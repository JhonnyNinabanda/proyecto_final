package proyecto.autos;

import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;

public class MainAuto {

	public static void main(String[] args) {
		
		Scanner Lector = new Scanner(System.in);
		Scanner Lector1 = new Scanner(System.in);
		
		int nroOpcion;
		String opcion;
		String placa = "", modelo= "", marca="", paisFabricacion="",tipoAuto="", estadoVehiculo="";
		int anioFabricacion=0, nroPuerta =0;
		double avaluo=0, cilindraje=0, pesoSoporta=0;
		String cedula;
		
		Date date=new Date();
		LocalDate fechaEntrega = LocalDate.now();
		
		int numVehiculo = 10;
		Auto arrayVehiculo[] = new Auto[numVehiculo];
		
		Auto auto1 = new Auto("TBA 4550", "Aveo", "Chevrolet", 2012, "USA", 1364, 8500.99, 4, 1112, "Disponible",null);
		Auto auto2 = new Auto("PCA 4550", "Cerato", "KIA", 2018, "SUR COREA", 1420, 12500.99, 4, 1132, "Reservado",fechaEntrega.now());
		Auto auto3 = new Auto("PCT 2025", "Prius", "Toyota", 2018, "CHINA", 1520, 15500.50, 4, 1132, "Alquilado",fechaEntrega.plusDays(4));
		Auto auto4 = new Auto("PFQ 0445", "Sportage", "KIA", 2019, "SUR COREA", 1820, 22500.50, 5, 1832, "Disponible",null);
		Auto auto5 = new Auto("PRG 0423", "Sportage", "KIA", 2017, "SUR COREA", 1820, 22500.50, 5, 1832, "Reservado",fechaEntrega.plusDays(5));
		
		arrayVehiculo[0] = auto1;
		arrayVehiculo[1] = auto2;
		arrayVehiculo[2] = auto3;
		arrayVehiculo[3] = auto4;
		arrayVehiculo[4] = auto5;
		
		
		System.out.println("Bienvendos a METROCARD");
		System.out.println("======================");
		
		do {
			
			System.out.println("======================");
			System.out.println(" 1. Cliente ");
			System.out.println(" 2. Empleado");
			System.out.println(" 3. SALIR ");
			System.out.println("======================");
			System.out.print("Ingrese una opcion: ");

			nroOpcion = Lector.nextInt();
			
			if(nroOpcion == 1) {
				
				do {
	
				System.out.println("    Menu de Clientes    ");
				System.out.println("------------------------");
				System.out.println(" a. Consultar Autos ");
				System.out.println(" b. Reservar Auto ");
				System.out.println(" c. Salir Menu Principal");
				System.out.println("------------------------");
				
				System.out.print("Ingrese una opcion: ");
				
				Scanner Lector5 = new Scanner(System.in);
				
				opcion = Lector5.nextLine();
				
				if(opcion.equals("a")) {
					
					System.out.print("Ingrese la marca del Auto: ");
					marca = Lector5.nextLine();
					
					for (int i = 0; i < arrayVehiculo.length; i++) {
						Auto auto = arrayVehiculo[i];
						boolean encontar = auto.getMarca().contains(marca);
						if (encontar == true) {
							
							System.out.println(arrayVehiculo[i]);
						
						}
					}

				}else if (opcion.equals("b")){
					
					System.out.print("Ingrese la placa del Auto: ");
					placa = Lector1.nextLine();
					System.out.print("Ingrese su cedula: ");
					cedula = Lector1.nextLine();
					
					for (int i = 0; i < arrayVehiculo.length; i++) {
						Auto auto = arrayVehiculo[i];
						boolean encontar = auto.getPlaca().contains(placa);
						if (encontar == true) {
							if (auto.getEstadoVehiculo().equals("Disponible")) {
								System.out.println(arrayVehiculo[i]);
								auto.setEstadoVehiculo("Reservado");
								System.out.println(arrayVehiculo[i]);
								System.out.println("El auto ha sido Correctamente Reservado");
								System.out.println("Por favor pasar a retirar en el Patio de Autos");
								
							}
							System.out.println("Este Auto no se puede Reservar");
						}
						 arrayVehiculo[i] = auto;
					}
				}
	
				}while(opcion.equals("c"));
				
			}else if(nroOpcion == 2){
				
				do{
					System.out.println("      Menu de Empleado      ");
					System.out.println("----------------------------");
					System.out.println(" a. Ingresar Auto ");
					System.out.println(" b. Alquilar Auto ");
					System.out.println(" c. Aplazar fecha de Entrega");
					System.out.println(" d. Salir Menu Principal");
					System.out.println("----------------------------");
					
					System.out.print("Ingrese una opcion: ");
					opcion = Lector1.nextLine();
					
					if(opcion.equals("a")) {
						
						Scanner LectorS = new Scanner(System.in);
						Scanner LectorN = new Scanner(System.in);
						
						int i = 0; ; 
						i++;
							Auto auto = new Auto();
							arrayVehiculo[i] = auto;

							System.out.print("Ingrese la placa del vehiculo: ");
							placa = LectorS.nextLine();

							System.out.print("Ingrese el modelo del vehiculo: ");
							modelo = LectorS.nextLine();

							System.out.print("Ingrese la marca del vehiculo: ");
							marca = LectorS.nextLine();

							System.out.print("Ingrese el año de fabricacion del vehiculo: ");
							anioFabricacion = LectorN.nextInt();

							System.out.print("Ingrese el pais de fabricacion del vehiculo: ");
							paisFabricacion = LectorS.nextLine();

							System.out.print("Ingrese el cilindraje del vehiculo: ");
							cilindraje = LectorN.nextDouble();

							System.out.print("Ingrese el avaluo del vehiculo: ");
							avaluo = LectorN.nextDouble();

							System.out.print("Elija el tipo de Auto: "); 
							tipoAuto = LectorS.nextLine();
							
							if (tipoAuto.equals("Automovil") ) {
								System.out.print("Numero de Puertas: ");
								nroPuerta = Lector.nextInt();
								
							}else if (tipoAuto.equals("Camioneta") ) {
								System.out.println("Peso que soporta: ");
								pesoSoporta = Lector.nextDouble();
								
							}
							
							System.out.println("Guardado exitosamente ");

							auto.setPlaca(placa);
							auto.setModelo(modelo);
							auto.setMarca(marca);
							auto.setAnioFabricacion(anioFabricacion);
							auto.setPaisFabricacion(paisFabricacion);
							auto.setCilindraje(cilindraje);
							auto.setAvaluo(avaluo);
							auto.setEstadoVehiculo(estadoVehiculo);

						
					}else if(opcion.equals("b")) {
						Scanner Lector9 = new Scanner(System.in);
						System.out.print("Ingrese la placa del auto: ");
						placa = Lector9.nextLine();
						
						for (int i = 0; i < arrayVehiculo.length; i++) {
							Auto auto = arrayVehiculo[i];
							boolean encontar = auto.getPlaca().contains(placa);
							if (encontar == true) {
								if (auto.getEstadoVehiculo().equals("Reservado")) {
									System.out.println(arrayVehiculo[i]);

									int op=0;
									do {
										Scanner Lector8 = new Scanner(System.in);
										System.out.println("1. Alquilar Auto");
										System.out.println("2. No Alquilar Auto");
										System.out.println("3. SALIR");
										op = Lector8.nextInt();
										
										if (op == 1) {
											auto.setEstadoVehiculo("Alquilado");
											auto.getEstadoVehiculo();
											System.out.println(arrayVehiculo[i]);
						
										}else if(op== 2) {
											System.out.println("Auto no Alquilado");
										}
										
									}while(op !=3);
									
								}
							}
							 arrayVehiculo[i] = auto;
						}
						
					}else if(opcion.equals("c")) {
						
						Scanner Lector7 = new Scanner(System.in);
						System.out.println("Ingrese la placa del vehiculo: ");
						placa = Lector7.nextLine();

						System.out.println("Ingrese la cedula del cliente: ");
						cedula = Lector7.nextLine();

						for (int i = 0; i < arrayVehiculo.length; i++) {
							Auto auto = arrayVehiculo[i];
							boolean encontar = auto.getPlaca().contains(placa);
							if (encontar == true) {
								if (auto.getEstadoVehiculo().equals("Alquilado")) {
								System.out.println(arrayVehiculo[i]);
								System.out.println("");

									int opc;
									do {
										Scanner Lector3 = new Scanner(System.in);
										System.out.println("1. Aplazar");
										System.out.println("2. No Aplazar");
										System.out.println("3. SALIR");
										opc = Lector3.nextInt();

										if(opc == 1) {
											
											LocalDate fechaPlazo=LocalDate.now();
											  fechaPlazo=fechaEntrega.plusDays(5);
											  arrayVehiculo[i].setFechaEntrega(fechaPlazo);;
											 System.out.println("Fecha de Entrega:"+arrayVehiculo[i].getFechaEntrega());

										}else if(opc == 2) {
											System.out.println("Auto no Aplazado");
											
										}

									} while (opc != 3);

								}
							}
							arrayVehiculo[i] = auto;

						}

					}					
					
				}while(opcion.equals("d"));
				
			}
			
		} while(nroOpcion !=3);

	}
}
