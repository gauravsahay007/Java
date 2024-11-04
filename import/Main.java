

public class Main{
    public static void main(String[] args){
        //all these classes are compiled with no import because they are present in the java.lang package so no need to import it
       //In Java, the java.lang package is automatically imported by the Java compiler for every program. This is why you don’t need to explicitly import commonly used classes like String, Thread, Exception, or StringBuffer.
       String s = new String("Durga");
       Thread t = new Thread();
       Exception e = new Exception();
       StringBuffer sb = new StringBuffer("Durga");

    //same directory classes dont need to be imported
       B b = new B();
    }
}