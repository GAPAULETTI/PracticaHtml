package institutoAcademy;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Inscripcion {

    private Alumno alumno;
    private Materia materia;
    private LocalDateTime fecha;

    public Inscripcion(Alumno alumno, Materia materia) {
        this.alumno = alumno;
        this.materia = materia;
        this.fecha = LocalDateTime.now();
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public Materia getMateria() {
        return materia;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }
    public boolean aprobada() {

        return !this.materia.tieneCorrelativas() || this.materia.puedeCursar(this.alumno);
    }
}
