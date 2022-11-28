/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.oop_project;

import java.text.DecimalFormat;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class Bill {
    //Class attribute
    private static String bill;
    
    //Encapsulation - getter
    public static String getBill() {
        return bill;
    }
    
    //Encapsulation - setter
    public static void setBill(String bill) {
        Bill.bill = bill;
    }
    
    public static void display(String title,int hour,int month , String budget, double usage, int count) {
        DecimalFormat df = new DecimalFormat("0.00");
        //Details for bill
        bill = "Bill for [Aircond " + count + "]"
                + "\n ------------------------------------------------------------------------------- "
                + "\nNum Account : 282828282828"
                + "\nNum Contract : 1234567"
                + "\nDeposit : RM 350.00"
                + "\nNum Invoice : 19283746"
                + "\n ------------------------------------------------------------------------------- "
                + "\nAli Hassan bin Abu Alif \n132, Lorong 21\nTaman Seri Iskandar \n32610 Seri Iskandar \nPerak."
                + "\n ------------------------------------------------------------------------------- "
                + "\n ------------------------------------------------------------------------------- "
                + "\nTotal amount Payable : RM" + df.format(Budget.total(hour, month)) + "          Tarikh Bill : 28/11/2022"
                + "\n ------------------------------------------------------------------------------- "
                + "\n ------------------------------------------------------------------------------- "        
                + "\n                                       Amount  "
                + "\nOutstanding charges :    RM 0.00"
                + "\nCurrent changes        :    RM" + df.format(Budget.total(hour, month))
                + "\n(After rounding up)"
                + "\nTotal bill                    :    RM" + Math.ceil(Budget.total(hour, month))
                + "\n ------------------------------------------------------------------------------- "
                + "\n                                       Amount              Date"
                + "\nPrevious bill     :            RM 132.40      01/10/2022"
                + "\nLatest payment:            RM 132.40      28/10/2022"
                + "\n ------------------------------------------------------------------------------- "
                + "\nType of reading :         Actual reading"
                + "\n"
                + "\n ------------------------------------------------------------------------------- "
                + "\nBilling period  : 1/11/2022 - 1/12/2022   Prorate Factor"
                + "\nTariff               : A.Kediaman                         1.00000"
                + "\n ------------------------------------------------------------------------------- "
                + "\nTariff block(kWh)   Prorated block(kWh)   Rate(RM)    Amount(RM)"
                + Budget.Tariff_Amount(hour, month);
        
        //Set up textarea
        TextArea area = new TextArea();
        area.setText(bill);
        area.setPrefColumnCount(15);
        area.setMinHeight(650);
        area.setMinWidth(475);
        area.setEditable(false);
        Font font = Font.font("verdana", FontWeight.BOLD, FontPosture.REGULAR, 12);
        area.setFont(font);
        
        //Set up the stage
        Stage window = new Stage();
        window.initModality(Modality.APPLICATION_MODAL);
        window.setTitle(title);
        window.setMinWidth(475);
        window.setMinHeight(750);
        
        //Set up button
        Button ExitButton = new Button("Exit");
        ExitButton.setOnAction(e -> window.close());
        ExitButton.setStyle("-fx-font: bold 15 arial; -fx-base: #FFE4E1;");        
        
        //VBox
        VBox layout = new VBox(10);
        layout.getChildren().addAll(area,ExitButton);
        
        //Setting the stage
        Stage stage = new Stage();
        stage.setTitle("Text Area");
        
        //layout.getChildren().addAll(NotedButton);
        layout.setAlignment(Pos.CENTER);
        Scene scene = new Scene(layout, Color.BEIGE);
        window.setScene(scene);
        window.showAndWait();
    }
}
