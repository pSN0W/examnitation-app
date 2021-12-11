package QuestionStatusInfo;

import javafx.scene.layout.VBox;

public class StatusInfo extends VBox{
	public StatusInfo() {
		this.setSpacing(10);
		this.getChildren().add(new InfoBox("Unvisited", "unvisited"));
		this.getChildren().add(new InfoBox("Bookmarked", "bookmarked"));
		this.getChildren().add(new InfoBox("Answered", "answered"));
		this.getChildren().add(new InfoBox("Answered and bookmarked", "ans-bookmarked"));
		this.getChildren().add(new InfoBox("UnAnswered", "un-answered"));
	}
}
