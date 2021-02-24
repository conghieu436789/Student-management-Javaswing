/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package casestudentmanagement.model;

import java.util.Comparator;

/**
 *
 * @author Hieu
 */
public class ComparatorName implements Comparator<Student>{

    @Override
    public int compare(Student o1, Student o2) {
        return o1.getLastName().toUpperCase().compareTo(o2.getLastName().toUpperCase());
    }

}
