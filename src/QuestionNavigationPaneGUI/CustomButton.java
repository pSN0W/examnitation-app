package QuestionNavigationPaneGUI;

import java.util.ArrayList;

import Questionire.Question;
import Utilities.Brain;
import application.QuestionIndex;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextArea;

public class CustomButton extends Button{
	public CustomButton(int index,QuestionIndex questionIndex,String className,Question question,ArrayList<CheckBox> checkBoxes,TextArea textArea) {
		this.setText(Integer.toString(index+1));
		this.setHeight(50);
		this.setWidth(50);
		this.getStyleClass().add(className);
		this.setOnAction(e->{
			Brain.handleSwitch(question, checkBoxes,textArea);
			questionIndex.setQuestionIndex(index);
		});
	}
}
