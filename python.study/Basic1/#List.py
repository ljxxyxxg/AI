#여러자료들의 목록형태로 관리하는 자료구조
#특징 : 순서가 있다. 수정이 가능하다. 요소의 종류가 달라도 된다.
#       중복 저장 가능 동일요소가 여러개 나올 수 있다.


list1 = [1, 1,1, "문자", [1,9]]
print (list1[0] )

list1 =[3,15,-12.5, "사과", "딸기"]
print(list1)
print(type(list1))# type() 자료형 보기

#리스트를 만드는 방법
#방법 1) 변수 = [요소1, 요소2]
#방법 2) list( ) 함수를 사용하자
list2 = list( range(1,21,2) ) # 1~21까지 두칸씩 증가
print(list2)
print(type(list2))


list3 = list("abcdef")
print(list3)
print(type(list3))

color = ["빨강", "파랑", "주황", "하양", "검정", "남색", "보라"]
print(color[0])
print(color[5])
print(color[2:6]) # 2<= index < 6
print(color[-3]) #뒤에서부터 세번째
print(color[-4:-1])

#전체 출력
print(color)
print(color[::])
print(color[:])
#["빨강", "파랑", "주황", "하양", "검정", "남색", "보라"]
print(color[3:])
#["빨강", "파랑", "주황"] 출력
print(color[0:3])
print(color[-7:-4])

#["주황","검정","보라"]
list6 = (color[2], color[4], color[6]) 
print(list6)
print(type (list6))

#반복문과 리스트
#for  i  in   color = ["빨강", "파랑", "주황", "하양", "검정", "남색", "보라"]
#   변수    리스트

for i in color :
    #print( i, end=" ")
    print("나는 %s를 좋아합니다" %i)

print( len(color) ) # len(리스트) 리스트 요소의 갯수