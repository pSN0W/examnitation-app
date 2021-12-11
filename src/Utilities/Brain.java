package Utilities;

import java.util.ArrayList;

import Questionire.Question;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextArea;

public class Brain {
	public static void handleSwitch(Question question,ArrayList<CheckBox>checkBoxes,TextArea textArea) {
		int userAnswer = getAnswer(checkBoxes);
		question.setNotes(textArea.getText());
		question.setUserAnswer(userAnswer);
		question.setVisited(true);
	}
	public static int getAnswer(ArrayList<CheckBox>checkBoxes) {
		ArrayList<Integer> markedAnswerArrayList = new ArrayList<Integer>();
		for(int i=0;i<4;i++) {
			if(checkBoxes.get(i).isSelected()) {
				markedAnswerArrayList.add(i+1);
			}
		}
		int intValue = Utility.convertToInt(markedAnswerArrayList);
		return intValue;
	}
}