#딕셔너리 생성
inventory = {"메로나":[300, 20],
            "비비빅":[400, 3 ],
            "죠스바":[250,10]}

#메로나 가격?
print( inventory["메로나"][0],"원", sep="")

#죠스바의 재고는? 1000개
print(inventory["죠스바"][1], "개 입니다", sep="")

#월드콘 추가하기
inventory["월드콘"] = [1500, 50]
print( inventory )

#죠스바 350원
inventory["죠스바"] = [350,10]
print( inventory )

#품목의 개수 요소의 갯수
print(len(inventory), "종류")

#아이스크림 종류는?
for key in inventory :
  print( key,end=" " )

#메로나 300 20 6000
#비비빅 400 3 1200
#죠스바 250 100 25000

for i in inventory :
  t = inventory[i][0] * inventory[i][1]
  print(f'{i} {inventory[i][0]}원 {inventory[i][1]}개 {t}원')
  
