/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import menu.Menu;
import view.ComputerProgram;

/**
 *
 * @author 84898
 */
public class ComputerProgramController extends Menu{
    public void menu(ComputerProgram cp)
    {
        String[] content = {"Normal Calculator", "BMI Calculator", "Exit"};
        Menu m = new Menu("========= Calculator Program =========", content) {
            @Override
            public void execute(int ch) {
                switch (ch)
                {
                    case 1:
                        System.out.println("----- Normal Calculator -----");
                        cp.calculate_normalMath(); break;
                    case 2:
                        System.out.println("----- BMI Calculator -----");
                        cp.calculate_BMI(); break;    
                }
            }
        };
        m.run();
    }

    @Override
    public void execute(int ch) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
