/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pantalla;

/**
 *
 * @author Estudiante
 */
public class operaciones {

    public static double calcular(double numero1, javax.swing.JTextField barraCalculadora, Mkicalcualdora pantalla) {
        double numero2 = SegundoNro(barraCalculadora);
        double resultado = 0;

        if (pantalla.sumando) {
            resultado = numero1 + numero2;
            pantalla.sumando = false;
        } else if (pantalla.restando) {
            resultado = numero1 - numero2;
            pantalla.restando = false;
        } else if (pantalla.multiplicacion) {
            resultado = numero1 * numero2;
            pantalla.multiplicacion = false;
        } else if (pantalla.dividiendo) {
            if (numero2 != 0) {
                resultado = numero1 / numero2;
            } else {
                barraCalculadora.setText("Error: Div/0"); 
                return 0; 
            }
            pantalla.dividiendo = false;
        }

        return resultado;
    }

    public static double PrimerNroyBorrar(javax.swing.JTextField barraCalculadora) {
        String texto = barraCalculadora.getText();
        barraCalculadora.setText(""); 
        try {
            return Double.parseDouble(texto);
        } catch (NumberFormatException e) {
            System.out.println("Entrada no válida: " + texto);
            return 0; 
        }
    }

    public static double SegundoNro(javax.swing.JTextField barraCalculadora) {
        String texto = barraCalculadora.getText();
        barraCalculadora.setText(""); 
        try {
            return Double.parseDouble(texto);
        } catch (NumberFormatException e) {
            System.out.println("Entrada no válida: " + texto);
            return 0; 
        }
    }

    public static void limpiarCalculadora(javax.swing.JTextField barraCalculadora, Mkicalcualdora pantalla) {
        barraCalculadora.setText(""); 
        pantalla.sumando = false;
        pantalla.restando = false;
        pantalla.multiplicacion = false;
        pantalla.dividiendo = false;
        pantalla.numero1 = 0;
    }
}