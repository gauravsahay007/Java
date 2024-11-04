
abstract class Test{
    public static void main(String[] args){

    }
    public abstract void m1();
    public abstract void m2();
}




//no error because now it is an abstract class
abstract class SubTest extends Test{
    public void m1(){}
}