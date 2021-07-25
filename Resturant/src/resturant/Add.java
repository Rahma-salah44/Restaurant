/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resturant;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.paint.Color;


/**
 *
 * @author raghda
 */
public class Add  extends Application {
    @Override
    public void start(Stage primaryStage) {
    Group f=new Group();
     Scene sc = new Scene(f);
     sc.setFill(Color.CADETBLUE);
     Label l2=new Label("ID:");
         l2.setPrefSize(300,100);
         l2.setFont(Font.font("Tahoma", FontWeight.BOLD, 18));
         l2.setLayoutX(130);
         l2.setLayoutY(60);
         TextField t1=new TextField();
         t1.setLayoutX(300);
         t1.setLayoutY(100);
         Label l3=new Label("Name:");
         l3.setPrefSize(300,100);
         l3.setFont(Font.font("Tahoma", FontWeight.BOLD, 18));
         l3.setLayoutX(130);
         l3.setLayoutY(130);
         TextField t2=new TextField();
         t2.setLayoutX(300);
         t2.setLayoutY(170);
         Label l4=new Label("Price:");
         l4.setPrefSize(300,100);
         l4.setFont(Font.font("Tahoma", FontWeight.BOLD, 18));
         l4.setLayoutX(130);
         l4.setLayoutY(200);
         TextField t3=new TextField();
         t3.setLayoutX(300);
         t3.setLayoutY(240);
         Label l5=new Label("Preparation Time:");
         l5.setPrefSize(300,100);
         l5.setFont(Font.font("Tahoma", FontWeight.BOLD, 18));
         l5.setLayoutX(130);
         l5.setLayoutY(270);
         TextField t4=new TextField();
         t4.setLayoutX(300);
         t4.setLayoutY(310);
         f.getChildren().addAll(l2,l3,l4,l5);
         f.getChildren().addAll(t1,t2,t3,t4);
         Button AddMeal = new Button("Add");
         AddMeal.setPrefSize(70,30);
         AddMeal.setLayoutY(400);
         AddMeal.setLayoutX(350);
         AddMeal.setAlignment(Pos.CENTER);
         f.getChildren().add(AddMeal);
         primaryStage.setTitle("Add Meals");
         primaryStage.setWidth(700);
         primaryStage.setHeight(600);
         primaryStage.setScene(sc);
        primaryStage.show();
       AddMeal.setOnAction(new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent event){
           Admin ad =new Admin();
           ad.addmeal(Integer.valueOf(t1.getText()),t2.getText(),Double.parseDouble(t3.getText()),Double.parseDouble(t4.getText()));
           primaryStage.close();
}
});
    }
}
                           
     

//if(p.addmeal(Integer.valueOf(t1.getText()),t2.getText(),Double.parseDouble(t3.getText()),Double.parseDouble(t3.getText()))
 