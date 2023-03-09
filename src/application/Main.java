package application;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.SplitPane;
import javafx.stage.Stage;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("Main.fxml"));
			SplitPane root = (SplitPane)loader.load();
			Scene scene = new Scene(root,770,400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene); 
			
			primaryStage.setTitle("BoardApp");
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}


//View(게시판 화면)(Main.fxml)-> Controller(MainController) -> Biz(서비스)
//-> DAO(Java랑 DB연결된애랑 중간)(Model이라고 함)-> DB(마이바티스)board.xml
//Model View COntrol MVC구조