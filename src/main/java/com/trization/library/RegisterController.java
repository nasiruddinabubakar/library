package com.trization.library;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.PasswordField;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import javafx.event.ActionEvent;
import java.io.File;



public class RegisterController  {


    @FXML
    private Label registerMessage;

    public void registerAccount(){

        try{

            Parent root = FXMLLoader.load((getClass().getResource("register.fxml")));
            Stage registerStage = new Stage();

            registerStage.show();
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public void registerButtonAction(ActionEvent event){


        registerMessage.setText("User Registered Successfully!");
    }


}
