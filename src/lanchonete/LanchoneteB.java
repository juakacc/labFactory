package lanchonete;
import main.Sanduiche;
import main.Tomate;
import ovo.OvoGranja;
import pao.PaoBola;
import presunto.PresuntoPeru;
import queijo.QueijoCheddar;

public class LanchoneteB extends Lanchonete {

	@Override
	public Sanduiche getSanduiche() {
		return new Sanduiche(new PaoBola(), new PaoBola(), new QueijoCheddar(), 
				new PresuntoPeru(), new OvoGranja(), new Tomate());
	}

}
