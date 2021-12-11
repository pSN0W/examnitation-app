package QuestionGUI;

import java.util.ArrayList;

import Questionire.Question;
import Utilities.Utility;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

public class QuestionPane extends VBox{
	private ArrayList<CheckBox> checkBoxes;
	
	public QuestionPane(Question question,int index) {
		String[] optionList = question.getOptions();
		QuestionNumber questionNumber = new QuestionNumber(question,index);
		CustomLine customLine1 = new CustomLine();
		CustomLine customLine2 = new CustomLine();
		Label questionContent = new Label(question.getText());
		ArrayList<CheckBox> optionCheckBox = new ArrayList<>();
		ArrayList<Integer> markedAnswer = Utility.getMarkedAnswer(question.getUserAnswer());
		for(int i=0;i<4;i++) {
			String option = Integer.toString(i+1)+") "+optionList[i];
			optionCheckBox.add(new CheckBox(option));
		}
		for(int i=0;i<4;i++) {
			if(markedAnswer.contains(i+1)) {
				optionCheckBox.get(i).setSelected(true);
			}
		}
		
		questionContent.getStyleClass().add("question-content");
		
		VBox questionAndOption = new VBox();
		questionAndOption.setSpacing(10);
		questionAndOption.setPadding(new Insets(10,10,10,10));
		questionAndOption.setMinHeight(400);
		questionAndOption.setAlignment(Pos.CENTER_LEFT);
		questionAndOption.getChildren().add(questionContent);
		questionAndOption.getChildren().addAll(optionCheckBox);
		
		
		this.setSpacing(10);
		this.setPadding(new Insets(10, 10, 10, 10));
		this.setCheckBoxes(optionCheckBox);
		this.getChildren().addAll(questionNumber,customLine1,questionAndOption,customLine2);
		
	}
	public ArrayList<CheckBox> getCheckBoxes() {
		return checkBoxes;
	}

	public void setCheckBoxes(ArrayList<CheckBox> checkBoxesArrayList) {
		this.checkBoxes = checkBoxesArrayList;
	}
}
