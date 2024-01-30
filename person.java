class person1
{
    String firstname;
    String lastname;
    double age;
    person1(String fn, String ln,double a)
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
public class person 
{
    public static void main (String args [])
    {
        person1 a1 = new person1("Jhon","Doe",30);
        person1 a2 = new person1("Alice","Smith",25);
        System.out.println("person1:"+a1.getfullname());
        System.out.println("person2:"+a2.getfullname());
        double b = (a1.age+a2.age)/2;
        System.out.println("Average Age:"+b);
    }
}