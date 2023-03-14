package Ex9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class ConversorNumeracaoRomana {
    ArrayList<Integer> valoresArabes = new ArrayList<Integer>();
    ArrayList<String> valoresRomanos = new ArrayList<String>();

    String traducao = "";


    public ConversorNumeracaoRomana() {

        // Inserindo valores no HashMap
        Collections.addAll(valoresArabes, 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1);

        Collections.addAll(valoresRomanos, "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I");

    }

    public String converterNumero(int numero) {

        for (int i = 0; i < valoresArabes.size(); i++) {

            while (numero >= valoresArabes.get(i)) {

                numero = numero - valoresArabes.get(i);
                traducao += valoresRomanos.get(i);

            }

        }

        return traducao;
    }


}
