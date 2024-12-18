import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;

public class ResourceManagement {

    public Parent getView() {
        GridPane grid = new GridPane();
        grid.setPadding(new Insets(10));
        grid.setVgap(10);
        grid.setHgap(10);

        Label resourceLabel = new Label("Resource:");
        resourceLabel.setStyle("-fx-text-fill: White;"); 
        
        Label amountLabel = new Label("Amount:");
        amountLabel.setStyle("-fx-text-fill: White;");        
        TextField resourceField = new TextField();
        TextField amountField = new TextField();
        TextArea displayArea = new TextArea();

        Button addButton = new Button("Add Resource");
        addButton.setStyle("-fx-background-color: blue; -fx-text-fill: white;");
        addButton.setOnAction(e -> {
            String resource = resourceField.getText();
            String amount = amountField.getText();
            displayArea.appendText("Resource: " + resource + " | Amount: " + amount + "\n");
            resourceField.clear();
            amountField.clear();
        });

        grid.add(resourceLabel, 0, 0);
        grid.add(resourceField, 1, 0);
        grid.add(amountLabel, 0, 1);
        grid.add(amountField, 1, 1);
        grid.add(addButton, 0, 2);
        grid.add(displayArea, 1, 3);

        displayArea.setPrefHeight(200);
        return grid;
    }
}