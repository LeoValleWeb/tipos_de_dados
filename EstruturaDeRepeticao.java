public class EstruturaDeRepeticao {
    public static void main(String args[]){

        //Exemplo
        /*for(int i=0; i<17;i++){
            System.out.println(i);
        } */

        //AT1
        /*for(int i=150; i<=300;i++){
            System.out.println(i);
        } */

        //AT2
        /*int soma = 0;
        for(int i=1; i<=1000;i++){
            soma=soma + i;  
        }
        System.out.println(soma); */

        //AT3
        /*for(int i=3; i<=100;i+=3){
            System.out.println(i);
        } */

        //AT4
        int fat = 1;
        for(int i=1; i<=10;i++){
            fat *= i;
            System.out.println("Fatorial de " +i+ " = " +fat);
        }
    }
}