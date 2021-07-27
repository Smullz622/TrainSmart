/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trainsmart;

import model.Exercise;
import model.Set;
import java.util.ArrayList;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Sarah
 */
public class ExerciseTest
{
     Set set1 = new Set(215.0, 5);
        Set set2 = new Set(225.0, 3);
        ArrayList<Set> setArray = new ArrayList<>();
        ArrayList<String> muscles = new ArrayList<>();
    
    public ExerciseTest()
    {
         setArray.add(set1);
        setArray.add(set2);
        muscles.add("Quads");
        muscles.add("Glutes");
        muscles.add("Hamstrings");
    }
    
    @BeforeClass
    public static void setUpClass()
    {
    }
    
    @AfterClass
    public static void tearDownClass()
    {
    }

    /**
     * Test of getMusclesWorked method, of class Exercise.
     */
    @Test
    public void testGetMusclesWorked()
    {
        System.out.println("getMusclesWorked");
        Exercise instance = new Exercise("Squat", setArray, muscles, "Legs", 3);
        ArrayList<String> expResult = new ArrayList<>();
        expResult.add("Quads");
        expResult.add("Glutes");
        expResult.add("Hamstrings");
        ArrayList<String> result = instance.getMusclesWorked();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setMusclesWorked method, of class Exercise.
     */
    @Test
    public void testSetMusclesWorked()
    {
        System.out.println("setMusclesWorked");
        ArrayList<String> musclesWorked = new ArrayList<>();
        musclesWorked.add("Quads");
        musclesWorked.add("Glutes");
        musclesWorked.add("Calves");
        musclesWorked.add("Hamstrings");
        Exercise instance = new Exercise("Squat", setArray, muscles, "Legs", 5);
        instance.setMusclesWorked(musclesWorked);
        assertEquals(musclesWorked, instance.getMusclesWorked());
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getCompoundType method, of class Exercise.
     */
    @Test
    public void testGetCompoundType()
    {
        System.out.println("getCompoundType");
        Exercise instance = new Exercise("Squat", setArray, muscles, "Legs", 6);
        String expResult = "Legs";
        String result = instance.getCompoundType();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setCompoundType method, of class Exercise.
     */
    @Test
    public void testSetCompoundType()
    {
        System.out.println("setCompoundType");
        String compoundType = "Lower Body";
        Exercise instance = new Exercise("Squat", setArray, muscles, "Legs", 7);
        instance.setCompoundType(compoundType);
        assertEquals(compoundType, instance.getCompoundType());
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getName method, of class Exercise.
     */
    @Test
    public void testGetName()
    {
        System.out.println("getName");
        Exercise instance = new Exercise("Squat", setArray, muscles, "Legs", 8);
        String expResult = "Squat";
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setName method, of class Exercise.
     */
    @Test
    public void testSetName()
    {
        System.out.println("setName");
        String name = "Barbell Squat";
        Exercise instance = new Exercise("Squat", setArray, muscles, "Legs", 2);
        instance.setName(name);
        assertEquals(name, instance.getName());
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getSet method, of class Exercise.
     */
    @Test
    public void testGetSet()
    {
        System.out.println("getSet");
        Exercise instance =new Exercise("Squat", setArray, muscles, "Legs", 1);
        ArrayList<Set> expResult = new ArrayList<>();
        expResult.add(set1);
        expResult.add(set2);
        ArrayList<Set> result = instance.getSet();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setSet method, of class Exercise.
     */
    @Test
    public void testSetSet()
    {
        System.out.println("setSet");
        ArrayList<Set> set = new ArrayList<>();
        set.add(set1);
        set.add(set2);
        Set set3 = new Set(225.0, 8);
        set.add(set3);
        Exercise instance = new Exercise("Squat", setArray, muscles, "Legs", 0);
        instance.setSet(set);
        assertEquals(set, instance.getSet());
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Exercise.
     */
    @Test
    public void testToString()
    {
        System.out.println("toString");
        Exercise instance = new Exercise("Squat", setArray, muscles, "Legs", 3);
        String expResult = "Exercise{" + "name=" + "Squat" + ", set=" + setArray + ", musclesWorked=" + muscles + ", compoundType=" + "Legs" + '}';
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
