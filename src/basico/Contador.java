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
		titulo.getStyleClass().add("titulo");
		
		Label numero = new Label("0");
		numero.getStyleClass().add("numero");
		
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
		
		VBox boxConteudo = new VBox(); // Cria caixa vertical
		boxConteudo.getStyleClass().add("conteudo");//adiciona estilo ao box
		boxConteudo.setAlignment(Pos.CENTER);
		boxConteudo.setSpacing(10);
		boxConteudo.getChildren().add(titulo); // Adiciona na caixa o titulo
		boxConteudo.getChildren().add(numero);
		boxConteudo.getChildren().add(boxBotoes);
		
		String caminhoCss = getClass()
				.getResource("/basico/contador.css").toExternalForm();//importa o css da classe selecionada
		
		Scene cenaPrincipal = new Scene(boxConteudo, 500, 500); //Cria uma cena colocando a caixa como cena
		cenaPrincipal.getStylesheets().add(caminhoCss);//relaciona o css com a classe
		cenaPrincipal.getStylesheets().add("https://fonts.googleapis.com/css?family=Montserrat");//importa fonte de texto
		primaryStage.setScene(cenaPrincipal);//Seta a cena para ser exibida
		primaryStage.show();//Exibe todas as cenas já selecionadas
	}
}
