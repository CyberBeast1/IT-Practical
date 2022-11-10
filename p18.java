 import java.util.Scanner;
 
 public class p18{
     public static void main(String[] args){
		 Scanner reader = new Scanner(System.in);
		 int fact = 1;
		 System.out.print("Enter number: ");
		 int num = reader.nextInt();
		 for(int i = num; i > 0; i--){
			 fact *= i;
		 }
		 System.out.printf("Factorial of %d is %d\n",num,fact);
		 reader.close();
     }
 }

