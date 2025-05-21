/*
1. Create a TVRemote class with two abstract methods turnOn() and turnoff() and demonstrate abstraction concept.
*/
/*
Abstraction:
Hides the method implementation and exposes only the method name and  signature. The benefit of abstraction is to achieve Runtime Polymorphsim (RTP).

RTP: Choosing which class method we want to invoke at runtime.
*/
// EmpPayroll.java
abstract class EmpPayroll {
	abstract void calSal(int eid);
}

// AdminEmpPayroll.java
class AdminEmpPayroll extends EmpPayroll {
	void calSal(int eid) {
		System.out.println(eid+" sal = nowd * pds ");
	}
}

// ProdEmpPayroll.java
class ProdEmpPayroll extends EmpPayroll {
	void calSal(int eid) {
		System.out.println(eid+" sal = (nowd*pds)+(othrs*amount)");
	}
}

// EPClient.java
class EPClient {
	public static void main (String rags[]) {
		// static binding
		/*AdminEmpPayroll aep=new AdminEmpPayroll();
		aep.calSal(1);
		ProdEmpPayroll pep=new ProdEmpPayroll();
		pep.calSal(2); */
		
		// dynamic binding
		String empType=rags[0];
		EmpPayroll ep=EmpPayrollFactory.getEmpPayroll(empType);
		ep.calSal(3);
	}
}

// EmpPayrollFactory.java
class EmpPayrollFactory {
	public static EmpPayroll getEmpPayroll(String empType) {
		if(empType.equalsIgnoreCase("Admin"))
			return new AdminEmpPayroll();
		else if(empType.equalsIgnoreCase("Prod"))
			return new ProdEmpPayroll();
		else
			return null;
	}
}
/*
javac EmpPayroll.java
java EPClient Admin
					 Prod
*/