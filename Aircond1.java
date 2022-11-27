/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.oop_project;

import java.text.DecimalFormat;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

/**
 *
 * @author 60162
 */
public class Aircond1 extends App {
    public static void display(String title, String message,int hour,int month , String budget, double usage) {
        Stage window = new Stage();
        window.initModality(Modality.APPLICATION_MODAL);
        window.setTitle(title);
        window.setMinWidth(400);
        window.setMinHeight(200);
        Label label = new Label();
        label.setText(message);
        Button NotedButton = new Button("Noted");
        NotedButton.setOnAction(e -> window.close());
        DecimalFormat df = new DecimalFormat("0.00");
        label.setText("hours = " + hour + "\nNumber of days in month : " + month + "\nBudget : RM " + budget + "\nUsage : " + df.format(Budget.usage(hour, month)) +" kWh." );
        
        VBox layout = new VBox(10);
        layout.getChildren().addAll(label, NotedButton);
        layout.setAlignment(Pos.CENTER);
        
        Scene scene = new Scene(layout);
        window.setScene(scene);
        window.showAndWait();
    }
    
    public static void Aircond_1(int hour,int month , String budget) {
        int hour1 = hour;
        double budget1 = Double.parseDouble(budget);
        double total1 = Budget.compare(hour1, month);
        double usage = Budget.usage(hour1, month);
    }
    
    
}
