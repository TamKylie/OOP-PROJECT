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

public class Picture {
    public static void display(String title) {
        //Set up stage
        Stage window = new Stage();
        window.initModality(Modality.APPLICATION_MODAL);
        window.setTitle(title);
        window.setMinWidth(400);
        window.setMinHeight(450);
        //Icon
        window.getIcons().add(new Image("http://www.w3.org/2000/svg"));
        
        //Display the picture
        ImageView Image1 = new ImageView("https://1.bp.blogspot.com/-voVQ-8eD8eo/X6zR8owmvfI/AAAAAAAAg_s/a23g81ha2w04tlKIMAORWThCBcVgDTGhwCLcBGAsYHQ/s922/Tenaga%2BTariff%2BFor%2BResidential.PNG");
        
        //Label
        Label label = new Label(" ", Image1);
        
        //Button
        Button ExitButton = new Button("Exit");
        ExitButton.setStyle("-fx-font: bold 15 arial; -fx-base: #FFE4E1;");
        ExitButton.setOnAction(e -> window.close());
        
        //VBox
        VBox layout = new VBox(10);
        layout.getChildren().addAll(label, ExitButton);
        layout.setAlignment(Pos.CENTER);
        
        //Scene
        Scene scene = new Scene(layout);
        window.setScene(scene);
        window.showAndWait();
    }
}
