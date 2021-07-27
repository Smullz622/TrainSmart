/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.ReadinessList;
import model.SetList;

/**
 *
 * @author Sarah
 */
public class SerializedCtrl
{
 private SetList currentSetList;
 private ReadinessList currentRdList;

    public SerializedCtrl()
    {
       // currentSetList = new SetList();
        currentRdList = new ReadinessList();        
        SetListCtrl setListController = new SetListCtrl();
    }

    public SetList getCurrentSetList()
    {
        return currentSetList;
    }

    public void setCurrentSetList(SetList currentSetList)
    {
        this.currentSetList = currentSetList;
    }
 
}
