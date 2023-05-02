package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//        Car car = new Car();
//        car.Drive();

        ApplicationContext context = new ClassPathXmlApplicationContext("Spring.xml");
         //Vehicle obj = (Vehicle) context.getBean("vehicle");
          Vehicle obj = (Vehicle) context.getBean("car");
          obj.Drive();
//
//        Tyre t = (Tyre) context.getBean("tyre");
//        System.out.println(t);


    }
}
