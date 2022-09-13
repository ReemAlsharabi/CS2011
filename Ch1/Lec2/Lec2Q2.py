f = open("1-200.txt", "r")
stack = []
numbers = f.readline().strip().split(' ')
for line in f:
    for i in range(1,50): # started from 1 because I read the first line before the loop
        stack.append(numbers)
        numbers = f.readline().strip().split(' ')
    for j in range(1,50):
        print(stack.pop())
f.close()