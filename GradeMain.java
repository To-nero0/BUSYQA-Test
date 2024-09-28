package Test;

public class GradeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   		StudentGrade studentGrades = new StudentGrade();

		    		        studentGrades.addGrade("Anthony", 89);
		        studentGrades.addGrade("okafor", 66);
		        studentGrades.addGrade("Chiz", 76);

		    		        System.out.println("Anthony's Grade: " + studentGrades.getGrade("Anthony"));

		     
		        studentGrades.removeStudent("okafor");
		        System.out.println("Remaining students and grades:");
		        studentGrades.printAllGrades();
	}}


