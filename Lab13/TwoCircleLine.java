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

public class TwoCircleLine extends Application{
	public void start(Stage primaryStage){
		Pane pane = new Pane();
		Random random = new Random();
		Circle circleOne = new Circle(random.nextInt(150), random.nextInt(150), 15);
		Circle circleTwo = new Circle(random.nextInt(150), random.nextInt(150), 15);
		Line line = new Line(circleOne.getCenterX(), circleOne.getCenterY(), circleTwo.getCenterX(), circleTwo.getCenterY());
		double lineLength = Math.sqrt(Math.pow(circleOne.getCenterX() - circleTwo.getCenterX(), 2) + Math.pow(circleOne.getCenterY() - circleTwo.getCenterY(), 2));
		Text text = new Text(0, 10, Double.toString(lineLength));
		pane.getChildren().add(circleOne);
		pane.getChildren().add(circleTwo);
		pane.getChildren().add(text);

		Scene scene = new Scene(pane, 150, 150);
		primaryStage.setTitle("TwoCircleLine");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	public static void main(String[] args){
		launch(args);
	}
}