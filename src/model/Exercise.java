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
public class Exercise
{
    private String name;
    private ArrayList<Set> set;
    private ArrayList<String> musclesWorked;
    private String compoundType;
    private int orderNum;

    public Exercise(String name, ArrayList<Set> set, ArrayList<String> musclesWorked, String compoundType, int orderNum)
    {
        this.name = name;
        this.set = set;
        this.musclesWorked = musclesWorked;
        this.compoundType = compoundType;
        this.orderNum = orderNum;
    }
    
    public Exercise()
    {
        this.name = "";
        this.set = new ArrayList<>();
        this.musclesWorked = new ArrayList<>();
        this.compoundType = "";
        this.orderNum = 0;
    }     

    public ArrayList<String> getMusclesWorked()
    {
        return musclesWorked;
    }

    public void setMusclesWorked(ArrayList<String> musclesWorked)
    {
        this.musclesWorked = musclesWorked;
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

    public ArrayList<Set> getSet()
    {
        return set;
    }

    public void setSet(ArrayList<Set> set)
    {
        this.set = set;
    }

    @Override
    public String toString()
    {
        return  name + ": sets=" + set + ", muscles worked=" + musclesWorked + ", compound type=" + compoundType;
    }
    
    public int getOrderNum()
    {
        return orderNum;
    }

    public boolean decideToInsert(Exercise exercise)
    {
        boolean insert = false;
        if (exercise.getOrderNum() < this.orderNum)
        {
            insert = true;
        }
        return insert;
    }
         
}
