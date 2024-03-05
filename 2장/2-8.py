import cv2 as cv
import sys

img = cv.imread('girl_laughing.jpg')

if img is None:
    sys.exit('파일을 찾을 수 없습니다')
    
# def: 사용자 함수 정의
def draw(event, x, y, flags, param):
    global ix, iy # 전역변수 선언
    
    if event == cv.EVENT_LBUTTONDOWN : #마우스누르는건 Down
        ix, iy = x, y
        
    elif event == cv.EVENT_LBUTTONUP: #마우스눌렀다가 떼는건 Up
        cv.rectangle(img, (ix,iy), (x, y), (0, 0 ,255), 2)
    cv.imshow( 'Drawing', img)
    
cv.namedWindow('Drawing') #윈도창의 이름은 Draw라고 정의함
cv.imshow('Drawing', img)

cv.setMouseCallback('Drawing', draw)
# 윈도우 창 Draw에서 마우스 이벤트가 발생하면 draw 함수로 호출해라


while True:
    if cv.waitKey(1) == ord('q'):
        cv.destroyAllWindows()
        break
