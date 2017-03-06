package assign3Session9;

public class Employee {
	int Empcode;
	String EmpName;
	
	public Employee(int empcode,String empname)
	{
		super();
		this.Empcode = empcode;
		this.EmpName = empname;
	}

	public int getEmpcode() {
		return Empcode;
	}

	public void setEmpcode(int empcode) {
		Empcode = empcode;
	}

	public String getEmpName() {
		return EmpName;
	}

	public void setEmpName(String empName) {
		EmpName = empName;
	}

	
	@Override
	public String toString()
	{
		return EmpName;
	}
}
