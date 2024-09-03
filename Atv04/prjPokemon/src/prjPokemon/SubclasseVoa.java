package prjPokemon;

public class SubclasseVoa extends ClassePokemon {
	//Metodos da SubClasse
	public void voar() {
		System.out.println(this.Nome + "esta voando");
	} 
	public void ataqueAsa() {
		System.out.println(this.Nome + "usou a asa para atarcar");
	} 
}
