package grupal4;
import java.text.SimpleDateFormat;
import java.util.Date;


public class Profesional extends Usuario {
	private String titulo;
	private Date fechaIngreso;
	
	
	public Profesional () {
		super();
	}
	
	
	public Profesional(String titulo, Date fechaIngreso, String nombre, Date fechaNacimiento, int run) {
		super(nombre, fechaNacimiento, run);
		this.titulo = titulo;
		this.fechaIngreso = fechaIngreso;
	
	}
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		if(titulo.length() <= 10 || titulo.length() >= 50) {
			throw new IllegalArgumentException("El titulo no puede ser menor a 10 caracteres ni mayor a 50 caracteres");
		}
		this.titulo = titulo;
	}
	
	public Date getFechaIngreso() {
		return fechaIngreso;
	}
	
	public void setFechaIngreso(Date fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}
	
	
	
	public String getFechaIngresoString() {
		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
		return formato.format(fechaIngreso);
	}
	public void analizarUsuario() {
		System.out.println("Titulo: " + this.titulo + "\nFechaIngreso: " + this.fechaIngreso);
	}
	
}
