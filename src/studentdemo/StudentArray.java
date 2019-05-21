/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentdemo;

/**
 * A class to create an array of students and print their names
 * @author megha,21 May,2019
 */
public class StudentArray 
{
    public static void main(String[] args)
    {
        StudentDemo [] studentList = new StudentDemo[5];
        StudentDemo student1 = new StudentDemo("10", "Diana");
        studentList[0] = student1;
        studentList[1] = new StudentDemo("20", "Myra");
        studentList[2] = new StudentDemo("30", "Salina");
        studentList[3] = new StudentDemo("40", "Tom");
        studentList[4] = new StudentDemo("50", "Kiara");
        
        for(int i=0; i<studentList.length; i++)
        {
           // System.out.println(studentList[i].getName());
        }
    }
    
}
