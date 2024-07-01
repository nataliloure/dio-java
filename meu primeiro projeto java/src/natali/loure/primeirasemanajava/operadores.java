public class operadores {

    public static void main(String[] args) {
      String nomeUm = "NATALI";
      String nomeDois = "LOURE";

      System.out.println(nomeUm.equals(nomeDois));

      int numero1 = 1;
      int numero2 = 2;

      boolean simNao = numero1 == numero2;

      if (numero1 == numero2){ //true
        System.out.println("nossa condição é verdadeira");
      }

      System.out.println("numeroUm é igual ao numeroDois?" + simNao );
      
      simNao = numero1 != numero2;

      System.out.println("numeroUm é diferente a numeroDois?" + simNao);

      simNao = numero1 > numero2;
    }
    
}
