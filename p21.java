public class p21{
    public static void main(String[] args){
		String s = "Terminator";

		System.out.println("length is: "+ s.length());
		System.out.println("index of m in string: "+s.indexOf('m'));
		System.out.println("Does string ends with 'tor': "+ s.endsWith("tor"));
		System.out.println("Replace 'tor' with 'tion': " + s.replace("tor", "tion"));
		System.out.println("String in lowercase: "+ s.toLowerCase());
		System.out.println("String in uppercase: "+ s.toUpperCase());
    }
}

