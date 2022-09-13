n = int(input("How many elements do you have? "))
s = []
q = []

for i in range(0,n):
    s.append(int(input("Enter element: ")))
print("\nElements in reversed order:\n")
for i in range(0,n):
    q.append(s.pop())
    print(q.pop())