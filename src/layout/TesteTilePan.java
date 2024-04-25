package layout;

import java.util.ArrayList;
import java.util.List;

import javafx.scene.layout.TilePane;

public class TesteTilePan extends TilePane{

	public TesteTilePan() {
		List<Quadrado> quadrados = new ArrayList<Quadrado>();
		
		for(int i = 1; i <10; i++) {
			quadrados.add(new Quadrado(i * 10));
		}
		
		getChildren().addAll(quadrados);
	}
}
