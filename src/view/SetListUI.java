/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.SetCtrl;
import controller.SetListCtrl;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import model.Set;
import model.SetListTableModel;

/**
 *
 * @author Sarah
 */
public class SetListUI extends JFrame
{

    private JPanel tablePanel, buttonPanel;
    private JTable setTable;
    public JButton doneButton;
    public JButton detailsButton;
    public JButton newButton;
    public JButton deleteButton;
    private JScrollPane tableScroller;
    private SetListCtrl setListCtrl;
    private SetListTableModel abstractTableModel;

    public SetListUI(SetListCtrl setListCtrl)
    {

        this.setListCtrl = setListCtrl;
        initComponents();
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    }

    public void initComponents()
    {
        tablePanel = new JPanel();
        buttonPanel = new JPanel(new GridLayout(1, 4));
        setTable = new JTable(setListCtrl.getSetTable());
        setTable.getColumnModel().getColumn(0).setPreferredWidth(25);
        setTable.getColumnModel().getColumn(1).setPreferredWidth(50);
        setTable.getColumnModel().getColumn(2).setPreferredWidth(30);
        doneButton = new JButton("Done");
        detailsButton = new JButton("Show Details");
        newButton = new JButton("New");
        deleteButton = new JButton("Delete");
        detailsButton.addActionListener(new DetailsButtonListener());
        newButton.addActionListener(new NewButtonListener());
        doneButton.addActionListener(new DoneButtonListener());
        deleteButton.addActionListener(new DeleteButtonListener());
        buttonPanel.add(newButton);
        buttonPanel.add(detailsButton);
        buttonPanel.add(doneButton);
        buttonPanel.add(deleteButton);
        tableScroller = new JScrollPane(setTable);
        setTable.setFillsViewportHeight(true);
        tableScroller.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        tableScroller.setPreferredSize(new Dimension(350, 300));
        tablePanel.add(tableScroller);
        this.setSize(500, 400);
        this.setLocationRelativeTo(null);
        this.setContentPane(new JPanel(new BorderLayout()));
        this.getContentPane().add(buttonPanel, BorderLayout.SOUTH);
        this.getContentPane().add(tablePanel, BorderLayout.CENTER);
    }

    private static class DoneButtonListener implements ActionListener
    {

        @Override
        public void actionPerformed(ActionEvent e)
        {
            System.exit(0);
        }
    }

    public class DetailsButtonListener implements ActionListener
    {

        public void actionPerformed(ActionEvent e)
        {
            int selectedTableRow = setTable.getSelectedRow();
            int selectedModelRow = setTable.convertRowIndexToModel(selectedTableRow);
            SetListUI.this.setListCtrl.getSetDetailUI(selectedModelRow);
        }
    }

    private class DeleteButtonListener implements ActionListener
    {

        @Override
        public void actionPerformed(ActionEvent e)
        {
            int selectedTableRow = setTable.getSelectedRow();
            int selectedModelRow = setTable.convertRowIndexToModel(selectedTableRow);
            SetListUI.this.setListCtrl.getSetArrayList().remove(selectedModelRow);
            setListCtrl.setListUI.repaint();
            setListCtrl.getSetList().writeSetListFile();
        }

    }

    public class NewButtonListener implements ActionListener
    {

        @Override
        public void actionPerformed(ActionEvent e)
        {
            SetListUI.this.setListCtrl.getSetArrayList().add(new Set());
            setListCtrl.setListUI.repaint();
            setListCtrl.getSetList().writeSetListFile();
            //trying to add new set within setCtrl, got NullPointerException
            //setListCtrl.setCtrl.add();
          
          //trying to add new list to detail view as well for continuity, got NullPointerException 
//          ArrayList<Set> newList = setListCtrl.setCtrl.getList();
//          newList.add(new Set());
//          setListCtrl.setCtrl.setSetDetailUI(new SetDetailUI(newList));
          
          //trying to reset the list, got NullPointerException
          //setListCtrl.setCtrl.setList(setListCtrl.getSetList().getList());

        }
    }
}
