package Submission;

import java.util.ArrayList;

import Questionire.Question;
import javafx.collections.ObservableList;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class ResponseTableView {
	private TableView<AnswerInfo> table = new TableView<AnswerInfo>();

	public ResponseTableView(ArrayList<Question> questionList) {
		TableColumn<AnswerInfo, String> queCol = new TableColumn<AnswerInfo, String>("Question");
		queCol.setMinWidth(200);
		queCol.setCellValueFactory(new PropertyValueFactory<>("queNo"));
		TableColumn<AnswerInfo, String> useCol = new TableColumn<AnswerInfo, String>("Your Answer");
		useCol.setMinWidth(400);
		useCol.setCellValueFactory(new PropertyValueFactory<>("userOption"));
		TableColumn<AnswerInfo, String> corCol = new TableColumn<AnswerInfo, String>("Correct Answer");
		corCol.setMinWidth(400);
		corCol.setCellValueFactory(new PropertyValueFactory<>("correctOption"));
		TableColumn<AnswerInfo, Integer> marks = new TableColumn<AnswerInfo, Integer>("Marks");
		marks.setMinWidth(200);
		marks.setCellValueFactory(new PropertyValueFactory<>("markAwarded"));
		ObservableList<AnswerInfo> responseTable = ResponseTable.getResponseTable(questionList);
		for(AnswerInfo response:responseTable) {
			System.out.println(response.toString());
		}
		this.table.getColumns().add(queCol);
		this.table.getColumns().add(useCol);
		this.table.getColumns().add(corCol);
		this.table.getColumns().add(marks);
		this.table.setItems(responseTable);
	}
	public TableView<AnswerInfo> getTable() {
		return table;
	}

	public void setTable(TableView<AnswerInfo> table) {
		this.table = table;
	}
	
}
