package Buttons;

import Clases.Directory;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class LogIn
{
    private VBox voki;
    private HBox names;
    private HBox lastnames;
    private HBox IDs;

    public LogIn()
    {
        voki = new VBox();

        //Ask Data
        ShowHead();
        AskName();
        AskLastName();
        AskID();

        //Buttons
        Button log = new Button("Ingresar");
        Button exit = new Button("Regresar");

        //Add buttons in the main container
        voki.getChildren().addAll(log,exit);

        //Design
        voki.setAlignment(Pos.CENTER);
        voki.setSpacing(Directory.verticalSpace);

        /*--------------------------Buttons Action--------------------------*/
        //Exit Button Action
        exit.setOnMouseClicked((ext) -> {
            Stage stage = (Stage) exit.getScene().getWindow();
            stage.close();
        });
        //Regist Button Action

    }

    public VBox getLogIn()
    {
        return voki;
    }

    /*--------------------------Head--------------------------*/
    public void ShowHead()
    {
        ImageView img = new ImageView("file:" + Directory.RESOURCE_FOLDER + "/LogoNoBackground.png");
        img.setFitHeight(200);
        img.setFitWidth(200);

        Label head = new Label("Mi Armoniosa Panaderia");
        head.setFont(new Font("Times New Roman", 35));
        Label space = new Label("");
        space.setFont(new Font(5));
        Label subHead = new Label("Porfavor, llene los campos solicitados");
        subHead.setFont(new Font("Times New Roman", 20));
        Label space2 = new Label("");
        space.setFont(new Font(5));

        voki.getChildren().addAll(img,head,space,subHead,space2);
    }

    /*--------------------------Ask Data--------------------------*/
    public void AskName()
    {
        names = new HBox();

        Label L_firstName = new Label("Nombre:");
        L_firstName.setFont(new Font("Times New Roman", Directory.textSize));

        TextField firstName = new TextField();
        firstName.setMaxWidth(Directory.squareSize);

        names.getChildren().addAll(L_firstName,firstName);
        names.setAlignment(Pos.CENTER);
        names.setSpacing(Directory.horizontalSpace);

        voki.getChildren().addAll(names);
    }

    public void AskLastName()
    {
        lastnames = new HBox();

        Label L_lastName = new Label("Apellido:");
        L_lastName.setFont(new Font("Times New Roman", Directory.textSize));

        TextField lastName = new TextField();
        lastName.setMaxWidth(Directory.squareSize);

        lastnames.getChildren().addAll(L_lastName,lastName);
        lastnames.setAlignment(Pos.CENTER);
        lastnames.setSpacing(Directory.horizontalSpace);

        voki.getChildren().addAll(lastnames);
    }

    public void AskID()
    {
        IDs = new HBox();

        Label L_ID = new Label("Numero de cedula:");
        L_ID.setFont(new Font("Times New Roman", Directory.textSize));

        TextField ID = new TextField();
        ID.setMaxWidth(Directory.squareSize);

        IDs.getChildren().addAll(L_ID,ID);
        IDs.setAlignment(Pos.CENTER);
        IDs.setSpacing(Directory.horizontalSpace);
 
        voki.getChildren().addAll(IDs);
    }
}