package main;
import abstratos.Ovo;
import abstratos.Pao;
import abstratos.Presunto;
import abstratos.Queijo;

public class Sanduiche {

	private Pao pao1, pao2;
	private Queijo queijo;
	private Presunto presunto;
	private Ovo ovo;
	private Tomate tomate;
	
	
	public Sanduiche(Pao pao1, Pao pao2, Queijo queijo, Presunto presunto, Ovo ovo, Tomate tomate) {
		this.pao1 = pao1;
		this.pao2 = pao2;
		this.queijo = queijo;
		this.presunto = presunto;
		this.ovo = ovo;
		this.tomate = tomate;
	}


	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		
		builder.append(pao1);
		builder.append(" e ");
		builder.append(pao2);
		builder.append("\n");
		builder.append(queijo);
		builder.append("\n");
		builder.append(presunto);
		builder.append("\n");
		builder.append(ovo);
		builder.append("\n");
		builder.append(tomate);
		
		return builder.toString();
	}
	
	
}
