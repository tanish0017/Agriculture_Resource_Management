import javafx.scene.Parent;
import javafx.scene.control.TextArea;
import javafx.scene.layout.VBox;

public class MonitoringReporting {

    public Parent getView() {
        VBox vbox = new VBox(10);
        TextArea reportArea = new TextArea();
        
        
        reportArea.setText("Crop Production Report:\n - Wheat: 1000 tons\n - Corn: 800 tons\n\n"
                         + "Resource Distribution Report:\n - Subsidies: 500 distributed\n - Fertilizers: 2000 kg distributed\n");
        reportArea.setEditable(false);

        vbox.getChildren().add(reportArea);
        return vbox;
    }
}