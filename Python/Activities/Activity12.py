	
def calculateSum(a):
  if a:
   
    return a + calculateSum(a-1)
  else:
    return 0

result = calculateSum(10)

print(result)