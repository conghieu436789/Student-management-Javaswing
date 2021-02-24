/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import casestudentmanagement.model.Student;
import java.util.ArrayList;

/**
 *
 * @author Hieu
 */
public class IDExist {
    public static boolean isIDExist(ArrayList<Student> studentList, String ID) {
        for (Student student:studentList) {
            if (isMatchID(student, ID))
                return true;
        }
        return false;
    }
    public static boolean isMatchID(Student student, String ID) {
        return student.getID().equals(ID);
    }
}
