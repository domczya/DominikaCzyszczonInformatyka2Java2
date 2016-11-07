package javafxapplication2;

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
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;






/**
 *
 * @author student
 */
public class JavaFXApplication2 extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        BorderPane root3 = new BorderPane();
        root3.setPadding(new Insets(5));
        FlowPane root = new FlowPane();
        root.setPadding(new Insets(5));
         
        Button btn = new Button();
        btn.setText("Say 'Hello World'");
        btn.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Hello World!");
            }
        });
        
      //   for (int i=1; i<=100; i++) {
     //       root.getChildren().add(new Button(String.valueOf(i)));
     //   }       
        
 
        
        
        
        Text text = new Text("ZetCode");
        text.setFont(Font.font("Serif", FontWeight.BOLD, 76));
        Pane root2 = new Pane();

         Rectangle rect = new Rectangle(25, 25, 50, 50);
        rect.setFill(Color.CADETBLUE);
        
        Line line = new Line(90, 40, 230, 40);
        line.setStroke(Color.BLACK);
        
        Circle circle = new Circle(130, 130, 30);
        circle.setFill(Color.CHOCOLATE);
        
        root3.setRight(root);
        root3.setLeft(root2);
        
        root.getChildren().addAll(btn,text);
        root2.getChildren().addAll(rect, line, circle);
    
        
        Scene scene = new Scene(root3, 300, 250);

            
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
    
}
