/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Sarah
 */
public class SetListTableModel extends AbstractTableModel
{
    private String[] columnsNames = {"Set Number", "Weight", "Reps"};
    private ArrayList<Set> sets;

    public SetListTableModel(ArrayList<Set> sets)
    {
        this.sets = sets;
    }
    
    
    @Override
    public int getRowCount()
    {
        return sets.size();
    }

    @Override
    public int getColumnCount()
    {
        return columnsNames.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex)
    {
        switch(columnIndex)
        {
            case 0: return (Object) (rowIndex + 1);
            case 1: return (Object) sets.get(rowIndex).getWeight();
            case 2: return (Object) sets.get(rowIndex).getReps();
            default: return null;
        }
    }
    
    @Override
    public String getColumnName(int col)
    {
        return columnsNames[col];
    }

    public String[] getColumnsNames()
    {
        return columnsNames;
    }

    public void setColumnsNames(String[] columnsNames)
    {
        this.columnsNames = columnsNames;
    }

    public ArrayList<Set> getSets()
    {
        return sets;
    }

    public void setSets(ArrayList<Set> sets)
    {
        this.sets = sets;
    }
    
    
    
}
