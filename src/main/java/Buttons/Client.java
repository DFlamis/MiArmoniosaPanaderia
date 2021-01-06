package Buttons;

import Clases.Directory;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class Client
{
    private VBox voki;

    public Client()
    {
        voki = new VBox();

        //Add logo at the top
        ImageView img = new ImageView("file:"+Directory.RESOURCE_FOLDER+"/LogoNoBackground.png");
        img.setFitHeight(200);
        img.setFitWidth(200);

        //Buttons
        Button login = new Button("Iniciar Sesion");
        Button register = new Button("Registrarse");
        Button exit = new Button("Regresar");

        //Label
        Label head = new Label("Mi Armoniosa Panaderia");
        head.setFont(new Font("Times New Roman", 35));
        Label space = new Label("");
        space.setFont(new Font(5));
        Label subHead = new Label("¿Que desea hacer?");
        subHead.setFont(new Font("Times New Roman", 20));
        Label space2 = new Label("");
        space.setFont(new Font(5));
        
        //Add all to the box
        voki.getChildren().addAll(img, head, space, subHead, space2, login, register, exit);

        //Design
        voki.setAlignment(Pos.CENTER);
        voki.setSpacing(Directory.horizontalSpace);


        /*--------------------------Bottons actions--------------------------*/
        //Exit Button Action
        exit.setOnMouseClicked((ext) -> {
            Stage stage = (Stage) exit.getScene().getWindow();
            stage.close();
        });

        //Register Button Action
        register.setOnMouseClicked((reg) -> {
            Register rg = new Register();
            Scene scen = new Scene(rg.getRegister(),600,700);
            Stage newRegister = new Stage();
            newRegister.setTitle("Mi Armoniosa Panaderia - Registrarse");
            newRegister.getIcons().add(new Image("file:"+Directory.RESOURCE_FOLDER+"/LogoNoBackground.png"));
            newRegister.setScene(scen);
            newRegister.show();    
        });

        //Login Button Action
        login.setOnMouseClicked((log) -> {
            LogIn li = new LogIn();
            Scene scen = new Scene(li.getLogIn(),600,600);
            Stage newLogIn = new Stage();
            newLogIn.setTitle("Mi Armoniosa Panaderia - Iniciar Sesion");
            newLogIn.getIcons().add(new Image("file:"+Directory.RESOURCE_FOLDER+"/LogoNoBackground.png"));
            newLogIn.setScene(scen);
            newLogIn.show();    
        });

    }

    public VBox getClient()
    {
        return voki;
    }
}
