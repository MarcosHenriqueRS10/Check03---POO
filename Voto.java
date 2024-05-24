
public class Voto {

	String nomePessoa;
	String email;
	String telefone;

	public void Voto() {

	}

	public Voto(String nomePessoa, String email, String telefone) {
		super();
		this.nomePessoa = nomePessoa;
		this.email = email;
		this.telefone = telefone;
	}

	public String getNomePessoa() {
		return nomePessoa;
	}

	public void setNomePessoa(String nomePessoa) {
		this.nomePessoa = nomePessoa;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	@Override
	public String toString() {
		return "Voto [nomePessoa=" + nomePessoa + ", email=" + email + ", telefone=" + telefone + "]";
	}
	
	

}
