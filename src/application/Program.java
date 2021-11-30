package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Aluno;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);

		Aluno a= new Aluno();
		
		a.name = sc.nextLine();
		a.n1 = sc.nextDouble();
		a.n2 = sc.nextDouble();
		a.n3 = sc.nextDouble();
		
		System.out.printf("Final grade = %.2f%n", a.notaFinal());
		
		if (a.notaFinal() > 60) {
		System.out.println("PASS");
	}
		else {
			System.out.println("FAILED");
			System.out.printf("MISSING %.2f POINTS" , a.restande());
		}

		sc.close();
	}

}
