import java.util.Scanner;

public class LcmProgram {
    public static void main(String[] args) {
        Scanner num =new Scanner(System.in);
        int i;
        System.out.println("Enter two number=");
        int num1=num.nextInt();
        int num2=num.nextInt();
        for( i=1;i<=num1*num2;i++)
        {
            if(i%num1==0 && i%num2==0) {
                break;
            }
        }
        System.out.println("Lowest common multiple is "+i);
    }
}
