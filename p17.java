import java.util.Scanner;

public class p17{
	public static void main(String[] args){
		int num,tempNum, digit, sum = 0;
		Scanner reader = new Scanner(System.in);
		System.out.print("Enter number: ");
		num = reader.nextInt();
		tempNum = num;
		while(tempNum != 0){
			digit = tempNum % 10;
			sum+=digit;
			tempNum/=10;
		}
		System.out.printf("Sum of digits of number %d is %d\n",num,sum);
		reader.close();
	}
}
