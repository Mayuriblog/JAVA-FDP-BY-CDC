/*
2. Create a class called Person with private instance variables name, age and country. 
Provide public getter and setter methods to access and modify these variables.
*/
/*
Encapsulation:
Hides the variables of the class by declaring them as private.

	declare Person class as public
	declare String name, int age, String country as private
	write one public no parameter constructor
	write one public parameter constructor
	write one pair of public setter and getter method for each private variable
	override toString(), hashCode() and equals() methods
*/
// Person.java
public class Person {
	private String name;
	private int age;
	private String country;
	
	public Person() {}
	public Person(String name, int age, String country) {
		this.name=name;
		this.age=age;
		this.country=country;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	
	public void setAge(int age) {
		this.age=age;
	}
	public int getAge() {
		return age;
	}
	
	public void setCountry(String country) {
		this.country=country;
	}
	public String getCountry() {
		return country;
	}
	
	public String toString() {
		return name+" "+age+" "+country; 
	}
	public int hashCode() {
		return toString().hashCode();
	}
	public boolean equals(Object o) {
		boolean flag=false;
		if(o instanceof Person) {
			Person p=(Person)o;
			if(this.name.equals(p.getName()) && this.age==p.getAge() && this.country.equals(p.getCountry())) {
				flag=true;
			}
		}
		return flag;
	}
}
