 import java.util.Scanner;

public class OperadorCalc {
    public static void main(String[] leleo) {
        Scanner entrada = new Scanner(System.in);
        int numero1;
        int numero2;
        int soma;
        int mult;
        double divis;
        int resto;
        int sub;

        System.out.println("Digite um número");
        numero1=entrada.nextInt();
        System.out.println("Digite um número");
        numero2=entrada.nextInt();

        soma=numero1+numero2;
        System.out.println("A soma de dois números é: "+ soma);
        mult=numero1*numero2;
        System.out.println("A multiplicação de dois números é: "+ mult);
        divis=numero1/numero2;
        System.out.println("A divisão de dois números é: "+ divis);
        resto=numero1%numero2;
        System.out.println("O resto da divisão de dois números é: "+ resto);
        sub=numero1-numero2;
        System.out.println("A multiplicação de dois números é: "+ sub);
        

   }
}
