/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.event.EventType;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.NodeOrientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.SeparatorMenuItem;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javax.swing.JOptionPane;

/**
 *
 * @author Stephen
 */
public class ShoppingCartDriver extends Application {

    @Override
    public void start(Stage primaryStage) throws FileNotFoundException, IOException {
        Button btn = new Button();
        btn.setText("Say 'Hello World'");
        btn.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                System.out.println("Hello World!");
            }
        });

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
        exitMenuItem.setOnAction(e -> Platform.exit());

        // Gives a short description about this program, please referance AlterBox Class for more details \\
        helpMenu.setOnAction(e -> AltertBox.display("Help You", "This program is designed to make you choose what "
                + "books you want to buy for yourself" + " Version 1.15"));
        menuBar.getMenus().addAll(fileMenu, aboutMenu);

        //reads books in file 
        BufferedReader in = new BufferedReader(new FileReader("src/bookFolder/books.txt"));
        String str = null;

        ArrayList<String> lists = new ArrayList<>();
        while ((str = in.readLine()) != null) {
            lists.add(str);
        }

        String[] listsArray = lists.toArray(new String[0]);

        ListView<String> bookList = new ListView();

        bookList.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
        bookList.getSelectionModel().getSelectedItems();

// reading from the file 
        ObservableList<String> items = FXCollections.observableArrayList(listsArray);

        bookList.setItems(items);

        ObservableList<String> bPrice = FXCollections.observableArrayList();


        ListView<String> shoppingCart = new ListView(bPrice);

        shoppingCart.getItems().addAll(bPrice);


        Button addBtn = new Button("Add");
        addBtn.setOnAction((ActionEvent e) -> {
            
                for(Integer i: bookList.getSelectionModel().getSelectedIndices()) {
                    if(bookList.getSelectionModel().isSelected(i)) {
                        shoppingCart.getItems().add(bookList.getItems().get(i));
                    }
                }
        });
        
        Button removeBtn = new Button("Remove");
        
        removeBtn.setOnAction((ActionEvent e) -> {
        for(Integer i: bookList.getSelectionModel().getSelectedIndices()) {
            if(shoppingCart.getSelectionModel().isSelected(i)) {
                shoppingCart.getItems().remove(0);
            }   
        }
    });
        
        cartSystem cart = new cartSystem();
        String[] itemss;
       Button checkOutBtn = new Button("Checkout");
       checkOutBtn.setOnAction((ActionEvent e )-> {
           for(Integer i: bookList.getSelectionModel().getSelectedIndices()) {
                    if(bookList.getSelectionModel().isSelected(i)) {
                        shoppingCart.getItems().add(bookList.getItems().get(i));
                    }
                }
           if(bPrice.isEmpty()) {
               JOptionPane.showMessageDialog(null, "You need to add books to the cart");
           }else{
               
               System.out.println("test");
           }
           
       });
        
        
        
        
    
        
        

        ColumnConstraints leftCol = new ColumnConstraints();
        leftCol.halignmentProperty().set(HPos.RIGHT);

        VBox leftVbox = new VBox();

        Pane leftVpane = new Pane();
        leftVpane.getChildren().addAll(bookList, leftVbox);

        Pane rightVpane = new Pane();

        rightVpane.getChildren().addAll(shoppingCart);

        VBox rightV = new VBox();
        rightV.getChildren().addAll(rightVpane);
        
        
        
        HBox hbox = new HBox();
        hbox.getChildren().addAll(addBtn, removeBtn, checkOutBtn);

        BorderPane root = new BorderPane();
        
        root.setTop(menuBar);
        root.setLeft(leftVpane);
        root.setRight(rightVpane);
        root.setCenter(hbox);
        

        Scene scene = new Scene(root, 300, 250);

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

}
