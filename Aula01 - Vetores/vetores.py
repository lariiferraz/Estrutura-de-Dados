# listas, que são dinâmicas e flexíveis 
fruits = []
fruits.append("orange")
fruits.append("apple")
fruits.append("banana")
fruits.sort()
print(fruits)
fruits.pop(1) #banana
print(fruits)
fruits.insert(0,"watermelon")
print(fruits)
fruits.insert(3,"grape")
print(fruits)
fruits.insert(4,"orange")
c = fruits.count("orange")
fruits.clear
print(c)
