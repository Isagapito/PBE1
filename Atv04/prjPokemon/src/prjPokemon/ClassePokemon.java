package prjPokemon;

public class ClassePokemon {
	//Atributos 
		String Nome;
		String Tipo;
		int Nivel;
		int hp ;
		
		//Construtores
			public ClassePokemon() {
				 	
			}
			
			public ClassePokemon(String parametroNome, String parametroTipo, int parametroNivel, int parametrohp) {
				this.Nome = parametroNome;
				this.Tipo = parametroTipo;
				this.Nivel = parametroNivel;
				this.hp = parametrohp;
				
			
}           
			//Metodos Setters

			public String getNome() {
				return Nome;
			}

			public void setNome(String nome) {
				Nome = nome;
			}

			public String getTipo() {
				return Tipo;
			}

			public void setTipo(String tipo) {
				Tipo = tipo;
			}

			public int getNivel() {
				return Nivel;
			}

			public void setNivel(int nivel) {
				Nivel = nivel;
			}

			public int getHp() {
				return hp;
			}

			public void setHp(int hp) {
				this.hp = hp;
			}
			
			//Metodo 
			public void Atacar() {
				System.out.println(this.Nome + "Atacou");
			} 
			public void Evoluir() {
				System.out.println(this.Nome + "esá evoluindo");
			}
			public void exibirInfo() {
				System.out.println("Nome: " + this.Nome);
				System.out.println("Tipo: " + this.Tipo);
				System.out.println("Nivel: " + this.Nivel);
				System.out.println("hp: " + this.hp);
			}
			
}
