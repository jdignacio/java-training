package labs;

public class lab2 {

	public static void main (String[] args) {
		
		Student stu1 = new Student("Jackie", "3651254258");
		Student stu2 = new Student("Marshall", "236587451");
		Student stu3 = new Student("Janice", "123547896");	
		//showCourses();
		stu1.enroll("Math 151");
		//stu2.enroll("English 101");
		//stu3.enroll("Arts 302");
		stu1.enroll("English 101");
		stu1.enroll("Science 201");
		//stu1.checkBalance();
		stu1.payTuition(500);
		//stu1.checkBalance();
		System.out.println(stu1.toString());
		
	}
}
class Student {
	private static int iD =1000;
	private static String ssn;
	private String name;
	private String userID;
	private String email;
	private String city;
	private String state;
	private String phoneNumber = "1234561203";
	private static final int costOfCourse = 800;
	private int balance = 0;
	private String courses= " ";
	
	public Student(String name, String ssn) { //constructors//properties
		this.name = name;
		this.ssn = ssn;
		iD++;
		setUserID();
		setEmail();
	}

	private void setEmail() {// self generated email id based on the name
		int random = (int) (Math.random()* 500);
		email = name.toLowerCase()+ "@university.com";
		System.out.println("[Name: " + name + "]" + " " +"[Generated Email ID: " + email+"]");
		}

	public void setUserID() {
		int max = 90;
		int min = 10;
		int randNum = (int)(Math.random()*(max-min)); 
		randNum = randNum + min;
		userID = iD + "" + randNum + ssn.substring(5);
		System.out.println(name + " User ID: " + userID);	
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	//methods: enroll(), pay(), checkBalance(), toString(), showCourses()
	public void enroll(String course) {
		this.courses = this.courses + "\n+" + course;
		balance = balance + costOfCourse;
		//System.out.println(name + " enrolled: " + course);		
	}
	
	public void payTuition(int amount) {
		balance = balance - amount;
		System.out.println("Payment Made: $" + amount );
	//	checkBalance();	
	}
	
	public void checkBalance() {
		System.out.println("[Name: "+ name + "]" + " " + "[Balance Remaining: $"+balance+ "]");
	}

	public String toString() {
		return "[Name:" + name + "]\n[Courses: "+ courses + "\n[Balance: $" + balance +"]";	
		
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
  
}	
