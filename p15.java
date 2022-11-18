public class p15{
    public static void main(String[] args){
		int a=10,b=9,c=15;
		int temp, greatest;

		temp = a>b?a:b;
		greatest = c>temp?c:temp;

		System.out.printf("Greatest number from %d, %d, and %d is %d\n",a,b,c,greatest);
		
    }
}

