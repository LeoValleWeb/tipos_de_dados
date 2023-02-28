public class Balango_trimestral {
    public static void main(String[] leleo) {
       int gastosJaneiro = 15000;
       int gastosFevereiro = 23000;
       int gatosMarco = 17000;
       int gastosTrimestre = gastosJaneiro + gastosFevereiro + gatosMarco;

       int mediaGastos = gastosTrimestre / 3;

       System.out.println("Os gastos trimestrais são: "+gastosTrimestre);
       System.out.println("A média dos gastos trimestrais são: "+mediaGastos);
    }
}
