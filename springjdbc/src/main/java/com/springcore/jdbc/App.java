package com.springcore.jdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.springcore.jdbc.dao.StudentDao;
import com.springcore.jdbc.dao.StudentDaoImpl;
import com.springcore.jdbc.entities.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	System.out.println("program started.......");
    	
        ApplicationContext con = new ClassPathXmlApplicationContext("com/springcore/jdbc/config.xml");
        
        
        StudentDao sd = con.getBean("studentDao" , StudentDaoImpl.class);
        
        // use for a method insert the data
        
//        Student student = new Student();
//        student.setId(17);
//        student.setName("janvi");
//        student.setCity("rajgarh");
//        
//        int result = sd.insert(student);
//        
//        System.out.println("student added" + result );
        
        
        // update the data
//        student.setId(16);
//        student.setName("Dhakad");
//        student.setCity("Khujner");
//        
//        int result = sd.change(student);
//        System.out.println("changed data...." + result);
        
        
        // delete data
        
//        student.setId(106);
//        int result = sd.delete(student);
//        System.out.println("delete data..." + result);
        
        
        // fetch the single data from the database
        
//        Student student2 = sd.getStudent(82);
//        System.out.println(student2);
        
        // fatch the all data from the database
        
        
        List<Student> allStudent = sd.getAllStudent();
        
        for (Student student2 : allStudent) {
        	System.out.println(student2);
			
		}
        
        
        
        
        
        /// Direct query update
        
//        JdbcTemplate temp = con.getBean("jdbcTemplate" , JdbcTemplate.class);
//        
//        String query = "insert into student (id , name , city) values(?,?,?)";
//        
//        int result = temp.update(query,82,"raj" , "pachore");
//        System.out.println("number of row effected : " + result);
//        
        
    }
}
