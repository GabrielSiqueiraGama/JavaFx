package basico;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Contador extends Application{

	private int contador = 0;
	
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		Label titulo = new Label("Contador");//Label = titulo
		Label numero = new Label("0");
		
		Button botaoMenos = new Button("-");
		botaoMenos.setOnAction(e ->{
			contador--;
			numero.setText(Integer.toString(contador));
		});
		Button botaoMais = new Button("+");
		botaoMais.setOnAction(e -> {
			contador++;
			numero.setText(Integer.toString(contador));
		});
		
		HBox boxBotoes = new HBox();
		boxBotoes.setAlignment(Pos.CENTER);//Centrazila o box
		boxBotoes.setSpacing(10);//Coloca espaçamento
		boxBotoes.getChildren().add(botaoMenos);
		boxBotoes.getChildren().add(botaoMais);
		
		VBox boxPrincipal = new VBox(); // Cria caixa vertical
		boxPrincipal.setAlignment(Pos.CENTER);
		boxPrincipal.setSpacing(10);
		boxPrincipal.getChildren().add(titulo); // Adiciona na caixa o titulo
		boxPrincipal.getChildren().add(numero);
		boxPrincipal.getChildren().add(boxBotoes);
		
		Scene cenaPrincipal = new Scene(boxPrincipal, 500, 500); //Cria uma cena colocando a caixa como cena
		
		primaryStage.setScene(cenaPrincipal);//Seta a cena para ser exibida
		primaryStage.show();//Exibe todas as cenas já selecionadas
	}
}
