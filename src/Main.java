import java.time.LocalDate;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		usuario max= new usuario("Maxi","123",LocalDate.of(2005, 9, 25),2222,"french 2930","");
		usuario lucas= new usuario("Luca","123",LocalDate.of(2005, 9, 25),2222,"french 2930","");

		admin nico= new admin("Nico","111",LocalDate.of(2005, 9, 25),2222,"french 2930","nico@davinci.edu.ar","Admin");

		String[] menu={
			"Login","Salir"
		};
		int selec=0;
		
		
		do {
			selec=JOptionPane.showOptionDialog(null, "Bienvenido a la Empresa \n           Bar.Co   ", "", 0, selec, null, menu, menu[0]);
			switch (selec) {
			case 0:
				
				max.Login("", "",null);
				
				
				break;

			case 1:
				
				JOptionPane.showMessageDialog(null, "Que tengas un Buen dia!!!  :)");
				
				break;
			}
			
			
			
			
		} while (selec!=1);
	
		
		
		
		
	}

}
