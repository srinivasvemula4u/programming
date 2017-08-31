/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapractice.InnerClasses;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

/**
 *
 * 
 */
class Person {

    public enum Sex {
        MALE, FEMALE
    }

    String name;
    LocalDate birthday;
    Sex gender;
    String emailAddress;

    public int getAge() {
        return -1;
    }

    public Sex getGender() {
        return gender;
    }

    public void printPerson() {
        // ...
    }
}

public class LambdaExpressions {

    public static void printPersons(
            List<Person> roster, CheckPerson tester) {
        for (Person p : roster) {
            if (tester.test(p)) {
                p.printPerson();
            }
        }
    }

    public static void printPersonsWithPredicate(
            List<Person> roster, Predicate<Person> tester) {
        roster.stream().filter((p) -> (tester.test(p))).forEach((p) -> {
            p.printPerson();
        });
    }
    public static void processPersons(List<Person> roster,Predicate<Person> tester,Consumer<Person> block) {
        roster.stream().filter((p) -> (tester.test(p))).forEach((p) -> {
            block.accept(p);
        });
    }

    interface CheckPerson {

        public boolean test(Person p);

    }

    interface Predicate<Person> {

        boolean test(Person t);
    }

    public static void main(String[] args) {
        List<Person> obj = new ArrayList<>();
        printPersons(obj, (Person p) -> p.getGender() == Person.Sex.MALE
                && p.getAge() >= 18
                && p.getAge() <= 25);
        printPersonsWithPredicate(obj, p -> p.getGender() == Person.Sex.MALE
                && p.getAge() >= 18
                && p.getAge() <= 25);
        processPersons(obj, p -> p.getGender() == Person.Sex.MALE
                && p.getAge() >= 18
                && p.getAge() <= 25, p->p.printPerson());

    }
}
