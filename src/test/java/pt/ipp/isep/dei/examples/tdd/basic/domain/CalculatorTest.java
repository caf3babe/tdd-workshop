package pt.ipp.isep.dei.examples.tdd.basic.domain;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    @BeforeAll
    public static void classSetUp() {
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
    public void failingTest() {
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
    public void ensureMinusFivePlusMinusFiveEqualsMinusTen() {
        System.out.println("\t\tExecuting " + new Object() {
        }.getClass().getEnclosingMethod().getName() + " Test");

        int expectedResult = -10;
        int firstOperand = -5;
        int secondOperand = -5;
        int result = 7;

        result = new Calculator().sum(firstOperand, secondOperand);

        assertEquals(expectedResult, result);
    }

    @Test
    public void whenIntegerOverflowInAddition_thenAssertionSucceeds() {
        System.out.println("\t\tExecuting " + new Object() {
        }.getClass().getEnclosingMethod().getName() + " Test");

        int firstOperand = 2147483647;
        int secondOperand = 2147483647;

        Exception exception = assertThrows(ArithmeticException.class, () -> {
            new Calculator().sum(firstOperand, secondOperand);
        });

        String expectedMessage = "integer overflow";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.equalsIgnoreCase(expectedMessage));
    }

    /**
    *
    * Subtract Function Tests
    *
    * */

    @Test
    public void ensureThreeMinusMinusTwoEqualsFive() {
        //HACK: for demonstration purposes only
        System.out.println("\t\tExecuting " + new Object() {
        }.getClass().getEnclosingMethod().getName() + " Test");

        // Arrange
        int firstOperand = 3;
        int secondOperand = -2;
        int expectedResult = 5;
        int result = 3;

        // Act
        result = new Calculator().subtract(firstOperand, secondOperand);

        // Assert
        assertEquals(expectedResult, result);
    }

    @Test
    public void ensureMinusFiveMinusMinusFiveEqualsZero() {
        System.out.println("\t\tExecuting " + new Object() {
        }.getClass().getEnclosingMethod().getName() + " Test");

        int expectedResult = 0;
        int firstOperand = -5;
        int secondOperand = -5;
        int result = 7;

        result = new Calculator().subtract(firstOperand, secondOperand);

        assertEquals(expectedResult, result);
    }

    @Test
    public void whenIntegerOverflowInSubtraction_thenAssertionSucceeds() {
        System.out.println("\t\tExecuting " + new Object() {
        }.getClass().getEnclosingMethod().getName() + " Test");

        int firstOperand = -2147483647;
        int secondOperand = 2147483647;

        Exception exception = assertThrows(ArithmeticException.class, () -> {
            new Calculator().subtract(firstOperand, secondOperand);
        });

        String expectedMessage = "integer overflow";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.equalsIgnoreCase(expectedMessage));
    }

    /**
     *
     * Division Function Tests
     *
     * */

    @Test
    public void ensureThreeDividedByTwoEqualsOne() {
        //HACK: for demonstration purposes only
        System.out.println("\t\tExecuting " + new Object() {
        }.getClass().getEnclosingMethod().getName() + " Test");

        // Arrange
        int firstOperand = 3;
        int secondOperand = 2;
        int expectedResult = 1;
        int result = 3;

        // Act
        result = new Calculator().divide(firstOperand, secondOperand);

        // Assert
        assertEquals(expectedResult, result);
    }

    @Test
    public void ensureMinusFiveDividedByMinusFiveEqualsOne() {
        System.out.println("\t\tExecuting " + new Object() {
        }.getClass().getEnclosingMethod().getName() + " Test");

        int expectedResult = 1;
        int firstOperand = -5;
        int secondOperand = -5;
        int result = 7;

        result = new Calculator().divide(firstOperand, secondOperand);

        assertEquals(expectedResult, result);
    }

    @Test
    public void whenDividedByZero_thenAssertionSucceeds() {
        System.out.println("\t\tExecuting " + new Object() {
        }.getClass().getEnclosingMethod().getName() + " Test");

        int firstOperand = -2147483647;
        int secondOperand = 0;

        Exception exception = assertThrows(ArithmeticException.class, () -> {
            new Calculator().divide(firstOperand, secondOperand);
        });

        String expectedMessage = "Can't divide by Zero";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.equalsIgnoreCase(expectedMessage));
    }


    /**
     *
     * Multiplication Function Tests
     *
     * */

    @Test
    public void ensureFiveMultipliedByThreeEqualsFifteen() {
        System.out.println("\t\tExecuting " + new Object() {
        }.getClass().getEnclosingMethod().getName() + " Test");

        int expectedResult = 15;
        int firstOperand = 5;
        int secondOperand = 3;
        int result = 7;

        result = new Calculator().multiply(firstOperand, secondOperand);

        assertEquals(expectedResult, result);
    }

    @Test
    public void whenMultiplicationExceedsIntegerRange_thenAssertionSucceeds() {
        System.out.println("\t\tExecuting " + new Object() {
        }.getClass().getEnclosingMethod().getName() + " Test");

        int firstOperand = 2147483647;
        int secondOperand = 345;

        Exception exception = assertThrows(ArithmeticException.class, () -> {
            new Calculator().multiply(firstOperand, secondOperand);
        });

        String expectedMessage = "integer overflow";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.equalsIgnoreCase(expectedMessage));
    }


    /**
     *
     * Factorial Function Tests
     *
     * */

    @Test public void ensureFactorialOfZeroIsOne(){
        System.out.println("\t\tExecuting " + new Object() {
        }.getClass().getEnclosingMethod().getName() + " Test");

        int number = 0;
        int expected = 1;

        int result = new Calculator().factorial(number);

        assertEquals(expected, result);
    }

    @Test public void ensureFactorialOfOneIsOne(){
        System.out.println("\t\tExecuting " + new Object() {
        }.getClass().getEnclosingMethod().getName() + " Test");

        int number = 1;
        int expected = 1;

        int result = new Calculator().factorial(number);

        assertEquals(expected, result);
    }

    @Test public void calculateFactorialOfTen(){
        System.out.println("\t\tExecuting " + new Object() {
        }.getClass().getEnclosingMethod().getName() + " Test");

        int number = 10;
        int expected = 3628800;

        int result = new Calculator().factorial(number);

        assertEquals(expected, result);
    }
    
    @Test
    public void whenFactorialExceedsIntegerRange_thenAssertionSucceeds()
    {
    	 System.out.println("\t\tExecuting " + new Object() {
         }.getClass().getEnclosingMethod().getName() + " Test");

         int number = 600;

         Exception exception = assertThrows(ArithmeticException.class, () -> {
             new Calculator().factorial(number);
         });
         
         String expectedMessage = "integer overflow";
         String actualMessage = exception.getMessage();

         assertTrue(actualMessage.equalsIgnoreCase(expectedMessage));
    }
    
    @Test
    public void calculateFivePowerTwo()
    {
    	int number = 5;
    	int exponential = 2;
    	
    	int expected = 25;
    	
    	double result = new Calculator().exponential(number,exponential);
    	
    	assertEquals(expected,result);
    	
    }
    
    @Test
    public void calculateZeroPowerMinusTwo()
    {
    	int number = 0;
    	int exponential = -2;
    	
    	int expected = 0;
    	
    	
    	double result = new Calculator().exponential(number,exponential);
    	assertEquals(expected,result);
    	
    }
    
    @Test
    public void calculateSquareRootOfTen()
    {
    	int number = 10;
    	
    	double expected = 3.16;
    	
    	
    	double result = new Calculator().squareRoot(number);
    	
    	assertEquals(expected,result);
    	
    }
    
    @Test
    public void calculateSquareRootOfMinusThousand()
    {
    	int number = -1000;
    	
    	double expected = 0.0;
    	
    	
    	double result = new Calculator().squareRoot(number);
    	
    	assertEquals(expected,result);
    }

}



