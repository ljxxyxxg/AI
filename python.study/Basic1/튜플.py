#튜플 - 수정이 안된다. 용도-변경 불가한것
t = (1,2)
t1 = 1,2
print(t[0])
print(t1[1])
print(type( t ))

# t2 =(1) int형 t2 = (1,) tuple
t2= (1,)
print( type(t2) )

#() 생략할 수 있다, 1개요소 (1, )
t3 = ()
print( type( t3 )) #() 빈 튜플
animals = ("토끼", "거북이", "사자", "여우")
print( animals [-1:] ) #list의 슬라이스와 동일
# 토끼를 돼지 바꾸기
# animals[0] ="돼지" 안됨
# 바꾸기 1단계 list() 2단계 tuple()
ani_list = list( animals )
print( type(ani_list) )
print(ani_list)
ani_list[0] = "돼지"
print(ani_list)
animals = tuple(ani_list)
print( animals ) 


#튜플 만들기
#변수 = (), 변수 = tuple( () )
n = tuple( range(10, 21) )
print( n )
n2 = tuple( [1,2,3] )
print( n2 )

print( n[0] )
print( n[:5] )
print( n[ : : -1] ) #reverse 뒤에서 앞으로 찍힌다.
print( len( n2 )) #튜플의 길이를 구하세여


#튜플 병합하기
tup1 = (10,20,30,40)
tup2 = (40,50,60)
tup3 = tup1 + tup2
print( tup1 )
print( tup2 )
print( tup3 ) 
print( tup1 * 2) #2번 반복
# print( tup1 * tup2 ) #에러 발생 멀티시퀀스 사용 불가

# 방법 1)tup1의 합계는?
print( tup1[0] + tup1[1] + tup1[2] + tup1[3] ) 
# 방법 2)
sm = sum( tup1 )
print( sm )

#tup1 30을 지우기 수정이 불가 삭제도 안됨
# tup1.remove(30)

#tup1 50을 삽입하기
# tup1.append(50) 오류 발생

# 어떠한 것도 수정 불가
tup1 = tup1 * 2
print( tup1 )

#tuple 실습
t1 = ('valentine', 2, 14, 'gift') 
print(t1[1:2])

t2 = ('love',)
print(t2[0])
print(t2[0:])
print(t2 * 2)
print(len(t1))

#list형과 tuple 비교 예제
a_1 = ["홍길동", "이수지", "박상민"]
a_1[1] = "하누리"
print( a_1 )

a_2 = ("홍길동", "이수지", "박상민")
a_2[1] = "하누리"
print( a_2 )







