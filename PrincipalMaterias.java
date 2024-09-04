package enem;

public class PrincipalMaterias {

	public static void main(String[] args) {
		System.out.println("TODAS AS MATERIAS DO ENSINO MEDIO NO SESI");
		System.out.println("(não foi divido por ano)");
		System.out.println("============================");
		for (Materia aulas: Materia.values()) {
			System.out.println("MATÉRIA: "+aulas);

	}
	}
}
