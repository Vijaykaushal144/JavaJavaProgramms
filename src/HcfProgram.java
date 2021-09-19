import java.util.Scanner;

public class HcfProgram {
    public static void main(String[] args) {
        int num1,num2,i,lower;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two numbers=");
        num1=sc.nextInt();
        num2=sc.nextInt();

        for ( lower=num1<num2?num1:num2;lower>=1;lower--) {
            if (num1 % lower == 0 && num2 % lower == 0)
                break;

        }
        System.out.println("Hcf is " + lower);
    }
}