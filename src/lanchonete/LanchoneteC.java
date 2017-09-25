package lanchonete;
import main.Sanduiche;
import main.Tomate;
import ovo.OvoGranja;
import pao.PaoIntegral;
import presunto.PresuntoFrango;
import queijo.QueijoMussarela;

public class LanchoneteC extends Lanchonete {

	@Override
	public Sanduiche getSanduiche() {
		return new Sanduiche(new PaoIntegral(), new PaoIntegral(), new QueijoMussarela(), 
				new PresuntoFrango(), new OvoGranja(), new Tomate());
	}

}
