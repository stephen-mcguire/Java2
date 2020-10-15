/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testingStuff;

import javafx.application.Application;
import javafx.geometry.Orientation;
import javafx.scene.Scene;
import javafx.scene.control.SplitPane;
import javafx.scene.control.TitledPane;
import javafx.scene.control.ToggleButton;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author sbmcguire
 */
public class NewFXMain1 extends Application {
    
    @Override
    public void start(Stage primaryStage) {
       //Create central pane and add toggle buttons to open hidden panes on the
    //left, right, and bottom (films, books, and arts respectively)
    ToggleButton selectBooks = new ToggleButton("Books");
    ToggleButton selectFilms = new ToggleButton("Films");
    ToggleButton selectArts = new ToggleButton("Arts");
    VBox centre = new VBox(100,selectBooks,selectFilms,selectArts);

    //Create left-hand titled pane for the films list and centre it in VBox
    TitledPane films = new TitledPane();
    films.setText("Films");
    VBox filmsBox = new VBox(films);

    //Create right-hand titled pane for the books list and centre it in Vbox
    TitledPane books = new TitledPane();
    books.setText("Books");
    VBox booksBox = new VBox(books);

    //Create mainSplit pane
    TitledPane arts = new TitledPane();
    arts.setText("arts");
    VBox artsBox = new VBox(arts);

    SplitPane mainSplit = new SplitPane();
    mainSplit.getItems().addAll(filmsBox, centre, booksBox);
    mainSplit.setDividerPosition(0,1/(double)12);
    mainSplit.setDividerPosition(1,11/(double)12);

    SplitPane root = new SplitPane();
    root.setOrientation(Orientation.VERTICAL);
    root.getItems().addAll(mainSplit, artsBox);
    root.setDividerPosition(0,0.9);
    root.setPrefWidth(1300);
    root.setPrefHeight(750);
        
        
        
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
