import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.util.Comparator.comparing;

public class Unit1Exercise {

    public static void main(String[] args) {

        // https://javabrains.io/courses/java_lambdabasics/lessons/Lambda-Exercise/

        List<Person> people = Arrays.asList(
                new Person("Charles", "Dickens", 60),
                new Person("Lewis", "Carroll", 42),
                new Person("Thoams", "Carlyle", 51),
                new Person("Charlotte", "Bronte", 45)


                // ----- Using a Lambda expression: ------

                // Step 1: Sort list by last name
                // Step 2: Create a method that prints all elements in the list
                // Step 3: Create a method that prints all people that have last name beginning with C

        );

        // Exercise 3:

        people.forEach( (Person person) -> { if (person.getLastname().charAt(0) == 'C' ) {System.out.println( person.getLastname());}}) ;
        people.forEach((Person::getAllLastNameThatBeginWithCs));

    }


}
