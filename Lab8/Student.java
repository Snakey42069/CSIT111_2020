public class Student {
    
    private String name;
    private int studentNumber;
    private Address address;
    private String contact;

    public Student(String name, int studentNumber, Address address, String contact) {
        this.name = name;
        this.studentNumber = studentNumber;
        this.address = address;
        this.contact = contact;
    }

    public String getName() {
        return this.name;
    }

    public int getStudentNumber() {
        return this.studentNumber;
    }

    public Address getAddress() {
        return this.address;
    }

    public String getContact() {
        return this.contact;
    }

    public void changeAddress(Address newAddress) {
        this.address = newAddress;
    }

    public void changeContact(String newContact) {
        this.contact = newContact;
    }

}
