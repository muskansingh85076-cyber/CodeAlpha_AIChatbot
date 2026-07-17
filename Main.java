import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== AI Chatbot ===");
        System.out.print("You: ");

        String message = sc.nextLine();

        if (message.equalsIgnoreCase("hello")) {
            System.out.println("Bot: Hello! How are you?");
        } else if (message.equalsIgnoreCase("hi")) {
            System.out.println("Bot: Hi! Nice to meet you.");
        } else {
            System.out.println("Bot: Sorry, I don't understand.");
        }

        sc.close();
    }
}
    

