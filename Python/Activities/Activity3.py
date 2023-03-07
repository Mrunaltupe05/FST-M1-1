player1=input("name of player1 : ")
player2=input("name of player2:  ")

player1_choice=input(player1 + ", do you want to choose rock, paper or scissors?")
player2_choice=input(player2 + ", do you want to choose rock, paper or scissors?")

if player1_choice == player2_choice:
    print("it's a tie")

elif player1_choice == 'rock':
    if player2_choice == 'scissors':
        print("Rock wins!")
    else:
        print("Paper wins!")
elif player1_choice == 'scissors':
    if player2_choice == 'paper':
        print("Scissors win!")
    else:
        print("Rock wins!")
elif player1_choice == 'paper':
    if player2_choice == 'rock':
        print("Paper wins!")
    else:
        print("Scissors win!")
else:
    print("Invalid input! You have not entered rock, paper or scissors, try again.")
