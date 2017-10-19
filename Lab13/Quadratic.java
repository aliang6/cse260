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

public class Quadratic extends Application{
	public void start(Stage primaryStage){
		Pane pane = new Pane();

		Polyline polyline = new Polyline();
		ObservableList list = polyline.getPoints();
		double scaleFactor = 0.0125;
		for (int x = -100; x <= 100; x++) {
			list.add(x + 250.0);
			list.add(scaleFactor * -x * x + 250.0);
		}
		Line x_line = new Line(0, 250, 500, 250);
		Line y_line = new Line(250, 0, 250, 500);
		pane.getChildren().add(polyline);
		pane.getChildren().add(x_line);
		pane.getChildren().add(y_line);

		Scene scene = new Scene(pane, 500, 500);
		primaryStage.setTitle("Quadratic");
		primaryStage.setScene(scene);
		primaryStage.show();

		
	}
	public static void main(String[] args){
		launch(args);
	}
}