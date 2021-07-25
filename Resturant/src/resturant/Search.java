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
public class Search extends Application{
     public void start(Stage primaryStage) {
    Group search=new Group();
    Scene s = new Scene(search);
     s.setFill(Color.CADETBLUE);
    Label l2=new Label("ID:");
         l2.setPrefSize(300,100);
         l2.setFont(Font.font("Tahoma", FontWeight.BOLD, 18));
         l2.setLayoutX(130);
         l2.setLayoutY(60);
         TextField t6=new TextField();
         t6.setLayoutX(300);
         t6.setLayoutY(100);
         /*Label l3=new Label("Name:");
         l3.setPrefSize(300,100);
         l3.setFont(Font.font("Tahoma", FontWeight.BOLD, 18));
         l3.setLayoutX(130);
         l3.setLayoutY(130);
         TextField t7=new TextField();
         t7.setLayoutX(300);
         t7.setLayoutY(170);
         Label l4=new Label("Price:");
         l4.setPrefSize(300,100);
         l4.setFont(Font.font("Tahoma", FontWeight.BOLD, 18));
         l4.setLayoutX(130);
         l4.setLayoutY(200);
         TextField t8=new TextField();
         t8.setLayoutX(300);
         t8.setLayoutY(240);
         Label l5=new Label("Preparation Time:");
         l5.setPrefSize(300,100);
         l5.setFont(Font.font("Tahoma", FontWeight.BOLD, 18));
         l5.setLayoutX(130);
         l5.setLayoutY(270);
         TextField t9=new TextField();
         t9.setLayoutX(300);
         t9.setLayoutY(310);*/
         search.getChildren().addAll(l2);
         search.getChildren().addAll(t6);
         Button SearchMeal = new Button("Search");
         SearchMeal.setPrefSize(70,30);
         SearchMeal.setLayoutY(160);
         SearchMeal.setLayoutX(300);
         SearchMeal.setAlignment(Pos.CENTER);
         search.getChildren().add(SearchMeal);
          Button DeleteMeal = new Button("Delete");
         DeleteMeal.setPrefSize(70,30);
         DeleteMeal.setLayoutX(400);
         DeleteMeal.setLayoutY(160);
         DeleteMeal.setAlignment(Pos.CENTER);
         search.getChildren().add(DeleteMeal);
         primaryStage.setTitle("Search and Delete Meals");
         primaryStage.setWidth(700);
         primaryStage.setHeight(600);
         primaryStage.setScene(s);
         primaryStage.show();
         SearchMeal.setOnAction(new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent event){
        Admin p =(Admin) new person();
        p.searchformeal(Integer.valueOf(t6.getText()));
        primaryStage.close();
}
});
        DeleteMeal.setOnAction(new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent event){
           Admin p =new Admin();
           p.deletemeal(Integer.valueOf(t6.getText()));
           primaryStage.close();
}
});
     }
}

