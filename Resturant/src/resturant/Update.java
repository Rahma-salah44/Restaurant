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
public class Update extends Application {
     @Override
    public void start(Stage primaryStage) {
    Group upd=new Group();
    Scene u = new Scene(upd);
     u.setFill(Color.CADETBLUE);
     Label l2=new Label("ID:");
         l2.setPrefSize(300,100);
         l2.setFont(Font.font("Tahoma", FontWeight.BOLD, 18));
         l2.setLayoutX(130);
         l2.setLayoutY(60);
         TextField t5=new TextField();
         t5.setLayoutX(300);
         t5.setLayoutY(100);
         Label l3=new Label("Name:");
         l3.setPrefSize(300,100);
         l3.setFont(Font.font("Tahoma", FontWeight.BOLD, 18));
         l3.setLayoutX(130);
         l3.setLayoutY(130);
         TextField t6=new TextField();
         t6.setLayoutX(300);
         t6.setLayoutY(170);
         Label l4=new Label("Price:");
         l4.setPrefSize(300,100);
         l4.setFont(Font.font("Tahoma", FontWeight.BOLD, 18));
         l4.setLayoutX(130);
         l4.setLayoutY(200);
         TextField t7=new TextField();
         t7.setLayoutX(300);
         t7.setLayoutY(240);
         Label l5=new Label("Preparation Time:");
         l5.setPrefSize(300,100);
         l5.setFont(Font.font("Tahoma", FontWeight.BOLD, 18));
         l5.setLayoutX(130);
         l5.setLayoutY(270);
         TextField t8=new TextField();
         t8.setLayoutX(300);
         t8.setLayoutY(310);
         upd.getChildren().addAll(l2,l3,l4,l5);
         upd.getChildren().addAll(t5,t6,t7,t8);
         Button UpdateMeal = new Button("Update");
         UpdateMeal.setPrefSize(70,30);
         UpdateMeal.setLayoutY(400);
         UpdateMeal.setLayoutX(350);
         UpdateMeal.setAlignment(Pos.CENTER);
         upd.getChildren().add(UpdateMeal);
         primaryStage.setTitle("Update Meals");
         primaryStage.setWidth(700);
         primaryStage.setHeight(600);
         primaryStage.setScene(u);
         primaryStage.show();
         UpdateMeal.setOnAction(new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent event){
          Admin p = new Admin();
          Meal x = new Meal(Integer.valueOf(t5.getText()),t6.getText(),Double.parseDouble(t7.getText()),Double.parseDouble(t8.getText()));
          p.updateMeal(Integer.valueOf(t5.getText()),x);
           primaryStage.close();
        }
    });

}
}



