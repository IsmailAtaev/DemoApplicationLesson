package com.example.demo;

import javafx.application.*;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.control.CheckBox;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.*;
import javafx.event.*;
import javafx.geometry.*;
import java.io.IOException;




public class HelloApplication extends Application {
    /*@Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }*/
    Label response;
    public static void main(String[] args) {
        launch();
    }

    @Override
    public void init() throws Exception {
        System.out.println("in method init ");
    }

    @Override
    public void stop() throws Exception {
        System.out.println("stop");
        super.stop();
    }

    @Override
    public void start(Stage myStage) throws Exception {
        System.out.println("start");
        myStage.setTitle("karkas application javafx ");
        FlowPane rootNode =  new FlowPane(20,10);

        rootNode.setAlignment(Pos.CENTER);

        myStage.setScene(new Scene(rootNode,300,200));
        response = new Label(" Enter Button ");

        Button btnUp = new Button("+");
        Button btnDown = new Button("-");

            btnUp.setOnAction(actionEvent -> response.setText("You are enter Up "));

            btnDown.setOnAction(actionEvent -> response.setText("You are aenter Down"));

       // Label label = new Label("\tJfx iron man\n Issy the best ");
        rootNode.getChildren().addAll(btnUp,btnDown,response);
        myStage.show();
    }
}


class CheckboxDemo extends Application{
    CheckBox cbSmartPhone;
    CheckBox cbTablet;
    CheckBox cbNotebook;
    CheckBox cbDesktop;

    Label response;
    Label selected;

    String computers;

    public CheckboxDemo(CheckBox cbSmartPhone, CheckBox cbTablet, CheckBox cbNotebook, CheckBox cbDesktop, Label response, Label selected, String computers) {
        this.cbSmartPhone = cbSmartPhone;
        this.cbTablet = cbTablet;
        this.cbNotebook = cbNotebook;
        this.cbDesktop = cbDesktop;
        this.response = response;
        this.selected = selected;
        this.computers = computers;
    }

    public static void main(String[] args) {
        launch(args);
    }

    public CheckboxDemo() {
        super();
    }

    @Override
    public void init() throws Exception {
        super.init();
    }

    @Override
    public void stop() throws Exception {
        super.stop();
    }

    @Override
    public void start(Stage myStage) throws Exception {
        myStage.setTitle("Demonstratiya flagka");
        FlowPane rootNode = new FlowPane(Orientation.HORIZONTAL, 10, 10);
        rootNode.setAlignment(Pos.CENTER);
        // create stenu
        Scene myScene = new Scene(rootNode, 230, 200);
        // install on platforme
        myStage.setScene(myScene);
        Label heading = new Label(" what haw you got device ?");
        response = new Label("");
        selected = new Label("");
        // create flags
        cbSmartPhone = new CheckBox("SmartPhone");
        cbTablet = new CheckBox("Table");
        cbNotebook = new CheckBox("NoteBook");
        cbDesktop = new CheckBox("PC");
        //
        cbSmartPhone.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                if (cbSmartPhone.isSelected())
                    response.setText(" choice was Phone ");
                else
                    response.setText(" choice phone cancelled");
                showAll();
            }
        });

        cbTablet.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                if (cbTablet.isSelected())
                    response.setText(" choice was Table ");
                else
                    response.setText(" choice table cancelled");

                showAll();
            }
        });

        cbNotebook.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                if (cbNotebook.isSelected())
                    response.setText(" choice was Notebook");
                else
                    response.setText(" choice Notebook cancelled");

                showAll();
            }
        });
        cbDesktop.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                if (cbDesktop.isSelected())
                    response.setText("choice was PC");
                else
                    response.setText("Choice PC cancelled ");
            }
        });

        rootNode.getChildren().addAll(heading, cbSmartPhone, cbTablet,
                cbNotebook, cbDesktop, response,
                selected);
        myStage.show();
        showAll();

    }
    public  void showAll(){
        computers = "";
        if(cbSmartPhone.isSelected()) computers = "Phone";
        if(cbTablet.isSelected()) computers = "Table";
        if(cbNotebook.isSelected()) computers= "Notebook";
        if(cbDesktop.isSelected()) computers = "PC";
        selected.setText("Selected devices :" + computers);
    }
}