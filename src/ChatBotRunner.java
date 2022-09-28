import java.util.Scanner;

public class ChatBotRunner {
    public static void main(String[] args) {
        ChatBot debbie = new ChatBot("Debbie", 178);
        Scanner scan = new Scanner(System.in);

        System.out.println("What's your name?");
        debbie.greeting(scan.nextLine());

        scan.nextLine();

        int choice = 0;
        while (choice != 5) {
            System.out.println("How can I help you today?");
            System.out.println("1 - Tell me about the weather");
            System.out.println("2 - Conversions");
            System.out.println("3 - Favorite Number");
            System.out.println("4 - Add Numbers");
            System.out.println("5 - Exit");

            choice = scan.nextInt();
            scan.nextLine();

            if (choice < 3) {
                if (choice == 1) {
                    //weather
                } else {
                    //conversion
                }
            } else if (choice != 5) {
                if (choice == 3) {
                    //fav num
                } else {
                    //add nums
                }
            } else {
                //goodbye
            }
        }
    }
}
