package grupal4;

public class VisitaEnTerreno extends Accidente{
    private int idVisita;
    private String comentarios;

    public VisitaEnTerreno(String run,int idVisita, String comentarios, String dia, String hora, String lugar) {
        super(run, dia, hora, lugar);
        this.idVisita = idVisita;
        this.comentarios = comentarios;
    }


    public String toString () {
        return "VisitaEnTerreno:" + "idVisita:" + idVisita + ", comnetarios:" + comentarios;
    }

    // Getters & Setters
    public int getIdVisita() {
        return idVisita;
    }
    public void setIdVisita(int idVisita) {
        if (idVisita > 0) {
            this.idVisita = idVisita;
        } else {
            System.out.println("Debes ingresar un id de visita");
        }
    }
    public String getComentarios() {
        return comentarios;
    }
    public void setComentarios(String comentarios) {
        if (comentarios.length() <= 100) {
            this.comentarios = comentarios;
        } else {
            System.out.println("Los comentarios no pueden ser mayor a 100 caracteres");
        }
    }
}
