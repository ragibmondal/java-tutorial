import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;

public class GroqClient {
    private final String apiKey;
    private final String model;
    private static final String API_URL = "https://api.groq.com/openai/v1/chat/completions";

    public GroqClient(String apiKey, String model) {
        this.apiKey = apiKey;
        this.model = model;
    }

    public String chat(String message) {
        try {
            String requestBody = buildRequestBody(message);
            String response = sendRequest(API_URL, requestBody);
            return extractContentFromResponse(response);
        } catch (IOException e) {
            throw new RuntimeException("Error communicating with Groq API", e);
        }
    }

    private String buildRequestBody(String message) {
        return String.format("""
            {
                "model": "%s",
                "messages": [{"role": "user", "content": "%s"}]
            }
            """, model, message);
    }

    private String sendRequest(String urlString, String requestBody) throws IOException {
        URL url = new URL(urlString);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        
        connection.setRequestMethod("POST");
        connection.setRequestProperty("Authorization", "Bearer " + apiKey);
        connection.setRequestProperty("Content-Type", "application/json");
        connection.setDoOutput(true);

        try (OutputStreamWriter writer = new OutputStreamWriter(connection.getOutputStream())) {
            writer.write(requestBody);
        }

        try (BufferedReader reader = new BufferedReader(
                new InputStreamReader(connection.getInputStream()))) {
            StringBuilder response = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                response.append(line);
            }
            return response.toString();
        }
    }

    private String extractContentFromResponse(String response) {
        int startIndex = response.indexOf("content") + 11;
        int endIndex = response.indexOf("\"", startIndex);
        return response.substring(startIndex, endIndex);
    }

    public static void main(String[] args) {
        // Example usage
        GroqClient client = new GroqClient("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", "deepseek-r1-distill-llama-70b");
        System.out.println(client.chat("Hello, how are you?"));
    }
}


