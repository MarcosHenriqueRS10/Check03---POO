import java.time.LocalDate;

public abstract class Obra {
	int id;
	String data;
	String artista;

	public abstract void arte();

	public Obra(int id, String string, String artista) {
		super();
		this.id = id;
		this.data = string;
		this.artista = artista;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String getArtista() {
		return artista;
	}

	public void setArtista(String artista) {
		this.artista = artista;
	}

	@Override
	public String toString() {
		return "Obra [id=" + id + ", data=" + data + ", artista=" + artista + "]";
	}

}
