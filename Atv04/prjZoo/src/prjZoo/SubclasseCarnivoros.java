package prjZoo;

public class SubclasseCarnivoros  extends ClasseAnimal {
	//Metodos da SubClasse
	public void metodoCacar() {
		System.out.println(this.atributoNome + " está caçando");
	} 
	@Override
	public void metodoEmitirSom() {
		System.out.println("RUUAARRR");
	}


}
