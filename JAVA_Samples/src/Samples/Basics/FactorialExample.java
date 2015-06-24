package Samples.Basics;

import java.math.BigInteger;

public class FactorialExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FactorialExample F1 = new FactorialExample();
        BigInteger NasBigInteger = BigInteger.valueOf(10);

		System.out.println(F1.factorial(NasBigInteger));
		
	}

	BigInteger  factorial(BigInteger  n){
		if (n.equals(BigInteger.ZERO)){
		 return BigInteger.ONE;}
		else{ 
		return n.multiply(factorial(n.subtract(BigInteger.ONE)));
		}
	}
}
