package NavigationPaneGUI;

import java.util.ArrayList;
import java.util.Optional;

import FinalNodes.SubmissionPane;
import Questionire.Question;
import Utilities.Brain;
import application.QuestionIndex;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class NavigationPane extends HBox{
	public NavigationPane(QuestionIndex questionIndex,Question question,ArrayList<CheckBox> checkBoxes,int length,TextArea textArea,Stage stage,ArrayList<Question> questionList) {
		Button prevQuestionButton = new Button("<< Previous");
		Button nextQuestionButton = new Button("Next >>");
		Label marks = new Label("Marks : "+question.getDifficulity());
		marks.setMinWidth(USE_PREF_SIZE);
		marks.getStyleClass().add("marks");
		Button submitButton = new Button("Submit");
		if(questionIndex.getQuestionIndex()==0) {
			prevQuestionButton.setDisable(true);
		}
		if(questionIndex.getQuestionIndex()==length-1) {
			nextQuestionButton.setDisable(true);
		}
		prevQuestionButton.setOnAction(e->{
			Brain.handleSwitch(question, checkBoxes,textArea);
			questionIndex.setQuestionIndex(questionIndex.getQuestionIndex()-1);
		});
		nextQuestionButton.setOnAction(e->{
			Brain.handleSwitch(question, checkBoxes,textArea);
			questionIndex.setQuestionIndex(questionIndex.getQuestionIndex()+1);
		});
		submitButton.setOnAction(e->{
			Alert alert = new Alert(AlertType.CONFIRMATION);
			alert.setTitle("Submit");
			alert.setHeaderText("Are you sure you want to submit");
			alert.setContentText("Once Submitted you can't make any further changes and your marks will be displayed");
			Optional<ButtonType> result = alert.showAndWait();
			if (result.get() == ButtonType.OK){
				Brain.handleSwitch(question, checkBoxes,textArea);
			    SubmissionPane submissionPane = new SubmissionPane(questionList,stage);
			    Scene scene = new Scene(submissionPane);
			    scene.getStylesheets().add(getClass().getResource("submit.css").toExternalForm());
			    stage.setScene(scene);
			}
		});
		HBox moveBox = new HBox();
		marks.setPadding(new Insets(10,10,10,10));
		moveBox.setSpacing(10);
		moveBox.getChildren().addAll(prevQuestionButton,nextQuestionButton);
		this.setPadding(new Insets(10,10,10,10));
		this.setAlignment(Pos.CENTER_LEFT);
		this.setSpacing(150);
		this.getChildren().addAll(moveBox,marks,submitButton);
	}
}
