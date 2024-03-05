import cv2 as cv
import sys
from math import sqrt

img = cv.imread('girl_laughing.jpg')

if img is None:
    sys.exit('파일을 찾을 수 없습니다')
    
# def: 사용자 함수 정의
def draw(event, x, y, flags, param):
    global ix, iy
    
    if event == cv.EVENT_LBUTTONDOWN :
        ix, iy = x, y
    elif event == cv.EVENT_LBUTTONUP:
        cv.rectangle(img, (ix, iy), (x, y), (0, 0 ,255), 2)
    
    elif event == cv.EVENT_RBUTTONDOWN:
        ix, iy = x, y
        
    elif event == cv.EVENT_RBUTTONUP:
        cv.circle(img,(ix, iy), round(sqrt((ix - x)*(ix - x) +(iy - y)*(iy - y))) , (255,0,0), 2)
    cv.imshow('Drawing', img)
    
cv.namedWindow('Drawing') #윈도창의 이름은 Draw라고 정의함
cv.imshow('Drawing', img)

cv.setMouseCallback('Drawing', draw)
# 윈도우 창 Draw에서 마우스 이벤트가 발생하면 draw 함수로 호출해라


while True:
    if cv.waitKey(1) == ord('q'):
        cv.destroyAllWindows()
        break