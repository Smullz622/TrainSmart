/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import model.Exercise;
import java.util.ArrayList;

/**
 *
 * @author Sarah
 */
public class Workout
{
    private String name;
    private ArrayList<Exercise> exercises;
    private String compoundType;

    //full constructor
    public Workout(String name, ArrayList<Exercise> exercises, String compoundType)
    {
        this.name = name;
        this.exercises = exercises;
       // this.warmups = warmups;
        this.compoundType = compoundType;
    }
    
    public Workout()
    {
        this.name = "";
        this.exercises = new ArrayList<>();
        //this.warmups = new ArrayList<>();
        this.compoundType = "";
    }

    public String getCompoundType()
    {
        return compoundType;
    }

    public void setCompoundType(String compoundType)
    {
        this.compoundType = compoundType;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public ArrayList<Exercise> getExercises()
    {
        return exercises;
    }

    public void setExercises(ArrayList<Exercise> exercises)
    {
        this.exercises = exercises;
    }


    @Override
    public String toString()
    {
        return "Workout{" + "name=" + name + ", exercises=" + exercises + ", compoundType=" + compoundType + '}';
    }
    
    
}
