import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Line;
import javafx.scene.paint.Color;
import javafx.scene.control.Button;
import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.event.EventHandler;
import java.util.Collections;
import java.util.Random;
import java.lang.Math;
import javafx.scene.shape.Polyline;
import javafx.collections.ObservableList;

public class Geometry extends Application{
	private TextField widthOne = new TextField();
	private TextField lengthOne = new TextField();
	private TextField centerXOne = new TextField();
	private TextField centerYOne = new TextField();
	private TextField widthTwo = new TextField();
	private TextField lengthTwo = new TextField();
	private TextField centerXTwo = new TextField();
	private TextField centerYTwo = new TextField();
	private Label overlap = new Label("The rectangles overlap");
	private Label contained = new Label("One rectangle is contained in the other");
	private Label noOverlap = new Label("The rectangles don't overlap");

	public void start(Stage primaryStage){
		GridPane pane = new GridPane();
		pane.add(new Label(" Rectangle One Length: "), 0, 0);
		pane.add(lengthOne, 1, 0);
		pane.add(new Label(" Rectangle One Width: "), 2, 0);
		pane.add(widthOne, 3, 0);
		pane.add(new Label(" Rectangle One Center X-Coordinate"), 4, 0);
		pane.add(centerXOne, 5, 0);
		pane.add(new Label(" Rectangle One Center Y-Coordiante"), 6, 0);
		pane.add(centerYOne, 7, 0);
		pane.add(new Label(" Rectangle Two Length: "), 0, 1);
		pane.add(lengthTwo, 1, 1);
		pane.add(new Label(" Rectangle Two Width: "), 2, 1);
		pane.add(widthTwo, 3, 1);
		pane.add(new Label(" Rectangle Two Center X-Coordinate"), 4, 1);
		pane.add(centerXTwo, 5, 1);
		pane.add(new Label(" Rectangle Two Center Y-Coordiante"), 6, 1);
		pane.add(centerYTwo, 7, 1);
		Button draw = new Button("Draw Rectangles");
		draw.setOnAction(e -> drawRectangles(primaryStage));
		pane.add(draw, 3, 2);

		Scene scene = new Scene(pane);
		primaryStage.setTitle("ShowGridPane");
		primaryStage.setScene(scene); 
		primaryStage.show(); 
	}

	public void drawRectangles(Stage primaryStage){
		Pane pane = new Pane();
		Double rectLenOne = Double.parseDouble(lengthOne.getText());
		Double rectWidOne = Double.parseDouble(widthOne.getText());
		Double rectXCorOne = Double.parseDouble(centerXOne.getText());
		Double rectYCorOne = Double.parseDouble(centerYOne.getText());
		Double rectLenTwo = Double.parseDouble(lengthTwo.getText());
		Double rectWidTwo = Double.parseDouble(widthTwo.getText());
		Double rectXCorTwo = Double.parseDouble(centerXTwo.getText());
		Double rectYCorTwo = Double.parseDouble(centerYTwo.getText());
		Rectangle rectOne = new Rectangle(rectXCorOne, rectYCorOne, rectWidOne, rectLenOne);
		Rectangle rectTwo = new Rectangle(rectXCorTwo, rectYCorTwo, rectWidTwo, rectLenTwo);
		pane.getChildren().add(rectOne);
		pane.getChildren().add(rectTwo);
		Scene scene = new Scene(pane, 400, 400);
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args){
		launch(args);
	}
}