f = open("words.txt", "r")
queue = []
words = f.readline()

for line in f:
    for j in range (0,43):
        queue.append(words)
        words = f.readline()
    if queue[-1] == '\n':
        print(queue.pop(0))
    for i in queue:
        queue.pop()
f.close()