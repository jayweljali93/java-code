import java.util.Scanner;

public class userInput {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = input.nextLine();
        System.out.println("welcome "+ name);
        System.out.println(name + "tell me your age: ");
        int age = input.nextInt();
        System.out.println("your age is " + age);

    }
}
