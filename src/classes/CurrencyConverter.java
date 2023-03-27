package classes;

import javax.swing.*;
import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.util.Arrays;
import java.util.stream.IntStream;

public class CurrencyConverter {

	private final DecimalFormat df = new DecimalFormat("0.00");

	public String showOptions() {
		String[] options = {"Conversor de Moneda"};
		ImageIcon icon = new ImageIcon("utilities/images/currency.png");
		String choseOption = (String) JOptionPane.showInputDialog(null, "Seleccione una opción de conversión", "Menú",
				JOptionPane.QUESTION_MESSAGE, icon, options, null);
		return choseOption;
	}
	
	public String showInputValue() {
		String inputValue = JOptionPane.showInputDialog(null, "Ingresa la catidad de dinero que desea convertir:",
				"Ingresar valor", JOptionPane.INFORMATION_MESSAGE);
		return inputValue;
	}

	public int showCurrencys() {
		String[] currencys = {"Pesos a Dólares", "Pesos a Euros", "Pesos a Libras Esterlinas", "Pesos a Yen Japonés",
				"Pesos a Won Sur-Coreano", "-------------------------------------", "Dólares a Pesos", "Euros a Pesos",
				"Libras Esterlinas a Pesos", "Yen Japonés a Pesos", "Won Sur-Coreano a Pesos"};
		String choseOption = (String) JOptionPane.showInputDialog(null, "Elije la moneda a la que deseaas convertir tu dinero",
				"Monedas", JOptionPane.QUESTION_MESSAGE, null, currencys, null);

		//Finding index of the option selected.
		int index = IntStream.range(0, currencys.length)
				.filter(i -> choseOption == currencys[i])
				.findFirst()
				.orElse(-1);
		return index;
	}

	public void showTotalConversion(String total, String typeTo) {
		JOptionPane.showMessageDialog(null,"Tienes $" + total + " " + typeTo);
	}

	public int showContinue() {
		int res = JOptionPane.showConfirmDialog(null, "¿Desea continuar?");
		return res;
	}

	public void showEndMessage() {
		JOptionPane.showMessageDialog(null, "Programa terminado");
	}

	public void showErrorMessage() {
		JOptionPane.showMessageDialog(null, "Valor no valido", "Error", JOptionPane.ERROR_MESSAGE);
	}

	public String convertPesoDolar(double amount, int index) {
		double peso = 4753;
		String total;

		if(index == 6) {
			total = String.valueOf((int) (amount * peso));
		} else {
			total = df.format(amount / peso);
		}
		return total;
	}

	public String convertPesoEuro(double amount, int indexChoise) {
		double peso = 5121;
		String total;

		if (indexChoise == 7) {
			total = String.valueOf((int) (amount * peso));
			System.out.println(total);
		} else {
			total = df.format(amount / peso);
			System.out.println(total);
		}
		return total;
	}

	public String convertPesoLibra(double amount, int indexChoise) {
		double peso = 5808;
		String total;

		if (indexChoise == 8) {
			total = String.valueOf((int) (amount * peso));
			System.out.println(total);
		} else {
			total = df.format(amount / peso);
			System.out.println(total);
		}
		return total;
	}

	public String convertPesoYen(double amount, int indexChoise) {
		double peso = 36.33;
		String total;

		if (indexChoise == 9) {
			total = String.valueOf((int) (amount * peso));
			System.out.println(total);
		} else {
			total = df.format(amount / peso);
			System.out.println(total);
		}
		return total;
	}

	public String convertPesoWon(double amount, int indexChoise) {
		double peso = 3.67;
		String total;

		if (indexChoise == 10) {
			total = String.valueOf((int) (amount * peso));
			System.out.println(total);
		} else {
			total = df.format(amount / peso);
			System.out.println(total);
		}
		return total;
	}
}
