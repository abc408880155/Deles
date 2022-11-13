package com.example.deles;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("Deles.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Deles");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.getIcons().add(new Image("file:src/main/resources/image/logo.png"));
//        getHostServices().showDocument("www.baidu.com");
        stage.show();

    }

    public static void main(String[] args) {
        launch();
    }

    @Override
    public void init() throws Exception {
        super.init();
    }

    @Override
    public void stop() throws Exception {
        super.stop();
    }
}