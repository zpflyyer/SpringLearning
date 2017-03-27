package com.pengfei.springmvc.Dao;

import com.pengfei.springmvc.Model.Student;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by zhaopen on 3/16/2017.
 */
public interface StudentDao {
    List<Student> getStudentList();
}
