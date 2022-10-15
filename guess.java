
import java.util.Random;
import java.util.*;

public class guess {

    public static int exit() {
        System.out.println("***you are successfully exit this game ***");
        return 0;

    }

    public static void game() {
        Random input = new Random();
        int randomNumber = input.nextInt(101);

        Scanner sc = new Scanner(System.in);
        System.out.println("1. unlimited attempt\n2. limited attempt");
        int number = sc.nextInt();
        int userNumber;
        System.out.println("Start guessing number\nenter number between 1 to 100");

        switch (number) {
            case 1 -> {

                while (true) {
                    userNumber = sc.nextInt();

                    if (randomNumber > userNumber) {
                        System.out.println("It is lower than the generated number");
                    } else if (randomNumber < userNumber) {
                        System.out.println("It is higher than the generated number");
                    } else {
                        System.out.println("****Congratulation..***\n you successfully find out");
                        break;
                    }

                }
            }

            case 2 -> {
                System.out.println("NOTE :- Max limit of your attempt ** 10 **");

                int limit = 0;

                while (limit < 10) {
                    userNumber = sc.nextInt();
//                    int count=0;
                    if (randomNumber > userNumber) {
                        System.out.println("It is lower than the generated number");
//                        count++;
                    } else if (randomNumber < userNumber) {
                        System.out.println("It is higher than the generated number");
//                        count++;
                    } else {
                        System.out.println("****Congratulation..***\n you successfully find out");
                        break;
                    }
                    limit++;
                }
                System.out.println("your SCRORE is = " + (10 - limit - 1));
                System.out.println("your POINT is = " + (10 - limit - 1) * 10 + "\n\n");
            }

            default -> {
                System.out.println("*** Enter only 1 or 2 ***");
            }
        }

    }

    public static void main(String[] args) {
        game();

        Scanner sc = new Scanner(System.in);
        System.out.println("you want to restart game\n1. YES\2. NO");
        int num = sc.nextInt();
        switch (num) {
            case 1 -> {
                game();
            }
            case 2 -> {
                exit();
            }
            default -> {
                System.out.println("*** Enter only 1 or 2 ***");
            }
        }
    }
}
