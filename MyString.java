import java.util.Scanner;


public class MyString {
    public static void main (String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.print("Name:Dima");
	String s = scanner.nextLine();
	System.out.println("Dima:"+s);
	System.out.print("Age:27");
	int i = scanner.nextInt();
	System.out.println("Age:27" + i);
    }
}