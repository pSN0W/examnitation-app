package Submission;

import java.util.ArrayList;

import Questionire.Question;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import Utilities.Utility;

public class ResponseTable {
	public static ObservableList<AnswerInfo> getResponseTable(ArrayList<Question> questionList){
		ObservableList<AnswerInfo> table = FXCollections.observableArrayList();
		int i = 1;
		for(Question question:questionList) {
			String queNo = "Que "+i;
			int marksAwarded = getMarks(question);
			ArrayList<Integer> userMarkedAnswer = Utility.getMarkedAnswer(question.getUserAnswer());
			ArrayList<Integer> correctAnswer = Utility.getMarkedAnswer(question.getCorrectAnswer());
			String userAnswer = arrToStr(userMarkedAnswer);
			String corrAnswer = arrToStr(correctAnswer);
			table.add(new AnswerInfo(queNo, userAnswer, corrAnswer, marksAwarded));
			i++;
		}
		return table;
	}
	public static String arrToStr(ArrayList<Integer> arr) {
		String ans = " ";
		for(Integer i:arr) {
			ans+=Integer.toString(i);
			ans+=" ";
		}
		return ans;
	}
	public static int getMarks(Question question) {
		int marks = 0;
		if(question.getCorrectAnswer()==question.getUserAnswer()) {
			marks = question.getDifficulity();
		}
		return marks;
	}
}
