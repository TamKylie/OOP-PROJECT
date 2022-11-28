/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.oop_project;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

/**
 *
 * @author 60162
 */
public class Welcome_page {
    public static void welcome(String title, String message){
        Stage window = new Stage();
        window.initModality(Modality.APPLICATION_MODAL);
        window.setTitle(title);
        window.setMinWidth(400);
        window.setMinHeight(200);
        window.getIcons().add(new Image("https://img.icons8.com/external-flaticons-lineal-color-flat-icons/64/null/external-thumb-up-gamification-flaticons-lineal-color-flat-icons.png"));
        
        Label label = new Label();
        label.setText(message);
        Button YesButton = new Button("Yes");
        YesButton.setOnAction(e -> window.close());
        Button NoButton = new Button("No");
        NoButton.setOnAction(e -> window.close());
        
        
        VBox layout = new VBox(10);
        layout.getChildren().addAll(label, YesButton, NoButton);
        layout.setAlignment(Pos.CENTER);
        
        Scene scene = new Scene(layout);
        window.setScene(scene);
        window.showAndWait();
    }
    
    /**
     * @param args the command line arguments
     */
    
}
