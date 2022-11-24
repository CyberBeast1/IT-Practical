import java.util.Scanner;

public class p13{
    public static void main(String[] args){
		Scanner scr = new Scanner(System.in);
		int a,b;
		System.out.print("Enter a: ");
		a = scr.nextInt();
		System.out.print("Enter b: ");
        b = scr.nextInt();
		int sum = a+b;
		System.out.printf("Sum of %d and %d is %d\n",a,b,sum);
		scr.close();
    }
}

