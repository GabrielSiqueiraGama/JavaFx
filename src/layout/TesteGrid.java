package layout;

import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.RowConstraints;

public class TesteGrid extends GridPane{

	public TesteGrid() {
		Caixa c1 = new Caixa().comTexto("1");
		Caixa c2 = new Caixa().comTexto("2");
		Caixa c3 = new Caixa().comTexto("3");
		Caixa c4 = new Caixa().comTexto("4");
		Caixa c5 = new Caixa().comTexto("5");
		Caixa c6 = new Caixa().comTexto("6");
		
		
		setGridLinesVisible(true);
		getColumnConstraints().addAll(cc(), cc(), cc(),cc(), cc(), cc());
		getRowConstraints().addAll(rc(), rc(), rc(),rc(), rc(), rc());
		
		add(c2, 1,  1, 2, 3);
		add(c1, 0,  0, 2, 2);
		add(c3, 3, 1, 2, 2);
		add(c4, 4, 3, 1, 1);
		add(c5, 0, 4, 2, 2);
		add(c6, 2, 4, 2, 2);
	}
	private ColumnConstraints cc() {
		ColumnConstraints cc = new ColumnConstraints();
		cc.setPercentWidth(20);
		cc.setFillWidth(true);
		return cc;
	}
	private RowConstraints rc() {
		RowConstraints rc = new RowConstraints();
		rc.setPercentHeight(20);
		rc.setFillHeight(true);
		return rc;
	}
}
