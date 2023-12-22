'''#요소변환 수정(삽입, 삭제, 업데이트)하기
flowers = ["목련", "벚꽃", "장미", "백일홍"]
print( flowers )
flowers[1] = "무궁화" #수정
#백일홍 수정하기 개나리
flowers[-1] = "개나리"
print( flowers)
#추가하기 뒤로 붙이기
flowers.append("백일홍")
print( flowers )
flowers.append("튜울립") #메소드
print( flowers ) #함수
#메소드 vs 함수 동작시키기
#메소드는 객체안에서 동작을 시키는것
#함수 동작을 시키는것

#리스트는 어떻게 쓸까? 빈 리스트를 만들고 추가로 넣기
scores = [] #빈 리스트
scores.append(100)
scores.append(90)
scores.append(85)
scores.append(100)
scores.append(98)
print(scores)

#특정 위치에 삽입하기
fruits = []
while True :
  fruit = input("좋아하는 과일은?")
  if fruit == "끝" :
      break
  fruits.appenㅁ.d( fruit )
print( fruits )
fruits.insert(1, "자몽")
print( fruits )'''

# 특정요서 위치 찾기
number = [5,20,13,7,8,22,7,17]
print(number)
idx = number.index(7) # 7번값의 인덱스 반환
print(idx)

number = [5,20,13,7,8,22,7,17]
property (number.index(8, 9,11))

flowers = ["목련","벚꽃", "장미", "벚꽃", "백일홍", "벚꽃"]
#처음으로 나오는 "벚꽃 "이 몇번째 인덱스있나요?
print(flowers.index("벚꽃")) # 1번 인덱스 있다.
#인덱스번호 4이후로 나오는 "벚꽃"의 인덱스 찾기?
print(flowers.index("벚꽃", 4))

#삭제하기 remove (요소)
flowers = ["목련","벚꽃", "장미", "벚꽃", "백일홍", "벚꽃"]
flowers.remove("목련")
print(flowers)
flowers.remove("벚꽃")
#flowers.remove("개나리") #오류발생
#print(flowes)
x = flowers.pop(2)
print(x)
print(flowers)

flowers.clear()
print(flowers)