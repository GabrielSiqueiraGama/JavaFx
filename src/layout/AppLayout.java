package layout;

import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class AppLayout extends Application{
	private Stage janela;
	@Override
	public void start(Stage primaryStage) throws Exception {
		
//		Adicionando quadrados e retangulos
//		VBox temp = new VBox();
//		
//		temp.getChildren().add(new Caixa().comTexto("1"));
//		temp.getChildren().add(new Caixa().comTexto("1"));
//		temp.setSpacing(10);
//		temp.getChildren().add(new Quadrado());
//		Scene principal = new Scene(temp, 800, 600);
//		
		Parent raiz = null;
		raiz = new TesteAnchorPane();
		raiz = new TesteBorderPane();
		raiz = new TesteFlowPane();
		raiz = new TesteGrid();
		//raiz = new TesteStackPane();
		raiz = new TesteTilePan();
		Scene principal = new Scene(raiz, 800, 600);
		janela = primaryStage;
		janela.setTitle("Gerenciadores de Layout");
		janela.setScene(principal);
		janela.show();
		
	}

	public static void main(String[] args) {
		launch(args);
	}
}
