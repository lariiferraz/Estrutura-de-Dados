# usando list

# criar uma pilha vazia
pilha = []

# empilhar os elementos
pilha.append(10)
pilha.append(20)
pilha.append(30)

print("Pilha atual: ", pilha)

# ver o topo da pilha, sem remover
print("Topo: ", pilha[-1])

# desempilhar (remove o topo)
valor_removido = pilha.pop()
print("Elemento removido: ", valor_removido )

# ver o topo novamente
print("Novo topo: ", pilha[-1])

# verificar se está vazia
print("Está vazia? ", len(pilha)==0)