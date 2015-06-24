package Samples.Basics;

public class Student {


	
	public Student(int i, String b, int r) {
		// TODO Auto-generated constructor stub
		this.Age=i;
		this.Name=b;
		this.Roll_No = r;
	}


	public String getName() {
		return Name;
	}


	public void setName(String name) {
		Name = name;
	}


	public String getBatch() {
		return Batch;
	}


	public void setBatch(String batch) {
		Batch = batch;
	}


	public int getRoll_No() {
		return Roll_No;
	}


	public void setRoll_No(int roll_No) {
		Roll_No = roll_No;
	}

	private int Age;

	public int getAge() {
		return Age;
	}


	public void setAge(int age) {
		Age = age;
	}

	String Name;
	private String Batch;
	private int Roll_No;
	private static int  No_of_Subjects;
	
	private double Total_Score_Achieved=0;
	private double Percent_Score;
	
	public double calculateScoreSum (Double[] scorearray){
		
		for(double i : scorearray){
			
			Total_Score_Achieved+=i;
			
		}
		
		return Total_Score_Achieved;
		
	}

	
	public int getNo_of_Subjects() {
		return No_of_Subjects;
	}

	public static void setNo_of_Subjects(int no_of_Subjects) {
		No_of_Subjects = no_of_Subjects;
	}
	
	
	
}
