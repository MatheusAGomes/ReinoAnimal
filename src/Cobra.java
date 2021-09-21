
public class Cobra extends Repteis implements Status{
	

	public Cobra() {
		this.caracteristicasEs = "Corpo cilíndrico e alongado";
		this.idademedia = 9;	
	}

	
	
	@Override
	public void printar() {	
		
		System.out.println("Cobra");
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
