import java.time.LocalDate;
import java.util.LinkedList;

import javax.swing.JOptionPane;

public class admin extends usuario{
	private String mail;

	public admin(String nombre, String contraseña, LocalDate fechanacimiento, int telefono, String direccion,
			String puesto, String mail) {
		super(nombre, contraseña, fechanacimiento, telefono, direccion, puesto);
		this.mail = mail;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}
	public void Login(String nom,String con) {

		do {
				nom=JOptionPane.showInputDialog(" Buen dia Usuario \n Ingrese su nombre de usuario:");				
				
		while(!nom.equals(getNombre()) || nom.isEmpty()) {
			
				if (nom.isEmpty()) {
					JOptionPane.showMessageDialog(null,"Error es necesario ingresar un nombre:");;	
					nom=JOptionPane.showInputDialog("Porfavor ingrese su nombre de usuario:");
					
				} else {
					JOptionPane.showMessageDialog(null,"El nombre " + nom +" No pertenece a de un Usuario:" );
					nom=JOptionPane.showInputDialog("Porfavor ingrese su nombre de usuario:");

				}					
		}
		con=JOptionPane.showInputDialog( "Usuario "+ nom + " Ingrese su contraseña:");
		while(!con.equals(getNombre()) || con.isEmpty()) {

			
					 if (con.isEmpty()) {
							JOptionPane.showMessageDialog(null,"Error es necesario ingresar una contraseña:");;	
							con=JOptionPane.showInputDialog("Porfavor ingrese su contraseña de usuario:");

					}else {
						
							JOptionPane.showMessageDialog(null,"La contraseña " + con +" No coinside con el usuario:" );
							con=JOptionPane.showInputDialog("Porfavor intente de nuevo:");
							 
						
						
						
					}
					
			}
			
			
		} while (!nom.equals(getNombre()) && !con.equals(getNombre()));
		
		JOptionPane.showMessageDialog(null,"Bienvenido Usuario "+nom+" Encargado de ...");
	}

	
	public void Funcionesadmin() {
		admin nico= new admin("Nico","111",LocalDate.of(2005, 9, 25),2222,"french 2930","nico@davinci.edu.ar","Admin");
		
		
			
		
		
		
		
		
	}
	
	
	
	

	
	
	
	
}
