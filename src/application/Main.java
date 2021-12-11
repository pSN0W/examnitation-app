package application;
	
import java.io.File;
import java.util.ArrayList;

import FinalNodes.QuestionPaperMain;
import Questionire.Question;
import Questionire.QuestionBank;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;


public class Main extends Application {
	QuestionBank questionBank = new QuestionBank("src/Questionire/Data.csv");
	ArrayList<Question> questionList = questionBank.getQuestionBank();
	QuestionIndex questionIndex = new QuestionIndex();
	
	@Override
	public void start(Stage primaryStage) {
		try {
			questionIndex.questionIndexProperty().addListener((v,oldVal,newVal)->{
				Scene scene = createScene(primaryStage);
				primaryStage.setScene(scene);
			});
			Scene scene = createScene(primaryStage);
			primaryStage.setScene(scene);
			primaryStage.setWidth(Double.MAX_VALUE);
			primaryStage.setHeight(Double.MAX_VALUE);
			primaryStage.setResizable(false);
			primaryStage.show();
		} catch(Exception e) {
			System.out.println("Please write the file location relative to "+new File(".").getAbsolutePath());
			e.printStackTrace();
		}
	}
	
	public Scene createScene(Stage stage) {
		QuestionPaperMain root = new QuestionPaperMain(questionIndex,questionList,stage);
		Scene scene = new Scene(root);
		scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		return scene;
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
