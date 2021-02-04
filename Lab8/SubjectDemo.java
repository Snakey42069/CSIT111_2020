
public class SubjectDemo {

	public static void main(String[] args) {

		Subject subject=  new Subject("Programming Fundamentals", "CSIT111");
		
		Address address = new Address(1, "George Street", "Wollongong", "NSW", 2552);
		Student student = new Student("Peter", 20160001, address, "0412345678");
		subject.enrollStudent(student);
		address = new Address(2, "George Street", "Wollongong", "NSW", 2552);
		student = new Student("John", 20160002, address, "0487654321");
		subject.enrollStudent(student);
		address = new Address(3, "George Street", "Wollongong", "NSW", 2552);
		student = new Student("Wang", 20160003, address, "0412348765");
		subject.enrollStudent(student);
		
		System.out.println("Subject:         " + subject.getSubjectName());
		System.out.println("Subject code:    " + subject.getSubjectCode());
		System.out.println("Enrolled number: " + subject.getTotalStudents());
		System.out.println("=========================================");
		System.out.println("All enrolled students:");
		subject.printStudents();
		
		System.out.println();
		System.out.println("Print detail of a student with the student number: 20160002");
		student = subject.getStudent(20160002);
		if(student != null){
			System.out.println("Student Name:    " + student.getName());
			System.out.println("Student No:      " + student.getStudentNumber());
			System.out.println("Student contact: " + student.getContact());
			System.out.println(student.getAddress());
		}
		
		System.out.println();
		System.out.println("A student (No: 2016003) changes the address and contact number");
		student = subject.getStudent(20160003);
		if(student != null){
			
			System.out.println(" === Old detail recorded in the subject:");
			System.out.println("Student Name:    " + student.getName());
			System.out.println("Student No:      " + student.getStudentNumber());
			System.out.println("Student contact: " + student.getContact());
			System.out.println(student.getAddress());
			
			address = new Address(1, "High Street", "Wollongong", "NSW", 2552);
			student.changeAddress(address);
			student.changeContact("0498761234");
			
			System.out.println(" === New detail recorded in the subject:");
			System.out.println("Student Name:    " + student.getName());
			System.out.println("Student No:      " + student.getStudentNumber());
			System.out.println("Student contact: " + student.getContact());
			System.out.println(student.getAddress());
		}
		
		System.out.println();
		System.out.println("All enrolled students:");
		subject.printStudents();
		
	}

}