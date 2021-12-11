package FinalNodes;

import java.util.ArrayList;

import ExamInfoGUI.ExamInfo;
import Questionire.Question;
import Submission.AnswerInfo;
import Submission.ResponseTableView;
import javafx.scene.control.Button;
import javafx.scene.control.TableView;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

public class SubmissionPane extends VBox{
	public SubmissionPane(ArrayList<Question> questionList,Stage stage) {
		//Header Pane
		ExamInfo examInfo = new ExamInfo();
		Line line = new Line(0,60,2000,60);
		line.setStrokeWidth(4);
		line.setStyle("-fx-stroke: red;");
		VBox header = new VBox();
		header.setSpacing(10);
		header.getChildren().addAll(examInfo,line);
		ResponseTableView tableView = new ResponseTableView(questionList);
		TableView<AnswerInfo> table = tableView.getTable();
		Button button = new Button("Close");
		button.setOnAction(e->stage.close());
		table.setColumnResizePolicy(TableView.CONSTRAINED_RESIZE_POLICY);
		this.setSpacing(75);
		this.getChildren().addAll(header,table,button);
		
	}
}
