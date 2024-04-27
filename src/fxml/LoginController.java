package fxml;

import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LoginController {

	@FXML
	private TextField emailField;
	@FXML
	private PasswordField senhaField;
	public void entrar() {
		boolean emailValido = emailField.getText().equals("Ronaldo@gmail.com");
		boolean senhaValida = senhaField.getText().equals("xyz-321");

		if(emailValido & senhaValida) {
			System.out.println("Aoooo trem bao");
		}
	}
}
