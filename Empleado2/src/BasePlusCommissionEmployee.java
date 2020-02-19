
public class BasePlusCommissionEmployee extends CommissionEmployee {
float bSalary;
	BasePlusCommissionEmployee(String firstname, String lastname, long ssn, int sales, float rate, float baseSalary) {
		super(firstname, lastname, ssn, sales, rate);
		// TODO Auto-generated constructor stub
		bSalary = baseSalary;
	}
	float earning(){
		if(bSalary<0) {
			return 0;
		}
		else {
			return bSalary+super.earning();
		}
		
	}

}
