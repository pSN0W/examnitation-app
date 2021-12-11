package NotesGUI;

import Questionire.Question;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.VBox;

public class Notes extends VBox{
	private TextArea textArea;
	public Notes(Question question) {
		Label label = new Label("Notes 📝");
		this.textArea = new TextArea();
		this.textArea.setText(question.getNotes());
		this.setAlignment(Pos.CENTER);
		this.getChildren().addAll(label,this.textArea);
	}
	public TextArea getTextArea() {
		return textArea;
	}
	public void setTextArea(TextArea textArea) {
		this.textArea = textArea;
	}
	
}
