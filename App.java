/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.oop_project;
import java.text.DecimalFormat;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

//Main class
public class App extends Application {

     //Declare the class attributes.
    private Stage window;
    private Button button1,button2, button3;
    private TextField budgetInput = new TextField();
    private int count;
    private static int Hour = hours.randomhours();
    Random random = ThreadLocalRandom.current();
    int month = Months.nextInt(random, 28, 31);
    //javafx components
    private Label label = new Label();
    private Label label2 = new Label();
    private Label label3 = new Label();
    private Label label4 = new Label();
    private Label label5 = new Label();
    private Label label6 = new Label();
    private ChoiceBox choiceBox = new ChoiceBox();
    private GridPane gridPane = new GridPane();

    @Override
    public void start(Stage primaryStage) throws Exception {
        //create a window for this class and set it up.
        window = primaryStage;
        window.setTitle("Aircond Page");
        window.getIcons().add(new Image("https://img.icons8.com/ios-filled/50/null/air-conditioner.png"));
        
        //Welcome message to the user
        label.setText("Hi, welcome to AIRCOND DETAILS PAGE.\nYou can check whether the electric usage of aircond has exceeded. \n ");
        
        //Create random numbers (act as taking the aircond numbers from database)
        Random rand = new Random();
        int upperbound = 4;
        int aircond_Num = rand.nextInt(upperbound)+1; 
        label4.setText("Your house has " + aircond_Num + " aircond(s). \nPlease select the aircond you want to check : ");
        label4.setFont(Font.font("Arial", FontWeight.BOLD, 12));
        //Loop to add random airconds into chociebox
        for(int i=0 ; i<aircond_Num ; i++){
            choiceBox.getItems().add("Aircond "+ (i+1));
        }
        
        //If choice box is clicked, it will....
        choiceBox.setOnAction((event) -> {
        //clear all the label and textfield
        budgetInput.clear();
        label2.setText(" ");
        label3.setText(" ");
        //Check which option is clicked
        int selectedIndex = choiceBox.getSelectionModel().getSelectedIndex();
        Object selectedItem = choiceBox.getSelectionModel().getSelectedItem();
        System.out.println("Selection made: [" + selectedIndex + "] " + selectedItem);
        System.out.println("   ChoiceBox.getValue(): " + choiceBox.getValue());
        label5.setText("\n\n[ " + choiceBox.getValue()+ " ]");
        label5.setFont(Font.font(null, FontWeight.BOLD, 20));
        //If statement to determine the count for specific aircond.
        if (selectedIndex == 0)
            count = 1;
        else if (selectedIndex == 1)
            count = 2;
        else if(selectedIndex == 2)
            count = 3;
        else if(selectedIndex == 3 )
            count = 4;
        else if (selectedIndex == 4 )
            count = 5;
        });
        
        label6.setText("Enter your budget :");
        //Create 3 buttons
        button1 = new Button("Enter");
        button2 = new Button("Display Bill");
        button3 = new Button("Exit");
        button1.setStyle("-fx-font: bold 16 arial; -fx-base: #E6E6FA;");
        button2.setStyle("-fx-font: bold 15 arial; -fx-base: #b6e7c9;");
        button3.setStyle("-fx-font: bold 15 arial; -fx-base: #F08080;");
        
        //button1's function
        button1.setOnAction(new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent event) {
            int i=5;
            do{
                Aircond_Details();
                i++;
            }while(i==count && i<20 );
        }
        });
        
        //Button3's function
        button3.setOnAction(e -> window.close());
        ImageView image1 = new ImageView("https://img.icons8.com/clouds/100/null/air-conditioner.png");
        
        Hyperlink link = new Hyperlink("Click to see tariff rates PNG");
        link.setOnAction(e -> Picture.display("Tariff Rates"));
        label2.setFont(Font.font("Arial", FontWeight.NORMAL, 12));
        label3.setFont(Font.font("Arial", FontWeight.EXTRA_BOLD, 12));
        gridPane.setBackground(new Background(new BackgroundFill(Color.ALICEBLUE, CornerRadii.EMPTY, Insets.EMPTY)));
        //Setting size for the pane  
        gridPane.setMinSize(400, 650); 
        //Setting the vertical and horizontal gaps between the columns 
        gridPane.setVgap(5); 
        gridPane.setHgap(5);       
        gridPane.setPadding(new Insets(20,20,20,20));
        
        //Add all the elements to the gridpane
        gridPane.add(label,0,0);
        gridPane.add(label4,0,1);
        gridPane.add(choiceBox,1,1);
        gridPane.add(image1,0,2);
        gridPane.add(label5,0,2);
        gridPane.add(label6,0,3);
        gridPane.add(budgetInput,0,4);
        gridPane.add(button1, 0,5);
        gridPane.add(label2, 0,7);
        gridPane.add(link, 0,8);
        gridPane.add(label3, 0,9);
        gridPane.add(button2, 0,11);
        gridPane.add(button3, 1,11);
        gridPane.setAlignment(Pos.CENTER_LEFT);
        budgetInput.setAlignment(Pos.CENTER_LEFT);
        Scene scene = new Scene(gridPane);
        window.setScene(scene);
        window.show();
        
    }
    
    public void Aircond_Details(){
        int Hour = hours.randomhours();
        int month = Months.nextInt(random, 28, 31);
        double usage = Budget.usage(Hour, month);
        
        //Call method in other class for calculation by using the input from textfield. 
        Budget.isInt(budgetInput,budgetInput.getText());
        //Display the calculation in label.
        label2.setText("\nThe hours aircond used in one day : "+ Hour +"\nNumber of days in this month is : "+ month + " days. \nWatts : 950 W \nkilowatts : 0.95 kW \n\nTariff price for: \nFirst 200 kWh = RM0.218. \nNext 100 kwh = RM0.334. \nNext 300 kWh = RM0.516.\nAbove 900 kWh = RM0.571");
        DecimalFormat df = new DecimalFormat("0.00");
        label3.setText("Total usage for Aircond " + count + " is : " + df.format(Budget.usage(Hour, month)) + " kWh. \nTotal electic bill for Aircond " + count + " is : RM "+ df.format(Budget.compare(Hour, month)) + ".\n\n");
        
        //Button3's function
        button2.setOnAction(e -> Bill.display("Aircond Bill",Hour, month,budgetInput.getText(), usage, count));
    } 
    
 
    public TextField getBudgetInput() {
        return budgetInput;
    }

    public void setBudgetInput(TextField budgetInput) {
        this.budgetInput = budgetInput;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public static int getHour() {
        return Hour;
    }
    
    public void setHour(int Hour) {
        this.Hour = Hour;
    }
    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }
     
    public static void main(String[] args) {
        launch(args);
    }
}

