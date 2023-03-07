fruits = {
"apple" : 220,
 "mango" : 500,
 "banana" : 60,
 "dragon_fruit" : 80,
 "orange" : 50
}

checking=input("which fruit you want?")
if(checking in fruits):
    print("Fruit is present")
else:
        print("fruit not present")