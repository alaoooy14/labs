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
public class Lab7 {

    static String grades = "Name            -Physic-Chemistry-C Programming-Quran-English\n"
            + "Hani Althubaiti -100-90-64-90-99\n"
            + "Hassan Alaiafi -100-100-64-60-97\n"
            + "Salem Alslaimi -52-100-64-100-97";

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] lines = grades.split("\n");
        String[] head = lines[0].split("-");
        Student[] theStudents = new Student[lines.length - 1];

        for (int index = 1; index < lines.length; ++index) {
            String[] information = lines[index].split("-");

            Student aStudent = new Student();
            aStudent.name = information[0];
            aStudent.transcript[0][0] = head[1];
            aStudent.transcript[0][1] = information[1];
            aStudent.transcript[1][0] = head[2];
            aStudent.transcript[1][1] = information[2];
            aStudent.transcript[2][0] = head[3];
            aStudent.transcript[2][1] = information[3];
            aStudent.transcript[3][0] = head[4];
            aStudent.transcript[3][1] = information[4];
            aStudent.transcript[4][0] = head[5];
            aStudent.transcript[4][1] = information[5];

            theStudents[index - 1] = aStudent;
        }
        
        //print first student grade
        System.out.println(theStudents[0].highestGrade());
        System.out.println(theStudents[0].highestGrade());
        
        /**
         *              ##  To Do   ##
         * 1. loop for all students to get a grade for a specific
         *      subject such as Chemistry
         * 2. Display grades along with students name in ascending order
         *      output should look like the following lines
         *      Hani Althubaiti     90
         *      Hassan Alaiafi      100
         *      Salem Alslaimi      100
         */
        
    }

}
