/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapractice.InnerClasses;

/**
 *
 * @author srivemul
 */
public class AnonymousClass {

    interface HelloWorld {

        public void greet();

        public void greetSomeone(String someone);
    }

    public void sayHello() {
        HelloWorld frenchGreeting = new HelloWorld() {
            String name = "tout le monde";

            @Override
            public void greet() {
                greetSomeone("tout le monde");
            }

            @Override
            public void greetSomeone(String someone) {
                name = someone;
                System.out.println("Salut " + name);
            }
        };

        HelloWorld spanishGreeting = new HelloWorld() {
            String name = "mundo";

            @Override
            public void greet() {
                greetSomeone("mundo");
            }

            @Override
            public void greetSomeone(String someone) {
                name = someone;
                System.out.println("Hola, " + name);
            }
        };
        spanishGreeting.greet();
        frenchGreeting.greetSomeone("Fred");
    }

    public static void main(String... args) {
        AnonymousClass myApp
                = new AnonymousClass();
        myApp.sayHello();
    }
}
