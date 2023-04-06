/*
Users inputs number of subjects. User inputs marks for each subject. Find Sum, Average and Highest of Marks.
*/

import java.util.Scanner;
class File
{
	public static void main(String[] args)
	{
		int[] marks={10,20,30,40};
		String[] subjects={"Math","Phy","Chem","Bio"};
		System.out.println("SUBJECT"+"\t"+"MARKS");
		for(int i=0;i<marks.length;i++)
		{
			System.out.print(subjects[i]+"\t");
			System.out.println(marks[i]);
		}
	}
}