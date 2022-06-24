package jana60.registrazioneUtente;

public class Utente {
	// Attributi
	private String nome;
	private String cognome;
	private String email;
	private String password;
	private int eta;

	// Costruttore
	public Utente(String nome, String cognome, String email, String password, int eta) throws Exception {
		// Se email contiene un carattere @ e un . in input continuo, altrimenti sollevo
		// un' Eccezione

		if (email.matches("[a-z].[a-z]+@+[a-z].[a-z]")) {
			throw new Exception("Email inserita non valida");
		}

		// Se password è lunga tra gli 8 e 12 caratteri in input continuo, altrimenti
		// sollevo un'Eccezione
		if (password.length() < 8 || password.length() > 12) {
			throw new Exception("Password inserita non valida");
		}

		// Se eta è maggiore di 18 in input continuo altrimenti sollevo un'Eccezione
		if (eta < 18) {
			throw new Exception("Età dell'untente non valida");
		}
		// Assegno nome, cognome, email ed eta
		this.nome = nome;
		this.cognome = cognome;
		this.email = email;
		this.password = password;
		this.eta = eta;
	}

	// Metodi getter e setter
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getEta() throws Exception {
		return eta;
	}

	public void setEta(int eta) throws Exception {
		this.eta = eta;
	}

}
