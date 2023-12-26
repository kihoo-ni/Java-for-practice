package sec01;

public class ResourceExample {
	public static void main(String[] args) {
		Class clazz = Car.class;

		String photo1 = clazz.getResource("cup-6.jpg").getPath();
		String photo2 = clazz.getResource("images/cup-6.jpg").getPath();
		System.out.println(photo1);
		System.out.println(photo2);
	}
}
