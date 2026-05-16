package javaPackage;

public class Identifiers {

    public static void main(String[] args) {

        int a = 5; // allowed
        int A = 5; // allowed

        char isShammi = 'S'; // not allowed
        char Shammi$ = 's'; // allowed
    }

    // Not allowed - special character @
    // public void a@method(){}

    // allowed special character _
    public void a_method() {
        int a123 = 500; // allowed special character $
    }
}
