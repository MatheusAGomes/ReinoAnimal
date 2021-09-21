
public class Baleia extends Mamiferos implements Status {

	public Baleia() {
		this.caracteristicasEs = "Marinho";
		this.idademedia = 25;		
		}
	
	@Override
	public void printar() {	
		
		System.out.println("Baleia");
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
