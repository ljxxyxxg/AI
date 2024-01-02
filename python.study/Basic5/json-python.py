#json 파일을 파이썬으로 읽어오기
import json

with open("Basic5/member.json","r", encoding="utf-8" ) as f:
  dict = json.load( f )

  print( dict)
  print( dict['history'][0])
  print( dict['history'])

  #pc 출력하기
  print(dict)
  print(dict['history'][1])
  print(dict['history'][1]['route'])

with open("./Basic5/b.json", "r" , encoding="utf-8") as f1 :
  dict2 = json.load( f1 )

  print( dict2 )

  #Home
  #Football

  print(dict2["contactNumbers"][0]['type'])
  print(dict2["favoriteSports"][0])