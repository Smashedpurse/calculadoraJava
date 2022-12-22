import javax.swing.*;

public class calculadoraJava {
    public static void main(String[] args) {

        //INGRESO DE DATOS
        String Operacion = JOptionPane.showInputDialog("Ingresa la operación que deseas realizar");
        String NUM1 = JOptionPane.showInputDialog("Ingresa el primer número");
        String NUM2 = JOptionPane.showInputDialog("Ingresa el segundo número");

        //DECLARACION DE VARIABLES FLOAT PARA EL INGRESO DE NUMEROS CON DECIMAL A PARTIR DE UN STRING
        float num1 = Float.parseFloat(NUM1);
        float num2 = Float.parseFloat(NUM2);

        //APLICACION DE OPERADORES ARITMETICOS
        float resultadoSuma = num1 + num2;
        float resultadoResta = num1 - num2;
        float resultadoDivision = num1 / num2;
        float resultadoMultipliacion = num1 * num2;

        //APLICACION DE SWITCH PARA DETERMINAR EL PROCESO ARITMETICO
        switch (Operacion) {
            case "suma" :
                JOptionPane.showMessageDialog(null,"El resultado de la suma es " + resultadoSuma);
                break;
            case "resta" :
                JOptionPane.showMessageDialog(null,"El resultado de la resta es " + resultadoResta);
                break;
            case "multiplicacion" :
                JOptionPane.showMessageDialog(null,"El resultado de la multiplicacion es " + resultadoMultipliacion);
                break;
            case "division" :
                if(num2 == 0){
                    JOptionPane.showMessageDialog(null,"No es posible dividir entre 0");
                }else {
                    JOptionPane.showMessageDialog(null, "El resultado de la division es " + resultadoDivision);
                    break;
                }
        }
    }
}
