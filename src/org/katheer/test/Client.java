package org.katheer.test;

import org.katheer.bean.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
    public static void main(String[] args) {
        /*
        autowire=constructor --> byType + Constructor DI
        ------------------------------------------------
        In this method, the bean objects required by the constructor is
        automatically wired using byType method.

        So, two beans can't have same type. If it has, then we should turn
        off autowiring for another bean.

        In order to avoid ambiguity problem, we should use index attribute
        for constructor-args.
         */
        ApplicationContext context = new ClassPathXmlApplicationContext("org" +
                "/katheer/resource/applicationContext.xml");

        Student std1 = (Student) context.getBean("std1");
        std1.showStudentInfo();
    }
}