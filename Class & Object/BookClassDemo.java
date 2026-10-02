class Book
{
    private String bookName;
    private double price;
    private String author;
    private String publication;

    //Empty Constructor....
    public Book()
    {
        bookName ="";
        price = 0.0;
        author = "";
        publication = "";
    }

    //Parameterized Constructor.....
    public Book(String bookName, double price, String author, String publication)
    {
        this.bookName = bookName;
        this.price = price;
        this.author = author;
        this.publication = publication;
    }

    //All Setter Methods....
    public void setBookName(String bookName)
    {
        this.bookName = bookName;
    }

    public void setPrice(double price)
    {
        this.price = price;
    }

    public void setAuthor(String author)
    {
        this.author = author;
    }

    public void setPublication(String publication)
    {
        this.publication = publication;
    }

    //All Getter Methods.....
    public String getBookName()
    {
        return bookName;
    }

    public double getPrice()
    {
        return price;
    }

    public String getAuthor()
    {
        return author;
    }

    public String getPublication()
    {
        return publication;
    }

    //Display Method....
    public void display()
    {
        System.out.println("BookName    : " + getBookName());
        System.out.println("Price       : " + getPrice());
        System.out.println("Author      : " + getAuthor());
        System.out.println("Publication  : " + getPublication());
    }
}

public class BookClassDemo
{
    public static void main(String... args)
    {
        Book ob1 = new Book();
        ob1.display();         //Calling Empty Constructor....

        System.out.println("----------------");

        Book ob2 = new Book("JAVA", 527.25, "James Gosling", "Tech Publication");
        ob2.display();         //Calling Parameterized Constructor....

        System.out.println("----------------");

        Book ob = new Book();
        ob.setBookName("Linux Fundamentals");
        ob.setPrice(620.52);
        ob.setAuthor("Linus Torvalds");
        ob.setPublication("Tech Publication");
        ob.display();


    }
}