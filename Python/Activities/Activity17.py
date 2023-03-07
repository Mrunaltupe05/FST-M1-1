import pandas
 
data = {
  "Usernames": ["admin", "Mrunal", "Mru"],
  "Passwords": ["password", "Mrunal97", "Mango5"]
}
 
dframe = pandas.DataFrame(data)
 
print(dframe)
 
dframe.to_csv("sample.csv", index=False)