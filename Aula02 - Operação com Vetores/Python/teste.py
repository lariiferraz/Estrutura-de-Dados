from collections import deque

# cria uma pilha usando deque
pilha = deque()

#empilhar
pilha.append("10")
pilha.append("20")
pilha.append("30")

print("Pilha: ", pilha)

#desempilhar
print("Removido: ", pilha.pop())

# ver topo
print("Topo:", pilha[-1])

# verificar se está vazia
print("Está vazia? ", len(pilha) == 0)