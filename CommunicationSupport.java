import javafx.geometry.Insets;
import javafx.scene.Parent;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;

public class CommunicationSupport {

    public Parent getView() {
        GridPane grid = new GridPane();
        grid.setPadding(new Insets(10));
        grid.setVgap(10);
        grid.setHgap(10);

        TextField messageField = new TextField();
        TextArea displayArea = new TextArea();

        Button sendButton = new Button("Send Message");
sendButton.setStyle("-fx-background-color: blue; -fx-text-fill: white;");
        
        sendButton.setOnAction(e -> {
            String message = messageField.getText();
            displayArea.appendText("Message Sent: " + message + "\n");
            messageField.clear();
        });

      
        Label messageLabel = new Label("Enter Message:");
        messageLabel.setStyle("-fx-text-fill: white;");
        grid.add(messageLabel, 0, 0);
        grid.add(messageField, 1, 0);
        grid.add(sendButton, 0, 1);
        grid.add(displayArea, 1, 2);

        displayArea.setPrefHeight(200);
        return grid;
    }
}