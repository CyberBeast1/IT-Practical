public class p16{
	public static void main(String[] args){
		int marks = 81;
		String grade;
		switch(marks/10){
			case 10:
				grade = "A1";
				break;
			case 9:
				grade= "A1";
				break;
			case 8:
				grade = "A2";
				break;
			case 7:
				grade = "B1";
				break;
			case 6:
				grade = "B2";
				break;
			case 5:
				grade = "C1";
				break;
			case 4:
				grade = "C2";
				break;
			case 3:
				grade = "D";
				break;
			default:
				grade = "E";
				break;
		}
		System.out.printf("Grades are %s\n",grade);
	}
}
