
public class Sapo extends Anfibio implements Status {
	

	public Sapo() {
		this.caracteristicasEs = "Glândulas paratoides";
		this.idademedia = 13;	
	}

	
	
	@Override
	public void printar() {	
		
		System.out.println("Sapo");
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
