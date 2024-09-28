package Test;
import java.util.HashMap;
public class StudentGrade {
	

	    HashMap<String, Double> grades = new HashMap<>();
    public void addGrade(String studentName, double grade) {
	        grades.put(studentName, grade);
	    }

	   	    public double getGrade(String studentName) {
	        return grades.get(studentName);
	    }

	    	    public void removeStudent(String studentName) {
	        grades.remove(studentName);
	    }

	  	    public void printAllGrades() {
	        for (String student : grades.keySet()) {
	            System.out.println(student + ": " + grades.get(student));
	        }
	  	    }}