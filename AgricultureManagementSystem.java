import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.layout.Region;
import javafx.stage.Stage;

public class AgricultureManagementSystem extends Application {

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Agriculture Management System");

       
        TabPane tabPane = new TabPane();

  
        tabPane.setStyle("-fx-background-color: black;");

      
        Tab registrationTab = new Tab("Farmer Registration", new FarmerRegistration().getView());
        Tab resourceTab = new Tab("Subsidy & Resource Management", new ResourceManagement().getView());
        Tab dataTab = new Tab("Real-Time Data", new RealTimeData().getView());
        Tab supportTab = new Tab("Communication & Support", new CommunicationSupport().getView());
        Tab reportTab = new Tab("Monitoring & Reporting", new MonitoringReporting().getView());

        tabPane.getTabs().addAll(registrationTab, resourceTab, dataTab, supportTab, reportTab);

        
        Scene scene = new Scene(tabPane, 800, 600);
        scene.getRoot().setStyle("-fx-background-color: black;");

        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}