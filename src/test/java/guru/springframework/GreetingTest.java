package guru.springframework;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class GreetingTest {

    private Greeting greeting;
    private static int count;

    @BeforeAll
    public static void beforeClass(){
        System.out.println("This executes before any test cases. Count = " + count++);
    }

    @BeforeEach
    public void setUp(){
        greeting = new Greeting();
    }

    @Test
    void helloWorld() {
        System.out.println(greeting.helloWorld());
    }

    @Test
    void testHelloWorld() {
        System.out.println(greeting.helloWorld("John"));
    }

    @AfterEach
    void tearDown(){
        System.out.println("Count = " + count++);
    }

    @AfterAll
    public static void afterClass(){
        System.out.println("Cleaned up ");
    }
}