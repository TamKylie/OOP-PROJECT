/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.oop_project;

import java.text.DecimalFormat;
import javafx.scene.control.TextField;

//Inheritance from the main class
public class Budget extends App{
    //Class attributes
    private static double compare;
    private static double budget;
    private static double kilowatt = 0.95, total, tariff_Price1 = 0.218, tariff_Price2 = 0.334, tariff_Price3 = 0.516, tariff_Price4 = 0.546, tariff_Price5 = 0.571;
    
    //Calculation for usage
    public static double usage(int hour, int month){
        double kilowatt = 0.95;
        double usage = hour * kilowatt * month;
        return usage;
    }
    
    //Calculation for total and compare it to budget to get the differences
    public static double compare(int hour, int month){
        double usage = usage(hour, month);
        
        if (usage <= 200 && usage >=0){
            total = usage * tariff_Price1;
        }
        else if(usage <=300 && usage >=201){
            total = ((usage - 200)* tariff_Price2)+(200 * tariff_Price1); 
        }
        else if (usage >=301 && usage <=600){
            total = ((usage - 300) * tariff_Price3)+(100* tariff_Price2)+(200 * tariff_Price1);
        }
        else if (usage >=601 && usage <= 900){
            total = ((usage - 600) * tariff_Price4)+(300 * tariff_Price3)+(100* tariff_Price2)+(200 * tariff_Price1);
        }
        else{
            total = ((usage - 900) * tariff_Price5)+(300 * tariff_Price4)+(300 * tariff_Price3)+(100* tariff_Price2)+(200* tariff_Price1);
        }
        
        if (budget > total){
            compare = budget - total;
            System.out.println("The budget still left : " + compare);
            Important_Box.display("Good News !!!", "\nYou still have budget for this month aircond electricity bill. \nGreat job !!! \nHope you can still remain your low usage of aircond electricity. \nYou can now increase more budget for food and savings !!!");
        }  
        else{
            compare = total - budget;
            System.out.println("Need more budget !!! : " + compare);
            Alert_Box.display("Alert !!!", "\nYour budget has exceeded !!!\nRemember to decrease the hours aircond is used. \nElse, you will need to decrease your budget for food !!! ");
        }   
        
        return total;
    }
    
    //Display tariff and amount in bill
    public static String Tariff_Amount(int hour, int month){
        double usage = usage(hour, month);
        String bill;
        DecimalFormat df = new DecimalFormat("0.00");
        DecimalFormat nodf = new DecimalFormat("0");
        if (usage <= 200 && usage >=0){
            total = usage * tariff_Price1;
            bill = "\n       200                           "+ nodf.format(usage) +"                       0.218             " + df.format(total)
            + "\n\n ----------Total : RM"+ df.format(total) + " ----------";
        }
        else if(usage <=300 && usage >=201){
            total = ((usage - 200)* tariff_Price2)+(200 * tariff_Price1); 
            bill = "\n       200                           200                       0.218             43.60"
                    + "\n       100                           "+ nodf.format(usage - 200)+"                       0.334             " + df.format((usage - 200)* tariff_Price2)
                    + "\n\n ----------Total : RM"+ df.format(total) + " ----------";
        }
        else if (usage >=301 && usage <=600){
            total = ((usage - 300) * tariff_Price3)+(100* tariff_Price2)+(200 * tariff_Price1);
            bill = "\n       200                           200                       0.218             43.60"
                    + "\n       100                           100                       0.334             33.40" 
                    + "\n       300                           "+ nodf.format(usage - 300)+"                       0.334             " + df.format((usage - 300) * tariff_Price3)
                    + "\n\n ----------Total : RM"+ df.format(total) + " ----------";
        }
        else if (usage >=601 && usage <= 900){
            total = ((usage - 600) * tariff_Price4)+(300 * tariff_Price3)+(100* tariff_Price2)+(200 * tariff_Price1);
            bill = "\n       200                           200                       0.218             43.60"
                    + "\n       100                           100                       0.334             33.40" 
                    + "\n       300                           300                       0.516             154.80"
                    + "\n       300                           "+ nodf.format(usage - 600) +"                       0.546             " + df.format((usage - 600) * tariff_Price4)
                    + "\n\n ----------Total : RM"+ df.format(total) + " ----------";
        }
        else{
            total = ((usage - 900) * tariff_Price5)+(300 * tariff_Price4)+(300 * tariff_Price3)+(100* tariff_Price2)+(200* tariff_Price1);
            bill = "\n       200                           200                       0.218             43.60"
                    + "\n       100                           100                       0.334             33.40" 
                    + "\n       300                           300                       0.516             154.80"
                    + "\n       300                           300                       0.546             163.80"
                    + "\n       >900                           "+ nodf.format(usage - 900) +"                       0.571             " + df.format((usage - 900) * tariff_Price5)
                    + "\n\n ----------Total : RM"+ df.format(total) + " ----------";
        }
        return bill;
    }
    
