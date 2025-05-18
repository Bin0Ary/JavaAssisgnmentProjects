public class Main {
    public static void main(String[] args){
        Staff staff = new Staff("Jack","ID","Jr",500);
        System.out.println(staff);
        staff.setPay(200);
        staff.setAddress("WI");
        staff.setSchool("Sr");
        System.out.println("Name: " + staff.getName() + "\nAddress: " + staff.getAddress()
                + "\nPay: " + staff.getPay() + "\nSchool: " + staff.getSchool());
        Student student = new Student("Jacob","WA" ,"CS", 200, 2004);
        System.out.println(student);
        student.setFee(250);
        student.setProgram("CE");
        student.setYear(2006);
        student.setAddress("IL");
        System.out.println("Name: " + student.getName() + "\nAddress: " + student.getAddress()
        + "\nProgram: " + student.getProgram() + "\nFee: " + student.getFee() + "\nYear: " + student.getYear());
    }
}
class Person{
    private String name;
    private String address;
    Person(String name, String address){
        this.name = name;
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }
    public String toString(){
        return "Person[name=" + getName() + ",address="+getAddress() + "]";
    }
}
class Student extends Person{
    private String program;
    private double fee;
    private int year;

    Student(String name, String address, String program, double fee, int year) {
        super(name, address);
        this.program = program;
        this.fee = fee;
        this.year = year;
    }

    public String getProgram() {
        return program;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Student["+super.toString()+",program=" + getProgram() + ",year=" + getYear() + ",fee=" + getFee() + "]";
    }
}
class Staff extends Person{
    private String school;
    private double pay;
    Staff(String name, String address, String school, double pay) {
        super(name, address);
        this.school = school;
        this.pay = pay;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public double getPay() {
        return pay;
    }

    public void setPay(double pay) {
        this.pay = pay;
    }
    @Override
    public String toString() {
        return "Staff["+super.toString()+",school=" + getSchool() + ",pay=" + getPay() +"]";
    }
}