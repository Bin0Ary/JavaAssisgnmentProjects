public class Main {
    public static void main(String[] args){
        Employee e1 = new Employee(8, 2500, "Peter", "Tan");
        System.out.println(e1);
        e1.setSalary(999);
        System.out.println(e1);
        System.out.println("id is: " + e1.getId());
        System.out.println("firstname is: " + e1.getFirstName());
        System.out.println("lastname is: " +e1.getLastName());
        System.out.println("salary is: " +e1.getSalary());
        System.out.println("my name is: " + e1.getName());
        System.out.println("annual salary is: "+ e1.getAnnualSalary());
        System.out.println(e1.raiseSalary(10));
        System.out.println(e1);
    }
}

class Employee{
    private int id;
    private int salary;
    private String firstName;
    private String lastName;
    public Employee(int id, int salary, String firstName, String lastName){
        this.id = id;
        this.firstName = firstName;
        this.salary = salary;
        this.lastName = lastName;
    }

    public String toString(){
        return "Employee[id=" + id +", name="+ getName()+", salary=" + salary + "]";
    }
    public String getName(){
        return getFirstName() + " " + getLastName();
    }
    public int raiseSalary(int percent){
        float result=0;
        result += (float)salary * ((float)percent/100);
        salary += (int)result;
        return salary;
    }
    public int getAnnualSalary(){
        return getSalary() * 12;
    }

    public int getId() {
        return id;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}