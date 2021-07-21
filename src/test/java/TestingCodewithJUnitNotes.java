import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class TestingCodewithJUnitNotes {

    public static void main(String[] args) {
    }

//     Testing your code will help you to keep it clean, maintainable,
//     and reusable. One of the hardest parts of testing code is when you
//     face legacy code that was written by others. In this module, we will
//     go through a small example of how to test our code from the beginning
//     of a project, how to test an existing code base, as well as some of
//     the best practice when engaging in test driven development.
//
//     To use Maven, you need to add dependency on your xml file.
//
//    <dependency>
//        <groupId>junit</groupId>
//        <artifactId>junit</artifactId>
//        <version>4.12</version>
//        <scope>test</scope>
//    </dependency>
//
//
//     *** The @Test Annotation *** \\

//     The @Test annotation tells JUnit that the public void method to which
//     it is attached can be run as a test case. To run the method, JUnit
//     first constructs a fresh instance of the class then invokes the annotated
//     method. Any exceptions thrown by the test will be reported by JUnit
//     as a failure. If no exceptions are thrown, the test is assumed to have
//     succeeded.
//
//     *** Assertions *** \\
//
//     In the following code examples we will use assertions to test our code,
//     most of these methods have an optional message as a parameter but in
//     practice the process of "finding out what's wrong" usually involves
//     enough detail that an extra message isn't going to make much difference.
//     Consider `time saved by having a message` vs `time spent thinking of
//     customized messages for simple yes/no questions, we won't be using them
//     in these code examples.
//
//     Let's talk about some of the most common assertion methods that are
//     available:
//
//     *** assertEquals *** \\
//
//     The assertEquals assertion verifies that the expected, and the actual
//     values are equal:

        @Test
        public void testIfCompanyNameIsEquals() {
        String expected = "Codeup";
        String actual = "Codeup";

        assertEquals(expected, actual);

        }

//     When you're using floating points values a third parameter is required
//     (Delta) which represents a positive margin of error of decimals.

        @Test
        public void testIfChangeIsCorrect() {
            Double price = 10.0;
            Double discount = 4.5;

            assertEquals(5.5, price - discount, 0);
            assertEquals(5.1, price - discount, 0.5);
            assertEquals(4.9, price - discount, 0.5);
        }


//     *** assertNotSame and assertSame *** \\
//
//     With assertNotSame, it's possible to verify if two variable don't refer
//     to the same object. Otherwise, when we want to verify that two variables
//     refer to the same object, we can use the 'assertSame' assertion.

    @Test
    public void testIfObjectsAreDifferent() {
        Object dog = new Object();
        Object sheep = new Object();
        Object clonnedSheep = sheep;

        assertNotSame(sheep, dog);
        assertSame(sheep, clonnedSheep);
    }

//     ** assertArrayEquals ** \\
//
//     The 'assertArrayEquals' method checks that two object arrays are equal
//     or not. If they are not, it throws an AssertionError.

    @Test
    public void testIfArrayEquals() {
        char[] expected = {'J','u','n','i','t'};
        char[] actual = "Junit".toCharArray();

        assertArrayEquals(expected, actual);
    }


//     ** assertTrue and assertFalse ** \\
//
//     In case we want to verify that a certain condition is true or false,
//     we can respectively use the assertTrue assertion or the assertFalse one:

    @Test
    public void testIfGreaterOrLesserThanWorks() {

        boolean learningTDD = true;

        assertTrue(learningTDD);
        assertTrue("5 is greater than 4", 5 > 4);
        assertFalse("5 is not greater than 6", 5 > 6);
    }

//     ** assertNull and assertNotNull ** \\
//
//     The following methods are useful to check if an object has been
//     instantiated or not.

//    @Test
//    public void testIfInstanceIsNull() {
//        Device phone = new Device();
//        Device laptop = null;
//        assertNull(null);
//        assertNotNull(phone);
//    }


//     *** The @Before Annotation *** \\
//
//     When writing tests, it is common to find that several tests need similar
//     objects or variables created before they can be run. Annotating a public
//     void method with '@Before' causes that method to be run before the '@Test'
//     method. The '@Before' methods of superclasses will be run before those of the
//     current class. It's like a default constructor for a Plain Java Object Class,
//     and the name of the method does not really matter, but we suggest to use 'setUp()'.

    private List<String> names;

    @Before
    public void setUp(){
        this.names = new ArrayList<>();
        this.names.add("Fer");
    }

//     We can verify that the names list is not longer null because it was initialized in the setUp() method with the following test:
    @Test
    public void testIfNamesIsInitialized(){
        assertNotNull(names);
    }

    @Test
    public void testIfANameCanBeAdded(){
        assertEquals(1, this.names.size());
        this.names.add("Zach");
        assertEquals(2, this.names.size());
        assertSame("fer", this.names.get(0));
        // when setting value to 2 and tries to debug it makes the program crash
        assertSame("Zach", this.names.get(1));
    }


//     *** Test-driven Development Cycle *** \\
//
//     The following develeopment is inspired by the book 'Test-Driven
//     Development by example' by 'Kent Beck'. It is basically a list of
//     steps that can be taken to test your code to make sure that it works:
//
//     1. Add a test
//     2. Run all tests and see if the new test fails
//     3. Write the code
//     4. Run tests
//     5. Refactor code
//     6. Repeat until the feature is complete
//
//
//     *** TO BE CONTINUED *** \\


}
