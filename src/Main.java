import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num,exp,total = 1;

        //Scanner created.
        Scanner scanner=new Scanner(System.in);

        //Data retrieved from user.
        System.out.print("Enter the number you want to calculate the exponent : ");
        num= scanner.nextInt();

        System.out.print("Enter the value of the exponent : ");
        exp= scanner.nextInt();

        //Exponent calculated
        for (int i=1;i<=exp;i++) {
            total=total*num;
        }
        //Result printed.
        System.out.print(exp + " to the power of "+ num + " is "+total );
    }
}
