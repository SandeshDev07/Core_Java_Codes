
class User
{
    private String userName;
    private String email;
    private String phNo;
    private String gender;

    public User()
    {

    }

    public User(String userName, String email, String phNo, String gender)
    {
        this.userName = userName;
        this.email = email;
        this.phNo = phNo;
        this.gender = gender;
    }

    public void setUserName(String userName)
    {
        this.userName = userName;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    public void setPhNo(String phNo)
    {
        this.phNo = phNo;
    }

    public void setGender(String gender)
    {
        this.gender = gender;
    }

    public String getUserName()
    {
        return userName;
    }

    public String getEmail()
    {
        return email;
    }

    public String getPhNo()
    {
        return phNo;
    }

    public String getGender()
    {
        return gender;
    }

    public void display()
    {
        System.out.println("UserName   : " + getUserName());
        System.out.println("Email      : " + getEmail());
        System.out.println("Mobile No. : " + getPhNo());
        System.out.println("Gender     : " + getGender());
    }
}

public class UserClassDemo
{   
    public static void main(String... args)
    {
        User ob = new User();
        ob.display();

        System.out.println("-----------------------");

        User ob1 = new User("Sandesh", "sandeshthakre07@gmail.com", "9860439976", "Male");
        ob1.display();

        System.out.println("-----------------------");

        ob1.setUserName("Anshul");
        ob1.setEmail("anshulthakre2008@gamail.com");
        ob1.setPhNo("7666628673");
        ob1.setGender("Male");
        ob1.display();
    }
}

