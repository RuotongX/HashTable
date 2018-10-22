package hashCode;

/**
 * This is the person class which have the attributes for the person, it has the hashcode method.
 * And also this class also include the main method.
 * @author RuotongXu 16935995
 *
 */
public class Person {
	private String name;
	private String phoneNum;
	private int age;
	Person next;
/**
 * This is the constructor of this class
 * @param name
 * @param phoneNum
 * @param age
 */
	public Person(String name,String phoneNum,int age) {
		this.name = name;
		this.phoneNum = phoneNum;
		this.age = age;
	}
	/**
	 * This method is used to hash the code by the person name which convert each letter of person name into number.
	 */
	public int hashCode() {
		int code = 0;
		char[] na = this.name.toCharArray();
		for(char letter:na) {
			code = code + Character.valueOf(letter);
		}
		return code;
	}
	/**
	 * This is the toString method which return the attributes for person.
	 */
	public String toString() {
		return " Name: "+this.name+" phone number: "+this.phoneNum+" age: "+age;
	}
	/**
	 * This is the main method, which create many people first then add them to table then delete one, finally display the details for table.
	 * @param args
	 */
	public static void main(String args[]) {
		HashTableWithChaining htwc = new HashTableWithChaining();
		Person Kenis = new Person("Kenis","0264145554",35);
		Person Monia = new Person("Monia","85148552",45);
		Person Keniss = new Person("Kenis","02641455555544",96);
		Person Rein = new Person("Rein","595614",74);
		Person Widow = new Person("Widow","554788920",29);
		Person Tracer = new Person("Tracery","0347893",25);
		Person Ball = new Person("Ball","8996412",8);
		Person Genji = new Person("Genji","6314789",38);
		Person Mccree = new Person("Mccreemee","8851447",46);
		Person Winston = new Person("Winston","9634766",12);
		Person Mercy = new Person("Mercy","8852145",38);
		Person Reaper = new Person("Reaper","8992144",48);
		htwc.add(Kenis);
		System.out.println("The Person in this table is "+htwc.size()+" and the size of this table is "+htwc.capacity);
		System.out.println();
		htwc.add(Monia);
		System.out.println("The Person in this table is "+htwc.size()+" and the size of this table is "+htwc.capacity);
		System.out.println();
		htwc.add(Keniss);
		System.out.println("The Person in this table is "+htwc.size()+" and the size of this table is "+htwc.capacity);
		System.out.println();
		htwc.add(Rein);
		System.out.println("The Person in this table is "+htwc.size()+" and the size of this table is "+htwc.capacity);
		System.out.println();
		htwc.add(Widow);
		System.out.println("The Person in this table is "+htwc.size()+" and the size of this table is "+htwc.capacity);
		System.out.println();
		htwc.add(Tracer);
		System.out.println("The Person in this table is "+htwc.size()+" and the size of this table is "+htwc.capacity);
		System.out.println();
		htwc.add(Ball);
		System.out.println("The Person in this table is "+htwc.size()+" and the size of this table is "+htwc.capacity);
		System.out.println();
		htwc.add(Genji);
		System.out.println("The Person in this table is "+htwc.size()+" and the size of this table is "+htwc.capacity);
		System.out.println();
		htwc.add(Mccree);
		System.out.println("The Person in this table is "+htwc.size()+" and the size of this table is "+htwc.capacity);
		System.out.println();
		htwc.add(Winston);
		System.out.println("The Person in this table is "+htwc.size()+" and the size of this table is "+htwc.capacity);
		System.out.println();
		htwc.add(Mercy);
		System.out.println("The Person in this table is "+htwc.size()+" and the size of this table is "+htwc.capacity);
		System.out.println();
		htwc.add(Reaper);
		System.out.println("The Person in this table is "+htwc.size()+" and the size of this table is "+htwc.capacity);
		System.out.println();
		System.out.println("Test for Ball is contains: "+htwc.contains(Ball));
		System.out.println(htwc.remove(Ball)+" has been remove");
		System.out.println("Test for Ball is contains: "+htwc.contains(Ball));
		System.out.println();
		System.out.println("The Hash Table");
		System.out.println(htwc.toString());
	}
}
