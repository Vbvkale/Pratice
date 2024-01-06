package seleniumsession;


public class student {
	
	
	int rollno;
	String name,city;
	
	student(int rollno, String name, String city){
	
		this.rollno = rollno;
		this.name = name;
		this.city=city;
		
	}
	
	public String toString() {
		
		return rollno + " " + name + " " + city; 
		
	}
	
	public static void main(String[] args) throws Exception {
		
		student s1 = new student(1, "vaibhav","solapur");
		
		System.out.println(s1);
		
	}

}
