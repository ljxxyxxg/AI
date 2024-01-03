#딕셔너리를 json으로 인코딩 하기
# import json

# member = {
#       "id" : "swhong",
#       "name" : "홍성우",
#       "age" : 23,
#       "history" : [
#           {"date" : "2021-03-15", "route" : "mobile"  },
#           {"date" : "2020-06-23", "route" : "pc"}]

#       }

# string = json.dump( member, ensure_ascii=False, indent=4)
# print( string )
# print( type( string ))

#중요한 파이썬의 딕셔너리를 json파일로 만들기(저장, 쓰기)
# import json

# k = {
#       "id" : "lee",
#       "name" : "이믿음",
#       "age" : 26,
#       "history" : [
#           {"date" : "2021-03-15", "route" : "mobile"  },
#           {"date" : "2020-06-23", "route" : "pc"}]

#       }

# with open("./Basic5/member.json", "a", encoding="utf-8") as f:
#     json.dump(k, f, ensure_ascii=False ,indent=4)