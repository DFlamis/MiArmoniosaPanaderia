
import Clases.Directory;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;

public class VistaOpciones
{
    public VBox inicio;
    public HBox backup;

    public VistaOpciones()
    {
        inicio = new VBox();

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
        inicio.getChildren().addAll(img, head, space, subHead, space2, client, baker, exit);

        //Design
        inicio.setAlignment(Pos.CENTER);
        inicio.setSpacing(12);
    }
    
    public VBox getInicio()
    {
        return inicio;
    }
}