package com.example.demo;

import javafx.application.*;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

import javafx.geometry.Pos;
import javafx.scene.*;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.*;
import javafx.stage.*;
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

        Button btnUp = new Button("Up");
        Button btnDown = new Button("Down");

            btnUp.setOnAction(new EventHandler<ActionEvent>() {
                @Override
                public void handle(ActionEvent actionEvent) {
                    response.setText("You are enter Up ");
                }
            });

            btnDown.setOnAction(new EventHandler<ActionEvent>() {
                @Override
                public void handle(ActionEvent actionEvent) {
                    response.setText("You are aenter Down");
                }
            });

       // Label label = new Label("\tJfx iron man\n Issy the best ");
        rootNode.getChildren().addAll(btnUp,btnDown,response);
        myStage.show();
    }
}