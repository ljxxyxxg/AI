# #1
# data = list(range(1,21))

# for i in range( 0 , len(data), 1) :
#     print("%d"%data[i], end=" ")

# #2 for 문
# a = list(range(1,21))

# for i in range(1 , len(a), 2) :
#     print("%d"% a[i], end=" ")

#3 while 문
data = list(range(1,21))
i = 0
while i < len(data) :
    print("%d"%data[i], end = " ")
    i+=2

#4 list.append
data = [] #빈리스트
for x in range( 10 , 21) :
    data.append( x )
print( data )