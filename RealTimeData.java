import javafx.scene.Parent;
import javafx.scene.control.TextArea;
import javafx.scene.layout.VBox;

public class RealTimeData {

    public Parent getView() {
        VBox vbox = new VBox(10);
        TextArea dataArea = new TextArea();
        
       
        dataArea.setText("Market Prices:\n - Wheat: $5/kg\n - Corn: $3/kg\n\n"
                        + "Weather Forecast:\n - Sunny, 25°C\n\n"
                        + "Crop Recommendations:\n - Best crop for this season: Soybean\n");
        dataArea.setEditable(false);

        vbox.getChildren().add(dataArea);
        return vbox;
    }
}