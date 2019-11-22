package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.*;
class testss {

    @BeforeAll
    public static void beforeAll() {
       System.out.println("123");
    }

    @BeforeEach
    public void beforeEach() {
        System.out.println("123");
    }

    @Test
   public void succeedingTest() {
        System.out.println("123");
    }

    @Test
    public void failingTest() {
        System.out.println("123");
        // fail("a failing test");
    }

    @Test
    @Disabled("for demonstration purposes")
    public void skippedTest() {
        System.out.println("123");
        // not executed
    }

    @AfterEach
    public void afterEach() {
        System.out.println("123");
    }

    @AfterAll
   public static void afterAll() {
        System.out.println("123");
    }

}
