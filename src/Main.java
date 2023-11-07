import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        //Ejercicio 1: Implemente un método que reciba como parámetro una lista de strings y devuelva una nueva
        //lista con los strings en mayúscula.
        List<String> lista = new ArrayList<>();
        lista.add("Jose");
        lista.add("Juana");
        lista.add("Roberto");
        lista.add("Maria");
        List<String> laNuevaLista = Ejercicio1.convierteAMayusc(lista);
        System.out.println("laNuevaLista = " + laNuevaLista);

        //Ejercicio2: Implementar un método que reciba como parámetro una lista de strings y un entero "n". El
        //método debe devolver un String que concatene separando por coma y espacio todas las
        //palabras, en la lista, que tengan más de "n" caracteres
        String nuevoString = Ejercicio2.concatena(lista, 4);
        System.out.println("nuevoString = " + nuevoString);

    }
        public class Ejercicio1 {
            public static List<String> convierteAMayusc(List<String> listaString) {
                List<String> listaEnMayusc = listaString.stream().map(palabra -> palabra.toUpperCase()).collect(Collectors.toList());
                return listaEnMayusc;
            }
        }
        public class Ejercicio2{
            public static String concatena(List<String> listaString, int n){
                List<String> stringAconcatenar = listaString.stream()
                        .filter((cadena -> cadena.length() > n))
                        .collect(Collectors.toList());
                String stringConcatenado = stringAconcatenar.stream().collect(Collectors.joining(", "));
                        return stringConcatenado;
            }

        }
    }
