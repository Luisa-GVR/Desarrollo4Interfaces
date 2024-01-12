public class Main implements aritmeticos{

    @Override
    public int suma(int a, int b) {
        return a + b;
    }

    @Override
    public int resta(int a, int b) {
        return a - b;
    }

    @Override
    public int multiplicacion(int a, int b) {
        return a * b;
    }

    @Override
    public int division(int a, int b) {
        if(b==0){
            return 0;
        } else {
            return a / b;
        }
    }

    public static void main(String[] args) {

        Main calculadora = new Main();

        System.out.println("Suma: " + (calculadora.suma(2, 2)));

        System.out.println("Resta: " + (calculadora.resta(2, 2)));

        System.out.println("Multiplicación: " + (calculadora.multiplicacion(2, 2)));

        System.out.println("División: " + (calculadora.division(2, 2)));


    }
}

interface aritmeticos{

    int suma(int a, int b);
    int resta(int a, int b);
    int multiplicacion(int a, int b);
    int division(int a, int b);

}
