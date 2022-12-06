public class Main {
    public static void main(String[] args) {
        Coche miCoche = new Coche();

        int resultado;
        resultado = suma(10, 20, 30);
        System.out.println(resultado);

        miCoche.incrementarPuertas();
        System.out.println(miCoche.nuemeroDePuertas);

    }

    public static int suma(int a, int b, int c){
        return a + b + c;
    }
}

