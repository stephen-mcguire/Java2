/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.SplitPane;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author Stephen
 */
public class ConfirmTest extends Application {
    
    @Override
    public void start(Stage primaryStage) {
      SplitPane sp = new SplitPane();
      MenuBar menuBar = new MenuBar();
        Pane pane = new Pane();
        pane.getChildren().add(menuBar);
        
        Menu menuFile = new Menu("File");
        Menu menuHelp = new Menu("Help");
        menuBar.getMenus().addAll(menuFile, menuHelp);
        
        // adding new items to the list \\ 
        MenuItem menuAbout = new MenuItem("About");
        MenuItem menuExit = new MenuItem("Exit");        
         
        // adds the exit option \\ 
        menuFile.getItems().addAll(menuExit);
        // adds the about option to the menu \\ 
        menuHelp.getItems().add(menuAbout);
        // come back and figure out how to add this to the description \\ 
        //menuAbout.setOnAction(e -> StringProperty);
        
        menuExit.setOnAction(e -> System.exit(0));
        
        
        VBox testvbox = new VBox();
        ListView<String> list = new ListView<>();
ObservableList<String> items =FXCollections.observableArrayList (
    "Single", "Double", "Suite", "Family App");
list.setItems(items);
      
        
        StackPane root = new StackPane();
        //root.getChildren().add(btShop);
        
        Scene scene = new Scene(new VBox(root), 300, 250);
        ((VBox) scene.getRoot()).getChildren().addAll(menuBar);
       
         
       
        
        
     // tutorial 11 check bockes
     // tutorial 13 choiceBoxs.setOnAction(e -> System.out.println(colors.getValue()));
//It's much easier this way.﻿
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Application.launch(args);
    }
    
}
