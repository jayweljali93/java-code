import java.util.Scanner;

public class sum {
    public static void main (String []args){
        Scanner input = new Scanner(System.in);
        System.out.println("enter your firstnum");
        int firstnum = input.nextInt();
        System.out.println("enter your secondnum");
        int secondnum = input.nextInt();
        System.out.println("enter your operator");
        int sum = firstnum + secondnum;
        System.out.println("sum of your number is: " + sum);
    }
}
