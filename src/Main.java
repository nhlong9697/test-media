import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.stage.Stage;

import java.io.File;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        MediaPlayer player = new MediaPlayer(new Media(
                new File("dumpling.mp3").toURI().toString()
        ));

        Button btn = new Button("Play");
        btn.setOnAction(event -> player.play());
        VBox pane = new VBox(10, btn);
        pane.setAlignment(Pos.CENTER);
        Scene scene = new Scene(pane, 100, 100);

        MediaView mediaView = new MediaView(player);
        ((Group)scene.getRoot()).getChildren().add(mediaView);

        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
