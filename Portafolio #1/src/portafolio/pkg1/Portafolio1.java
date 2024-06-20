/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package portafolio.pkg1;
import javax.swing.JOptionPane;
/**
 *
 * @author danie
 */
public class Portafolio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //Contadores:
        int EM = 0;
        int EMP = 0;
        double SEM = 0;
        double IVM = 0;
        double Total = 0;
        // Definimos los string o las preguntas que le vamos hacer al usuario para que ingrese en pantalla

        String Welcome = "Calculador de Cuota CCSS ";
        String Employee = "Cantidad de Empleados: ";
        String Salary = "Ingrese el salario del empleado";
        String Result = "La empresa deberá abonar a la CCSS el monto de: ";
        String Rest = " ";
        //Imprimmos Welcome
        System.out.println(Welcome);
        //hacemos la logica del programa
        Employee = JOptionPane.showInputDialog(Employee);

        //pasamos los datos de string a int
        int Emplo = Integer.parseInt(Employee);

        for (int i = 0; i < Emplo; i++) {
            EM = EM + 1;
            Rest = JOptionPane.showInputDialog(Salary);
            double Sala = Integer.parseInt(Rest);
            SEM = Sala * 0.0925;
            IVM = Sala * 0.0508;
            Total = SEM + IVM;
            JOptionPane.showMessageDialog(null, Result + Total + " por concepto de SEM y IVM");
        }

    }
}
