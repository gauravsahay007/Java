class Test {
    public void m1(Object o) {
        System.out.println("Object Version");
    }

    public void m1(String s) {
        System.out.println("String Version");
    }

    public static void main(String[] args) {
        Test t = new Test();
        t.m1(new Object());  // Calls m1(Object)
        t.m1("durga");       // Calls m1(String)
        t.m1(null);           // Which version will be called?
    }

    /* 
t.m1(null):
This is the most interesting part:
null can match both Object and String, because String is a subclass of Object.
Java always prefers the more specific type. Since String is more specific than
Object (i.e., String extends Object), Java calls the m1(String s) method. 
*/
}
