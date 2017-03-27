package com.pengfei.springmvc.Dao.DaoImpl;

        import com.pengfei.springmvc.Dao.StudentDao;
        import com.pengfei.springmvc.Model.Student;
        import org.hibernate.Query;
        import org.hibernate.Session;
        import org.hibernate.SessionFactory;
        import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.context.annotation.DependsOn;
        import org.springframework.stereotype.Repository;

        import java.util.LinkedList;
        import java.util.List;

/**
 * Created by zhaopen on 3/16/2017.
 */
@Repository
public class StudentDaoImpl implements StudentDao{

    @Override
    public List<Student> getStudentList() {
        List<Student> students = new LinkedList<>();
        students.add(new Student(3,"apple"));
        students.add(new Student(4,"John"));
        students.add(new Student(40,"uncle"));
        return students;
    }
}

