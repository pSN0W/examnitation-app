package application;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;

public class QuestionIndex {
	private IntegerProperty questionIndex = new SimpleIntegerProperty(0);

	public int getQuestionIndex() {
		return questionIndex.get();
	}

	public void setQuestionIndex(int questionIndex) {
		this.questionIndex.set(questionIndex);
	}
	
	public IntegerProperty questionIndexProperty() {
		return questionIndex;
	}
	
}
