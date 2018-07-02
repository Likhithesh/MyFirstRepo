package tests;

class Parent{
    int x=10;
    static int y=20;
    int z=30;
    
    void m1(){
    	System.out.println(" Non Static m1() methos in Parent");
    }
    static void m2(){
    	System.out.println(" Static m2() methos in Parent");
    }
}
class Child extends Parent{
    int x=100;
    static int y=200;
    
    @Override
    void m1(){
    	System.out.println(" Non Static m1() methos in Child");  	
    	System.out.println(z);
    }
    
    static void m2(){
    	System.out.println(" Static m2() methos in Child");
//    	System.out.println(z);  // We cannot invoke non static variable inside static method.
    	
    }
}

public class VariableHidingInJava {
	public static void main(String[] args) {
		
		Parent p=new Child();
        Child c = new Child();
        
        Child c1=(Child) p; //downcasting P (parent type) to C (child type)
        
        System.out.println(c.x);
        System.out.println(p.x);
        System.out.println(c1.y);
        System.out.println(c.z+" "+p.z);
        
        c.m2(); // Static m2() methos in Child
        p.m2(); // Static m2() methos in Parent
        
        c.m1(); // Non Static m1() methos in Child
        p.m1(); // Non Static m1() methos in Child
        
//        c.m2(); // Static m2() methos in Parent
//        p.m2(); // Static m2() methos in Parent
        
    }
}
