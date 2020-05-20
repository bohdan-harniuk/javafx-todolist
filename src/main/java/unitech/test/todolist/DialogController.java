package unitech.test.todolist;

import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import unitech.test.todolist.datamodel.TodoData;
import unitech.test.todolist.datamodel.TodoItem;

import java.time.LocalDate;

public class DialogController {
    @FXML
    private TextField shortDescriptionField;
    @FXML
    private TextArea detailsArea;
    @FXML
    private DatePicker deadLinePicker;

    public TodoItem processResult() {
        String shortDescription = shortDescriptionField.getText().trim();
        String details = detailsArea.getText().trim();
        LocalDate deadLine = deadLinePicker.getValue();

        TodoItem item = new TodoItem(shortDescription, details, deadLine);
        TodoData.getInstance().addTodoItem(item);

        return item;
    }
}
