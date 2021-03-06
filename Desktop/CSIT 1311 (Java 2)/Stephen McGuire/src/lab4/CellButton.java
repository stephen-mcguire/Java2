/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import java.util.ArrayList;
import java.util.List;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.stage.Stage;

/**
 *
 * @author Stephen
 */
public class CellButton extends Application {
    public static class HBoxCell extends HBox {
          Label label = new Label();
          Button button = new Button();

          HBoxCell(String labelText, String buttonText) {
               super();

               label.setText(labelText);
               label.setMaxWidth(Double.MAX_VALUE);
               HBox.setHgrow(label, Priority.ALWAYS);

               button.setText(buttonText);

               this.getChildren().addAll(label, button);
          }
     }

     public Parent createContent() {
          BorderPane layout = new BorderPane();

          List<HBoxCell> list = new ArrayList<>();
          for (int i = 0; i < 12; i++) {
               list.add(new HBoxCell("Item " + i, "Button " + i));
          }

          ListView<HBoxCell> listView = new ListView<>();
          ObservableList<HBoxCell> myObservableList = FXCollections.observableList(list);
          listView.setItems(myObservableList);

          layout.setCenter(listView);

          return layout;
     }

     @Override
     public void start(Stage stage) throws Exception {
          stage.setScene(new Scene(createContent()));
          stage.setWidth(300);
          stage.setHeight(200);
          stage.show();
     }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
