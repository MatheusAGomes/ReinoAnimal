


public class Tubarao extends Peixes implements Status {
	

	public Tubarao() {
		this.caracteristicasEs = "Escamas placoides";
		this.idademedia = 25;	
	}

	
	
	@Override
	public void printar() {	
		
		System.out.println("Tubarao");
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
