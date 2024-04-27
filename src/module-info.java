module estudo_JavaFx {
	requires javafx.controls;
	requires javafx.fxml;
	requires org.controlsfx.controls;
	
	opens fxml;
	opens basico;
	opens contador;
	opens layout;
}