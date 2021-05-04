package pt.ipp.isep.dei.examples.tdd.basic.domain;

/**
 * Calculator class.
 * This class is very simple in order to demonstrate how to build test cases for Unit Testing.
 */
public class Calculator {

    /**
     * Sums one operand to the other, returning the result.
     *
     * @param firstOperand  First operand to sum.
     * @param secondOperand Second Operand to sum.
     * @return The sum of firstOperand with secondOperand.
     */
    public int sum(int firstOperand, int secondOperand) {
        return Math.addExact(firstOperand, secondOperand);
    }

    public int subtract(int firstOperand, int secondOperand) 
    {
    	return Math.subtractExact(firstOperand, secondOperand);
    }

    public int divide(int dividend, int divisor) {
        if (divisor == 0){
            throw new ArithmeticException("Can't divide by Zero");
        }
    	return dividend / divisor;
    }

    public int multiply(int firstOperand, int secondOperand) {
    	return Math.multiplyExact(firstOperand, secondOperand);
    }

    public int factorial(int firstOperand) 
    {
    	int result = 1;
    	for(int i  = firstOperand; i >= 1; i--)
    	{
    		if(result*firstOperand < 0 )
    		{
    			throw new ArithmeticException("Integer overflow");
    		}
    		System.out.println(result+" "+i);
    		result*= i;
    	}
    	return result;
    }
}
