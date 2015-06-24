package Samples.Basics;

import java.math.BigInteger;

public class FibonacciExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FibonacciExample F1 = new FibonacciExample();
		F1.call_Fib(100);
		
	    }

	void call_Fib (int n){
		
		for(int i=0;i<=n;i++){
			
			System.out.println(fib(i));
		}
	}
	
	
	int fib (int x){
		int result=0;
		if (x >=0){

			if (x ==0){
				result= 1;}
			
			else if (x ==1){
			  result= 1; }
		
		
			else {
			result= fib(x-1)+fib(x-2);}
		
		}
		return result;
		
	}
	
}
	

