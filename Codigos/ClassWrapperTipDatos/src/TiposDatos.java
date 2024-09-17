import javax.swing.*;

public class TiposDatos {

    public static void main(String[] args) {

        int input = Integer.parseInt(JOptionPane.showInputDialog(null,
                "Buenos Días, ¿Qué tipo de dato desea ver primero? \n 1. Primitivos\n 2. Objetos / Referencia"));

        while (input < 1 || input > 2) {
            input = Integer.parseInt(JOptionPane.showInputDialog(null, "Opción inválida. Por favor, elija:\n 1. Primitivos\n 2. Objetos / Referencia"));
        }

        switch (input) {
            case 1:
                JOptionPane.showMessageDialog(null,
                        "Tipos de datos primitivos:\n" +
                                "• byte: Almacena enteros de 8 bits. (Rango: -128 a 127)\n" +
                                "• short: Almacena enteros de 16 bits. (Rango: -32,768 a 32,767)\n" +
                                "• int: Almacena enteros de 32 bits. (Rango: -2,147,483,648 a 2,147,483,647)\n" +
                                "• long: Almacena enteros de 64 bits. (Rango: -9,223,372,036,854,775,808 a 9,223,372,036,854,775,807)\n" +
                                "• float: Almacena números decimales de precisión simple de 32 bits. (Rango: ±1.4E-45 a ±3.4E38)\n" +
                                "• double: Almacena números decimales de precisión doble de 64 bits. (Rango: ±4.9E-324 a ±1.8E308)\n" +
                                "• char: Almacena un solo carácter Unicode de 16 bits. (Rango: 'u0000' a 'uffff' '\u0000' a '\uffff')\n" +
                                "• boolean: Almacena valores lógicos true o false.");
                break;

            case 2:
                JOptionPane.showMessageDialog(null,
                        "Tipos de datos de objetos / referencia, no primitivos:\n" +
                                "• Clases: Definidas por el usuario o proporcionadas por Java, como String, ArrayList, etc.\n" +
                                "• Interfaces: Contratos que las clases deben cumplir.\n" +
                                "• Arrays: Estructuras que almacenan múltiples valores del mismo tipo.\n" +
                                "• Enum: Conjuntos de constantes.\n" +
                                "• Colecciones: Incluyen Listas (ArrayList), Conjuntos (HashSet), Mapas (HashMap), etc.");
                break;
        }
    }
}
