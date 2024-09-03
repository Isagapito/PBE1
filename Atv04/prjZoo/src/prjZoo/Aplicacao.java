package prjZoo;

public class Aplicacao {

	public static void main(String[] args) {
		ClasseAnimal elefante = new ClasseAnimal();
		elefante.AtributoNome("Dumbo");
		elefante.setAtributoPeso(100);
	
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
		
		elefante.metodoEmitirSom();
		girafa.metodoEmitirSom();
		leao.metodoEmitirSom();
		
	} 
	
	}


