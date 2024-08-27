package prjZoologico;

public class Aplicacão {

	public static void main(String[] args) {
		ClasseAnimal elefante = new ClasseAnimal();
		elefante.atributoNome = "Dumbo";
		elefante.atributoRaca = "Africano";
		elefante.atributoSexo = "Macho";
		elefante.atributoPeso = 170;
	
		ClasseAnimal girafa = new ClasseAnimal("GitHub", "Russa", "Femea", 50);
		
		SubclasseCarnivoros leao = new SubclasseCarnivoros();
		leao.atributoNome = "Leaodro";
		leao.atributoRaca = "Australeandro";
		leao.atributoSexo = "Neutro";
		leao.atributoPeso = 123; 
		
		leao.exibirInfo();
		leao.metodoCacar();
		
		elefante.exibirInfo();
		
		elefante.metodoComer(); 
		
		elefante.exibirInfo();
		
		girafa.exibirInfo();
		
	} 
	
	

}
