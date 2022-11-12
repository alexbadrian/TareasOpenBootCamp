public class Main {
    public static void main(String[] args) {
        int resultado;
        resultado = suma(230,30,20);

        System.out.println(resultado);

        coche numerodepuertas = new coche();
        numerodepuertas.anadirpuerta();
        System.out.println(numerodepuertas.puertas);
    }
    public static int suma(int a, int b,int c) {
        return a + b + c;
    }
}
class coche {
    public int puertas = 4;
    public void anadirpuerta() {
        this.puertas++;
    }

}

