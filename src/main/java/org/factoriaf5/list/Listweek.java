package org.factoriaf5.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Listweek {
    private List<String> dias;

    // Método para crear la lista de los días de la semana
    public void crearListaDias() {
        dias = new ArrayList<>();
        dias.add("Lunes");
        dias.add("Martes");
        dias.add("Miércoles");
        dias.add("Jueves");
        dias.add("Viernes");
        dias.add("Sábado");
        dias.add("Domingo");
    }

    // Método que retorna los días de la semana
    public List<String> getDias() {
        return dias;
    }

    // Método que retorna el largo de la lista
    public int getLargoLista() {
        return dias.size();
    }

    // Método para eliminar un día de la semana
    public void eliminarDia(String dia) {
        dias.remove(dia);
    }

    // Método que retorna el día de la semana solicitado
    public String getDia(int index) {
        if (index >= 0 && index < dias.size()) {
            return dias.get(index);
        } else {
            return "Índice fuera de rango";
        }
    }

    // Método que retorna si el día solicitado existe en la lista
    public boolean existeDia(String dia) {
        return dias.contains(dia);
    }

    // Método para ordenar la lista de días por orden alfabético
    public void ordenarDias() {
        Collections.sort(dias);
    }

    // Método para vaciar la lista
    public void vaciarLista() {
        dias.clear();
    }
}
