package QuestionGUI;

import Questionire.Question;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;

public class QuestionNumber extends HBox{
	private ImageView unBookmarkImage;
	private ImageView bookMarkedImage;
	public QuestionNumber(Question question,int index) {
		Label questionNumber = new Label("Question "+Integer.toString(index+1));
		questionNumber.getStyleClass().add("question-number");
		Button bookmarkButton  = new Button();
		bookmarkButton.setPadding(Insets.EMPTY);
		this.setUnBookmarkImage(new ImageView(new Image("unbookmarked.png")));
		this.setBookMarkedImage(new ImageView(new Image("bookmarked.png")));
		bookmarkingText(question, bookmarkButton);
		bookmarkButton.setOnAction(e->{
			question.setBookmarked(!question.isBookmarked());
			bookmarkingText(question, bookmarkButton);
		});
		this.bookMarkedImage.setFitHeight(40);
		this.bookMarkedImage.setFitWidth(40);
		this.unBookmarkImage.setFitHeight(40);
		this.unBookmarkImage.setFitWidth(40);
		this.setSpacing(600);
		this.setAlignment(Pos.CENTER_LEFT);
		this.getChildren().addAll(questionNumber,bookmarkButton);
	}
	
	public void bookmarkingText(Question question,Button bookmarkButton){
		if(question.isBookmarked()) {
			bookmarkButton.setGraphic(this.bookMarkedImage);
		}else {
			bookmarkButton.setGraphic(this.unBookmarkImage);
		}
	}
	
	public ImageView getUnBookmarkImage() {
		return unBookmarkImage;
	}
	public void setUnBookmarkImage(ImageView unBookmarkImage) {
		this.unBookmarkImage = unBookmarkImage;
	}
	public ImageView getBookMarkedImage() {
		return bookMarkedImage;
	}
	public void setBookMarkedImage(ImageView bookMarkedImage) {
		this.bookMarkedImage = bookMarkedImage;
	}
	
}
