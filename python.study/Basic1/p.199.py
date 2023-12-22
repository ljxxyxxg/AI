# #병합, 합계, 순서 거꾸로, 정렬, 복사
# person1 = ["kim", 24, "kim@naver.com"]
# person2 = ["lee", 35, "lee@hanmail.net"]
# person3 = ["kim", 24, "kim@naver.com"]

# person = person1 + person2 + person3
# print(person)


# scores = list(range( 80, 101, 4))
# print(scores)
# sm = sum( scores )
# print( sm )

# #리스트 안에 숫자 문자 섞여 있다면 sum() 에러 발생
# data = [1, 2, 8.9]
# sm = sum( data )
# print( sm )


jumsu = list(range( 90, 101, 1))
avg = sum(jumsu) / len(jumsu)
print(avg)

data = ["사과", "배", "귤", "딸기"]
data.reverse()
print(data)
data.reverse()
print(data)

# 복사하기
fruits =["apple", "banana", "orange"]
print( fruits )

x = fruits.copy()
print( x )
print( type( x ))

xx = fruits
print( xx )
print( type(xx))

#pineapple 1인데스 삽입하기
fruits.insert(1,"pineapple")
print( fruits )
print( x )
print( xx )

#정렬하기
data = [12, 8, 15, 32, -3, -20, 15, 34, 6]
data1 =['a','A','C','!','한글','가나']
#오름차순 정렬
data.sort()
print(data)

data1.sort() # 유니코드 번호 순서대로 정렬
print(data1)

#내림차순 정렬
data.sort( reverse=True)
print(data)
data1.sort( reverse=True)
print(data1)