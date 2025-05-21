// PersonClient.java
public class PersonClient {
	public static void main(String rags[]) {
		// create and initialize Person class object
		Person p=new Person("ABC", 23, "India");
		
		// print its state
		System.out.println(p); // implicitly toString() method is called on that object
	}
}