package com.higgsup.intern.spring.demo.xml_config;

import com.higgsup.intern.spring.pojo.student.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

public class SpringXMLConfigDemo {
    public static void main(String[] args) {
        //create the factory bean after loading the bean configuration file from the given path.
//       ClassPathXmlApplicationContext API takes care of creating and initializing all the objects
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-beans.xml");

//      getBean() method uses bean ID to return a generic object, which finally can be casted to the actual object.
        Student student = applicationContext.getBean(Student.class);

//      use this object to call any class method
        student.registerObligatorySubject();

    }
}
