import javafx.geometry.Insets;
import javafx.scene.Parent;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;

public class FarmerRegistration {
    private TextField nameField = new TextField();
    private TextField emailField = new TextField();
    private TextArea displayArea = new TextArea();

    public Parent getView() {
        GridPane grid = new GridPane();
        grid.setPadding(new Insets(10));
        grid.setVgap(10);
        grid.setHgap(10);

        Label nameLabel = new Label("Farmer Name:");
        nameLabel.setStyle("-fx-text-fill: White;"); 

        Label emailLabel = new Label("Email:");
        emailLabel.setStyle("-fx-text-fill: White;"); 

        Button registerButton = new Button("Register");
        registerButton.setStyle("-fx-background-color: blue; -fx-text-fill: white;");
        registerButton.setOnAction(e -> registerFarmer());

        grid.add(nameLabel, 0, 0);
        grid.add(nameField, 1, 0);
        grid.add(emailLabel, 0, 1);
        grid.add(emailField, 1, 1);
        grid.add(registerButton, 0, 2);
        grid.add(displayArea, 1, 3);

        displayArea.setPrefHeight(200);
        return grid;
    }

    private void registerFarmer() {
        String name = nameField.getText();
        String email = emailField.getText();
        displayArea.appendText("Registered Farmer: " + name + " | Email: " + email + "\n");
        nameField.clear();
        emailField.clear();
    }
}