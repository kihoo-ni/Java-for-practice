package sec05;

public class Person {
	final String NATION = "korean";
	final String SSN;
	String name;

	public Person(String ssn, String name) {
		this.SSN = ssn;
		this.name = name;
	}

	public static void main(String[] args) {
		Person p1 = new Person("123456-1234567", "È«±æµ¿");

		System.out.println(p1.NATION);
		System.out.println(p1.SSN);
		System.out.println(p1.name);
		// p1.NATION="usa"; final °´Ã¼´Â º¯°æ¾ÈµÊ.
		// p1.SSN="14214214"; final °´Ã¼¶ó °´Ã¼»ý¼º½Ã ÁöÁ¤ÇÒ°æ¿ì º¯°æ¾ÈµÊ.
	}
}
