package grupal4;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Accidente extends Cliente{

    private int identificador;
    private String dia;
    private String hora;
    private String lugar;
    private String origen;
    private String consecuencias;

   

    public Accidente(int identificador, String dia, String hora, String lugar, String origen, String consecuencias) {
		super();
		this.identificador = identificador;
		this.dia = dia;
		this.hora = hora;
		this.lugar = lugar;
		this.origen = origen;
		this.consecuencias = consecuencias;
	}

    
    
    
    
	public Accidente() {
        super();
    }


    // Constructor para VisitaEnTerreno
    public Accidente(String run, String dia, String hora, String lugar) {
    }

    public String toString() {
        return "Accidente" +
                "identificador=" + identificador +
                ", dia='" + dia + '\'' +
                ", hora='" + hora + '\'' +
                ", lugar='" + lugar + '\'' +
                ", origen='" + origen + '\'' +
                ", consecuencias='" + consecuencias + '\'';
    }

    // Getters & Setters
    public int getIdentificador() {
        return identificador;
    }
    public void setIdentificador(int identificador) {
        if (identificador > 0) {
            this.identificador = identificador;
        } else {
            System.out.println("El identificador debe ser mayor a 0");
        }
    }
    public String getDia() {
        return dia;
    }
    public void setDia(String dia) {
        SimpleDateFormat formatoEntrada = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat formatoSalida = new SimpleDateFormat("dd/MM/yyyy");
        try {
            Date fecha = formatoEntrada.parse(dia);
            this.dia = formatoSalida.format(fecha);
        } catch (ParseException e) {
            System.out.println("Error al analizar la fecha.");
        }
    }
    public String getHora() {
        return hora;
    }
    public void setHora(String hora) {
        if (hora.length() == 5) {
            String[] horaMinutos = hora.split(":");
            int horaInt = Integer.parseInt(horaMinutos[0]);
            int minutosInt = Integer.parseInt(horaMinutos[1]);
            if (horaInt >= 0 && horaInt <= 23 && minutosInt >= 0 && minutosInt <= 59) {
                this.hora = hora;
            } else {
                System.out.println("La hora debe ser entre 00:00 y 23:59");
            }
        } else {
            System.out.println("La hora debe ser en formato HH:MM");
        }
    }
    public String getLugar() {
        return lugar;
    }
    public void setLugar(String lugar) {
        if (lugar != null && !lugar.isEmpty()) {
            if (lugar.length() >= 10 && lugar.length() <= 50) {
                this.lugar = lugar;
            } else {
                System.out.println("El lugar debe tener entre 10 y 50 caracteres");
            }
        } else {
            System.out.println("El lugar no puede ser nulo o vacio");
        }
    }
    public String getOrigen() {
        return origen;
    }
    public void setOrigen(String origen) {
        if (origen != null && !origen.isEmpty()) {
            if (origen.length() >= 10 && origen.length() <= 100) {
                this.origen = origen;
            } else {
                System.out.println("El origen debe tener entre 10 y 100 caracteres");
            }
        } else {
            System.out.println("El origen no puede ser nulo o vacio");
        }
    }
    public String getConsecuencias() {
        return consecuencias;
    }
    public void setConsecuencias(String consecuencias) {
        if (consecuencias != null && !consecuencias.isEmpty()) {
            if (consecuencias.length() >= 10 && consecuencias.length() <= 100) {
                this.consecuencias = consecuencias;
            } else {
                System.out.println("Las consecuencias deben tener entre 10 y 100 caracteres");
            }
        } else {
            System.out.println("Las consecuencias no pueden ser nulas o vacias");
        }
    }
    
    
}









