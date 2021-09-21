
public class Morcego extends Mamiferos implements Status {
		

	public Morcego(){
		
	this.caracteristicasEs = "Voador";
	this.idademedia = 30;

	
	}
	
	@Override
	public void printar() {	
		
		System.out.println("Morcego");
		System.out.print("Classe :");
		System.out.println(this.classe);
		System.out.print("Filo :");

		System.out.println(this.filo);
		System.out.print("Caracteristica :");
		System.out.print(this.caracteristicas);
		System.out.print(",");
		System.out.println(this.caracteristicasEs);
		System.out.print("Idade Media :");

		System.out.println(this.idademedia);


	}
}
