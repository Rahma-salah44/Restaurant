/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resturant;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;


/**
 *
 * @author raghda
 */
public class List extends Application {

    public void start(Stage primaryStage) {
        Group display=new Group();
        TableView<Meal> table = new TableView<>();
        TableColumn<Meal, String> nameCol = new TableColumn<>("Name");
        TableColumn<Meal, String> idCol= new TableColumn<>("ID");
        TableColumn<Meal, String> priceCol= new TableColumn<>("Price");
        TableColumn<Meal, String> prtimeCol = new TableColumn<>("preparationTime");
        table.getColumns().addAll(nameCol,idCol,priceCol,prtimeCol);
        StackPane root=new StackPane();
        root.setPadding(new Insets(5));
        root.getChildren().add(table);
         primaryStage.setTitle("Display Meals");
          primaryStage.setWidth(700);
         primaryStage.setHeight(600);
         Scene scene=new Scene(root,350,400);
         primaryStage.setScene(scene);
         primaryStage.show();
}
    }
    
 

