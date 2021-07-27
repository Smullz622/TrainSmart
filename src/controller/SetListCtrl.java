/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

/**
 *
 * @author Sarah
 */
import java.util.ArrayList;
import model.Set;
import model.SetList;
import model.SetListTableModel;
import view.SetDetailUI;
import view.SetListUI;

public class SetListCtrl
{

    private SetList setList = new SetList();
    private SetListTableModel setTable;
    private SetDetailUI setDetailUI;
    public SetListUI setListUI;
    public SetCtrl setCtrl;
    private ArrayList<Set> setArrayList; 

    public SetListCtrl()
    {
        setArrayList = setList.getList();
        setTable = new SetListTableModel(setList.getList());
        setListUI = new SetListUI(this);
        setListUI.setVisible(true);
    }

    public ArrayList<Set> getSetArrayList()
    {
        return setArrayList;
    }

    public void setSetArrayList(ArrayList<Set> setArrayList)
    {
        this.setArrayList = setArrayList;
    }

    public SetList getSetList()
    {
        return setList;
    }

    public void setSetList(SetList setList)
    {
        this.setList = setList;
    }

    public SetListTableModel getSetTable()
    {
        return setTable;
    }

    public void setSetTable(SetListTableModel setTable)
    {
        this.setTable = setTable;
    }

    public void getSetDetailUI(int selectedRow)
    {
        setCtrl = new SetCtrl(this, selectedRow);
        setListUI.setVisible(false);
    }


    public void setSetDetailUI(SetDetailUI setDetailUI)
    {
        this.setDetailUI = setDetailUI;
    }

    public SetListUI getSetListUI()
    {
        return setListUI;
    }

    public void setSetListUI(SetListUI setListUI)
    {
        this.setListUI = setListUI;
    }

    public SetCtrl getSetCtrl()
    {
        return setCtrl;
    }

    public void setSetCtrl(SetCtrl setCtrl)
    {
        this.setCtrl = setCtrl;
    }



}
