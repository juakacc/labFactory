package lanchonete;
import main.Sanduiche;
import main.Tomate;
import ovo.OvoCapoeira;
import pao.PaoFrances;
import presunto.PresuntoFrango;
import queijo.QueijoPrato;

public class LanchoneteA extends Lanchonete {

	@Override
	public Sanduiche getSanduiche() {
		return new Sanduiche(new PaoFrances(), new PaoFrances(), new QueijoPrato(), 
				new PresuntoFrango(), new OvoCapoeira(), new Tomate());
	}

}
