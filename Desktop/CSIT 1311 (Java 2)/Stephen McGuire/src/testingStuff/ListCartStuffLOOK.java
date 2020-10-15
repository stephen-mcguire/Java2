/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testingStuff;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.SeparatorMenuItem;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import lab4.AltertBox;
import lab4.cartSystem;

/**
 *
 * @author sbmcguire
 */
public class ListCartStuffLOOK extends Application {
    VBox vBox1;
    VBox vBox2;
    HBox hBox1;
    HBox hBox2;
    HBox hBox3;
    Button button1;
    Button button2;
    Button button3;
    Button button4;
    Button button5;
    Button button6;
    @Override
    public void start(Stage primaryStage) throws Exception {
        
        
        
          // Initializing the containers.
        vBox1 = new VBox();
        vBox1.setPadding(new Insets(5, 5, 5, 5));
        vBox1.setSpacing(10);

        vBox2 = new VBox();
        vBox2.setPadding(new Insets(10, 10, 0, 10));
        vBox2.setSpacing(10);

        hBox1 = new HBox();
        hBox1.setPadding(new Insets(50, 50, 50, 50));
        hBox1.setSpacing(100);

        hBox2 = new HBox();
        hBox2.setPadding(new Insets(50, 50, 50, 50));
        hBox2.setSpacing(100);

        hBox3 = new HBox();

        // initializing the nodes.
        button1 = new Button("Option 1 ");
        button2 = new Button("Option 2 ");
        button3 = new Button("Option 3 ");
        button4 = new Button("Option 4 ");
        button5 = new Button("Option 5 ");
        button6 = new Button("Option 6 ");

        // Events
        button1.setOnAction(e -> /*SimpleLogInScreen.display("Log in")*/ System.out.println("Log in"));
        button2.setOnAction(e -> /*ConfirmNotificationWindow.display("Log in",
                "Confirm?")*/ System.out.println("Confirm"));
        button3.setOnAction(e -> /*SimpleNotificationWindow.display("Log in",
                "Alert, invalid action!")*/ System.out.println("Notify"));

         //Arrange the containers and contents
        hBox1.getChildren().addAll(button1, button2, button3);
        hBox2.getChildren().addAll(button4, button5, button6);

        vBox1.getChildren().addAll(hBox1, hBox2);

        hBox3.getChildren().addAll(vBox1);
        hBox3.setAlignment(Pos.TOP_LEFT);

        // Creating a list view
        ListView<Books> list = new ListView<>();

        ObservableList<Books> items = FXCollections.observableArrayList();
        for (int i = 0; i < 1; i++) {
            items.add(new Books("Book 1", "$19.99"));
           items.add(new Books("book 2", "$55.55"));
           items.add(new Books("testing", "$999.999"));
        }
        list.setItems(items);

        list.setCellFactory(lv -> new PersonCell());


        // --------------------------------------------------------------------

        vBox2.getChildren().addAll(hBox3, list);

        VBox.setVgrow(list, Priority.ALWAYS);

        // Loading the final scene.
        Scene scene1 = new Scene(vBox2);
        //scene1.getStylesheets().add("main-application-window.css");

        // Final steps to set up the window.

        primaryStage.setScene(scene1);
        primaryStage.setTitle("Main Aplication Interface");
        primaryStage.setMaximized(false);
        primaryStage.show();
        primaryStage.setResizable(true);

    }
    
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
    public static class PersonCell extends ListCell<Books> {
        private final Label firstNameLabel ;
        private final Label lastNameLabel ;

        private final GridPane listCellContents ;

        public PersonCell() {
            listCellContents = new GridPane();
            listCellContents.setPadding(new Insets(5, 5, 5, 5));
            listCellContents.setHgap(10);
            listCellContents.setVgap(10);

            firstNameLabel = new Label();
            lastNameLabel = new Label();

            Button deleteReccord = new Button("Delete");
            deleteReccord.setOnAction(e -> { 
                Books books = getItem();
                System.out.println("Delete "+books.getFirstName() + " " + books.getLastName());
            });


            listCellContents.add(firstNameLabel, 0, 0);
            listCellContents.add(lastNameLabel, 0, 1);
            listCellContents.add(deleteReccord, 1, 0, 1, 2);

            ColumnConstraints leftCol = new ColumnConstraints();
            ColumnConstraints rightCol = new ColumnConstraints();

            rightCol.setHalignment(HPos.RIGHT);
            rightCol.setHgrow(Priority.ALWAYS);

            listCellContents.getColumnConstraints().addAll(leftCol, rightCol);

        }

        @Override
        public void updateItem(Books item, boolean empty) {
            super.updateItem(item, empty);
            if (empty) {
                setGraphic(null);
            } else {
                firstNameLabel.setText(item.getFirstName());
                lastNameLabel.setText(item.getLastName());
                setGraphic(listCellContents);
            }
        }
    }
 public static class Books {
        private String firstName ;
        private String lastName ;

        public Books(String firstName, String lastName) {
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

        public String getBookPrice() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }


    }
    
}
