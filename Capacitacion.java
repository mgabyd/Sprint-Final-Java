package grupal4;

public class Capacitacion extends Usuario {
    private int identificador;
    private int runCliente;
    private String nombreCap;
    private String dia;
    private String hora;
    private String lugar;
    private String duracion;
    private int cantAsistentes;
    
	public Capacitacion() {
	}

	public Capacitacion(int identificador, int runCliente, String nombreCap,String dia, String hora, String lugar, String duracion,
			int cantAsistentes) {
		if (lugar == null || lugar.length() < 10 || lugar.length() > 50) { 
			throw new IllegalArgumentException("Lugar debe tener entre 10 y 50 caracteres");
		}
		if (duracion != null && duracion.length() > 70) {
			throw new IllegalArgumentException("La duracion no debe superar los 70 caracteres");
		}
		if (cantAsistentes <0 || cantAsistentes > 1000) {
			throw new IllegalArgumentException("La cantidad de asistentes no puede superar los 1000");
		}
		this.nombreCap = nombreCap;
		this.identificador = identificador;
		this.runCliente = runCliente;
		this.dia = dia;
		this.hora = hora;
		this.lugar = lugar;
		this.duracion = duracion;
		this.cantAsistentes = cantAsistentes;
	}
	
	

	public int getRunCliente() {
		return runCliente;
	}

	public void setRunCliente(int runCliente) {
		this.runCliente = runCliente;
	}

	public String getNombreCap() {
		return nombreCap;
	}

	public void setNombreCap(String nombreCap) {
		this.nombreCap = nombreCap;
	}

	public int getIdentificador() {
		return identificador;
	}

	public void setIdentificador(int identificador) {
		this.identificador = identificador;
	}

	public int getRutCliente() {
		return runCliente;
	}

	public void setRutCliente(int rutCliente) {
		this.runCliente = rutCliente;
	}

	public String getDia() {
		return dia;
	}

	public void setDia(String dia) {
		this.dia = dia;
	}

	public String getHora() {
		return hora;
	}

	public void setHora(String hora) {
		this.hora = hora;
	}

	public String getLugar() {
		return lugar;
	}

	public void setLugar(String lugar) {
		this.lugar = lugar;
	}

	public String getDuracion() {
		return duracion;
	}

	public void setDuracion(String duracion) {
		this.duracion = duracion;
	}

	public int getCantAsistentes() {
		return cantAsistentes;
	}

	public void setCantAsistentes(int cantAsistentes) {
		this.cantAsistentes = cantAsistentes;
	}
	
	public void mostrarDetalle() {
		System.out.println("la capacitacion sera en " + this.lugar + " a las " + this.hora + "  del dia " +  this.dia + " y dura" + this.duracion);
	}

	@Override
	public String toString() {
		return "Capacitacion [identificador=" + identificador + ", runCliente=" + runCliente + ", nombreCap="
				+ nombreCap + ", dia=" + dia + ", hora=" + hora + ", lugar=" + lugar + ", duracion=" + duracion
				+ ", cantAsistentes=" + cantAsistentes + "]";
	}

	
	

}