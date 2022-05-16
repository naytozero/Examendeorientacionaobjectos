
package notas;
import java.util.Scanner;
public class NOTAS {
public static void main(String[] args) {
    
Scanner entrada = new Scanner (System.in);
float participacion, primerexamen, segundoexamen, examenfinal, promediofinal; {
System.out.print("Digite la nota del primer estudiante");
participacion = entrada.nextFloat();
System.out.print("Digite la nota del primer examen ");
primerexamen = entrada.nextFloat();
System.out.print("Digite la nota del segundo examen ");
segundoexamen = entrada.nextFloat();
System.out.print("Digite la nota del ultimo examen");
examenfinal =entrada.nextFloat();
participacion*= 0.10f;
primerexamen *= 0.25f;
segundoexamen *= 0.25f;
examenfinal *= 0.40f;
promediofinal = participacion + primerexamen + segundoexamen + examenfinal;
System.out.println("La nota final del primer estudiante es; "+promediofinal);
      
    }
    
}
}
