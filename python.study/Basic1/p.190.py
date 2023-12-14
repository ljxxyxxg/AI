# ans1 = input("'사자'의 영어 단어는 무엇일까요?: ")
# ans2 = input("'오렌지'의 영어 단어는 무엇일까요?: ")
# if ans1 == "lion" and ans2 == "orange" :
#   result = "딩동댕! 참 잘했어요!~~~"
# elif ans2 == "orr" and ans1 == "tiger" :
#   result ="땡! 틀렸습니다."
# print(result)
yn = "y"
while yn == "y"  :
  q1 = input("질문단어는(한국어)?")
  a1 = input("답변단어(영어)? ")
  o = 0
  x = 0

  if q1 == '사자' and a1 == 'lion':
    result = "딩동댕 참 잘했어요"
    o += 1
  elif q1 == '오렌지'and a1 == 'orange':
    result = "딩동댕 참 잘했어요"
    o += 1
  elif q1 == '기차' and a1 == 'train':
    result = "딩동댕 참 잘했어요"
    o += 1
  else :
    result = "땡 틀렸습니다"
    x += 1
    print(result)

  yn = input("계속 공부할래요? (Y/N)")

print(f"전체 {o + x} 문제 풀었다.")
print(f"{o} 문제 맞추었고")
print(f"{x} 문제 틀렸다.")


# ans2 = input("'오렌지'의 영어 단어는 무엇일까요?: ")
# result = "땡! 틀렷습니다."
# if ans2 =="orange" :
#   reult = "딩동댕! 참 잘했어요!~~~"
# print(result)

# ans3 = input("'사자'의 영어 단어는 무엇일까요?: ")
# result = "땡! 틀렷습니다."
# if ans3 =="train" :
#   reult = "딩동댕! 참 잘했어요!~~~"
# print(result)
