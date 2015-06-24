package Samples.Basics;

import java.util.Arrays;
import java.io.BufferedReader;
import java.io.Console;
import java.io.IOException;
import java.io.InputStreamReader;

public class StudentTestDrive {

	private static String[] as;
	private static int[] sarrays;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Student S1= new Student(32,"Vipul", 00256);	
        System.out.println(S1.Name);
        
        
      
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter No. of Subjects... "+ "\n");
        int s = 0 ;
		try {
			s = Integer.parseInt(br.readLine());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}        
		
        Student.setNo_of_Subjects(s);
        //System.out.println(S1.getNo_of_Subjects());
        int alenght = S1.getNo_of_Subjects();

        Double[] scorearray = new Double[alenght];
        System.out.print("Enter Score in each of Subjects..."+ "\n");
        
        
        for(int i=0;i<alenght;i++){
        	int j=i+1;
        System.out.print("Subject: " + j + "\n");
        Double s1  ;
		try {
			BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));
			s1 = Double.parseDouble(br2.readLine());
			scorearray[i]=s1;
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
        }
        
        
        Double total_score=S1.calculateScoreSum(scorearray);
        System.out.println("Total Score: " + total_score);
        
        double percent = (total_score*100)/(alenght*100);
        System.out.println("Your Percentage is:  " + percent + " %");

	}

	@Override
	public String toString() {
		return "StudentTestDrive [getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}
	

	
}
