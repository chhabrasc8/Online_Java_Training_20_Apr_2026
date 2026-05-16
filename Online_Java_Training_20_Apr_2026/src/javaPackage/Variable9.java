package javaPackage;

public class Variable9 {

    int b = 10; // Global Variable
    static int c = 5; // static variable

    // static method
    public static void d() {

        int a = 15; // Local Variable
        System.out.println(a); // 15
    }

    // Non static method
    public void f() {

        int e = 11; // Local Variable
        System.out.println(e); // 11
    }

    public static void main(String[] args) {

        int g = 16; // Local Variable
        System.out.println(g); // 16 - Calling variable

        // static member calling
        System.out.println(c); // calling static variable
        d(); // calling static method directly in the same class - predefined rule

        // Non Static Member Calling
        Variable9 v = new Variable9();
        System.out.println(v.b); // calling non static variable
        v.f(); // calling non static method using class ref - predefined rule
    }
}