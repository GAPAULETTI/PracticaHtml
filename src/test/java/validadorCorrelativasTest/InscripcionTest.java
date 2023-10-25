package validadorCorrelativasTest;

import institutoAcademy.Alumno;
import institutoAcademy.Inscripcion;
import institutoAcademy.Materia;
import org.junit.Assert;
import org.junit.Test;

public class InscripcionTest {

    @Test
    public  void juanSePuedeAnotarEnProg1(){
        Alumno juan = new Alumno("Juan", "Abc123");
        Materia programacion1 = new Materia("ProgramacionI");
        Inscripcion inscripcionJuanToProg1 = new Inscripcion(juan, programacion1);

        Materia programacion2 = new Materia("Programacion II");
        programacion2.agregarCorrelativa(programacion1);

        juan.agregarAprobada(programacion1);

        Inscripcion inscripcionJuanToProg2 = new Inscripcion(juan, programacion2);

        Assert.assertTrue(inscripcionJuanToProg1.aprobada());
        Assert.assertTrue(inscripcionJuanToProg2.aprobada());
    }
}
