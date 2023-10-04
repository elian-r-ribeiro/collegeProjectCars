package collegeProjectCars;

import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		Car c1 = new Car(2001, "verde", "Escort", 122);
		Car c2 = new Car(2004, "branco", "Palio", 111);
		Car c3 = new Car(2003, "preto", "Gol", 113);
		
		Scanner input = new Scanner(System.in);
		
		System.out.printf("[1] %s", c1.getPartialInfoAboutCar());
		System.out.printf("\n[2] %s", c2.getPartialInfoAboutCar());
		System.out.printf("\n[3] %s", c3.getPartialInfoAboutCar());
		
		System.out.println("\nEscolha o carro: ");
		String carUserChoice = input.nextLine();
		
		System.out.println("Digite o motor do carro selecionado: ");
		String setEngineInput = input.nextLine();
		System.out.println("Digite o tipo do câmbio do carro selecionado: ");
		String setExchangeInput = input.nextLine();
		System.out.println("Digite o número do chassi do carro selecionado: ");
		int setChassisInput = input.nextInt();
		input.nextLine();
		System.out.println("Digite o tipo do assento do carro selecionado: ");
		String setSeatInput = input.nextLine();
		
		switch(carUserChoice.toLowerCase().trim().replaceAll("\\s", "")){
		case "1":
			c1.setEngine(setEngineInput);
			c1.setExchange(setExchangeInput);
			c1.setChassis(setChassisInput);
			c1.setSeat(setSeatInput);
			c1.getAllInfoAboutCar();
			break;
		case "2":
			c2.setEngine(setEngineInput);
			c2.setExchange(setExchangeInput);
			c2.setChassis(setChassisInput);
			c2.setSeat(setSeatInput);
			c2.getAllInfoAboutCar();
			break;
		case "3":
			c3.setEngine(setEngineInput);
			c3.setExchange(setExchangeInput);
			c3.setChassis(setChassisInput);
			c3.setSeat(setSeatInput);
			c3.getAllInfoAboutCar();
			break;
		default:
			System.out.println("Escolha inválida!");
		}
		
		
		
		input.close();
	}
}
