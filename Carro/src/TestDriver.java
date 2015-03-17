
public class TestDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Carro Carro1 = new Carro();
		
		Carro Carro2 = new Carro();
		
		Carro1.color = "azul";
		
		Carro1.portas = 2;
		
		Carro1.rodas = 4;
		
        Carro2.color = "amarelo";
		
		Carro2.portas = 2;
		
		Carro2.rodas = 4;
		
		System.out.println ("Meu carro Ž " + Carro1.color + ", tem " + Carro1.portas + " portas e " + Carro1.rodas
				+ " rodas!");
		
		System.out.println ("Meu outro carro Ž " + Carro2.color + ", tem " + Carro2.portas + " portas e " + Carro2.rodas
				+ " rodas!");
		
		Carro1.acendeFar—is();
		
		Carro1.buzina();
		
		Carro1.andaParaFrente();
		
		Carro2.buzina();
		
		
		
		
		
				

	}

}
