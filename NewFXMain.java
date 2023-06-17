import firstjavafxproject.Choice;
import firstjavafxproject.TestClass;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import  javafx.stage.Stage;

public class NewFXMain extends Application {

    @Override
    public void start(Stage primaryStage) {

        TextField postCodeEdit = new TextField();
        TextField phoneEdit = new TextField();
        TextField nameEdit = new TextField();

        ChoiceBox<Choice> phoneChoice = new ChoiceBox<>();
        phoneChoice.getItems().setAll(Choice.values());
        phoneChoice.setValue(Choice.OTHER);

        Button processBtn = new Button("Process");

        postCodeEdit.setPrefWidth(120);
        phoneEdit.setPrefWidth(120);
        nameEdit.setPrefWidth(120);
        phoneChoice.setPrefWidth(120);
        processBtn.setPrefWidth(120);

        Label postCodeLabel = new Label("Postcode");
        Label phoneLabel = new Label("Phone");
        Label nameLabel = new Label("Name");
        Label phoneTypeLabel = new Label("Type of Phone");
        Label btnLabel = new Label("Process");

        phoneLabel.setPrefWidth(100);
        nameLabel.setPrefWidth(100);
        phoneTypeLabel.setPrefWidth(100);
        btnLabel.setPrefWidth(100);
        postCodeLabel.setPrefWidth(100);

        HBox nameBox = new HBox();
        nameBox.setPadding(new Insets(10, 10, 10, 10));
        nameBox.setSpacing(10);
        nameBox.setStyle("-fx-background-color: #ffffff;");
        nameBox.getChildren().addAll  (nameLabel, nameEdit);

        HBox phoneBox = new HBox();
        phoneBox.setPadding(new Insets(10, 10, 10, 10));
        phoneBox.setSpacing(10);
        phoneBox.setStyle("-fx-background-color: #ffffff;");
        phoneBox.getChildren().addAll(phoneLabel, phoneEdit);

        HBox postCodeBox = new HBox();
        postCodeBox.setPadding(new Insets(10, 10, 10, 10));
        postCodeBox.setSpacing(10);
        postCodeBox.setStyle("-fx-background-color: #ffffff;");
        postCodeBox.getChildren().addAll(postCodeLabel, postCodeEdit);

        HBox phoneTypeBox = new HBox();
        phoneTypeBox.setPadding(new Insets(10, 10, 10, 10));
        phoneTypeBox.setSpacing(10);
        phoneTypeBox.setStyle("-fx-background-color: #ffffff;");
        phoneTypeBox.getChildren().addAll(phoneTypeLabel, phoneChoice);

        HBox btnBox = new HBox();
        btnBox.setPadding(new Insets(10, 10, 10, 10));
        btnBox.setSpacing(10);
        btnBox.setStyle("-fx-background-color: #ffffff;");
        btnBox.getChildren().addAll(btnLabel, processBtn);

        GridPane detailsGrid = new GridPane();
        detailsGrid.add(nameBox, 0, 0);
        detailsGrid.add(phoneBox, 0, 1);
        detailsGrid.add(postCodeBox, 0, 2);
        detailsGrid.add(phoneTypeBox, 0, 3);
        detailsGrid.add(btnBox, 0, 4);

        processBtn.setOnAction((event) -> {
            
            Choice c = phoneChoice.getValue();
            String n = nameEdit.getText();
            String p = phoneEdit.getText();
            String pc = postCodeEdit.getText();
            
            // public TestClass(String postcode,  String phone,  String name, Choice choice){

            TestClass tc = new TestClass(pc, p, n, c);
            System.out.println(tc.toString());
            
        });

        StackPane root = new StackPane();
        root.getChildren().add(detailsGrid);

        Scene scene = new Scene(root, 300, 250);

        primaryStage.setTitle("Details");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
}