/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trainsmart;

import model.Workout;
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
public class WorkoutTest
{

    ArrayList<Exercise> exercises = new ArrayList<>();
    ArrayList<Set> squatSet = new ArrayList<>();
    ArrayList<String> squatMuscles = new ArrayList<>();
    ArrayList<String> deadliftMuscles = new ArrayList<>();
    ArrayList<Set> deadliftSet = new ArrayList<>();
    Set dSet1 = new Set(185.0, 10);
    Set dSet2 = new Set(205.0, 5);
    Set set1 = new Set(215.0, 5);
    Set set2 = new Set(225.0, 5);
    Exercise squat = new Exercise("Squat", squatSet, squatMuscles, "Legs", 3);
    Exercise deadlift = new Exercise("Deadlift", deadliftSet, deadliftMuscles, "Legs", 8);

    public WorkoutTest()
    {

        squatMuscles.add("Quads");
        squatMuscles.add("Glutes");
        deadliftMuscles.add("Glutes");
        deadliftMuscles.add("Hamstrings");
        deadliftSet.add(dSet1);
        deadliftSet.add(dSet2);
        squatSet.add(set1);
        squatSet.add(set2);
        exercises.add(squat);
        exercises.add(deadlift);

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
     * Test of getCompoundType method, of class Workout.
     */
    //Workout(String name, ArrayList<Exercise> exercises, String compoundType)
    @Test
    public void testGetCompoundType()
    {
        System.out.println("getCompoundType");
        Workout instance = new Workout("Leg One", exercises, "Legs");
        String expResult = "Legs";
        String result = instance.getCompoundType();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setCompoundType method, of class Workout.
     */
    @Test
    public void testSetCompoundType()
    {
        System.out.println("setCompoundType");
        String compoundType = "Lower Body";
        Workout instance = new Workout("Leg One", exercises, "Legs");
        instance.setCompoundType(compoundType);
        assertEquals(compoundType, instance.getCompoundType());
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getName method, of class Workout.
     */
    @Test
    public void testGetName()
    {
        System.out.println("getName");
        Workout instance = new Workout("Leg One", exercises, "Legs");
        String expResult = "Leg One";
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setName method, of class Workout.
     */
    @Test
    public void testSetName()
    {
        System.out.println("setName");
        String name = "Leg Two";
        Workout instance = new Workout("Leg One", exercises, "Legs");
        instance.setName(name);
        assertEquals(name, instance.getName());
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getExercises method, of class Workout.
     */
    @Test
    public void testGetExercises()
    {
        System.out.println("getExercises");
        Workout instance = new Workout("Leg One", exercises, "Legs");
        ArrayList<Exercise> expResult = exercises;
        ArrayList<Exercise> result = instance.getExercises();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setExercises method, of class Workout.
     */
    @Test
    public void testSetExercises()
    {
        System.out.println("setExercises");
        ArrayList<Exercise> newExercises = new ArrayList<>();
        Exercise squat = new Exercise("Back Squat", squatSet, squatMuscles, "Lower Body", 4);
        Exercise deadlift = new Exercise("Barbell Deadlift", deadliftSet, deadliftMuscles, "Lower Body", 10);
        newExercises.add(squat);
        newExercises.add(deadlift);
        Workout instance = new Workout("Leg One", exercises, "Legs");
        instance.setExercises(newExercises);
        assertEquals(newExercises, instance.getExercises());
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Workout.
     */
    @Test
    public void testToString()
    {
        System.out.println("toString");
        Workout instance = new Workout("Leg One", exercises, "Legs");
        String expResult = "Workout{" + "name=" + "Leg One" + ", exercises=" + exercises + ", compoundType=" + "Legs" + '}';
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

}
