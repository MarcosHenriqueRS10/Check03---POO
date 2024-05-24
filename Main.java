import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		List<Pintura> pinturas = new ArrayList<Pintura>();

		pinturas.add(new Pintura(1889, " Noite Estrelada", " Van Gogh"));
		pinturas.add(new Pintura(1888, " Os Girassois", " Van Gogh"));
		pinturas.add(new Pintura(1503, " Monalisa", " Leonardo Da Vinci"));

		List<Escultura> esculturas = new ArrayList<Escultura>();

		esculturas.add(new Escultura(1499, " Pietà", " Michelangelo"));
		esculturas.add(new Escultura(1922, " Lincoln Memorial", " Daniel Chester"));
		esculturas.add(new Escultura(1986, " La Gorda Gertrudis", " Fernando Botero"));

		Scanner e = new Scanner(System.in);

		Voto voto = new Voto(" João Pedro", " markin@gmail.com", " 11942999026");

		System.out.println(voto);
		System.out.println("");

		System.out.println("Pinturas:");
		for (Pintura pintura : pinturas) {
			System.out.println(pintura);
		}
		System.out.println("");

		System.out.println("Esculturas:");
		for (Escultura escultura : esculturas) {
			System.out.println(escultura);
		}

		System.out.println("");

		System.out.println("Digite a arte que você mais gostou: ");
		String votacao = e.next();

		System.out.println();

		System.out.println("Arte escolhida: " + votacao);

	}
}
