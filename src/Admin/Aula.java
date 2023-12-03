package Admin;
import java.time.LocalDateTime;

public class Aula {
    private String tipo;
    private String horario;
    private String reservador;
    private int numParticipantes;
    private LocalDateTime dataRegistro;

    public Aula(String tipo, String horario, String reservador, int numParticipantes) {
        this.tipo = tipo;
        this.horario = horario;
        this.reservador = reservador;
        this.numParticipantes = numParticipantes;
        this.dataRegistro = LocalDateTime.now();
    }

    public String getTipo() {
        return tipo;
    }

    public String getHorario() {
        return horario;
    }

    public String getReservador() {
        return reservador;
    }

    public int getNumParticipantes() {
        return numParticipantes;
    }

    public LocalDateTime getDataRegistro() {
        return dataRegistro;
    }
}
