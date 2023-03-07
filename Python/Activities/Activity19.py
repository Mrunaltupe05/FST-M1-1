import pandas
from pandas import ExcelWriter
 
df = {
	'FirstName':["Mrunal", "Suraj", "Radha"],
	'LastName':["Tupe", "Kolekar", "Yadav"],
	'Email':["mtupe@xyz.com", "suruK@exam.com", "radhaY@abc.com"],
	'PhoneNumber':["8537829158", "9892184058", "7528727830"]
}
 
dframe = pandas.DataFrame(df)

print(dframe)
 
writer = ExcelWriter('sample.xlsx')
dframe.to_excel(writer, 'Sheet1', index = False)
 
writer.save()