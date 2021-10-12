/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import view.WorkoutListUI;

/**
 *
 * @author Sarah
 */
public class WorkoutCtrl
{

    WorkoutListUI woListUI = new WorkoutListUI();
    
    public WorkoutCtrl()
    {
        
    }
    
    public WorkoutListUI getWoListUI(){
        return woListUI;
    }
}
