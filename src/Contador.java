import java.util.InputMismatchException;
import java.util.Scanner;


public class Contador {
    public static void main(String[] args) {
        boolean validar = false;
        while (!validar){
            try{
                Scanner scanner = new Scanner(System.in);
                System.out.println("Insira o primeiro número");
                int numeroUm = scanner.nextInt();

                System.out.println("Insira o segundo número");
                int numeroDois = scanner.nextInt();

                contar(numeroUm, numeroDois);
                validar = true;
            } catch (ParametrosInvalidosException e){
                System.out.println(e.getMessage());
            } catch (InputMismatchException e){
                System.out.println("Insira apenas números inteiros");
            }
        }

    }

    static void contar(int numeroUm, int numeroDois) throws ParametrosInvalidosException{
        if (numeroDois < numeroUm){
            throw new ParametrosInvalidosException("O segundo número precisa ser maior que o primeiro");
        }
        int valorIteracao = numeroDois - numeroUm;
        for (int i = 1; i <= valorIteracao; i++) {
            System.out.println("Imprimindo o número " + i);
        }
    }
}
