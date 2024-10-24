/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package estudiantes;

/**
 *
 * @author lalej
 * 
 * objetivo = mostrar en pantalla los estudiantes digitados x el usuario;
 */
import javax.swing.*;
public class Estudiantes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int cantidadEstudiantes;
        String estudiantes = "";
        
        cantidadEstudiantes = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de alumnos que desea guardar"));
        
        for(int i = 0; i < cantidadEstudiantes;i++ ){
            estudiantes += "\n"+JOptionPane.showInputDialog("Digite el alumno #"+(i + 1));
        
        }
        
        JOptionPane.showMessageDialog(null, """
                                            Estudiantes
                                            """+estudiantes);
        
        //Otra forma
        //JOptionPane.showMessageDialog(null,"Estudiantes"+"\n"+estudiantes);
    }
    
}
