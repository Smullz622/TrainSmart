/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JTable;
import model.Set;
import model.SetList;
import model.SetListTableModel;
import view.SetDetailUI;

/**
 *
 * @author Sarah
 */
public class SetCtrl implements ActionListener
{

    private ArrayList<Set> list;
    SetDetailUI setDetailUI;
    private SetListCtrl setListCtrl;
    private SetList setList = new SetList();

    public SetCtrl()
    {
        list = setList.getList();

        setDetailUI = new SetDetailUI(list);
        setDetailUI.setVisible(true);

        addButtons();

    }

    public SetCtrl(SetListCtrl listCtrl, ArrayList<Set> setList)
    {
        this.setListCtrl = listCtrl;
        list = setListCtrl.getSetArrayList();
        setDetailUI = new SetDetailUI(list);
        addButtons();
        setDetailUI.setVisible(true);
    }

    public SetCtrl(SetListCtrl listCtrl, int row)
    {
        this.setListCtrl = listCtrl;
        list = setListCtrl.getSetArrayList();
        setDetailUI = new SetDetailUI(this, row);
        addButtons();
        setDetailUI.setVisible(true);
    }

    public void addButtons()
    {
        setDetailUI.nextBtn.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                if (getSetDetailUI().currentSet == (getList().size() - 1))
                {
                    System.out.println("You are already on the final set.");
                } else
                {
                    setDetailUI.currentSet++;
                    getSetDetailUI().refresh(list.get(setDetailUI.currentSet));
                }
            }
        }
        );

        setDetailUI.previousBtn.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                if (getSetDetailUI().currentSet == 0)
                {
                    System.out.println("You are already on the first set.");
                } else
                {
                    setDetailUI.currentSet--;
                    getSetDetailUI().refresh(list.get(setDetailUI.currentSet));
                }

            }
        }
        );

        setDetailUI.updateBtn.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                list.get(getSetDetailUI().currentSet).setWeight(Double.parseDouble(getSetDetailUI().weightText.getText()));
                list.get(getSetDetailUI().currentSet).setReps(Integer.parseInt(getSetDetailUI().repsText.getText()));
                setListCtrl.getSetTable().setSets(list);
                setListCtrl.getSetList().writeSetListFile();
            }

        }
        );

        setDetailUI.backBtn.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                // setListCtrl.setListUI.repaint();
                //setListCtrl.setSetTable(new SetListTableModel(setList.getList()));
                //setListUI.setSetTable(new JTable(setListCtrl.getSetTable()));
                setListCtrl.getSetTable().fireTableDataChanged();
                setListCtrl.setListUI.setVisible(true);
                setDetailUI.dispose();
            }

        });

        setDetailUI.deleteBtn.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                if (list.size() == 1)
                {
                    System.out.print("Cannot delete. You must have at least one set.");
                } else
                {
                    list.remove(setDetailUI.currentSet);
                    if (setDetailUI.currentSet != 0)
                    {
                        setDetailUI.currentSet--;
                    }

                    getSetDetailUI().refresh(list.get(setDetailUI.currentSet));
                    setListCtrl.getSetList().writeSetListFile();
                }
                setListCtrl.setListUI.repaint();
//                setListCtrl.setSetTable(new SetListTableModel(setList.getList()));
            }

        }
        );

        setDetailUI.addBtn.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                add();
            }

        }
        );
    }

    public void add()
    {
        list.add(new Set());
        setDetailUI.currentSet = list.size() - 1;
        getSetDetailUI().refresh(list.get(setDetailUI.currentSet));;
        setListCtrl.getSetList().writeSetListFile();
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public ArrayList<Set> getList()
    {
        return list;
    }

    public void setList(ArrayList<Set> list)
    {
        this.list = list;
    }

    public SetList getSetList()
    {
        return setList;
    }

    public void setSetList(SetList setList)
    {
        this.setList = setList;
    }

    public SetDetailUI getSetDetailUI()
    {
        return setDetailUI;
    }

    public void setSetDetailUI(SetDetailUI setDetailUI)
    {
        this.setDetailUI = setDetailUI;
    }

    public Set getSet(int row)
    {
        return list.get(row);
    }

    public void getSetDetailUI(int selectedRow)
    {
        setDetailUI = new SetDetailUI(this, selectedRow);
        setListCtrl.setListUI.setVisible(false);
        setDetailUI.setVisible(true);
    }

}
