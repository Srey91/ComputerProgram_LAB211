/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author 84898
 */
public class Calculator_data {
    private double number;
    private double memory;
    private char operator;

    public Calculator_data() {
    }

    public Calculator_data(double number, double memory, char operator) {
        this.number = number;
        this.memory = memory;
        this.operator = operator;
    }

    public double getNumber() {
        return number;
    }

    public void setNumber(double number) {
        this.number = number;
    }

    public double getMemory() {
        return memory;
    }

    public void setMemory(double memory) {
        this.memory = memory;
    }

    public char getOperator() {
        return operator;
    }

    public void setOperator(char operator) {
        this.operator = operator;
    }
    
    public double calculate()
    {
        switch (operator)
        {
            case '+' -> this.memory += this.number;
            case '-' -> this.memory -= this.number;
            case '*' -> this.memory *= this.number;
            case '/' -> this.memory /= this.number;
            case '^' -> this.memory = Math.pow(memory, number);
        }
        return memory;
    }
}
