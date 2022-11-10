public class p19{
	public static void main(String[] args){
		dummy obj = new dummy();
		obj.setData(34);
		obj.getData();
	}
}

class dummy{
	private int data;
	public void setData(int n){
		data = n;
	}
	public void getData(){
		System.out.println("Data stored inside object is " + data);
	}
}
