/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testingStuff;

import java.io.File;
import java.util.Scanner;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.SeparatorMenuItem;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import lab4.AltertBox;
import lab4.ReadFile;


/**
 *
 * @author Stephen
 */
public class Main19 extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        HBox menuTOP = new HBox();
        menuTOP.setPadding(new Insets(50, 50, 50, 50));
        menuTOP.setSpacing(100);
        
    MenuBar menuBar = new MenuBar();
    menuBar.prefWidthProperty().bind(primaryStage.widthProperty());
    menuTOP.setAlignment(Pos.TOP_LEFT);
   
        
    
     // File menu - new, save, print, and exit
    Menu fileMenu = new Menu("File");
    MenuItem exitMenuItem = new MenuItem("Exit");
    
    //add the new menuitems to the fileMenu
    fileMenu.getItems().addAll(new SeparatorMenuItem(), exitMenuItem);

    Menu aboutMenu = new Menu("About");
    MenuItem helpMenu = new MenuItem("Help");
    aboutMenu.getItems().addAll(helpMenu);
    
    
    // Exits the program when clicked "EXIT" \\ 
    exitMenuItem.setOnAction(e ->Platform.exit());
    
    // Gives a short description about this program, please referance AlterBox Class for more details \\ 
    helpMenu.setOnAction(e -> AltertBox.display("Help You", "This program is designed to make you choose what "
            + "books you want to buy for yourself"));
    menuBar.getMenus().addAll(fileMenu, aboutMenu);


ReadFile readfile = new ReadFile();
    
            GridPane root = new GridPane();
        // adds list to the application \\
        File bookTitles = new File("src/bookFolder/books.txt");
       // Scanner fileScanner = new Scanner(bookTitles);
        
     
        
        ListView<String> list = new ListView<>();
        list.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
        list.getSelectionModel().getSelectedItems();
       // list.getSelectionModel().getSelectedItems().addListener(new ChangeListener<String>() {});
       
       // ObservableList<ReadFile> bItems = FXCollections.observableArrayList();
        ObservableList<String> items = FXCollections.observableArrayList (
    "Single", "Double", "Suite", "Family App");
        
        // sets item values to list \\
        list.setItems(items);
        
        Pane listPane = new Pane();
      //  listPane.getChildren().add(items);

        BorderPane testing = new
        
       
        root.getChildren().addAll(menuBar, listPane);
        
        Scene scene = new Scene(root, 300, 250);
        
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**tesin
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Application.launch(args);
    }
    
//    @Override
//        public void updateItem(books item, boolean empty) {
//            super.updateItem(item, empty);
//            if (empty) {
//                setGraphic(null);
//            } else {
//                firstNameLabel.setText(item.getFirstName());
//                lastNameLabel.setText(item.getLastName());
//                setGraphic(listCellContents);
//            }
//        }
   
 public static class booksItem {
        private String firstName ;
        private String lastName ;

        public booksItem(String firstName, String lastName) {
            this.firstName = firstName ;
            this.lastName = lastName ;
        }

        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }


    }


}


