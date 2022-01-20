package org.launchcode.java.demos.lsn4classes2;

public class HelloWorld {
//    public String message = "Hello, Mika!";
//
//    public void sayHello() {
//        System.out.println(message);
//    }

        public String message = "Hello World";

        public void sayHello() {

            String message = "Goodbye World";

            // The line below prints "Goodbye World"
            System.out.println(message);

            // The line below prints "Hello World"
            System.out.println(this.message);
        }

}
