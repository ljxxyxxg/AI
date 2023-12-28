#회문을 구하기, 알고리즘
def is_palindrome( s ) :
  for i in range(0, int(len(s)/2)):
    if s[i] != s[len(s)-i-1]:
      return False
  return True

string = "rotator"
if is_palindrome(string) :
  print("%s은(는) 회문이다!" % string)
else:
  print("%s은(는) 회문이아니다!" % string)

# 문장 단어 반대로 하기
def reverse_sentence( sentence ):
    words = sentence.split(" ")
    result = ""
    for word in words :
        result = word + " " + result 

sentence = "Nice to meet you"
print( reverse_sentence(sentence))

#
def check_word(string, word) :
  if(string.find(word) == -1) :
    print("존재하지 않는다")
  else :
    print("존재한다")



string = "A good book is a great friend"
word = "friend"
check_word(string, word)
#테스팅 코드
#string.find("is")

#다수의 문자열 치환하기
# def replace_word(s, wl, w) :
#     new_str = []
#     ssList = s.split(" ")
#     for si in ssList :  
#         if si in word_list :
#           new_str.append( w )
#         else :
#           new_str.append( si )
#     #리스트를 문자열로 바꾸기
#     new_str1 = " ".join(new_str)
#     return new_str1


# string = "python java apple orange banana"
# word_list = "apple orange banana"
# word = "fruits"
# new_str = replace_word(string, word_list, word)
# print("치환된 문자열:" + new_str)


def string_shift( string, d, direction ) :
  if direction == "left" :
    left_part = string[d:]
    right_part = string[0:d]
  else :
    left_part = string[-d:]
    right_part = string[0:len(string)-d]
  result = left_part + right_part
  return result





string = "pythonprogramming"
str_left = string_shift( string, 2, "left")
str_right = string_shift( string, 3, "right")
print("좌측으로 2칸이동" + str_left)
print("우측으로 3칸이동" + str_right)

#8-4 단어 개수를 카운트하라
def count_word( s ) :
    arr = s.split(" ")
    return len(arr) #len(리스트) 리스트안 요소들의 갯수를 반환한다

string = "I am a Student."
num_word = count_word(string)
print("단어의 개수 : ",num_word)

#8-5
def del_word( s, w ) :
    arr = s.split(" ")
    arr.remove( w )
    result = " ".join( arr )
    return result

string = "Don't crt before you are the hurt"
word = "the"
new_str = del_word(string, word)
print("변경된 문자열", new_str) #문자열


#선형탐색, 순차탐색, 앞에서부터 차례대로 찾기, 정렬이 안된 자료 찾기
#검색횟수 최악인 경우 n회 찾는다. 최악 시간의 복잡도 N

#이진 검색, 이분 탐색, 전제조건이 정렬이 되어야한다.
#최악 시간의 복잡ㅂ도 logN

def find_max( n ) :
    mx = n[0]
    for i in range(1, len(n)) :
      if n[i] > mx :
        mx = n[i]
    return mx


data = [5, -3, 12, 8, 2 ]
max_value = find_max(data)
print("선형검색으로 최대값 찾기", max_value)


def binary_search(n, x) :
  start = 0
  end = len(n) - 1 #길이는 8이 나온다
  while start <= end :
    mid = (start + end ) // 2 # 4
    if x == n[mid] :
      return mid
    elif x > n[mid] :
      start = mid + 1 #5
    else:
      end = mid - 1
  return -1

data = [7,16,23,35,40,52,68,78,82]
search_num = 16
index = binary_search(data, search_num)
print(index)


#3-2
def sen_splite ( s ) :
  ss = s.split("/")
  for sp in ss :
    print("%s : %d"%(sp, len(sp)))
    


sentence = "강아지/사슴/거북/고릴라/청개구리"
sen_splite( sentence )
