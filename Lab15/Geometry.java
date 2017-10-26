import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.paint.Color;
import javafx.scene.control.Button;
import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.event.EventHandler;
import javafx.scene.input.MouseEvent;
import javafx.scene.input.KeyEvent;
import java.util.Collections;
import java.util.Random;
import java.lang.Math;
import javafx.scene.shape.Polyline;
import javafx.collections.ObservableList;
import java.util.LinkedList;
import java.lang.Math;

public class Geometry extends Application{
	LinkedList<Circle> points = new LinkedList<Circle>();
	Rectangle rectangle = null;
	public void start(Stage primaryStage){
		Pane pane = new Pane();
		pane.setOnMouseClicked(e -> {
			if(!e.isAltDown()){
				Circle circle = new Circle(e.getX(), e.getY(), 10);
				points.push(circle);
				pane.getChildren().add(circle);
				updateRectangle(pane);
			}
		});
		for(Circle circle : points){
			circle.setOnMouseClicked(e -> {
				if(e.isAltDown()){
					pane.getChildren().remove(circle);
					points.remove(circle);
					updateRectangle(pane);
				}
			});
		}

		Scene scene = new Scene(pane, 500, 500);
		primaryStage.setScene(scene);
		primaryStage.show();
		//Rectangle rectOne = new Rectangle(rectXCorOne, rectYCorOne, rectWidOne, rectLenOne);
		//Rectangle rectTwo = new Rectangle(rectXCorTwo, rectYCorTwo, rectWidTwo, rectLenTwo);
	}

	public void updateRectangle(Pane pane){
		if(points.size() >= 2){
			Circle one = points.get(0);
			Circle two = points.get(1);
			if(rectangle != null){
				pane.getChildren().remove(rectangle);
			}
			Double x, y, height, width;
			if(one.getCenterX() < two.getCenterX()){
				x = one.getCenterX();
			}
			else{
				x = two.getCenterX();
			}
			if(one.getCenterY() < two.getCenterY()){
				y = one.getCenterY();
			}
			else{
				y = two.getCenterY();
			}
			width = Math.abs(one.getCenterX() - two.getCenterX());
			height = Math.abs(one.getCenterY() - two.getCenterY());
			//rectangle = new Rectangle(one.getCenterX(), one.getCenterY(), two.getCenterX(), two.getCenterY());
			rectangle = new Rectangle(x, y, width, height);
			pane.getChildren().add(rectangle);
		}
	}

	public static void main(String[] args){
		launch(args);
	}
}