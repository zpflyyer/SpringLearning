package com.pengfei.springmvc.Service.ServiceImpl;

import com.pengfei.springmvc.Dao.StudentDao;
import com.pengfei.springmvc.Model.Student;
import com.pengfei.springmvc.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by zhaopen on 3/16/2017.
 */
@Component
public class StudentServiceImpl implements StudentService {

    @Autowired
    StudentDao studentDao;

    public  List<Student> getAllStudents(){
        return studentDao.getStudentList();
    }
}
