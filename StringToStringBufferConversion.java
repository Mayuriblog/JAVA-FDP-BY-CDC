// StringToStringBufferConversion.java
class StringToStringBufferConversion {
  public static void main(String rags[]) {
    String str="IARE";
	String str1=new String("IARE");
	String str2="IARE";
	String str3=new String("IARE");
	
	String out=(str==str1)?"str, str1 address are same":"str, str1 address are not same";
	System.out.println(out);
	
	out=(str==str2)?"str, str2 address are same":"str, str2 address are not same";
	System.out.println(out);
	
	out=(str1==str3)?"str1, str3 address are same":"str1, str3 address are not same";
	System.out.println(out);
	
	out=(str.equals(str1))?"str, str1 state is same":"str, str1 state is different";
	System.out.println(out);

	out=(str.equals(str2))?"str, str2 state is same":"str, str2 state is different";
	System.out.println(out);
	
	out=(str1.equals(str3))?"str1, str3 state is same":"str1, str3 state is different";
	System.out.println(out);
	
	StringBuffer sb=new StringBuffer(str1); // converting String to StringBuffer
	System.out.println(sb);
	
	sb.insert(1, "nstitute "); // Institute ARE
	System.out.println(sb);
	
	sb.insert(10, "of ");
	System.out.println(sb);
	
	String str4=new String(sb); // converting StringBuffer into String
	System.out.println(str4);
  }  
}
