package Questionire;

import java.util.Arrays;

public class Question {
	private String text;
	private String [] options;
	private int correctAnswer;
	private int userAnswer;
	private int difficulity;
	private boolean visited;
	private boolean bookmarked;
	private String notes;
	
	public Question() {
		this.userAnswer = 0;
		this.visited = false;
		this.bookmarked = false;
		this.setNotes("");
	}
	
	public Question(String text, String[] options, int correctAnswer, int difficulity) {
		super();
		this.text = text;
		this.options = options;
		this.correctAnswer = correctAnswer;
		this.userAnswer = 0;
		this.difficulity = difficulity;
		this.visited = false;
		this.bookmarked = false;	
	}
	
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public String[] getOptions() {
		return options;
	}
	public void setOptions(String[] options) {
		this.options = options;
	}
	public int getCorrectAnswer() {
		return correctAnswer;
	}
	public void setCorrectAnswer(int correctAnswer) {
		this.correctAnswer = correctAnswer;
	}
	public int getUserAnswer() {
		return userAnswer;
	}
	public void setUserAnswer(int userAnswer) {
		this.userAnswer = userAnswer;
	}
	public int getDifficulity() {
		return difficulity;
	}
	public void setDifficulity(int difficulity) {
		this.difficulity = difficulity;
	}
	public boolean isVisited() {
		return visited;
	}
	public void setVisited(boolean visited) {
		this.visited = visited;
	}
	public boolean isBookmarked() {
		return bookmarked;
	}
	public void setBookmarked(boolean bookmarked) {
		this.bookmarked = bookmarked;
	}
	
	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}
	
	@Override
	public String toString() {
		return "Question [text=" + text + ", options=" + Arrays.toString(options) + ", correctAnswer=" + correctAnswer
				+ ", userAnswer=" + userAnswer + ", difficulity=" + difficulity + ", visited=" + visited
				+ ", bookmarked=" + bookmarked + "]";
	}
	
}
