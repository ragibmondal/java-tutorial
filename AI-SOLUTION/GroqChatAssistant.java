import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;

public class GroqChatAssistant {
    private final String apiKey;
    private final String model;
    private static final String API_URL = "https://api.groq.com/openai/v1/chat/completions";

    public GroqChatAssistant(String apiKey, String model) {
        this.apiKey = apiKey;
        this.model = model;
    }

    public void startChatSession() {
        try (BufferedReader terminalReader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("\nGroq AI Assistant (type 'exit' to end session)");
            System.out.println("==============================================");

            while (true) {
                System.out.print("\nYou: ");
                String userInput = terminalReader.readLine();
                
                if (userInput == null || userInput.equalsIgnoreCase("exit")) {
                    System.out.println("\nEnding chat session. Goodbye!");
                    break;
                }
                
                if (userInput.isBlank()) {
                    System.out.println("Please enter a valid message.");
                    continue;
                }

                String response = sendChatRequest(userInput);
                System.out.println("\nAssistant: " + response);
            }
        } catch (IOException e) {
            System.err.println("Error reading input: " + e.getMessage());
        }
    }

    private String sendChatRequest(String message) {
        try {
            String requestBody = createRequestBody(message);
            String apiResponse = executeHttpRequest(API_URL, requestBody);
            return parseResponseContent(apiResponse);
        } catch (IOException e) {
            return "Error processing request: " + e.getMessage();
        }
    }

    private String createRequestBody(String message) {
        return String.format("""
            {
                "model": "%s",
                "messages": [{"role": "user", "content": "%s"}]
            }
            """, model, message);
    }

    private String executeHttpRequest(String urlString, String requestBody) throws IOException {
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

    private String parseResponseContent(String response) {
        int contentStart = response.indexOf("content") + 11;
        int contentEnd = response.indexOf("\"", contentStart);
        return response.substring(contentStart, contentEnd);
    }

    public static void main(String[] args) {
        // Configure with your API details
        GroqChatAssistant assistant = new GroqChatAssistant(
            "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",
            "deepseek-r1-distill-llama-70b"
        );
        
        assistant.startChatSession();
    }
}