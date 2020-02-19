
public abstract class Employee {
	String first;
	String last;
	long ss;
	float earn;
	Employee(String firstname, String lastname, long ssn){
		first = firstname;
		last = lastname;
		ss = ssn;
		
	}
	abstract float earning();
	 public String toString() {
		return first+" "+last+" "+ss;
	
	 }
	
}
