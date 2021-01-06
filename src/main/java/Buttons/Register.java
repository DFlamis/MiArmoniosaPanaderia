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

public class Register {
    //Containers
    private VBox voki;
    private HBox names;
    private HBox lastnames;
    private HBox IDs;
    private HBox emails;
    private HBox numbers;
    private HBox mainstreets;
    private HBox streets;

    public Register()
    {

        voki = new VBox();

        //Ask data
        ShowHead();
        AskName();
        AskLastName();
        AskID();
        AskEmail();
        AskNumber();
        AskMainStreet();
        AskStreet();

        //Buttons
        Button regist = new Button("Registrarse");
        Button exit = new Button("Regresar");

        //Add all Buttons in the main container
        voki.getChildren().addAll(regist, exit);
    
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
    
    public VBox getRegister()
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

        Label L_lastName = new Label("Apellido");
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

    public void AskEmail()
    {
        emails = new HBox();

        Label L_email = new Label("Correo electronico:");
        L_email.setFont(new Font("Times New Roman", Directory.textSize));

        TextField email = new TextField();
        email.setMaxWidth(Directory.squareSize);

        emails.getChildren().addAll(L_email,email);
        emails.setAlignment(Pos.CENTER);
        emails.setSpacing(Directory.horizontalSpace);

        voki.getChildren().addAll(emails);
    }

    public void AskNumber()
    {
        numbers = new HBox();

        Label L_number = new Label("Numero de contacto:");
        L_number.setFont(new Font("Times New Roman", Directory.textSize));

        TextField ID = new TextField();
        ID.setMaxWidth(Directory.squareSize);

        numbers.getChildren().addAll(L_number,ID);
        numbers.setAlignment(Pos.CENTER);
        numbers.setSpacing(Directory.horizontalSpace);

        voki.getChildren().addAll(numbers);
    }

    public void AskMainStreet()
    {
        mainstreets = new HBox();

        Label L_mainStreet = new Label("Calle principal:");
        L_mainStreet.setFont(new Font("Times New Roman", Directory.textSize));

        TextField mainStreet = new TextField();
        mainStreet.setMaxWidth(Directory.squareSize);

        mainstreets.getChildren().addAll(L_mainStreet,mainStreet);
        mainstreets.setAlignment(Pos.CENTER);
        mainstreets.setSpacing(Directory.horizontalSpace);

        voki.getChildren().addAll(mainstreets);
    }

    public void AskStreet()
    {
        streets = new HBox();

        Label L_street = new Label("Calle Secundaria:");
        L_street.setFont(new Font("Times New Roman", Directory.textSize));

        TextField street = new TextField();
        street.setMaxWidth(Directory.squareSize);

        streets.getChildren().addAll(L_street,street);
        streets.setAlignment(Pos.CENTER);
        streets.setSpacing(Directory.horizontalSpace);

        voki.getChildren().addAll(streets);
    }
}
