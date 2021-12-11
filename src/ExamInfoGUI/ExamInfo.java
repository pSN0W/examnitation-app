package ExamInfoGUI;

import javafx.geometry.Insets;
import javafx.scene.layout.HBox;

public class ExamInfo extends HBox{
	public ExamInfo() {
		College college = new College();
		Candidate candidate = new Candidate();
		this.setPadding(new Insets(10,10,10,10));
		this.setSpacing(500);
		this.getChildren().addAll(college,candidate);
	}
}
