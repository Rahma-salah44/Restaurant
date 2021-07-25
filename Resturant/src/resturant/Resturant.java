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
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author raghda
 */
public class Resturant extends Application{
     /**
     * @param args the command line arguments
     */
      public static void main(String[] args) {
        launch(args);
    }
    Button bt1,bt2,bt3,bt4,bt5;

    @Override
    public void start(Stage primaryStage) {
        //Scene s=new Scene(new Group());
         //s.setFill(Color.CADETBLUE);
         Group g=new Group();
         Label l1=new Label("Meals....");
         g.getChildren().add(l1);
         l1.setPrefSize(300,100);
         l1.setFont(Font.font("Tahoma", FontWeight.BOLD, 18));
         l1.setWrapText(true);
         l1.setAlignment(Pos.CENTER_RIGHT);
         Scene sc = new Scene(g);
         sc.setFill(Color.CADETBLUE);
         bt1=new Button("Add Meal");
         g.getChildren().add(bt1);
         bt1.setLayoutX(200);
         bt1.setLayoutY(100);
         bt1.setPrefSize(150,30);
        // bt1.setOnAction((EventHandler<ActionEvent>) this);
         bt2= new Button("Delete Meal");
         g.getChildren().add(bt2);
         bt2.setLayoutX(200);
         bt2.setLayoutY(170);
         bt2.setPrefSize(150,30);
          bt3 =new Button("Search Meal");
         g.getChildren().add(bt3);
         bt3.setLayoutX(200);
         bt3.setLayoutY(240);
         bt3.setPrefSize(150,30);
         bt4 =new Button("Update Meal");
         g.getChildren().add(bt4);
         bt4.setLayoutX(200);
         bt4.setLayoutY(310);
         bt4.setPrefSize(150,30);
          bt5 =new Button("Display Meal");
         g.getChildren().add(bt5);
         bt5.setLayoutX(200);
         bt5.setLayoutY(380);
         bt5.setPrefSize(150,30);
     
         primaryStage.show();

         //add.setFill(Color.ANTIQUEWHITE);
        
        primaryStage.setScene(sc);
        primaryStage.setTitle("Meal");
        primaryStage.setWidth(900);
        primaryStage.setHeight(700);
        Text actiontarget=new Text();
        bt1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
        public void handle(ActionEvent event){
            if(event.getSource().equals(bt1)){
            primaryStage.close();
               Add meal = new  Add();
               try{
               Stage s = new Stage();
               meal.start(s);
               }
               catch(Exception ex){ 
                   System.out.println("error");
               }
            }else{
                actiontarget.setFill(Color.BROWN);
                actiontarget.setText("Failed..");
            }
        
         }});
         bt2.setOnAction((ActionEvent e) -> {
                   if(e.getSource().equals(bt2)){
                       primaryStage.close();
                       Delete meal = new  Delete();
                       Stage s = new Stage();
                       meal.start(s);
               }
                   else{
                        actiontarget.setFill(Color.BROWN);
                        actiontarget.setText("Failed..");
                   }
                   
    });
          bt3.setOnAction((ActionEvent e) -> {
                   if(e.getSource().equals(bt3)){
                       primaryStage.close();
                       Search meal = new  Search();
                       Stage s = new Stage();
                       meal.start(s);
               }
                   else{
                actiontarget.setFill(Color.BROWN);
                actiontarget.setText("Failed..");
                   }
    });
           bt4.setOnAction((ActionEvent e) -> {
                   if(e.getSource().equals(bt4)){
                       primaryStage.close();
                       Update meal = new  Update();
                       Stage s = new Stage();
                       meal.start(s);
               }
                   else{
                actiontarget.setFill(Color.BROWN);
                actiontarget.setText("Failed..");
                   }
    });
            bt5.setOnAction((ActionEvent e) -> {
                   if(e.getSource().equals(bt5)){
                       primaryStage.close();
                       List meal = new  List();
                       Stage s = new Stage();
                       meal.start(s);
               }
                   else{
                actiontarget.setFill(Color.BROWN);
                actiontarget.setText("Failed..");
                   }
    });
        
}
}

  




  
    

