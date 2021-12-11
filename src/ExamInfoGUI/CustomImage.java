package ExamInfoGUI;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class CustomImage extends ImageView{
	public CustomImage(String url) {
		Image image = new Image(url);
		this.setImage(image);
		this.setFitHeight(100);
		this.setFitWidth(100);
	}
}
