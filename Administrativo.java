package grupal4;
import java.util.Date;

public class Administrativo extends Usuario{
	private String area;
	private String experiencia;
	
	public Administrativo(String nombre, Date fechaNacimiento, int run,String area, String experiencia) {
		super(nombre, fechaNacimiento, run);
		this.area = area;
		this.experiencia = experiencia;
	}

	public Administrativo () {

	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		if(area.length() <= 5 || area.length() >= 20) {
			throw new IllegalArgumentException("El area no puede ser menor a 5 caracteres ni mayor a 20 caracteres");
		}
		this.area = area;
	}
	public String getExperiencia() {
		return experiencia;
	}
	public void setExperencia(String experiencia) {
		if(experiencia.length() >= 100) {
			throw new IllegalArgumentException("La experiencia no puede ser mayor a 100 caracteres");
		}
		this.experiencia = experiencia;
	}
	
	
	
	@Override
	public String toString() {
		return "Administrativo [area=" + area + ", experiencia=" + experiencia + "]";
	}
	public void analizarUsuario() {

		System.out.println("Area: " + this.area + "\nExperiencia: " + this.experiencia);
	}
	
}










