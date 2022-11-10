public class p20{
	public static void main(String[] args){
		book obj = new book(2000,"Harry Potter","JK Rowling","Fantasy");
		obj.getData();
	}
}

class book{
	private int price;
	private String title, author,genre;

	book(){}

	book(int p, String t,String a,String g){
		System.out.println("Constructor of class 'book' was called!");
		price = p;
		title = t;
		author = a;
		genre = g;
	}

	public void getData(){
		System.out.printf("\t\tBook Data\nTitle: %s\nAuthor: %s\nGenre: %s\nPrice: %d\n",title,author,genre,price);
	}
}


