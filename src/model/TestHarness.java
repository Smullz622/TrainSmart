/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import model.Set;
import java.util.ArrayList;

/**
 *
 * @author Sarah
 */
public class TestHarness
{

    public TestHarness()
    {

        //testPerson();
        //testSet();
        testClassHierarchy();

    }

    public void testClassHierarchy()
    {
        //test toString()
        Person t1 = new Person("Sarah Smulligan", "06/22/93", "smm5878@psu.edu");
        Person t2 = new User("smullz", "t3s1P@ss", "Sarah", "June 22, 1993", "smacklin622@gmail.com");
        Person t3 = new Athlete("hypertrophy", "intermediate", "build muscle", 123, "smullz622", "P@ssw03d", "Sarah S", "06-22-93", "smulligan622@gmail.com");
        ArrayList<Person> pTest = new ArrayList();
        pTest.add(t1);
        pTest.add(t2);
        pTest.add(t3);
        
        for (int i = 0; i < pTest.size(); ++i)
        {
            System.out.println(pTest.get(i).toString() + "\n");
        }

        //test exists()
        User u1 = new User("smullz", "t3s1P@ss", "Sarah", "June 22, 1993", "smacklin622@gmail.com");
        Athlete a1 = new Athlete("hypertrophy", "intermediate", "build muscle", 123, "smullz622", "P@ssw03d", "Sarah S", "06-22-93", "smulligan622@gmail.com");
        ArrayList<User> uTest = new ArrayList();
        uTest.add(u1);
        ArrayList<Athlete> aTest = new ArrayList();
        aTest.add(a1);
        
        System.out.print("Person: ");
        t1.exists(pTest);
        System.out.print("User: ");
        u1.exists(uTest, "smullz");
        System.out.print("Athlete: ");
        a1.exists(aTest, 123);

    }

    private void testPerson()
    {
        //test User class
        Person testU = new Person("Sarah", "06/22/1993", "smm5878@psu.edu");
        if (testU != null)
        {
            System.out.println("USER CLASS CREATED");
            //test toString
            System.out.println(testU.toString());
            //test name methods
            System.out.println("Previous name: " + testU.getName());
            testU.setName("Smulligan");
            System.out.println("Updated name: " + testU.getName());
            //test birthdate methods
            System.out.println("Previous birthdate: " + testU.getBirthDate());
            testU.setBirthDate("06/22/1992");
            System.out.println("Updated birthdate: " + testU.getBirthDate());
            
        }
        //test User class empty constructor
        Person testUemp = new Person();
        System.out.println("Test User with empty constructor: " + "\n" + testUemp.toString());
    }

    private void testSet()
    {
        //test Set class
        Set testS = new Set(215.0, 5);
        if (testS != null)
        {
            System.out.println("\nSET CLASS CREATED");
            //test toString
            System.out.println(testS.toString());
            //test weights methods
            System.out.println("Previous weight: " + testS.getWeight());
            testS.setWeight(225.0);
            System.out.println("Updated weight: " + testS.getWeight());
            //test reps
            System.out.println("Reps: " + testS.getReps());
            testS.setReps(6);
            System.out.println("Updated reps: " + testS.getReps());
        }
        //test Set mepty constructor
        Set testSemp = new Set();
        System.out.println("Test Set with empty constructor: " + "\n" + testSemp.toString());
    }
}
