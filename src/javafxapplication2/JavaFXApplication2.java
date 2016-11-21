package javafxapplication2;

import static java.lang.Byte.SIZE;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.scene.layout.FlowPane;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.layout.BorderPane;
import javafx.scene.control.Label;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Tooltip;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;






/**
 *
 * @author student
 */
public class JavaFXApplication2 extends Application {
   BorderPane root1;
    private Label getBottomLabel() {

        Label lbl = new MyLabel("Bottom");
        lbl.setPrefHeight(SIZE);
        lbl.prefWidthProperty().bind(root1.widthProperty());
        lbl.setStyle("-fx-border-style: dotted; -fx-border-width: 1 0 0 0;"
                + "-fx-border-color: gray; -fx-font-weight: bold");

        return lbl;
    }
    
    @Override
    public void start(Stage stage) {
              root1 = new BorderPane();
        root1.setBottom(getBottomLabel());
        
   
        
             BorderPane root3 = new BorderPane();
        root3.setPadding(new Insets(1));
        
            FlowPane root = new FlowPane(Orientation.HORIZONTAL, 10, 10);
        root.setPadding(new Insets(20));
        root.setAlignment(Pos.BASELINE_RIGHT);
      //  for (int i=1; i<=20; i++) {
      //      root.getChildren().add(new Button(String.valueOf(i)));
       // }
            Button prevbtn = new Button("Say _Hello");
        Tooltip tooltip = new Tooltip(" Hello ");
        Tooltip.install(prevbtn, tooltip);
        prevbtn.setOnAction((ActionEvent event) -> {
            System.out.println("Hello ! ");
        });
            Button nextbtn = new Button("Say _Goodbye");
        Tooltip tooltipN = new Tooltip(" Goodbye ");
        Tooltip.install(nextbtn, tooltipN);
        nextbtn.setOnAction((ActionEvent event) -> {
            System.out.println("Goodbye ! ");
        });
        
        
            Text text = new Text("Hello !");
        text.setFont(Font.font("Serif", FontWeight.BOLD, 80));
        text.setId("text");
        root.setId("root");
            
        
        Pane root2 = new Pane();

            Rectangle rect = new Rectangle(25, 25, 100, 100);
        rect.setFill(Color.CADETBLUE);
        
            Line line = new Line(90, 40, 170, 40);
        line.setStroke(Color.BLACK);
        
            Circle circle = new Circle(110, 110, 40);
        circle.setFill(Color.CHOCOLATE);
        
        
        root3.setRight(root);
        root3.setLeft(root2);
        
        root.getChildren().addAll(prevbtn, nextbtn, text);
        root2.getChildren().addAll(rect, line, circle);
    
        
        Scene scene = new Scene(root3, 650, 250);
        Scene scene1 = new Scene(root1, 500, 500);

        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.setScene(scene1);
        stage.show();
    }
    


    public static void main(String[] args) {
        launch(args);
    }

    private Node getBottomLabel() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
