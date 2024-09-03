package prjZoo;

public class subClasseReptil extends ClasseAnimal  { 
	//Metodos da SubClasse
	public void metodoTrocarPele() {
		System.out.println(this.atributoNome + " está trocando de pele");
	} 
	public void metodoRastejar() {
		System.out.println(this.atributoNome + " está rastejando");
	}
	@Override
	public void metodoEmitirSom() {
		System.out.println("SHHHIIII");
	}


}
