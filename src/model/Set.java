/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;

/**
 *
 * @author Sarah
 */
public class Set implements Serializable
{
    private Double weight;
    private int reps;
    //add set type

    public Set(Double weight, int reps)
    {
        this.weight = weight;
        this.reps = reps;
    }
    
    public Set()
    {
        this.weight = 0.0;
        this.reps = 0;
    }

    public Double getWeight()
    {
        return weight;
    }

    public void setWeight(Double weight)
    {
        this.weight = weight;
    }

    public int getReps()
    {
        return reps;
    }

    public void setReps(int reps)
    {
        this.reps = reps;
    }

    @Override
    public String toString()
    {
        return "Set{" + "weight=" + weight + ", reps=" + reps + '}';
    }
    
    
}
