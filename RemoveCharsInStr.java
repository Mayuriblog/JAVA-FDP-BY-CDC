/*
Given a string, remove first and last character of a string.
*/
// RemoveCharsInStr.java
class RemoveCharsInStr {
	public static void main(String rags[]) {
		String str="Welcome";
		// how to convert String to StringBuffer?
		// store String object in StringBuffer class constructor
		StringBuffer sb=new StringBuffer(str);
		
		sb.deleteCharAt(0);
		System.out.println(sb);
		sb.deleteCharAt(sb.length()-1);
		System.out.println(sb);
		
		// How to convert StringBuffer into String?
		// store StringBuffer object into String class constructor
		String str1=new String(sb);
		System.out.println(str1);
		
		// one more way to convert StringBuffer into String
		String str2=sb.toString();
		System.out.println(str2);
	}
}
	
