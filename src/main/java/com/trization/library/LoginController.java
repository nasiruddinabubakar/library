package com.trization.library;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class LoginController {


    @FXML
    private TextField username;

    @FXML
    private AnchorPane mainAnchorPane;



    public void moveToRegisterPage(){

        try{
            System.out.println("hello world");
            FXMLLoader loader = new FXMLLoader(getClass().getResource("register.fxml"));
            Parent registrationPage = loader.load();
            mainAnchorPane.getChildren().setAll(registrationPage);
        }catch(Exception e){
            e.printStackTrace();
        }

    }
}