    //calculation for total
    public static double total(int hour, int month){
        double usage = usage(hour, month);
        
        if (usage <= 200 && usage >=0){
            total = usage * tariff_Price1;
        }
        else if(usage <=300 && usage >=201){
            total = ((usage - 200)* tariff_Price2)+(200 * tariff_Price1); 
        }
        else if (usage >=301 && usage <=600){
            total = ((usage - 300) * tariff_Price3)+(100* tariff_Price2)+(200 * tariff_Price1);
        }
        else if (usage >=601 && usage <= 900){
            total = ((usage - 600) * tariff_Price4)+(300 * tariff_Price3)+(100* tariff_Price2)+(200 * tariff_Price1);
        }
        else{
            total = ((usage - 900) * tariff_Price5)+(300 * tariff_Price4)+(300 * tariff_Price3)+(100* tariff_Price2)+(200* tariff_Price1);
        }
        
        return total;
    }
    
    //Check whether the input from user in the textfield is integer or not(using Exception(try..catch) method)
    public static boolean isInt(TextField input, String message){
        budget = Double.parseDouble(input.getText());
        try{
            System.out.println("The budget is : " + budget);
            return true;
           
        }catch(NumberFormatException e){
            System.out.println("Error : " + message +" is not a number");
            return false;
        }   
    }
    
    //Encapsulation - setter and getter (private attributes)
    public double getCompare() {
        return compare;
    }

    public void setCompare(double compare) {
        this.compare = compare;
    }
    
    public static void setBudget(int budget) {
        Budget.budget = budget;
    }
    
    public double getBudget(){
        return budget;
    }
    
    public static double getKilowatt() {
        return kilowatt;
    }

    public static void setKilowatt(double kilowatt) {
        Budget.kilowatt = kilowatt;
    }

    public static double getTotal() {
        return total;
    }

    public static void setTotal(double total) {
        Budget.total = total;
    }

    public static double getTariff_Price1() {
        return tariff_Price1;
    }

    public static void setTariff_Price1(double tariff_Price1) {
        Budget.tariff_Price1 = tariff_Price1;
    }

    public static double getTariff_Price2() {
        return tariff_Price2;
    }

    public static void setTariff_Price2(double tariff_Price2) {
        Budget.tariff_Price2 = tariff_Price2;
    }

    public static double getTariff_Price3() {
        return tariff_Price3;
    }

    public static void setTariff_Price3(double tariff_Price3) {
        Budget.tariff_Price3 = tariff_Price3;
    }

    public static double getTariff_Price4() {
        return tariff_Price4;
    }

    public static void setTariff_Price4(double tariff_Price4) {
        Budget.tariff_Price4 = tariff_Price4;
    }

    public static double getTariff_Price5() {
        return tariff_Price5;
    }

    public static void setTariff_Price5(double tariff_Price5) {
        Budget.tariff_Price5 = tariff_Price5;
    }

    
}
