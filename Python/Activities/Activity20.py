	
import pandas
 
dframe = pandas.read_excel('demo.xlsx')
 
print(dframe)
 
print("====================================")
print("Number of rows and columns:", dframe.shape)
 
print("====================================")
print("Emails:")
print(dframe['Email'])
 
print("====================================")
print("Sorted data:")
print(dframe.sort_values('FirstName'))