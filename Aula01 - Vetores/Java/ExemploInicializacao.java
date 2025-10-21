// declaração e alocação na mesma instrução

//int vetor [] = new int [12]

// declaração e alocação em instruções distintas

// int [] array;
// array = new int[5];

// inicialização direta
// int[] valor = {10,20,30,40,50}/

public class ExemploInicializacao {
  public static void main(String[] args) {
    int[] numeros = new int[3];
    boolean[] flags = new boolean[2];
    String[] nomes = new String[3];

    System.out.println(numeros[0]); // 0
    System.out.println(flags[1]); // false
    System.out.println(nomes[2]); // null
  }
}

class Teste1 {

}