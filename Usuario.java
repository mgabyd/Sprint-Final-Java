package grupal4;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.time.Period;
import java.time.ZoneId;
import java.time.LocalDate;

public abstract class Usuario implements Asesoria {
    private String nombre;
    private Date fechaNacimiento;
    private int run;
    
    public Usuario() {
    	
    }
    

    public Usuario(String nombre, Date fechaNacimiento, int run) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.run = run;
    }

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		if(nombre.length() <10 || nombre.length() >50) {
			throw new IllegalArgumentException("El nombre no puede ser menor a 10 caracteres ni mayor de 50 caracteres");
		}
		this.nombre = nombre;
	}

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	
	public String getFechaNacimientString() {
		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
		return formato.format(fechaNacimiento);
		}

	public int getRun() {
		return run;
	}

	public void setRun(int run) {
		if (run >= 999999999) {
		throw new IllegalArgumentException("El run no puede ser mayor a 100.000.000");	
		}
		this.run = run;
	}

	@Override
	public void analizarUsuario() {
		System.out.println("Nombre:"+ getNombre() + "\nRUN: " + getRun() + "\n-----------------------------------------");
	}
	
	public void mostrarEdad(){
		LocalDate fechaNacimientoLocal = fechaNacimiento.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
		LocalDate fechaActual = LocalDate.now();
		Period periodo = Period.between(fechaNacimientoLocal, fechaActual);
		int edad = periodo.getYears();
		
		System.out.println("Edad: "+ edad + " años" );
		
	}
	}
