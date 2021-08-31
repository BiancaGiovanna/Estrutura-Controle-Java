package estruturaControle;

public class IfElseIf {

	public static void main(String[] args) {
		Double nota = 5.5;
		Boolean bomComportamento = false;
		
		if (nota >= 7 && bomComportamento) {
			System.out.println("Quadro de honra");
		} else if (nota>= 7 && bomComportamento == false) {
			System.out.println("O aluno tem boas notas mas se comporta mal");
		} else {
			System.out.println("O aluno não tem boas notas e tem um mal comportamento!");
		}

	}

}
