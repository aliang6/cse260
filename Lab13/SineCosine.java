import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.paint.Color;
import java.util.Collections;
import java.util.Random;
import java.lang.Math;
import javafx.scene.shape.Polyline;
import javafx.collections.ObservableList;
import javafx.scene.paint.Color;

public class SineCosine extends Application{
	public void start(Stage primaryStage){
		Pane pane = new Pane();
		Polyline sineline = new Polyline();
		ObservableList list = sineline.getPoints();
		double scaleFactor = 50;
		for (int x = -170; x <= 170; x++) {
			list.add(x + 250.0);
			list.add(250 - 50 * Math.sin((x / 100.0) * 2 * Math.PI));
		}
		sineline.setStroke(Color.RED);
		Polyline cosineline = new Polyline();
		ObservableList list2 = cosineline.getPoints();
		for (int x = -170; x <= 170; x++) {
			list2.add(x + 250.0);
			list2.add(250 - 50 * Math.sin((x / 100.0) * Math.PI));
		}
		cosineline.setStroke(Color.BLUE);
		Line x_line = new Line(0, 250, 500, 250);
		Line y_line = new Line(250, 0, 250, 500);
		pane.getChildren().add(sineline);
		pane.getChildren().add(cosineline);
		pane.getChildren().add(x_line);
		pane.getChildren().add(y_line);

		Scene scene = new Scene(pane, 500, 500);
		primaryStage.setTitle("Sine Cosine");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args){
		launch(args);
	}
}