# 이벤트란 사용자가 동작하는 것을 프로그램이 받아서 처리하기
# 콜백함수 callback - 리스너와 비슷함 : 이벤트 발생하는 것을 처리하는 함수

import cv2 as cv
import sys

img = cv.imread('girl_laughing.jpg')

if img is None:
    sys.exit('파일을 찾을 수 없습니다')
    
# def: 사용자 함수 정의
def draw(event, x, y, flags, param):
    if event == cv.EVENT_LBUTTONDOWN :
        cv.rectangle(img, (x,y), (x+200, y+200), (0, 0 ,255), 2)
    elif event == cv.EVENT_RBUTTONDOWN :
        cv.rectangle(img, (x,y), (x+100, y+100), (255, 0 ,0), 2)
    cv.imshow( 'Drawing', img)
    
cv.namedWindow('Drawing') #윈도창의 이름은 Draw라고 정의함
cv.imshow('Drawing', img)

cv.setMouseCallback('Drawing', draw)
# 윈도우 창 Draw에서 마우스 이벤트가 발생하면 draw 함수로 호출해라


while True:
    if cv.waitKey(1) == ord('q'):
        cv.destroyAllWindows()
        break