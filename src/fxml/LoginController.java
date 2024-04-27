package fxml;

import org.controlsfx.control.Notifications;

import javafx.fxml.FXML;
import javafx.geometry.Pos;
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
			Notifications.create().position(Pos.CENTER).title("Login FXML").text("Sucesso ao logar").showConfirm();
		}else {
			Notifications.create().position(Pos.CENTER).title("Login FXML").text("Usuario ou senha invalidos").showError();;
		}
	}
}
