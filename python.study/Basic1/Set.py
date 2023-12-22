#Set Exple 수정 가능하다
#Set : add() update() remove()
color_list = {'red', 'blue', 'red', 'green' }
print(color_list)
#print(color_list[0])#인덱스 번호가 없다. 슬라이스를 할 수 없다.에러 발생

p = {1, 2, 'red', 'blue'}
plus = color_list & p #교집합 and
print( plus )
plus = color_list | p #합집합 or
print( plus )
plus = color_list - p #차집합 not
print( plus )

a={1,2,3}
# 3을 바꾸기
a.update({1,2,4})
print( a )
a.remove( 3 )
print( a )

#추가하기, 삽입하기
b = {10,11}
b.add( 20 )
print( b )

#수정하기
b.update({5})
print( b )
b.remove( 10 )
print( b )