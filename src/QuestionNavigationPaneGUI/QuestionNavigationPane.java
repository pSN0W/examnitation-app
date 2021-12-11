package QuestionNavigationPaneGUI;

import java.util.ArrayList;

import Questionire.Question;
import application.QuestionIndex;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextArea;
import javafx.scene.layout.FlowPane;

public class QuestionNavigationPane extends FlowPane{
	public QuestionNavigationPane(int length,QuestionIndex questionIndex,ArrayList<Question> questionList,ArrayList<CheckBox> checkBoxes,Question question,TextArea textArea) {
		this.setPrefWrapLength(180);
		this.setVgap(10);
		this.setHgap(10);
		for(int i=0;i<length;i++) {
			Question questionLinked = questionList.get(i);
			String className = getClassName(questionLinked);
			this.getChildren().add(new CustomButton(i, questionIndex, className, question, checkBoxes,textArea));
		}
	}
	private String getClassName(Question question) {
		String className = "unvisited";
		if(question.isVisited()) {
			if(question.getUserAnswer()!=0) {
				if(question.isBookmarked()) {
					className = "ans-bookmarked";
				}else {
					className = "answered";
				}
			}else {
				if(question.isBookmarked()) {
					className = "bookmarked";
				}else {
					className = "un-answered";
				}
			}
		}
		return className;
	}
}
