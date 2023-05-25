package classes;

public class Main {

	public static void main(String[] args) {
		CurrencyConverter test1 = new CurrencyConverter();
		int onceAgain = 0;

		//0=yes, 1=no, 2=cancel
		while (onceAgain == 0) {
			String choice = test1.showOptions();
			if (choice == "Conversor de Moneda") {
				try {
					int index = test1.showCurrencys();
					System.out.println("Index " + index);
					if (index >= 0 && index != 5) {
						String amount = test1.showInputValue();

						String total;

						switch (index) {
							case 0:
								total = test1.convertPesoDolar(Double.parseDouble(amount), index);
								test1.showTotalConversion(total, "Dolares");
								break;
							case 1:
								total = test1.convertPesoEuro(Double.parseDouble(amount), index);
								test1.showTotalConversion(total, "Euros");
								break;
							case 2:
								total = test1.convertPesoLibra(Double.parseDouble(amount), index);
								test1.showTotalConversion(total, "Libras Esterlinas");
								break;
							case 3:
								total = test1.convertPesoYen(Double.parseDouble(amount), index);
								test1.showTotalConversion(total, "Yen Japonés");
								break;
							case 4:
								total = test1.convertPesoWon(Double.parseDouble(amount), index);
								test1.showTotalConversion(total, "Won Sur-Coreano");
								break;
							case 6:
								total = test1.convertPesoDolar(Double.parseDouble(amount), index);
								test1.showTotalConversion(total, "Pesos");
								break;
							case 7:
								total = test1.convertPesoEuro(Double.parseDouble(amount), index);
								test1.showTotalConversion(total, "Pesos");
								break;
							case 8:
								total = test1.convertPesoLibra(Double.parseDouble(amount), index);
								test1.showTotalConversion(total, "Pesos");
								break;
							case 9:
								total = test1.convertPesoYen(Double.parseDouble(amount), index);
								test1.showTotalConversion(total, "Pesos");
								break;
							case 10:
								total = test1.convertPesoWon(Double.parseDouble(amount), index);
								test1.showTotalConversion(total, "Pesos");
								break;
						}
					}
				} catch (Exception e) {
					e.printStackTrace();
					test1.showErrorMessage();
				}
			}
			onceAgain = test1.showContinue();
		}
		test1.showEndMessage();
	}
}
