package jana60.registrazioneUtente;

import java.util.Scanner;

public class Registrazione {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean valido = false;
		do {
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
				valido = true;
				System.out.println("Registrazione completata, benvenuto/a : " + nuovoUtente.toString());
			} catch (NumberFormatException nfe) {
				System.out.println("L'età inserita non è valida");
				System.out.println(nfe.getMessage());
			} catch (Exception exceptionUtente) {
				System.out.println("Impossibile completare la ragistrazione");
				System.out.println(exceptionUtente.getMessage());
			}

		} while (!valido);

		scan.close();

	}
}
