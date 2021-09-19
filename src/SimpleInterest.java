import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a  number=");
        int a=sc.nextInt();
        System.out.println("Enter the interest=");
        float interest =sc.nextFloat();
        System.out.println("Enter the time=");
        int time=sc.nextInt();
        float d= a*interest*time/100;

        System.out.println("simple interest is ="+d);

    }
}
