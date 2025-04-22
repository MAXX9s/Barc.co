import java.time.LocalDate;

import javax.swing.JOptionPane;

public class usuario {
	private String nombre;
	private String contraseña;
	private LocalDate fechanacimiento;
	private int telefono;
	private String direccion;
	public usuario(String nombre, String contraseña, LocalDate fechanacimiento, int telefono, String direccion) {
		this.nombre = nombre;
		this.contraseña = contraseña;
		this.fechanacimiento = fechanacimiento;
		this.telefono = telefono;
		this.direccion = direccion;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getContraseña() {
		return contraseña;
	}
	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}
	public LocalDate getFechanacimiento() {
		return fechanacimiento;
	}
	public void setFechanacimiento(LocalDate fechanacimiento) {
		this.fechanacimiento = fechanacimiento;
	}
	public int getTelefono() {
		return telefono;
	}
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	public void Registro(String nombr, String contra, LocalDate Fecha, int telefono , String direccion) {
    
		nombr=JOptionPane.showInputDialog("Ingrese su Nombre");
		if (nombr.equals(nombre)) {
			JOptionPane.showMessageDialog(null, "El nombre ingresado ya existe");
		}else {
			
			nombre=nombr;
		}
    
		contra=JOptionPane.showInputDialog("Ingrese su Nombre");
		contraseña=contra;
		
		telefono=Integer.parseInt(JOptionPane.showInputDialog("Ingrese su Numero de telefono personal:"));
	}
	
	public void Login(String nom,String con) {
		do {
			
			nom=JOptionPane.showInputDialog("Ingrese su nombre de usuario:");
			if (nom.isEmpty()){
				JOptionPane.showMessageDialog(null,"Ingrese un nombre");;	
				nom=JOptionPane.showInputDialog("Ingrese su nombre de usuario:");

			} else {
				con=JOptionPane.showInputDialog("Ingrese su nombre de usuario:");

			}
			
			
			
			
			
			
			
			
		} while (nom==nombre && con==contraseña);
		
		
	}
	
	
}
