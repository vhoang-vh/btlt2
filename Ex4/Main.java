
package com.example.bt;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage stage) {
        TextField input = new TextField();
        input.setPromptText("Nhap nhiet do C");

        Button button = new Button("Chuyen sang F");

        Label result = new Label("Ket qua: ");

        button.setOnAction(e -> {
            double c = Double.parseDouble(input.getText());
            double f = c * 9 / 5 + 32;
            result.setText("Ket qua: " + f + " F");
        });

        VBox root = new VBox(10);
        root.getChildren().addAll(input, button, result);

        Scene scene = new Scene(root, 300, 200);

        stage.setTitle("Chuyen doi nhiet do");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
