/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7;

/**
 *
 * @author Marshal
 */
public class Student {

    String name;
    //at each row index 0 is the course's name and 1 is the course's grade
    String[][] transcript = new String[5][2];

    public String highestGrade() {
        //write your algorithm here
        //assume the lowest grade is -1 which is not real !!!
        int highestGrade = -1;
        String course = "";
        for (int index = 0; index < transcript.length; ++index) {
            //convert string to int
            int grade = Integer.parseInt(transcript[index][1]);
            //compare the current grade in loop with the assumed variable
            if (grade > highestGrade) {
                highestGrade = grade;
                course = transcript[index][0];
            }
        }
        return "Your highest grade in " + course + " (" + highestGrade + ")";
    }

    public String lowestGrade() {
        //write your algorithm here
        //assume the highest grade is 101 which is not real !!!
        int lowestGrade = 101;
        String course = "";
        for (int index = 0; index < transcript.length; ++index) {
            //convert string to int
            int grade = Integer.parseInt(transcript[index][1]);
            //compare the current grade in loop with the assumed variable
            if (grade < lowestGrade) {
                lowestGrade = grade;
                course = transcript[index][0];
            }
        }
        return "Your lowest grade in " + course + " (" + lowestGrade + ")";
    }

    public int gradeByCourseName(String course) {
        /**
         *                      ##  To do   ##
         * 1.search inside the transscript for the given course's name
         * 2.parse the grade from string to int like this int grade =
         * Integer.parseInt(transcript[index][1]); 3.instead of returning zero
         * (0) return the grade
         */
        or(int index = 0; index < transcript.length; ++index){
     if (transcript[index][0].equals(course)) {
         return Integer.parseInt(transcript[index][1]);
     }
 }
        return 0;
    }
}
