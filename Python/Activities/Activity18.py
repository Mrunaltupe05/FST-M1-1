import pandas
 
dframe = pandas.read_csv("sample.csv")
 
print("Full Data: ")
print(dframe)
 
print("===============")
print("Usernames:")
print(dframe["Usernames"])
 
print("===============")
print("Username: ", dframe["Usernames"][1], " | ", "Password: ", dframe["Passwords"][1])
 
print("====================================")
print("Data sorted in ascending Usernames:")
print(dframe.sort_values('Usernames'))
 
print("====================================")
print("Data sorted in descending Passwords:")
print(dframe.sort_values('Passwords', ascending=False))



