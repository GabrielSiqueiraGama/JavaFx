module estudo_JavaFx {
	requires javafx.controls;
	requires javafx.fxml;
	
	opens fxml;
	opens basico;
	opens contador;
	opens layout;
}