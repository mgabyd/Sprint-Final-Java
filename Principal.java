package grupal4;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Principal {
	
	public static int getIntFromUser(Scanner usuarioEscribe) {
        boolean inputValid = false;
        int result = 0;

        do {
            try {
                result = usuarioEscribe.nextInt();
                usuarioEscribe.nextLine(); // consume el '\n'
                inputValid = true; // Si llegamos aquí, significa que no hubo una excepción y la entrada es válida
            } catch (InputMismatchException e) {
                System.out.println("Error: Solo debes ingresar números. Intenta nuevamente.");
                usuarioEscribe.nextLine(); // limpia el buffer
            }
        } while (!inputValid);

        return result;
    }

	public static void main(String[] args) {

		// Constructores
		Contenedor contenedor = new Contenedor();
		Profesional profesional = new Profesional();
		Administrativo nuevoAdministrativo = new Administrativo();
		Cliente nuevoCliente = new Cliente();
		Capacitacion nuevoCapacitacion = new Capacitacion();

		try (Scanner inputs = new Scanner(System.in)) {
			while (true) {
				System.out.println("Bienvenido al sistema");
			    System.out.println("1. Almacenar cliente");
			    System.out.println("2. Almacenar profesional");
			    System.out.println("3. Almacenar administrativo");
			    System.out.println("4. Almacenar capacitación");
			    System.out.println("5. Eliminar usuario");
			    System.out.println("6. Listar usuarios");
			    System.out.println("7. Listar usuarios por tipo");
			    System.out.println("8. Listar capacitaciones");
			    System.out.println("9. Salir");
				System.out.println("Eligue tu opción: ");

			    int opcion = inputs.nextInt();
			    inputs.nextLine();
			    
			 switch(opcion) {
			 case 1:
				 contenedor.almacenarCliente(nuevoCliente);
				 System.out.println("Ingrese los detalles del nuevo cliente: ");
				 boolean nombreValido = false;

				 while (!nombreValido) {
					 try {
						 System.out.print("Nombre: ");
						 String nombre = inputs.nextLine();
						 nuevoCliente.setNombre(nombre);
						 nombreValido = true;
				 } catch (IllegalArgumentException e) {
					 System.out.println(e.getMessage());
				 }
			 }

				 boolean apellidoValido = false;

				 while (!apellidoValido) {
					 try {
						 System.out.print("Apellidos: ");
						 String apellido = inputs.nextLine();
						 nuevoCliente.setApellido(apellido);
						 apellidoValido = true;
					 } catch (IllegalArgumentException e) {
						 System.out.println(e.getMessage());
					 }
				 }

			     System.out.print("Fecha de Nacimiento (dd/MM/yyyy): ");
			     Date fechaNacimiento;
				 boolean fechaValida = false;

				 do {
					 try {
						 String fechaInput = inputs.nextLine();
						 fechaNacimiento = new SimpleDateFormat("dd/MM/yyyy").parse(fechaInput);
						 nuevoCliente.setFechaNacimiento(fechaNacimiento);
						 fechaValida = true;
					 } catch (ParseException e) {
						 System.out.println("Fecha inválida, inténtalo de nuevo.");
						 System.out.print("Fecha de Nacimiento (dd/MM/yyyy): ");
					 }
				 } while (!fechaValida);
				 System.out.print("RUN (En caso de ser K, remplazelo por un 1): ");
				 int run;
				 boolean runValido = false;

				 do {
					 try {
						 run = inputs.nextInt();
						 inputs.nextLine();
						 nuevoCliente.setRun(run);
						 runValido = true;
					 } catch (InputMismatchException e) {
						 System.out.println("RUN inválido, inténtalo de nuevo.");
						 System.out.print("RUN (En caso de ser K, remplazelo por un 1): ");
						 inputs.nextLine();
					 }
				 } while (!runValido);
			
			     System.out.print("Telefono: ");
			     boolean telefonoValido = false;

				 while (!telefonoValido) {
					 try {
						 String telefono = inputs.nextLine();
						 nuevoCliente.setTelefono(telefono);
						 telefonoValido = true;
					 } catch (InputMismatchException e) {
						 System.out.println("Teléfono inválido, inténtalo de nuevo.");
						 System.out.print("Telefono: ");
					 }
				 }


			     System.out.print("AFP: ");
				 boolean afpValida = false;

				 while(!afpValida) {
					 try {
						 String afp = inputs.nextLine();
						 nuevoCliente.setAfp(afp);
						 afpValida = true;
					 } catch (IllegalArgumentException e) {
						 System.out.println(e.getMessage());
						 System.out.print("AFP: ");
					 }
				 }


				 System.out.println("Sistema Salud (1 para Fonasa, 2 para Isapre):  ");
				 boolean sistemaSaludValido = false;

				 while(!sistemaSaludValido) {
					 try {
						 int sistemaSalud = getIntFromUser(inputs);
						 nuevoCliente.setSistemaSalud(sistemaSalud);
						 sistemaSaludValido = true;
					 } catch (InputMismatchException e) {
						 System.out.println("Sistema de salud inválido, inténtalo de nuevo.");
						 System.out.println("Sistema Salud (1 para Fonasa, 2 para Isapre):  ");
						 inputs.nextLine();
					 }
				 }
			     
			     
			     System.out.print("Direccion: ");
			     boolean direccionValida = false;

				 while(!direccionValida) {
					 try {
						 String direccion = inputs.nextLine();
						 nuevoCliente.setDireccion(direccion);
						 direccionValida = true;
					 } catch (IllegalArgumentException e) {
						 System.out.println(e.getMessage());
						 System.out.print("Direccion: ");
					 }
				 }

			     System.out.print("Comuna: ");
			     boolean comunaValida = false;

				 while(!comunaValida) {
					 try {
						 String comuna = inputs.nextLine();
						 nuevoCliente.setComuna(comuna);
						 comunaValida = true;
					 } catch (IllegalArgumentException e) {
						 System.out.println(e.getMessage());
						 System.out.print("Comuna: ");
					 }
				 }

				 System.out.println("Ingrese su edad: ");
				 boolean edadValida = false;

				 while(!edadValida) {
					 try {
						 int edad = getIntFromUser(inputs);
						 nuevoCliente.setEdad(edad);
						 edadValida = true;
					 } catch (InputMismatchException e) {
						 System.out.println("Edad inválida, inténtalo de nuevo.");
						 System.out.println("Ingrese su edad: ");
						 inputs.nextLine();
					 }
				 }

			     System.out.println("Cliente creado y almacenado exitosamente.");
				 System.out.println("Presiona enter para volver al menú principal");
				 inputs.nextLine();
			     break;

			 case 2:
				 while(true) {
					 try {
						 System.out.println("Ingrese el titulo");
						 profesional.setTitulo(inputs.nextLine());
						 break;

					 }catch(IllegalArgumentException e) {
						 System.out.println("El titulo no puede ser menor a 10 caracteres ni mayor a 50 caracteres");
					 }
				 }


				 Date fechaIngreso = null;
				 boolean fechaValidaZ = false;

				 do {
					 try {
						 System.out.print("Fecha de Ingreso (dd/MM/yyyy): ");
						 String fechaInput = inputs.nextLine();
						 fechaIngreso = new SimpleDateFormat("dd/MM/yyyy").parse(fechaInput);
						 profesional.setFechaIngreso(fechaIngreso);
						 fechaValidaZ = true;
					 } catch (ParseException e) {
						 System.out.println("Fecha inválida. Inténtalo de nuevo (dd/MM/yyyy).");
					 }
				 } while (!fechaValidaZ);



				 while(true) {
					 try {
						 System.out.println("Nombre del profesional");
						 profesional.setNombre(inputs.nextLine());
						 break;
					 }catch(IllegalArgumentException e) {
						 System.out.println("El nombre no puede ser menor a 10 caracteres ni mayor de 50 caracteres");
					 }
				 }



				 while(true) {
					 try {
						 System.out.println("Run del profesional");
						 profesional.setRun(getIntFromUser(inputs)) ;
						 break;
					 }catch(IllegalArgumentException e) {
						 System.out.println("ingrese un run valido");
					 }
				 }


				 Date fechaNacimientoProfesional = null;
				 boolean fechaValidaS = false;

				 do {
					 try {
						 System.out.print("Fecha de Nacimiento (dd/MM/yyyy): ");
						 String fechaInput = inputs.nextLine();
						 fechaNacimientoProfesional = new SimpleDateFormat("dd/MM/yyyy").parse(fechaInput);
						 profesional.setFechaNacimiento(fechaNacimientoProfesional);
						 fechaValidaS = true;
					 } catch (ParseException e) {
						 System.out.println("Fecha inválida. Inténtalo de nuevo (dd/MM/yyyy).");
					 }
				 } while (!fechaValidaS);

				 contenedor.almacenarProfesional(profesional);
				 System.out.println("Profesional creado y almacenado exitosamente.");
				 System.out.println("Presiona enter para volver al menú principal");
				 inputs.nextLine();
				 break;
			 case 3:

				 System.out.println("Ingrese el nombre del Administrativo: ");
				 boolean nombreValidoA = false;

				 while(!nombreValidoA) {
					 try {
						 String nombreAdministrativo = inputs.nextLine();
						 nuevoAdministrativo.setNombre(nombreAdministrativo);
						 nombreValidoA = true;
					 } catch (IllegalArgumentException e) {
						 System.out.println(e.getMessage());
						 System.out.println("Ingrese el nombre del Administrativo: ");
					 }
				 }

				 System.out.println("Ingrese el RUN del administrativo: ");
				 boolean runValidoA = false;

				 while(!runValidoA) {
					 try {
						 int runAdministrativo = getIntFromUser(inputs);
						 nuevoAdministrativo.setRun(runAdministrativo);
						 runValidoA = true;
					 } catch (IllegalArgumentException e) {
						 System.out.println(e.getMessage());
						 System.out.println("Ingrese el RUN del administrativo: ");
					 }
				 }

				 System.out.print("Fecha de Nacimiento (dd/MM/yyyy): ");
				 Date fechaNacimientoAdministrativo = null;
				 boolean fechaValidaA = false;

				 while (!fechaValidaA) {
					 try {
						 String fechaInput = inputs.nextLine();
						 fechaNacimientoAdministrativo = new SimpleDateFormat("dd/MM/yyyy").parse(fechaInput);
						 fechaValidaA = true;
					 } catch (ParseException e) {
						 System.out.println("Fecha inválida. Inténtalo de nuevo (dd/MM/yyyy).");
					 }
				 }


				 System.out.println("Ingrese el area del Administrativo:  ");
				 boolean areaValida = false;

				 while(!areaValida) {
					 try {
						 String area = inputs.nextLine();
						 nuevoAdministrativo.setArea(area);
						 areaValida = true;
					 } catch (IllegalArgumentException e) {
						 System.out.println(e.getMessage());
						 System.out.println("Ingrese el area del Administrativo:  ");
					 }
				 }

				 System.out.println("Ingrese la experiencia del Administrativo:  ");
				 boolean experienciaValida = false;

				 while(!experienciaValida) {
					 try {
						 String experiencia = inputs.nextLine();
						 nuevoAdministrativo.setExperencia(experiencia);
						 experienciaValida = true;
					 } catch (IllegalArgumentException e) {
						 System.out.println(e.getMessage());
						 System.out.println("Ingrese la experiencia del Administrativo:  ");
					 }
				 }

 			     contenedor.almacenarAdministrativo(nuevoAdministrativo);

 			     System.out.println("Administrativo creado y almacenado exitosamente.");
				 System.out.println("Presiona enter para volver al menú principal");
				 inputs.nextLine();
			     break;
			 case 4:

				 System.out.println("Ingrese el identificador de la capacitacion:  ");
				 boolean idCapValido = false;

				 while (!idCapValido) {
					 try {
						 int idCap = getIntFromUser(inputs);
						 nuevoCapacitacion.setIdentificador(idCap);
						 idCapValido = true;
					 } catch (IllegalArgumentException e) {
						 System.out.println(e.getMessage());
						 System.out.println("Ingrese el identificador de la capacitacion:  ");
					 }
				 }

				 System.out.println("Ingresa RUN del Cliente: ");
				 boolean runClienteValido = false;

				 while (!runClienteValido) {
					 try {
						 int runCliente = getIntFromUser(inputs);
						 nuevoCapacitacion.setRunCliente(runCliente);
						 runClienteValido = true;
					 } catch (IllegalArgumentException e) {
						 System.out.println(e.getMessage());
						 System.out.println("Ingresa RUN del Cliente: ");
					 }
				 }

				 System.out.println("Ingrese el nombre de la capacitacion:  ");
				 boolean nombreCapValido = false;

				 while (!nombreCapValido) {
					 try {
						 String nombreCap = inputs.nextLine();
						 nuevoCapacitacion.setNombreCap(nombreCap);
						 nombreCapValido = true;
					 } catch (IllegalArgumentException e) {
						 System.out.println(e.getMessage());
						 System.out.println("Ingrese el nombre de la capacitacion:  ");
					 }
				 }

				 System.out.println("Ingrese el dia de la Capacitación:  ");
				 boolean diaValido = false;

				 while (!diaValido) {
					 try {
						 String dia = inputs.nextLine();
						 nuevoCapacitacion.setDia(dia);
						 diaValido = true;
					 } catch (IllegalArgumentException e) {
						 System.out.println(e.getMessage());
						 System.out.println("Ingrese el dia de la Capacitación:  ");
					 }
				 }

				 System.out.println("Ingrese la hora de la Capacitación:  ");
				 boolean horaValida = false;

				 while (!horaValida) {
					 try {
						 String hora = inputs.nextLine();
						 nuevoCapacitacion.setHora(hora);
						 horaValida = true;
					 } catch (IllegalArgumentException e) {
						 System.out.println(e.getMessage());
						 System.out.println("Ingrese la hora de la Capacitación:  ");
					 }
				 }

				 System.out.println("Ingrese el lugar de la Capacitación:  ");
				 boolean lugarValido = false;

				 while (!lugarValido) {
					 try {
						 String lugar = inputs.nextLine();
						 nuevoCapacitacion.setLugar(lugar);
						 lugarValido = true;
					 } catch (IllegalArgumentException e) {
						 System.out.println(e.getMessage());
						 System.out.println("Ingrese el lugar de la Capacitación:  ");
					 }
				 }



				 System.out.println("Ingrese la duracion de la Capacitación:  ");
				 boolean duracionValida = false;

				 while (!duracionValida) {
					 try {
						 String duracion = inputs.nextLine();
						 nuevoCapacitacion.setDuracion(duracion);
						 duracionValida = true;
					 } catch (IllegalArgumentException e) {
						 System.out.println(e.getMessage());
						 System.out.println("Ingrese la duracion de la Capacitación:  ");
					 }
				 }

				 System.out.println("Ingrese cantidad de participantes: ");
				 boolean cantParticipantesValida = false;

				 while (!cantParticipantesValida) {
					 try {
						 int cantParticipantes = getIntFromUser(inputs);
						 nuevoCapacitacion.setCantAsistentes(cantParticipantes);
						 cantParticipantesValida = true;
					 } catch (IllegalArgumentException e) {
						 System.out.println(e.getMessage());
						 System.out.println("Ingrese cantidad de participantes: ");
					 }
				 }

 			     contenedor.almacenarCapacitacion(nuevoCapacitacion);
 			     System.out.println("Administrativo creado y almacenado exitosamente.");
				 System.out.println("Presiona enter para volver al menú principal");
				 inputs.nextLine();


 			     break;
				
			 case 5:
				 	System.out.println("Ingrese el run que desea eliminar: ");
				    int run1 = inputs.nextInt();
				 	inputs.nextLine();
				    contenedor.eliminarCliente(run1);
				    System.out.println("Cliente eliminado exitosamente");
				 	System.out.println("Presiona enter para volver al menú principal");
					inputs.nextLine();
			     break;
			 case 6:
				  contenedor.listarUsuarios();
				 System.out.println("Presiona enter para volver al menú principal");
				 inputs.nextLine();
			     break;
			 case 7:
				  System.out.println("Ingrese el tipo de usuario a listar:");
				  System.out.println("1. Cliente");
				  System.out.println("2. Profesional");
				  System.out.println("3. Administrativo");
				  
				  
				  int tipoUsuario = getIntFromUser(inputs);
				  switch(tipoUsuario) {
				  case 1:
					  System.out.println("Los Clientes son: ");
					  contenedor.listarClientes();
					  System.out.println("Presiona enter para volver al menú principal");
					  inputs.nextLine();
					  break;
				  case 2:
					  System.out.println("Los profesionales son: ");
					  contenedor.listarProfesionales();
					  System.out.println("Presiona enter para volver al menú principal");
					  inputs.nextLine();
					  break;
				  case 3:
					  System.out.println("Los Administrativos son: ");
					  contenedor.listarAdministrativo();
					  System.out.println("Presiona enter para volver al menú principal");
					  inputs.nextLine();
					  break;
				  default:
					  System.out.println("Opcion no valida");
				  }
			     break;
			 case 8:
			       contenedor.listarCapacitacion();
				   System.out.println("Presiona enter para volver al menú principal");
				   inputs.nextLine();
			     break;
			 case 9:
			     System.exit(0);

			 	}
			 
			}
			
		}
		
	}
	
}