import java.util.Scanner;

public class StringJoinerApp {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Users First name and Last name");
		String fn=scan.next();
		String ln=scan.next();
		System.out.println(joinStrings(fn,ln));

	}
	public static String joinStrings(String str1, String str2)
	{
		return str1+str2;
	}
}
