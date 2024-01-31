/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import model.BMI_data;
import model.Calculator_data;
import validation.Validation;

/**
 *
 * @author 84898
 */
public class ComputerProgram {
    BMI_data bMI_data = new BMI_data();
    Calculator_data calculator_data = new Calculator_data();
    
    Validation v = new Validation();
    
    public void calculate_BMI()
    {
        double weight = v.getDouble("Weight(kg)");
        bMI_data.setWeight(weight);
        double height = v.getDouble("Height(cm)");
        bMI_data.setHeight(height);
        double bmiNumber = bMI_data.BMI_Number();
        System.out.println("BMI Number: " + bmiNumber);
        System.out.print("BMI Status: ");
        
        if(bmiNumber < 19)
        {
            System.out.println("Under-standard");
        }else if(bmiNumber >= 19 && bmiNumber < 25)
        {
            System.out.println("Standard");
        }else if(bmiNumber >= 25 && bmiNumber < 30)
        {
            System.out.println("Overweight");
        }else if(bmiNumber >= 30 && bmiNumber < 40)
        {
            System.out.println("Fat - should lose weight ");
        }else
        {
            System.out.println("Very fat - should lose weight immediately");
        }
    }
    
    public void calculate_normalMath()
    {
        double memory = v.getAnyDouble("number");
        calculator_data.setMemory(memory);
        char operator = v.getOperator();
        calculator_data.setOperator(operator);
        
        while (calculator_data.getOperator() != '=')
        {
            double number = v.getAnyDouble("number");
            calculator_data.setNumber(number);
            calculator_data.setMemory(calculator_data.calculate());
            System.out.println("Memory:" + calculator_data.getMemory());
            calculator_data.setOperator(v.getOperator());
        }
        
        if (calculator_data.getOperator() == '=')
        {
            System.out.println("Result:" + calculator_data.getMemory());
        }
    }
    
    public static void main(String[] args) {
        ComputerProgram cp = new ComputerProgram();
        cp.calculate_BMI();
    }
}
