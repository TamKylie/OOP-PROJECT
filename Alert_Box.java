/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.oop_project;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class Alert_Box {
    public static void display(String title, String message) {
        //set up window
        Stage window = new Stage();
        window.initModality(Modality.APPLICATION_MODAL);
        window.setTitle(title);
        window.setMinWidth(400);
        window.setMinHeight(200);
        //Icon
        window.getIcons().add(new Image("https://img.icons8.com/emoji/48/null/warning-emoji.png"));
        //Image
        ImageView Image1 = new ImageView("https://img.icons8.com/fluency/48/null/siren.png");
        
        //Label
        Label label = new Label(message, Image1);
        
        //Button
        Button NotedButton = new Button("Noted");
        NotedButton.setStyle("-fx-font: bold 15 arial; -fx-base: #F5F5DC;");
        NotedButton.setOnAction(e -> window.close());
        
        //VBox
        VBox layout = new VBox(10);
        layout.getChildren().addAll(label, NotedButton);
        layout.setAlignment(Pos.CENTER);
        
        //Scene
        Scene scene = new Scene(layout);
        window.setScene(scene);
        window.showAndWait();

    }
    
    
}
