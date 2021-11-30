package entities;

public class Aluno {

	public String name;
	public double n1;
	public double n2;
	public double n3;
	
	public double notaFinal() {
		return n1 + n2 + n3;
	}
	public double restande() {
		return 60 - (n1 + n2 + n3);
	}
}
