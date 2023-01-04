package application;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
public class Main extends Application {
public static Stage stage;
public static void main(String[] args) {
launch(args);
}
@Override
public void start(Stage primaryStage) throws Exception {
try {
stage = primaryStage;
AnchorPane root = (AnchorPane)

FXMLLoader.load(getClass().getResource("/views/LoginView.fxml"));
// AnchorPane root = (AnchorPane)
FXMLLoader.load(getClass().getResource("/views/AdminView.fxml"));
// AnchorPane root = (AnchorPane)
FXMLLoader.load(getClass().getResource("/views/ClientView.fxml"));

Scene scene = new Scene(root);
stage.setTitle("Login View");
stage.setScene(scene);
stage.show();
} catch (Exception e) {
System.out.println("Error occurred while inflating view: " + e);
}
}
}