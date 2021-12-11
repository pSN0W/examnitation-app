package ExamInfoGUI;

import javafx.geometry.Pos;
import javafx.scene.layout.HBox;

public class Candidate extends HBox{
	public Candidate() {
		CustomImage personImage = new CustomImage("person.jpg");
		CandidateInfo info = new CandidateInfo();
		this.setSpacing(10);
		this.getChildren().addAll(personImage,info);
	}
	public Candidate(String url) {
		CustomImage personImage = new CustomImage(url);
		CandidateInfo info = new CandidateInfo();
		this.setSpacing(10);
		this.setAlignment(Pos.CENTER_LEFT);
		this.getChildren().addAll(personImage,info);
	}
}
