import java.time.LocalDateTime;

public class Barco {

	private String nombre;
	private LocalDateTime horaEntrada;
	private LocalDateTime horaSalida;
	private int capacidadCarga;
	private double tarifa;
	private double impuesto;
	
	public Barco(String nombre, LocalDateTime horaEntrada, LocalDateTime horaSalida, int capacidadCarga, double tarifa,
			double impuesto) {
		this.nombre = nombre;
		this.horaEntrada = horaEntrada;
		this.horaSalida = horaSalida;
		this.capacidadCarga = capacidadCarga;
		this.tarifa = tarifa;
		this.impuesto = impuesto;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public LocalDateTime getHoraEntrada() {
		return horaEntrada;
	}
	public void setHoraEntrada(LocalDateTime horaEntrada) {
		this.horaEntrada = horaEntrada;
	}
	public LocalDateTime getHoraSalida() {
		return horaSalida;
	}
	public void setHoraSalida(LocalDateTime horaSalida) {
		this.horaSalida = horaSalida;
	}
	public int getCapacidadCarga() {
		return capacidadCarga;
	}
	public void setCapacidadCarga(int capacidadCarga) {
		this.capacidadCarga = capacidadCarga;
	}
	public double getTarifa() {
		return tarifa;
	}
	public void setTarifa(double tarifa) {
		this.tarifa = tarifa;
	}
	public double getImpuesto() {
		return impuesto;
	}
	public void setImpuesto(double impuesto) {
		this.impuesto = impuesto;
	}
}
