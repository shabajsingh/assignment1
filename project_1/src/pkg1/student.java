package pkg1;

public class student
{
	int rollno, age;
	public void sharma1()
	{
		System.out.println("welcome to all of you");
	}
	public void sharma2()
	{
		System.out.println("automation is very easy to learn");
	}
    public static void main(String[] args)
    {
    	int x,y;
    	student abc=new student();
    	abc.sharma1();
    	abc.sharma2();
    	abc.rollno=63;
    	x=abc.rollno;
    	abc.age=4;
    	y=abc.age;
    	System.out.println("rollno is" +x);
    	System.out.println("age is" +y);
    	}
}
