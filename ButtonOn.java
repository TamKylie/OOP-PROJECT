/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.oop_project;


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
public class ButtonOn {
    public static void On(String title, String message) {
        Stage window = new Stage();
        window.initModality(Modality.APPLICATION_MODAL);
        window.setTitle(title);
        window.setMinWidth(400);
        window.setMinHeight(200);
        
        Label label = new Label();
        label.setText(message);
        
        Button ExitButton = new Button("Exit");
        ExitButton.setOnAction(e -> window.close());
        ExitButton.setStyle("-fx-font: 15 arial; -fx-base: #b6e7c9;");
        
        VBox layout = new VBox(10);
        layout.getChildren().addAll(label,ExitButton);
        layout.setAlignment(Pos.CENTER);

        Scene scene = new Scene(layout);
        window.setScene(scene);
        window.showAndWait();
        
    }
}
