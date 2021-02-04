import java.util.ArrayList;

class Subject {
	private String subjectName;
	private String subjectCode;
	// private Student[] studentList = new Student[10];
	private ArrayList<Student> studentList1 = new ArrayList<Student>();
	private int totalStudents = 0;
	
	Subject(String subjectName, String subjectCode){
		this.subjectName = subjectName;
		this.subjectCode = subjectCode;
	}
	public String getSubjectName(){
		return subjectName;
	}
	
	public String getSubjectCode(){
		return subjectCode;
	}

	// public void enrollStudent(Student student){
	// 	this.studentList1.add(student);
	// }

	public void enrollAllStudents(ArrayList<Student> studentList) {
		studentList1.addAll(studentList);
	}
	
	public int getTotalStudents(){
		return totalStudents; 
	}
	
	public void printStudents(){
		for(Student s : studentList1){
			System.out.print("Student: "+s.getName()
					+"   Student No: "+s.getStudentNumber()
					+ " Student Contact: "+ s.getContact());
			System.out.println();
		}
	}

	public ArrayList<Student> getAllStudents() {
		return studentList1;
	}
	
	public Student getStudent(int studentNumber){
		Student student = null;
		
		for(Student s : studentList1){
			if(s.getStudentNumber() == studentNumber) {
				student = s;
				break;
			}
		}

		return student;
	}
	
}

class Student {
	private String name;
	private int studentNumber;
	private Address address;
	private String contact;
	
	Student(String name, int studentNumber, Address address, String contact){
		this.name = name;
		this.studentNumber = studentNumber;
		this.address = address;
		this.contact = contact;
	}
	
	public String getName(){
		return name;
	}
	
	public int getStudentNumber(){
		return studentNumber;
	}
	
	public Address getAddress(){
		return address;
	}
	
	public String getContact(){
		return contact;
	}
	
	public void changeAddress(Address address){
		this.address = address;
	}
	
	public void changeContact(String contact){
		this.contact = contact;
	}
	
}

class Address {
	private int streetNumber;
	private String street;
	private String suburb;
	private String state;
	private int postcode;
	
	Address(int streetNumber, String street, String suburb, String state, int postcode){
		this.streetNumber = streetNumber;
		this.street = street;
		this.suburb = suburb;
		this.state = state;
		this.postcode = postcode;
	}
	
	public String toString() {
		
		String str = streetNumber + " " + street
				+ "\n" + suburb + ", " + state
				+ ", " + postcode;
	    return str;
	}
}
