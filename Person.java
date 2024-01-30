class Person1
{
    String firstname;
    String lastname;
    double age;
    Person1(String fn, String ln,double a)
    {
        firstname= fn;
        lastname= ln;
        age=a;
    }
    String getfullname()
    {
        return firstname+" "+lastname;
    }
}
public class Person 
{
    public static void main (String args [])
    {
        Person1 a1 = new Person1("Jhon","Doe",30);
        Person1 a2 = new Person1("Alice","Smith",25);
        System.out.println("Person1:"+a1.getfullname());
        System.out.println("Person2:"+a2.getfullname());
        double b = (a1.age+a2.age)/2;
        System.out.println("Average Age:"+b);
    }
}