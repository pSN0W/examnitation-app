package Submission;

public class AnswerInfo {
	String queNo;
	String userOption;
	String correctOption;
	int markAwarded;
	
	public AnswerInfo() {
	}
	
	public AnswerInfo(String queNo, String userOption, String correctOption, int markAwarded) {
		super();
		this.queNo = queNo;
		this.userOption = userOption;
		this.correctOption = correctOption;
		this.markAwarded = markAwarded;
	}
	
	@Override
	public String toString() {
		return "AnswerInfo [queNo=" + queNo + ", userOption=" + userOption + ", correctOption=" + correctOption
				+ ", markAwarded=" + markAwarded + "]";
	}

	public String getQueNo() {
		return queNo;
	}
	public void setQueNo(String queNo) {
		this.queNo = queNo;
	}
	public String getUserOption() {
		return userOption;
	}
	public void setUserOption(String userOption) {
		this.userOption = userOption;
	}
	public String getCorrectOption() {
		return correctOption;
	}
	public void setCorrectOption(String correctOption) {
		this.correctOption = correctOption;
	}
	public int getMarkAwarded() {
		return markAwarded;
	}
	public void setMarkAwarded(int markAwarded) {
		this.markAwarded = markAwarded;
	}
	
}
