package hashCode;
import java.util.Scanner;

public class Person {
	private String name;
	private long phoneNum;
	private int age;
	private int hashcode;
	

	public Person(String name,long phoneNum,int age) {
		this.name = name;
		this.phoneNum = phoneNum;
		this.age = age;
		hashcode = this.hashcode;
	}
	
	public int hashCode() {
		int code = 0;
		char[] na = this.name.toCharArray();
		for(char letter:na) {
			code = code + Character.valueOf(letter);
		}
		return code;
	}
	public int getHashcode() {
		return hashcode;
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please input your name");
		String name = sc.nextLine();
		Person p1 = new Person(name,0,0);
		
	}
}
