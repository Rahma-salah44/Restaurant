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
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

/**
 *
 * @author raghda
 */
public class Delete extends Application{
     @Override
    public void start(Stage primaryStage) {
    Group del=new Group();
    Scene d = new Scene(del);
     d.setFill(Color.CADETBLUE);
     Label l6=new Label("ID:");
         l6.setPrefSize(300,100);
         l6.setFont(Font.font("Tahoma", FontWeight.BOLD, 18));
         l6.setLayoutX(200);
         l6.setLayoutY(65);
         TextField t5=new TextField();
         t5.setLayoutX(300);
         t5.setLayoutY(100);
         del.getChildren().add(l6);
         del.getChildren().add(t5);
         Button DeleteMeal = new Button("Delete");
         DeleteMeal.setPrefSize(70,30);
         DeleteMeal.setLayoutX(350);
         DeleteMeal.setLayoutY(200);
         DeleteMeal.setAlignment(Pos.CENTER);
         del.getChildren().add(DeleteMeal);
         primaryStage.setTitle("Delete Meals");
          primaryStage.setWidth(700);
         primaryStage.setHeight(600);
         primaryStage.setScene(d);
         primaryStage.show();
         DeleteMeal.setOnAction(new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent event){
           Admin p =(Admin) new person();
           p.deletemeal(Integer.valueOf(t5.getText()));
           primaryStage.close();
}
});
 }
}

