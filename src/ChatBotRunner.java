import java.util.Scanner;

public class ChatBotRunner {
    public static void main(String[] args) {
        ChatBot debbie = new ChatBot("Debbie", 178);
        Scanner scan = new Scanner(System.in);

        System.out.println("What's your name? ");
        debbie.greeting(scan.nextLine());

        scan.nextLine();

        int choice = 0;
        while (choice != 7) {
            System.out.println("How else can I help you today?");
            System.out.println("1 - Tell me about the weather");
            System.out.println("2 - Convert Feet to Meters");
            System.out.println("3 - Favorite Number");
            System.out.println("4 - Add Numbers");
            System.out.println("5 - Guess my Favorite Number");
            System.out.println("6 - Do we have the same favorite number?");
            System.out.println("7 - Exit");

            choice = scan.nextInt();
            scan.nextLine();

            if (choice < 3) {
                if (choice == 1) {
                    debbie.weather();
                } else {
                    System.out.print("Enter a number of feet: ");
                    int feet = scan.nextInt();
                    scan.nextLine();
                    System.out.println(feet + " feet is equal to " + debbie.convertFeetToMeters(feet) + " meters.");
                }
            } else if (choice < 5) {
                if (choice == 3) {
                    System.out.print("What's your favorite number? ");
                    debbie.favoriteNumber(scan.nextInt());
                    scan.nextLine();
                } else {
                    System.out.println("Enter your first number: ");
                    int num1 = scan.nextInt();
                    scan.nextLine();
                    System.out.println("Enter your second number: ");
                    int num2 = scan.nextInt();
                    scan.nextLine();
                    System.out.println("Enter your third number: ");
                    int num3 = scan.nextInt();
                    scan.nextLine();
                    System.out.println("The sum of " + num1 + ", " + num2 + ", and " + num3 + " is " + debbie.addNumbers(num1, num2, num3));
                }
            } else if (choice != 7) {
                if (choice == 5) {
                    debbie.guessMyFavorite();
                } else {
                    System.out.print("What's your favorite number? ");
                    if (debbie.isFaveNum(scan.nextInt())) {
                        System.out.println("Wow! We have the same favorite number!");
                    } else {
                        System.out.println("No, unfortunately we don't have the same favorite number.");
                    }
                    scan.nextLine();
                }
            } else {
                System.out.println(debbie.goodbye());
            }
        }

        scan.close();
    }
}
