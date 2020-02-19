
public class CommissionEmployee extends Employee {
	int s;
	float r;
CommissionEmployee(String firstname, String lastname, long ssn, int sales, float rate){
	super(firstname, lastname, ssn);
	s=sales;
	r=rate;
}


float earning() {
	// TODO Auto-generated method stub
	return s*r;
}
public String toString() {
	return(super.toString()+" "+s+" "+r);
}
}
