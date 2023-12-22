# python Dictionary = java의 Map {key : value}
score = {"kor":90, "eng":89, "math":95 }
print(score[ "math" ])
user = { "id":"kim55", "name":"강성준", "level":"7", "point":10000 }

#전체 출력하기
for ukey in user :
  print(f"{ukey} - {user[ukey]}")

#추가하기
score["music"] = 100
print( score )
user["vip"] = "우수회원"
print( user )

#수정하기
score["music"] = 80
print(score)
user["vip"] = "최우수회원"
print( user )

#삭제하기 (pop사용하기)
x = score.pop("music")
print(x)
print( score )
user.pop("vip")
print( user )

#반복문을 이용해서 딕셔너리 처리 java iterator 처럼
area_code = { "02":"서울", "051":"부산", "053":"대구", "052":"광주"}

for k in area_code:# key 값이 자동으로 한개 씩 k로 들어간다
  print( f"{k}-{area_code[k]}")

sk = " "
for k in area_code:
  sk = sk + k + " "
print( sk )