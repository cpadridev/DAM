module proAdrian.JavaFX {
	requires javafx.controls;
	requires javafx.fxml;
	
	opens application0 to javafx.graphics, javafx.fxml;
	opens application1 to javafx.graphics, javafx.fxml;
	opens application2 to javafx.graphics, javafx.fxml;
	opens application3 to javafx.graphics, javafx.fxml;
	opens application3.controller to javafx.fxml;
	opens application4 to javafx.graphics, javafx.fxml;
	opens application5 to javafx.graphics, javafx.fxml;
	opens application5.controller to javafx.fxml;
}
