package pt.ipp.isep.dei.examples.tdd.basic.domain;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class CalculatorTest {

    @BeforeAll
    public static void classSetUp() 
    {
        //HACK: for demonstration purposes only
        System.out.println("This is a CalculatorTest class method and takes place before any @Test is executed");
        
   
    }

    @AfterAll
    public static void classTearDown() {
        //HACK: for demonstration purposes only
        System.out.println(
                "This is a CalculatorTest class method and takes place after all @Test are executed");
    }

    @BeforeEach
    public void setUp() {
        //HACK: for demonstration purposes only
        System.out.println(
                "\tThis call takes place before each @Test is executed");
    }

    @AfterEach
    public void tearDown() {
        //HACK: for demonstration purposes only
        System.out.println(
                "\tThis call takes place after each @Test is executed");
    }

    @Test
    @Disabled
    public void failingTest() 
    {
        fail("a disabled failing test");
    }

   
    /**
     * Test to ensure two positive numbers are summed correctly.<p>
     * <p>
     * For demonstration purposes the Arrange/Act/Assert syntax is used:<p>
     * Arrange: one positive number (three) and another positive number (two).<p>
     * Act: sum both numbers (three and two).<p>
     * Assert: the result is five.
     */
    @Test
    public void ensureThreePlusTwoEqualsFive() {

        //HACK: for demonstration purposes only
        System.out.println("\t\tExecuting " + new Object() {
        }.getClass().getEnclosingMethod().getName() + " Test");

        // Arrange
        int expectedResult = 5;
        int firstOperand = 3;
        int secondOperand = 2;
        int result = 3;

        // Act
        result = new Calculator().sum(firstOperand, secondOperand);

        // Assert
        assertEquals(expectedResult, result);
    }

    /**
     * Test to ensure positive and negative numbers are summed correctly.<p>
     * <p>
     * For demonstration purposes the Arrange/Act/Assert syntax is used:<p>
     * Arranje a positive number (three) and a negative number (minus two)<p>
     * Act I sum three to minus two<p>
     * Assert the sum result should be one.
     */
    @Test
    public void ensureThreePlusMinusTwoEqualsOne() {
        //HACK: for demonstration purposes only
        System.out.println("\t\tExecuting " + new Object() {
        }.getClass().getEnclosingMethod().getName() + " Test");

        // Arrange
        int firstOperand = 3;
        int secondOperand = -2;
        int expectedResult = 1;
        int result = 3;

        // Act
        result = new Calculator().sum(firstOperand, secondOperand);

        // Assert
        assertEquals(expectedResult, result);
    }
    @Test
    public void ensureMinusFivePlusMinusFiveEqualsMinusTen()
    {
    	System.out.println("\t\tExecuting " + new Object() {
        }.getClass().getEnclosingMethod().getName() + " Test");
    	
    	
    	int expectedResult = -10;
        int firstOperand = -5;
        int secondOperand = -5;
        int result = 7;
    	
    	
        result = new Calculator().sum(firstOperand, secondOperand);
       
        assertEquals(expectedResult, result);
    }
    
    
    
}



