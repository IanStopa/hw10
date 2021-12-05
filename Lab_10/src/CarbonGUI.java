/*
# Name:       Ian Stopa
# Class:      CPSC-24500-004
# Assignment: Assignment 10 GUI
# Version:	  Java SE-14
# Goal:       To construct a GUI out of our previous assignment 09. I choose this one because I thought it was easier
              to work with than the banking one.
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class CarbonGUI extends JFrame{

    public CarbonGUI() {

        //Car Portion
        JButton jCar = new JButton("Car");
        setLayout(new FlowLayout());
        add(jCar);

        jCar.addActionListener(new ActionListener() {

            String sDistanceTraveled, sMPG;
            double distanceTraveled, mpg;


            public void actionPerformed(ActionEvent e) {
                sDistanceTraveled = JOptionPane.showInputDialog("Enter Miles Driven:");
                sMPG = JOptionPane.showInputDialog("Enter MPG:");

                distanceTraveled = Double.parseDouble(sDistanceTraveled);
                mpg = Double.parseDouble(sMPG);

                double sum = distanceTraveled * mpg;

                JOptionPane.showMessageDialog(null, "Carbon Emissions produced by this car is " +
                        sum, "Carbon Emissions", JOptionPane.PLAIN_MESSAGE);

            }
        });
        //End Car Portion

        //Building Portion
        JButton jBuilding = new JButton("Building"); //creates the button object building
        setLayout(new FlowLayout());//creates the FlowLayout
        add(jBuilding);

        jBuilding.addActionListener(new ActionListener(){

            String sSquareFeet, sGasUsage, sKWH;
            double squareFeet, GasUsage, kWh;


            public void actionPerformed(ActionEvent e) {
                sSquareFeet=JOptionPane.showInputDialog("Square Feet of interior:");
                sGasUsage=JOptionPane.showInputDialog("Gas Usage:");
                sKWH=JOptionPane.showInputDialog("kWH Usage:");

                squareFeet=Integer.parseInt(sSquareFeet);
                GasUsage=Double.parseDouble(sGasUsage);
                kWh=Double.parseDouble(sKWH);

                double sum = squareFeet * GasUsage * kWh;


                JOptionPane.showMessageDialog(null, "Carbon Emissions produced by this " +
                        "building is " + sum,  "Carbon Emissions", JOptionPane.PLAIN_MESSAGE);
            }
        });
        //End Building Portion

        //Bicycle Portion
        JButton jBicycle = new JButton("Bicycle");
        setLayout(new FlowLayout());
        add(jBicycle);


        jBicycle.addActionListener(new ActionListener(){


            public void actionPerformed(ActionEvent e) {

                JOptionPane.showMessageDialog(null, "During operation, the bicycle itself " +
                                "produces no carbon emissions.","Carbon Emissions", JOptionPane.PLAIN_MESSAGE);
            }
        });
        //End Bicycle Portion

    }

    public static void main(String[] args) {
        CarbonGUI window = new CarbonGUI();
        window.setTitle("Carbon Waster");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setSize(270,80);
        window.setVisible(true);

    }
}
