import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MyFxApp extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        // Construct your controls
        Label label1 = new Label("It's");
        Label label2 = new Label("January");
        Label label3 = new Label("5");
        Button button1 = new Button("Press me!");
        button1.setOnAction(actionEvent -> {
            label2.setText("2023");
        });
        Button button2 = new Button("Don't press me!");
        button2.setOnAction(actionEvent -> {label2.setText("I SAID NO");}

        );

        // Layout your controls
        VBox vbox1 = new VBox(label1, label2, label3);
        HBox hbox1 = new HBox(button1, vbox1,button2);
        Scene scene = new Scene(hbox1, 400, 200);

        primaryStage.setTitle("My First JavaFX App");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}
