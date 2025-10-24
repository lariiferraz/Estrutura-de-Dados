public class Pilha {
  private int topo;
  private int[] elementos;
  private int capacidade;

  public Pilha(int capacidade) {
    this.capacidade = capacidade;
    elementos = new int[capacidade];
    topo = -1; // começa vazia
  }

  // Empilhar
  public void push(int valor) {
    if (isFull()) {
      System.out.println("Pilha cheia!");
    } else {
      topo++;
      elementos[topo] = valor;
    }
  }

  // Desempilhar
  public int pop() {
    if (isEmpty()) {
      System.out.println("Pilha vazia!");
      return -1;
    } else {
      int valor = elementos[topo];
      topo--;
      return valor;
    }
  }

  // Topo
  public int top() {
    if (isEmpty()) {
      System.out.println("Pilha vazia!");
      return -1;
    }
    return elementos[topo];
  }

  // Verifica se está vazia
  public boolean isEmpty() {
    return topo == -1;
  }

  // Verifica se está cheia
  public boolean isFull() {
    return topo == capacidade - 1;
  }
}
