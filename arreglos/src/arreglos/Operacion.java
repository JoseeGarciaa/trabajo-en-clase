package arreglos;

import java.util.Scanner;

public class Operacion {
	
	
	Scanner sc = new Scanner (System.in);
	private  Alumno[] listAlumno = new Alumno[2];
	private Alumno alumno = new Alumno();
			
public void crearAlumno() {
	for (int i=0;i<listAlumno.length;i++) {
		
	System.out.println("ingresar el nombre");
	alumno.setNombre(sc.next());
	
	System.out.println("ingrese el apellido");
	alumno.setApellido(sc.next());
	
	System.out.println("ingrese la nota");
    alumno.setNota(sc.nextDouble());
    
    llenarArreglo(alumno, i);

}

}

public void llenarArreglo (Alumno alumno, int i) {
	
	listAlumno [i] = alumno;
	
}

public void mostrarAlumnoNotasMasAlta() {
	for (int i = 0; i < this.listAlumno.length; i++) {
	System.out.println(listAlumno);
}
	
}



}
