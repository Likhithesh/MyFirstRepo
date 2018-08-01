package tests;

public class Demo1 {

	static int x = 11;
    private int y = 33;
    public void method1(int x)
    {
    	System.out.println("Changing");
    	Demo1 t = new Demo1();
        this.x = 22;
        y = 44;
 
        System.out.println("Test.x: " + Demo1.x);
        System.out.println("t.x: " + t.x);
        System.out.println("t.y: " + t.y);
        System.out.println("y: " + y);
    }
 
    public static void main(String args[])
    {
    	Demo1 t = new Demo1();
        t.method1(5);
    }
	}

