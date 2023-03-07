listOne = [20, 30, 40, 50, 60]
listTwo = [11, 41, 24, 76, 10]
 
print("First List ", listOne)
print("Second List ", listTwo)
 

result = []
 
for num in listOne:
    if (num % 2 != 0):
        result.append(num)
        
for num in listTwo:
    if (num % 2 == 0):
        result.append(num)
 
print("result List is:")
print(result)