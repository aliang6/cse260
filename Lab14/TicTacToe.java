import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.scene.shape.Circle;
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

public class TicTacToe extends Application{
	private int[][] array = {{-1, -1, -1}, {-1, -1, -1}, {-1, -1, -1}};
	private int counter = 0;
	public void start(Stage primaryStage){
		GridPane pane = new GridPane();
		Button one = new Button();
		one.setOnAction(e -> {drawSymbol(one, counter, 0, 0); counter++;});
		Button two = new Button();
		two.setOnAction(e -> {drawSymbol(two, counter, 0, 0); counter++;});
		Button three = new Button();
		three.setOnAction(e -> {drawSymbol(three, counter, 0, 0); counter++;});
		Button four = new Button();
		four.setOnAction(e -> {drawSymbol(four, counter, 0, 0); counter++;});
		Button five = new Button();
		five.setOnAction(e -> {drawSymbol(five, counter, 0, 0); counter++;});
		Button six = new Button();
		six.setOnAction(e -> {drawSymbol(six, counter, 0, 0); counter++;});
		Button seven = new Button();
		seven.setOnAction(e -> {drawSymbol(seven, counter, 0, 0); counter++;});
		Button eight = new Button();
		eight.setOnAction(e -> {drawSymbol(eight, counter, 0, 0); counter++;});
		Button nine = new Button();
		nine.setOnAction(e -> {drawSymbol(nine, counter, 0, 0); counter++;});
		pane.add(one, 0, 0);
		pane.add(two, 1, 0);
		pane.add(three, 2, 0);
		pane.add(four, 0, 1);
		pane.add(five, 1, 1);
		pane.add(six, 2, 1);
		pane.add(seven, 0, 2);
		pane.add(eight, 1, 2);
		pane.add(nine, 2, 2);

		Scene scene = new Scene(pane);
		primaryStage.setTitle("TicTacToe");
		primaryStage.setScene(scene); 
		primaryStage.show(); 
	}

	public void drawSymbol(Button num, int counter, int row, int column){
		if(counter % 2 == 0){
			num.setText("X");
			array[row][column] = 0;
		}
		else{
			num.setText("O");
			array[row][column] = 1;
		}
		checkWin();
	}

	public boolean checkWin(){
		return false;
	}

	public static void main(String[] args){
		launch(args);
	}
}