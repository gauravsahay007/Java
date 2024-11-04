//abstract class can contain zero number of abstract methods
abstract class Abstract{
    public static void main(String[] args){
        
    }

    public abstract void method1();

    public void method2(){
        System.out.println("Method2 called");
    }

    //if not abstract methpds then compulsary to decalre body => {}
    // public void method3(); => Error no body
}
