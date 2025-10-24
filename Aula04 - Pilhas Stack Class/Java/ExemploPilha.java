import java.util.Stack;

public class ExemploPilha {
  public static void main(String[] args) {

    // criação da pilha
    Stack<String> pilha = new Stack<>();

    // empilhando elementos
    pilha.push("A");
    pilha.push("B");
    pilha.push("C");

    System.out.println("Pilha atual: " + pilha);

    // consultar o topo (peek)
    System.out.println("Topo: " + pilha.peek());

    // desempilhar (pop)

    String removido = pilha.pop();
    System.out.println("Item Removido: " + removido);

    System.out.print("Pilha apos o POP: " + pilha);

    // verificar se está vazia
    System.out.println("\nEsta vazia? " + pilha.isEmpty());

    // Buscar um elemento
    System.out.println("Posicao de A: " + pilha.search("A"));

  }

}
