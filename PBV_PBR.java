// PBV_PBR.java
import java.util.*;
class PBV_PBR {
	// pass-by-value 
	public static void pbv(int i, double d, char ch, boolean b) {
		i++; d++; ch='F'; b=true;
	}
	public static void main(String rags[]) {
		Scanner sc=new Scanner(System.in);
		int i=sc.nextInt();
		double d=sc.nextDouble();
		char gender='M';
		boolean isMarried=false;
		pbv(i, d, gender, isMarried);
		System.out.println(i+" "+d+" "+gender+" "+isMarried);
		
		int marks[]={50,60,70,80,90};
		Emp e1=new Emp(1, "ABC", 50000.00, "Designer");
		pbr(marks, e1);
		for(int mark:marks) {
			System.out.print(mark+" ");
		}
		System.out.println();
		System.out.println(e1);
	}
	public static void pbr(int i[], Emp e) {
		i[0]+=5; i[1]=i[1]+5;
		e.sal+=25000.00; e.desig="Developer";
	}
}

class Emp {
	int eid; String ename;
	double sal; String desig;
	Emp(int eid, String ename, double sal, String desig) {
		this.eid=eid; 
		this.ename=ename; 
		this.sal=sal; 
		this.desig=desig;
	}
	public String toString() {
		return eid+" "+ename+" "+sal+" "+desig;
	}
}

