package proyecto.autos;

import java.time.LocalDate;

public class Auto {
	
	private String placa;
	private String modelo;
	private String marca;
	private int anioFabricacion;
	private String paisFabricacion;
	private double cilindraje;
	private double avaluo;
	private int nroPuertas;
	private double pesoSoporta;
	private String estadoVehiculo;
	private LocalDate fechaEntrega;
	


	private Cliente  cliente;
	
	
	//Constructor
	
	public Auto() {
		this.placa = "";
		this.modelo = "";
		this.marca = "";
		this.anioFabricacion = 0;
		this.paisFabricacion = "";
		this.cilindraje = 0;
		this.avaluo = 0;
		this.nroPuertas = 0;
		this.pesoSoporta = 0;
		this.estadoVehiculo = "";
	}
	
	
	// Constructor
	
	public Auto(String placa, String modelo, String marca, int anioFabricacion, String paisFabricacion,double cilindraje, double avaluo, int nroPuertas, double pesoSoporta, String estadoVehiculo, LocalDate fechaEntrega) {
		super();
		this.placa = placa;
		this.modelo = modelo;
		this.marca = marca;
		this.anioFabricacion = anioFabricacion;
		this.paisFabricacion = paisFabricacion;
		this.cilindraje = cilindraje;
		this.avaluo = avaluo;
		this.nroPuertas = nroPuertas;
		this.pesoSoporta = pesoSoporta;
		this.estadoVehiculo = estadoVehiculo;
		this.fechaEntrega = fechaEntrega;
		
	}
	// Metodos Set y Get
	
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public int getAnioFabricacion() {
		return anioFabricacion;
	}
	public void setAnioFabricacion(int anioFabricacion) {
		this.anioFabricacion = anioFabricacion;
	}
	public String getPaisFabricacion() {
		return paisFabricacion;
	}
	public void setPaisFabricacion(String paisFabricacion) {
		this.paisFabricacion = paisFabricacion;
	}
	public double getCilindraje() {
		return cilindraje;
	}
	public void setCilindraje(double cilindraje) {
		this.cilindraje = cilindraje;
	}
	public double getAvaluo() {
		return avaluo;
	}
	public void setAvaluo(double avaluo) {
		this.avaluo = avaluo;
	}
	public int getNroPuertas() {
		return nroPuertas;
	}
	public void setNroPuertas(int nroPuertas) {
		this.nroPuertas = nroPuertas;
	}
	public double getPesoSoporta() {
		return pesoSoporta;
	}
	public void setPesoSoporta(double pesoSoporta) {
		this.pesoSoporta = pesoSoporta;
	}
	public String getEstadoVehiculo() {
		return estadoVehiculo;
	}
	public void setEstadoVehiculo(String estadoVehiculo) {
		this.estadoVehiculo = estadoVehiculo;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public LocalDate getFechaEntrega() {
		return fechaEntrega;
	}
	public void setFechaEntrega(LocalDate fechaReserva) {
		this.fechaEntrega = fechaReserva;
	}


	@Override
	public String toString() {
		return "\n[Placa=" + placa + ", Modelo=" + modelo + ", Marca=" + marca + ", Año="
				+ anioFabricacion + ", Estado=" + estadoVehiculo + ", Fecha Entrega=" + fechaEntrega + "]";
	}

}
