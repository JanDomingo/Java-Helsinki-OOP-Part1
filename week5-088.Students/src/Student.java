/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jandomingo
 */
public class Student {
    private String studentName;
    private String studentNumber;
    
    public Student (String studentName, String studentNumber) {
        this.studentName = studentName;
        this.studentNumber = studentNumber;
    }
    
    public String getName() {
        return this.studentName;
    }
    
    public String getStudentNumber() {
        return this.studentNumber;
    }
    
    public String toString() {
        return this.studentName + " (" + this.studentNumber + ")";
    }
}
