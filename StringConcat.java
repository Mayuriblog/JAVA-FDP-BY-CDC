/*
Demonstrate sequential concatenation of multiple strings using concat() method.
*/
// StringConcat.java
class StringConcat {
	public static void main(String rags[]) {
		String str="Institute ";
		System.out.println(str);
		String str1=str.concat("Of ");
		System.out.println(str1);
		String str2=str1.concat("Aeronautical ");
		System.out.println(str2);
		String str3=str2.concat("Engineering ");
		System.out.println(str3);
		
		String str4="Sirisha ".concat("Jirra ").concat("IARE ").concat("CSE DS");
		System.out.println(str4);
		
		String str5="Institute "+"of "+"Aeronautical "+"Engineering";
		System.out.println(str5);
	}
}