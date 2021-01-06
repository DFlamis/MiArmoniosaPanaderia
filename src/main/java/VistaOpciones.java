
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

public class VistaOpciones
{
    public VBox voki;

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
        Button exit = new Button("Salir");

        //Add all in the box
        voki.getChildren().addAll(img, head, space, subHead, space2, client, baker, exit);

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
    }
    
    public VBox getInicio()
    {
        return voki;
    }
}