package FinalNodes;

import java.util.ArrayList;

import ExamInfoGUI.ExamInfo;
import NavigationPaneGUI.NavigationPane;
import NotesGUI.Notes;
import QuestionGUI.QuestionPane;
import QuestionNavigationPaneGUI.QuestionNavigationPane;
import QuestionStatusInfo.StatusInfo;
import Questionire.Question;
import application.QuestionIndex;
import javafx.geometry.Insets;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextArea;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

public class QuestionPaperMain extends VBox{
	public QuestionPaperMain(QuestionIndex questionIndex,ArrayList<Question> questionList,Stage stage) {
		int length = questionList.size();
		int index = questionIndex.getQuestionIndex();
		Question question = questionList.get(index);
		Notes notes = new Notes(question);
		TextArea textArea = notes.getTextArea();
		//Header Pane
		ExamInfo examInfo = new ExamInfo();
		Line line = new Line(0,60,2000,60);
		line.setStrokeWidth(4);
		line.setStyle("-fx-stroke: red;");
		VBox header = new VBox();
		header.setSpacing(10);
		header.getChildren().addAll(examInfo,line);
		
		//Left Pane
		QuestionPane questionPane = new QuestionPane(question, index);
		ArrayList<CheckBox> checkBoxes = questionPane.getCheckBoxes();
		NavigationPane navigationPane = new NavigationPane(questionIndex, question, checkBoxes, length,textArea,stage,questionList);
		VBox leftPane = new VBox();
		leftPane.setSpacing(10);
		leftPane.getChildren().addAll(questionPane,navigationPane);
		
		// Right Pane
		StatusInfo statusInfo = new StatusInfo();
		QuestionNavigationPane questionNavigationPane = new QuestionNavigationPane(length, questionIndex, questionList, checkBoxes, question,textArea);
		VBox rightPane = new VBox();
		rightPane.setSpacing(10);
		rightPane.setPadding(new Insets(20,20,20,20));
		rightPane.getChildren().addAll(statusInfo,questionNavigationPane,notes);
		
		// Footer
		HBox footer = new HBox();
		footer.setSpacing(100);
		footer.getChildren().addAll(leftPane,rightPane);
		
		// Adding them to this
		this.setSpacing(10);
		this.getChildren().addAll(header,footer);
	}
}
