package grupal4;
import java.util.Date;


public class Cliente extends Usuario {
    private String nombre;
    private String apellido;
    private String telefono;
    private String afp;
    private int sistemaSalud;
	private int run;
	private String comuna;
	private String direccion;
	private int edad;
	
	
	

    public Cliente() {
		super();
		
	}


	public Cliente(String nombre, String apellido, Date fechaNacimiento, int run, String telefono, String afp,
			int sistemaSalud, String comuna, String direccion, int edad) {
		super(nombre, fechaNacimiento, run);
		this.nombre = nombre;
		this.apellido = apellido;
		this.telefono = telefono;
		this.afp = afp;
		this.sistemaSalud = sistemaSalud;
		this.run = run;
		this.comuna = comuna;
		this.direccion = direccion;
		this.edad = edad;
	}


	public void setRun(int run) {
		if (run >=999999999) {
		throw new IllegalArgumentException("El run no puede ser mayor a 99.999.999");
		}
		this.run = run;
    }
		
    public void setNombre(String nombre) {
		if(nombre.length() <5 || nombre.length() >30) {
			throw new IllegalArgumentException("El nombre no puede ser menor a 5 caracteres ni mayor de 30 caracteres");
		}
		this.nombre = nombre;
	}
    
    public void setApellido(String apellido) {
		if(apellido.length() <5 ||apellido.length() >30) {
			throw new IllegalArgumentException("El apellido no puede ser menor a 5 caracteres ni mayor de 30 caracteres");
		}
		this.apellido = apellido;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		if(telefono.length() <=1 || telefono.length() >9){
			throw new IllegalArgumentException("El telefono es obligatorio y debe ser menor de 9 caracteres");
		}

		this.telefono = telefono;
		
	}
	
	public String getAfp() {
		return afp;
	}
	public void setAfp(String afp) {
		if(afp.length() <=4 || afp.length() >30){
			throw new IllegalArgumentException("Ingrese una AFP valida entre 4 y 30 caracteres: ");
		}

		this.afp = afp;
		
	}
	
	public int getEdad() {
		return edad;
	}
	
	public void setEdad(int edad) {
		if(edad <18 || edad >100){
			throw new IllegalArgumentException("La edad debe ser mayor a 18 y menor a 100");
		}
		this.edad = edad;
	}
	
	public int getSistemaSalud() {
		return sistemaSalud;
	}
	
	public void setSistemaSalud(int sistemaSalud) {
		if(sistemaSalud != 1 && sistemaSalud != 2) {
		throw new IllegalArgumentException("El sistema de salud debe ser (1) para FONASA o (2) para Isapre");
		}

		this.sistemaSalud = sistemaSalud;
	}
	
	
	public String getNombre() {
		return nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public int getRun() {
		return run;
	}
	public String getComuna() {
		return comuna;
	}
	public void setComuna(String comuna) {
		if(comuna.length() >50){
			throw new IllegalArgumentException("La comuna no puede ser mayor de 50 caracteres");
		}

		this.comuna = comuna;
	}
	public String getDireccion() {
		return direccion;
	}
	
	public void setDireccion(String direccion) {
		if(direccion.length() >70){
			throw new IllegalArgumentException("La direccion no puede ser mayor de 70 caracteres");
	}
		this.direccion = direccion;
    }
	


	
		
		
		
		
	}

	
	
		
   