
class Employee
{
    private int employeeID;
    private String name;
    private int salary;
    private String city;

    //Empty Constructor.........
    public Employee()
    {
        employeeID = 0;
        name = "";
        salary = 0;
        city = "";
    }

    //Parameterized Constructor........
    public Employee(int employeeID, String name, int salary, String city)
    {
        this.employeeID = employeeID;
        this.name = name;
        this.salary = salary;
        this.city = city;
    }

    //Setter Methods......
    public void setEmployeeID(int employeeID)
    {
        this.employeeID = employeeID;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setSalary(int salary)
    {
        this.salary = salary;
    }

    public void setCity(String city)
    {
        this.city = city;
    }

    //Getter Methods........
    public int getEmployeeID()
    {
        return employeeID;
    }

    public String getName()
    {
        return name;
    }

    public int getSalary()
    {
        return salary;
    }

    public String getCity()
    {
        return city;
    }

    //Display Method......
    public void display()
    {
        System.out.println("Employee ID : " + getEmployeeID());
        System.out.println("Name        : " + getName());
        System.out.println("Salary      : " + getSalary());
        System.out.println("City        : " + getCity());
    }
}

public class EmployeeClassDemo
{
    public static void main(String... args)
    {
        Employee ob1 = new Employee();

        //Set Details....
        ob1.setEmployeeID(101);
        ob1.setName("Sandesh");
        ob1.setSalary(20000);
        ob1.setCity("Nagpur");

        //Call Display Method....
        ob1.display();

    }
    
}