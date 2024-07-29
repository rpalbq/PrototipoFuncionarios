package Application;

import java.util.ArrayList;
import java.util.List;

import Entities.AuxiliarVeterinario;
import Entities.Funcionario;
import Entities.MedicoVeterinario;
import Entities.Secretaria;
import Entities.Zelador;

public class Main {

	public static void main(String[] args) {

		// criando medico
		Funcionario funcionario1 = new MedicoVeterinario(1, "Fulana De Tal", "00000000", 26, 2568.4, "012345-PE");
		System.out.println("Printar medica:");
		System.out.println(funcionario1);
		System.out.println();

		// criando auxiliar veterinario
		Funcionario funcionario2 = new AuxiliarVeterinario(2, "Beltrano lala", "11111111", 19, 1435.0, funcionario1);

		System.out.println("Printar Auxiliar:");
		System.out.println(funcionario2);
		System.out.println();

		// criando Zelador
		Funcionario funcionario3 = new Zelador(3, "Siclano bibi", "2222222", 30, 1458.2, "Recepcao");
		System.out.println("Printar Printar Zelador 1:");
		System.out.println(funcionario3);
		System.out.println();

		// criando Zelador 2
		Funcionario funcionario4 = new Zelador(3, "Jose", "224442", 40, 1458.2, "Consultorio 1");
		System.out.println("Printar Zelador 2:");
		System.out.println(funcionario4);
		System.out.println();

		// criando secretaria
		Funcionario funcionario5 = new Secretaria(4, "Maria", "231231232", 30, 1458.2);
		System.out.println("Printar Secretaria:");
		System.out.println(funcionario5);
		System.out.println();

		System.out.println("Criando Lista");
		List<Funcionario> funcionarios = new ArrayList<>();

		funcionarios.add(funcionario1);
		funcionarios.add(funcionario2);
		funcionarios.add(funcionario3);
		funcionarios.add(funcionario4);
		funcionarios.add(funcionario5);

		// Imprimindo todos os funcionários
		System.out.println("Listagem de todos os funcionários:");
		for (Funcionario f : funcionarios) {
			System.out.println(f);
			System.out.println();
		}

		// Filtrando e imprimindo apenas os Zeladores
		System.out.println("Listagem dos Zeladores:");
		for (Funcionario f : funcionarios) {
			if (f instanceof Zelador) {
				System.out.println(f);
				System.out.println();
			}
		}

	}
}
