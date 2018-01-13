/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapractice.annotations;

/**
 *
 * @author srivemul
 */
@interface ClassPreamble {

    String author();

    String date();

    int currentRevision() default 1;

    String lastModified() default "N/A";

    String lastModifiedBy() default "N/A";
    // Note use of array

    String[] reviewers();
}

@ClassPreamble(
        author = "John Doe",
        date = "3/17/2002",
        currentRevision = 6,
        lastModified = "4/12/2004",
        lastModifiedBy = "Jane Doe",
        // Note array notation
        reviewers = {"Alice", "Bob", "Cindy"})

public class FirstProgram {

    @SuppressWarnings({"unchecked", "deprecation"})
    public static void main(String[] args) {

        System.out.println("First Annotaion Program");
    }
}
