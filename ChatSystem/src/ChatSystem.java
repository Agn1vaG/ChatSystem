import java.io.*;
import java.util.Scanner;

public class ChatSystem {
    public static void main(String[] args) throws IOException {
        File chatLog = new File("chat.log");
        chatLog.createNewFile();
        
        BufferedWriter writer = new BufferedWriter(new FileWriter(chatLog, true));
        Scanner sc = new Scanner(System.in);

        System.out.println("Chat started. Type 'exit' to quit.");
        while (true) {
            String message = sc.nextLine();
            if (message.equals("exit")) break;
            writer.write(message + "\n");
            writer.flush();
            System.out.println("Message saved.");
        }
    }
}
