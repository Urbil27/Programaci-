
public class SalariedEmployee extends Employee {
	SalariedEmployee(String firstname, String lastname, long ssn) {
		super(firstname, lastname, ssn);
	
	}

	int wsalary;

	
	float earning() {
		if(wsalary<0) {
			return 0;
		}
		else {
			return wsalary;
		}
	}
	public String toString(){
		return (super.toString()+" "+earning());
	}
	


}
