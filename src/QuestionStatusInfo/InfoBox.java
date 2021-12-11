package QuestionStatusInfo;


import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;

public class InfoBox extends HBox{
	public InfoBox(String content,String className) {
		Button button = new Button("1");
		button.setMaxHeight(50);
		button.setMaxWidth(50);
		button.getStyleClass().add(className);
		Label label = new Label(content);
		this.setSpacing(15);
		this.setAlignment(Pos.CENTER_LEFT);
		this.getChildren().addAll(button,label);
	}
}
