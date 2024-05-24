import java.time.LocalDate;

public class Pintura extends Obra {

	String escola;
	String tipo;

	public Pintura(int id, String string, String artista) {
		super(id, string, artista);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void arte() {
		// TODO Auto-generated method stub

	}

	public String getEscola() {
		return escola;
	}

	public void setEscola(String escola) {
		this.escola = escola;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

}
