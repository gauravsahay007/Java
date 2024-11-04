class Test2 {
    // General method with one int parameter
    public void m1(int i) {
        System.out.println("General Method");
    }

    // Varargs method with int... parameter (accepts any number of integers)
    public void m1(int... i) {
        System.out.println("Var-arg Method");
    }

    public static void main(String[] args) {
        Test t = new Test();
        t.m1();         // Which method will be called?
        /* t.m1();

Explanation: No arguments are passed.
Since the general method requires exactly one int parameter, it cannot be called.
Java selects the varargs method because it can accept zero arguments. */


        t.m1(10);       // Which method will be called?
        /* 
        t.m1(10);
        Explanation: One int argument is passed.
        Here, both the general method and the varargs method could be valid matches.
        Java always prefers the most specific match, so it selects the general method.
        */


       /*
       t.m1(10, 20);

        Explanation: Two int arguments are passed.
        The general method cannot be selected because it only accepts one int.
        =>>>> Java selects the varargs method since it can accept multiple arguments.
            */
        t.m1(10, 20);   // Which method will be called?
    }
}
