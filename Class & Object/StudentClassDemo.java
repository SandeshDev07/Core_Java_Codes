class Student
{
    private int rollNumber;
    private String name;
    private double per;

    public Student()
    {
        rollNumber = 0;
        name = "";
        per = 0.0;
    }

    public Student(int rollNumber, String name, double per)
    {
        this.rollNumber = rollNumber;
        this.name = name;
        this.per = per;
    }

    public void display()
    {
        System.out.println("Roll Number : " + rollNumber);
        System.out.println("Name     : " + name);
        System.out.println("Percentage : " + per);
    }
}

public class StudentClassDemo
{
    public static void main(String... args)
    {
        Student ob = new Student();
        ob.display();

        System.out.println("---------------------------");
        
        Student ob1 = new Student(11, "Sandesh", 75.94);
        ob1.display();

    }
}