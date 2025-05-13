package tudelft.sum;

import java.util.ArrayList;
import java.util.Collections;

// Source: https://leetcode.com/problems/add-two-numbers/description/
import java.util.ArrayList;
import java.util.Collections;

public class TwoNumbersSum {

    public ArrayList<Integer> addTwoNumbers(ArrayList<Integer> first, ArrayList<Integer> second) {
        // Se invierten las listas para facilitar la suma de dígitos desde las unidades.
        Collections.reverse(first);
        Collections.reverse(second);

        int complement = 0;
        ArrayList<Integer> result = new ArrayList<>();

        // Iterar sobre el tamaño máximo de las dos listas.
        for (int i = 0; i < Math.max(first.size(), second.size()); i++) {
            // Obtener el valor de cada número en la posición i, si no hay valor se asume 0.
            int firstVal = i < first.size() ? first.get(i) : 0;
            int secondVal = i < second.size() ? second.get(i) : 0;

            // Sumar los valores y el complemento (acarreo).
            int total = firstVal + secondVal + complement;

            // Si la suma es 10 o más, hay que manejar el complemento.
            if (total >= 10) {
                complement = 1;  // El complemento será 1 en el siguiente ciclo.
                total -= 10;     // Restamos 10 para guardar solo la unidad.
            } else {
                complement = 0;
            }

            // Añadir el resultado a la lista.
            result.add(total);
        }

        // Si al final queda un complemento, lo agregamos.
        if (complement > 0) {
            result.add(complement);
        }

        // Se invierte la lista para devolver el número en orden correcto.
        Collections.reverse(result);
        return result;
    }
}
