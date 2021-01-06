
import Buttons.Baker;
import Buttons.Client;
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

import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.DriverManager;
import java.sql.SQLException;

public class VistaOpciones
{
    public VBox voki;
    //
    private static final String usuario = "root";
    //Cambiar clave dependiendo de quien lo este usando
    private static final String clave = "";
    private static final String url = "jdbc:mysql://localhost:3306/mi_armoniosa_panaderia";
    private static Connection con;
    Statement stmt;
    
    public void conexion(){
        con = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = (Connection) DriverManager.getConnection(url, usuario, clave);
            if (con != null){
                System.out.println("Se hizo la conexion exitosa");
            }
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e.getMessage());
        }
    }
//
    public VistaOpciones()
    {
        voki = new VBox();

        //Add logo at the top
        ImageView img = new ImageView("file:"+Directory.RESOURCE_FOLDER+"/LogoNoBackground.png");
        img.setFitHeight(200);
        img.setFitWidth(200);

        //Label
        Label head = new Label("Mi Armoniosa Panaderia");
        head.setFont(new Font("Times New Roman", 35));
        Label space = new Label("");
        space.setFont(new Font(5));
        Label subHead = new Label("Ingresar como:");
        subHead.setFont(new Font("Times New Roman", 20));
        Label space2 = new Label("");
        space.setFont(new Font(5));

        //Buttons
        Button client = new Button("Cliente");
        Button baker = new Button("Pastelero");
        Button conexion = new Button("Conectar con base de datos");
        Button exit = new Button("Salir");

        //Add all in the box
        voki.getChildren().addAll(img, head, space, subHead, space2, client, baker, conexion, exit);

        //Design
        voki.setAlignment(Pos.CENTER);
        voki.setSpacing(12);

        /*--------------------------Bottons actions--------------------------*/
        //Exit Button Action
        exit.setOnMouseClicked((ext) -> {
            Stage stage = (Stage) exit.getScene().getWindow();
            stage.close();
        });

        //Client Button Action
        client.setOnMouseClicked((log) -> {
            Client cl = new Client();
            Scene sce = new Scene(cl.getClient(),600,600);
            Stage newClient = new Stage();
            newClient.setTitle("Mi Armoniosa Panaderia - Cliente");
            newClient.getIcons().add(new Image("file:"+Directory.RESOURCE_FOLDER+"/LogoNoBackground.png"));
            newClient.setScene(sce);
            newClient.show();    
        });

        //Baker Button Action
        baker.setOnMouseClicked((bak) -> {
            Baker bk = new Baker();
            Scene scen = new Scene(bk.getBaker(),600,600);
            Stage NewBaker = new Stage();
            NewBaker.setTitle("Mi Armoniosa Panaderia - Pastelero");
            NewBaker.getIcons().add(new Image("file:"+Directory.RESOURCE_FOLDER+"/LogoNoBackground.png"));
            NewBaker.setScene(scen);
            NewBaker.show();  
        });
            
        // Conexion Button Action
        conexion.setOnMouseClicked((conex) -> {
            conexion();
        });
    }
    
    public VBox getInicio()
    {
        return voki;
    }
}