f = open("1-200.txt", "r")
stack = []

for line in f:
    numbers = line.strip().split(' ')
    stack.append(numbers)
for i in range(0,200):
    print(stack.pop())
f.close()