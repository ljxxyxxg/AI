#2차원리스트
numbers = [ [10,20,30],[40,50,60],[60,70,80],['a',[100,90] ] ]
print(numbers[0][0])
print(numbers[1][2])

#80
print( numbers[2][2])
print( numbers[3][1])
print( numbers[3][1][0])

boards = [[1, "작성자1", "내용1"],[2,"작성자2", "내용2"],[3, "작성자3","내용3"]]
#내용 전부 출력하기
for i in range(0, len(boards)) :
  for j in range(0, len(boards[i])) :
    print( boards[i][j], end=' ')
print()


#내용을 모두 출력하기
sm = 0
jumsu = [ [10,20], [30,40,50],[60] ]
#생각 10을 출력하려면 [0][0], 20을 출력하려면 [0][1]
for i in range(0, len(jumsu) ) :
  for j in range(0, len(jumsu[i])) :
    sm = sm + jumsu[i][j]
print( sm ) 

#문 sum 함수
# a =[1,2,3]
# print(sum(a))

jumsu = [ [10,20], [30,40,50], [60]]
print(sum( jumsu[0]))
print(sum( jumsu[1]))

sm = sum( jumsu[0] + sum(jumsu[1])) + sum(jumsu[2])
print( sm )

#for문을 이용해서 합 구하기
for i in range( 0 , len(jumsu)) :
  sm += sum(jumsu[i])
print( sm )

strings = [["원두커피", "라떼"," 콜라"],["우동", "국수", "피자", "파스타"]
#국수 출력
print[string1ngs[1][1]]
#'피자', ' 파스타', 삭제하기
strings[1].remove("피자")
strings[1].remove("파스타")
# "원두커피" 치환하기 '아메리카노'
#strings [0][0] = '아메리카노'

findColumIndex = strings[i].index("원두커피") #열에 대한 인덱스
strings[ findIndex ][ findColumIndex ] = "아메리카노"

print( strings[0] )
print( strings[1] )

#join()리스트 --> "문자열"
#"문자열" replace하기
strings = [["원두커피", "라떼", "콜라"]. ["우동", "국수", "피자", "파스타"]]



