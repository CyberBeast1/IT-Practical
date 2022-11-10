public class p22{
	public static void main(String[] args){
		try{
			int[] arr = {2,4,6};
			System.out.println(arr[3]);
		} catch(Exception e){
			System.out.println(e);
		}
		System.out.println("code after Exception");
	}
}
