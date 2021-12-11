package ExamInfoGUI;

import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

public class CandidateInfo extends VBox{
	private Label nameLabel=new Label();
	private Label idLabel=new Label();
	private Label subjectLabel=new Label();
	public CandidateInfo() {
		this.nameLabel.setText("Candidate Name     : Pratyaksh Singh");
		this.idLabel.setText(  "Enrollment Number : iib2020015");
		this.subjectLabel.setText("Subject                    : OOM");
		this.setSpacing(5);
		this.setPadding(new Insets(10,10,10,10));
		this.getChildren().addAll(this.nameLabel,this.idLabel,this.subjectLabel);
	}
	public CandidateInfo(String name,String id,String subject) {
		this.nameLabel.setText("Candidate Name     : "+name);
		this.idLabel.setText("Enrollment Number : "+id);
		this.subjectLabel.setText("Subject                    : "+subject);
		this.setSpacing(10);
		this.getChildren().addAll(this.nameLabel,this.idLabel,this.subjectLabel);
	}
	public Label getNameLabel() {
		return nameLabel;
	}
	public void setNameLabel(Label nameLabel) {
		this.nameLabel = nameLabel;
	}
	public Label getIdLabel() {
		return idLabel;
	}
	public void setIdLabel(Label idLabel) {
		this.idLabel = idLabel;
	}
	public Label getSubjectLabel() {
		return subjectLabel;
	}
	public void setSubjectLabel(Label subjectLabel) {
		this.subjectLabel = subjectLabel;
	}
	
}
