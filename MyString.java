public class MyString {
    public static void main(String[] args){
	String s1="�����";
	String s2="�������";
	String s3="���";
	System.out.println(s1);
	System.out.println(s2);
	System.out.println(s3);
	System.out.println(s1 + s3);
	System.out.println(s3 + (s2 + s1));
	System.out.println(s1 + s2 + s3);
    }
}