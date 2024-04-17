package basico;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

//Estudando navegação de paginas/cenas
public class Wizard extends Application{

	private Stage janela;
	private Scene passo1;
	private Scene passo2;
	private Scene passo3;
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		janela = primaryStage;
		
		criarPasso1();
		criarPasso2();
		criarPasso3();
		
		janela.setScene(passo1);
		janela.setTitle("Wizard");
		janela.show();
	}

	private void criarPasso1() {
		Button proximoPasso = new Button("Ir para o passo 2");
		proximoPasso.setOnAction(e->{
			janela.setScene(passo2);
		});
		HBox box = new HBox();
		box.setAlignment(Pos.CENTER);
		box.getChildren().add(proximoPasso);
		passo1 = new Scene(box, 400, 400);
	}
	
	private void criarPasso2() {
		Button voltar = new Button("<<<<<  Voltar");
		Button ir3 = new Button("Passo de n 03");

		
		voltar.setOnAction(e ->{
			janela.setScene(passo1);
			});
		ir3.setOnAction(e ->{
			janela.setScene(passo3);
		});
		
		
		HBox box = new HBox();
		box.setAlignment(Pos.CENTER);
		box.getChildren().add(voltar);
		box.getChildren().add(ir3);
		
		passo2 = new Scene(box, 400, 400);
	}
	
	private void criarPasso3() {
		Button voltar2 = new Button("Voltar para o passo 2");
		Button finalizar = new Button("Finalizar programa");

		
		finalizar.setOnAction(e ->{
			System.exit(0);
			});
		voltar2.setOnAction(e ->{
			janela.setScene(passo2);
		});
		
		
		HBox box = new HBox();
		box.setAlignment(Pos.CENTER);
		box.getChildren().add(finalizar);
		box.getChildren().add(voltar2);
		
		passo3 = new Scene(box, 400, 400);
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
