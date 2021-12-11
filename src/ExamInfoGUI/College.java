package ExamInfoGUI;

import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;

public class College extends HBox{
	public College() {
		CustomImage image = new CustomImage("iiita.png");
		Label label = new Label("IIIT\nAllahabad");
		label.getStyleClass().add("college-name");
		this.setMaxHeight(110);
		this.setSpacing(10);
		this.setAlignment(Pos.CENTER_LEFT);
		this.getChildren().addAll(image,label);
	}
}
