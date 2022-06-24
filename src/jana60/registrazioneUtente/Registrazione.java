package jana60.registrazioneUtente;

import java.util.Scanner;

public class Registrazione {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		try {
			System.out.println("Inserisci il tuo nome: ");
			String nome = scan.nextLine();
			System.out.println("Inserisci il tuo cognome: ");
			String cognome = scan.nextLine();
			System.out.println("Inserisci la tua email: ");
			String email = scan.nextLine();
			System.out.println("Inserisci la tua password: ");
			String password = scan.nextLine();
			System.out.println("Inserisci la tua età: ");
			int etaUtente = Integer.parseInt(scan.nextLine());
			Utente nuovoUtente = new Utente(nome, cognome, email, password, etaUtente);
			System.out.println("Registrazione completata, benvenuto!");
		} catch (Exception exceptionUtente) {
			System.out.println("Impossibile terminare la registrazione");
			System.out.println(exceptionUtente.getMessage());

		}
		scan.close();
	}

}
