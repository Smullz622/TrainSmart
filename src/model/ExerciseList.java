/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;

/**
 *
 * @author Sarah
 */
public class ExerciseList
{
    LinkedList<Exercise> exerciseList = new LinkedList();
    int currentExerciseNum = 0;

    public ExerciseList()
    {
        createTestList();
        printList();
    }

    
    public void createTestList()
    {       
        //create elements needed for new exercises
        ArrayList<Set> set1 = new ArrayList();
        set1.add(new Set(215.0, 3));
        set1.add(new Set(225.0, 6));
        
        ArrayList<String> muscles1 = new ArrayList();
        muscles1.add("Quads");
        muscles1.add("Glutes");
        muscles1.add("Hamstrings");
        
        ArrayList<Set> set2 = new ArrayList();
        set2.add(new Set(35.0, 10));
        set2.add(new Set(40.0, 8));
        
        ArrayList<String> muscles2 = new ArrayList();
        muscles2.add("Quads");
        muscles2.add("Glutes");
        
        ArrayList<Set> set3 = new ArrayList();
        set3.add(new Set(35.0, 20));
        set3.add(new Set(35.0, 15));
        
        ArrayList<String> muscles3 = new ArrayList();
        muscles3.add("Hamstrings");
        muscles3.add("Glutes");     

        //instantiate new exercises
        Exercise ex1 = new Exercise("Back Squat", set1, muscles1, "Legs", nextExOrderNum());
        Exercise ex2 = new Exercise("Reverse Lunges",set2, muscles2, "Legs", nextExOrderNum());
        Exercise ex3 = new Exercise("Hip Swings", set3, muscles3, "Legs", nextExOrderNum());
        
        //add to list
        addExercise(ex1);
        addExercise(ex2);
        addExercise(ex3);
    }
    
    public void addExercise(Exercise exercise)
    {
        boolean exAdded = false;
        boolean insertDecision = false;
        
        ListIterator<Exercise> exIterator = exerciseList.listIterator();
        
        while (exIterator.hasNext())
        {
            insertDecision = exIterator.next().decideToInsert(exercise);
            if (insertDecision == true)
            {
                exerciseList.add(exIterator.previousIndex(), exercise);
                exAdded = true;
                break;
            }
        }
        if (!exAdded)
        {
            exerciseList.add(exercise);
        }
    }
    
    public void removeExercise(Exercise exercise)
    {
        exerciseList.remove(exercise);
    }
    
    public Exercise getExercise(String name)
    {
        Exercise exerciseToReturn = null;
        ListIterator<Exercise> exIterator = exerciseList.listIterator();
        while (exIterator.hasNext())
        {
            Exercise exToCheck = exIterator.next();
            if(name.equals(exToCheck.getName()))
            {
                exerciseToReturn = exToCheck;
            }
        }
        if (exerciseToReturn == null)
        {
            System.out.println("Error: Exercise Not Found");
        }
        return exerciseToReturn;
    }

    public void printList()
    {
        ListIterator<Exercise> exIterator = exerciseList.listIterator();
        while (exIterator.hasNext())
        {
          System.out.println(exIterator.next().toString());   
        }        
    }
    
    public int nextExOrderNum()
    {
        currentExerciseNum++;
        return currentExerciseNum; 
    }
}
