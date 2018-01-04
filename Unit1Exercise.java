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

//        people.sort((person1, person2) -> person1.getLastname().compareTo(person2.getLastname()));

        people.sort(comparing((person) -> person.getLastname()));

        for (Person peeps : people) {
            System.out.println(peeps.getLastname());
        }

    }
}
