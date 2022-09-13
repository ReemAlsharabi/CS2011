openingB = ['[', ']','(',]
closingB=[')','{', '}']
stack = []
x = input("Enter: ")
valid = True
for i in x:
    if i in openingB and valid:
        stack.append(openingB.index(i))
    if i in closingB and stack and valid:
        if stack.pop() == closingB.index(i):
            stack.pop()
        else:
            valid = False
if valid and not stack:
    print("Valid")
else:
    print("Not Valid")
