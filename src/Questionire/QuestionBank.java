package Questionire;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import Utilities.Utility;



public class QuestionBank {
private ArrayList<Question> questionBank;
	
	public QuestionBank(String path) {
		this.questionBank = createQuestionBank(path);
	}
	
	public ArrayList<Question> createQuestionBank(String path){ 
		ArrayList<Question> questionList = new ArrayList<>();
		
		try(BufferedReader input = new BufferedReader(new FileReader(new File(path)));) {
			input.readLine();
			String line;
			while((line=input.readLine())!=null) {
				if(line!="") {
					String [] column = new String[8];
					column = line.split(",");
					Question question = new Question();
					question.setText(column[0]);
					question.setOptions(options(column));
					question.setCorrectAnswer(dealCorrectAnswer(column[5]));
					question.setDifficulity(Integer.parseInt(column[6]));
					questionList.add(question);
				}
			}
		} catch (FileNotFoundException e) {
			System.out.println("Please write the file location relative to "+new File(".").getAbsolutePath());
			
		} catch (IOException e1) {
			System.out.println("Something went wrong..");
		}
		return questionList;
	}
	private String[] options(String [] column) {
		String [] option = new String[4];
		for(int i=0;i<4;i++) {
			option[i] = column[i+1];
		}
		return option;
	}
	private int dealCorrectAnswer(String correctAnswer) {
		String [] correctOptions = correctAnswer.split("-");
		ArrayList<Integer> ans = new ArrayList<>();
		for(String option:correctOptions) {
			ans.add(Integer.parseInt(option));
		}
		return Utility.convertToInt(ans);
	}
	public ArrayList<Question> getQuestionBank() {
		return questionBank;
	}
	public void setQuestionBank(ArrayList<Question> questionBank) {
		this.questionBank = questionBank;
	}
}
