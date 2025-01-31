package com.assignments;

public class Assignment2 {

	public static void main(String[] args) {
		
		//create 3D array to store engineering course details
		String [][][] engineering= {
				
				//store semester1 subjects and respective marks
				{
				      {"Mathematics","Physics","Chemistry","Computer Programming","Engineering Drawing","Basic Electrical Eng"},
				      {"78","85","91","74","88","79"}
				},
				
				//store semester2 subjects and respective marks
				{
				      {"Mathematics II","Mechanics","Environmental Sci.","Basic Electronics","Engineering Physics","Engineering Graphics"},
				      {"82","77","93","69","84","90"}
				},
				
				//store semester3 subjects and respective marks
				{
				      {"Data Structures","Discrete Mathematics","Digital Electronics","Operating Systems","Signals and Systems","Object-Oriented Prog"},
				      {"88","81","76","92","85","78"}
				},
				
				//store semester4 subjects and respective marks
				{
					  {"Algorithms","Computer Networks","Database Systems","Microprocessors","Communication Eng","Software Engineering"},
				      {"91","73","89","80","76","87"}
				},
				
				//store semester5 subjects and respective marks
				{
				      {"Probability & Stats","Machine Learning","Compiler Design","Theory of Computation","Embedded Systems","Computer Graphics"},
				      {"86","88","84","95","73","90"}
				}
				
		};
		
		//Print Semester 3 - Subject 4 Name
		System.out.println(engineering[2][0][3]);
		//Print Semester 3 - Subject 5 Name.
		System.out.println(engineering[2][0][4]);
		System.out.printf("Semester 3 - Subject 4: Name is %s and Semester 3 - Subject 5: Name is %s%n",engineering[2][0][3],engineering[2][0][4]);
		
		//Print Semester 5 - Subject 3 marks
		System.out.println(engineering[4][1][2]);
		//Print Semester 5 - Subject 6 marks
		System.out.println(engineering[4][1][5]);
		System.out.printf("Semester 5 - Subject 3: Marks is %s and Semester 5 - Subject 6: Marks is %s%n",engineering[4][1][2],engineering[4][1][5]);

	}

}
