package ru.gr36x.ui;

import ru.gr36x.Main;
import ru.gr36x.db.Student;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import java.awt.*;

public class MainWindow extends JFrame {
    private JTable tStudents;
    //private JTable tGrades;


    public MainWindow(){
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setMinimumSize(new Dimension(600, 500));
        GridLayout gridLayout= new GridLayout(2,1,8,8);
        JPanel grid = new JPanel();
        grid.setLayout(gridLayout);
        getContentPane().add(grid);
        tStudents= new JTable();
        //tGrades= new JTable();
        String[] columnNames = {"Имя", "Фамилия", "Группа"};
        var studModel= new DefaultTableModel(columnNames, 0);
        studModel.addRow(new Object[]{"Ivan","Ivanov","09-632"});
        studModel.addRow(new Object[]{"Petr","Ivanov","09-632"});
        tStudents.setModel(studModel);
        grid.add(tStudents);
        var btn = new JButton();
        btn.setText("Exit");
        grid.add(btn);
        pack();
    }
}
