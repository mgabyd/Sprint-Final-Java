package grupal4;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Contenedor {

	private List<Asesoria>listaAsesoria;
	private List<Capacitacion>listaCapacitacion;
	
	public Contenedor() {
		this.listaAsesoria = new ArrayList<>();
		this.listaCapacitacion = new ArrayList<>();
	}
	
	Scanner inputs = new Scanner(System.in);
	
	public void almacenarCliente(Cliente cliente) {
		this.listaAsesoria.add(cliente);
	}
	
	public void almacenarProfesional(Profesional profesional) {
		this.listaAsesoria.add(profesional);
	}
	
	public void almacenarAdministrativo(Administrativo administrativo) {
		this.listaAsesoria.add(administrativo);
	}
	
	public void almacenarCapacitacion(Capacitacion capacitacion) {
		this.listaCapacitacion.add(capacitacion);
	}
	
	public void eliminarCliente(int rut) {
	    listaAsesoria.removeIf(asesoria -> (asesoria instanceof Cliente) && (((Cliente) asesoria).getRun() == rut));  
	    
	}
	
	public void listarUsuarios() {
		for(Asesoria asesoria : listaAsesoria) {
			asesoria.analizarUsuario();
		}
	}
	
	public void listarCapacitacion() {
		for(Capacitacion capacitacion : listaCapacitacion) {
			capacitacion.mostrarDetalle();
		}
	}
	
	public void listarClientes() {
		for (Asesoria asesoria : listaAsesoria) {
			if (asesoria instanceof Cliente) {
				((Cliente)asesoria).analizarUsuario();
			}
		}
	}
	
	public void listarProfesionales() {
		for(Asesoria asesoria : listaAsesoria) {
			if (asesoria instanceof Profesional) {
				((Profesional)asesoria).analizarUsuario();
			}
		}
	}
	
	public void listarAdministrativo() {
		for(Asesoria asesoria : listaAsesoria) {
			if(asesoria instanceof Administrativo) {
				((Administrativo)asesoria).analizarUsuario();	
			}
		}
	}
	
	

	
	  
	
}