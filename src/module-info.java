module FinalApplication {
	requires javafx.controls;
	requires javafx.graphics;
	requires javafx.base;
	
	opens application to javafx.graphics, javafx.fxml,javafx.base;
	opens Submission to javafx.base;
}
