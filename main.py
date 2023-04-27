print("hello test")

file = open('emails.txt', 'r')
fileContents = file.readline(4)
print(fileContents)
file.close()