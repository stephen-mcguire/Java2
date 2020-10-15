/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testingStuff;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.SeparatorMenuItem;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import lab4.AltertBox;
import java.io.*;
import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;


/**
 *
 * @author sbmcguire
 */
public class NewIdea extends Application {

    
    
    @Override
    public void start(Stage primaryStage) {
        cartSystem bookCart = new cartSystem();
   BorderPane menuTOP = new BorderPane();
   MenuBar menuBar = new MenuBar();
    menuBar.prefWidthProperty().bind(primaryStage.widthProperty());
    menuTOP.setTop(menuBar);

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
    
    ListView<allItems> list = new ListView<>();
    
     ObservableList<allItems> items = new  ObservableList<>();
    
    
    
        
        Scene scene = new Scene(menuTOP, 300, 250);
        
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    // TO MAKE ERROR GO AWAY, ADD THIS ITEM \\
    public static class bookListView extends ListCell<allItems> {
    
    private final Label BOOKTITLES;
    private final Label PRICECOVER;
    
    private GridPane grid;
    
    public bookListView() {

        grid = new GridPane();
        grid.setPadding(new Insets(10,10,10,10));
        grid.setHgap(10);
        grid.setVgap(10);

        BOOKTITLES = new Label();
        PRICECOVER = new Label();

        Button deleteBTN = new Button("delete");



    }

    public void shoppingCart(bookListView item, boolean empty) {
        super.shoppingCart(item, empty);
        if (empty) {
            setGraphic(null);
        }else{
            // add code here \\

        }
    }
}

public static class bookInventory {
        private Stirng books;
        private double prices;

        public bookInventory(String books, double prices) {
            this.books = books;
            this.prices = prices;
        }

    public Stirng getBooks() {
        return books;
    }

    public void setBooks(Stirng books) {
        this.books = books;
    }

    public double getPrices() {
        return prices;
    }

    public void setPrices(double prices) {
        this.prices = prices;
    }
}
    
}
