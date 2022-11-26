package com.mycompany.oop_project;

import java.text.DecimalFormat;
import java.util.Random;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;


/**
 * JavaFX App
 */
public class App extends Application {
    
    Stage window;
    Button button1,button2;
    TextField budgetInput = new TextField();
public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        window = primaryStage;
        window.setTitle("Aircond Page");
        window.getIcons().add(new Image("https://img.icons8.com/ios-filled/50/null/air-conditioner.png"));
        
        Label label = new Label();
        label.setText("Hi, welcome to AIRCOND DETAILS PAGE.\nYou can enter your budget here to check whether the electric usage of aircond has exceeded. \n ");
        
        ChoiceBox choiceBox = new ChoiceBox();
        Random rand = new Random();
        int upperbound = 4;
        int aircond_Num = rand.nextInt(upperbound)+1; 
        Label label4 = new Label();
        label4.setText("Your house has " + aircond_Num + " aircond(s), please select the aircond you want to check in this choicebox : ");
        for(int i=1 ; i<=aircond_Num ; i++){
            choiceBox.getItems().add("Aircond "+ i);
        }
        choiceBox.setOnAction((event) -> {
        int selectedIndex = choiceBox.getSelectionModel().getSelectedIndex();
        Object selectedItem = choiceBox.getSelectionModel().getSelectedItem();

        System.out.println("Selection made: [" + selectedIndex + "] " + selectedItem);
        System.out.println("   ChoiceBox.getValue(): " + choiceBox.getValue());
        
        });
        
        
        Label label5 = new Label();
        label5.setText("\n\nEnter your budget :" );
        
        button2 = new Button("Enter");
        button1 = new Button("Display Bill");
        button1.setStyle("-fx-font: 15 arial; -fx-base: #b6e7c9;");
        button2.setStyle("-fx-font: 15 arial; -fx-base: #b6e7c9;");
        Label label2 = new Label();
        Label label3 = new Label();
        button2.setOnAction(new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent event) {label2.setText("\n\nThe hours aircond used in one day : "+ hours.randomhours()+"\nNumber of days in this month : 30 \nWatts : 950 W \nkilowatts : 0.95 kW \n\nTariff price for the \nFirst 200 kWh = RM0.218. \nNext 100 kwh = RM0.334. \nNext 300 kWh = 0.516.");
            int Hour = hours.randomhours();
            Budget.isInt(budgetInput,budgetInput.getText());
            label2.setText("\n\nThe hours aircond used in one day : "+ Hour +"\nWatts : 950 W \nkilowatts : 0.95 kW \n\nTariff price for: \nFirst 200 kWh = RM0.218. \nNext 100 kwh = RM0.334. \nNext 300 kWh = RM0.516.\nAbove 900 kWh = RM0.571");
            DecimalFormat df = new DecimalFormat("0.00");
            label3.setText("Your total electic bill for Aircond is : RM "+ df.format(Budget.compare(Hour)));
        }
        });
        
        budgetInput.setAlignment(Pos.CENTER_LEFT);
        

        GridPane gridPane = new GridPane();
        
        //Setting size for the pane  
        gridPane.setMinSize(400, 600); 

      
        //Setting the vertical and horizontal gaps between the columns 
        gridPane.setVgap(5); 
        gridPane.setHgap(5);       
 
        gridPane.setPadding(new Insets(20,20,20,20));
        gridPane.add(label,0,0);
        gridPane.add(label4,0,1);
        gridPane.add(choiceBox,0,2);
        gridPane.add(label5,0,4);
        gridPane.add(budgetInput,0,5);
        gridPane.add(button2, 0,6);
        gridPane.add(label2, 0,7);
        gridPane.add(label3, 0,8);
        gridPane.add(button1, 0,10);
        gridPane.setAlignment(Pos.CENTER_LEFT);
        
        Scene scene = new Scene(gridPane);
        window.setScene(scene);
        window.show();
        
    }
    
   
}