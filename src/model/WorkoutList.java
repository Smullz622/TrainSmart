/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author Sarah
 */
public class WorkoutList
{
    private ArrayList<Workout> workoutList;

    public WorkoutList()
    {
        workoutList =  new ArrayList();
        createTestList();
    }

    private void createTestList()
    {
        ArrayList<Exercise> pushEx = new ArrayList();
        pushEx.add(new Exercise());
        ArrayList<Exercise> legEx = new ArrayList();
        legEx.add(new Exercise());
        
        workoutList.add(new Workout("Push", pushEx, "Chest"));
        workoutList.add(new Workout("Leg", legEx, "Legs"));
    }

    public ArrayList<Workout> getWorkoutList()
    {
        return workoutList;
    }

    public void setWorkoutList(ArrayList<Workout> workoutList)
    {
        this.workoutList = workoutList;
    }
    
    
    
    
}
