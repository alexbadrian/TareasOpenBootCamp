import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Main {
    public static void main(String[] args) {

        int numerolf = -20;

        if (numerolf == 0)
            System.out.println("0");
         if (numerolf > 0)
            System.out.println("positivo");
         if (numerolf < 0)
            System.out.println("negativo");

         int numeroWhile = 0;


         while (numeroWhile < 3) {
             System.out.println(numeroWhile);
             numeroWhile = numeroWhile + 1;
         }

         do {
             System.out.println(numeroWhile);
             numeroWhile = numeroWhile +3;
         } while (numeroWhile < 3);
        System.out.println(numeroWhile + " :aqui la prueba de que se ha ejecutado 1 vez y por tanto ha sumado solo 3");

        for (int numeroFor = 0; numeroFor <= 3; numeroFor = numeroFor +1) {
            System.out.println(numeroFor);
        }

        var estacion = "OTOÑO";

        switch (estacion) {

            case "PRIMAVERA":
                System.out.println("es primavera");
                break;
            case "OTOÑO":
                System.out.println("es otoño");
                break;
            case "INVIERNO":
                System.out.println("es invierno");
                break;
            case "VERANO":
                System.out.println("es verano");
                break;
            default:
                System.out.println("estacion no valida");
                break;
        }

        }
    }