import cv2 as cv
import sys

img = cv.imread('soccer.jpg')

if img is None:
    sys.exit('파일을 찾을 수 없습니다')
    
BrushSize = 5 #붓의 크기
LCOLOR, RCOLOR = (255,0,0), (0,0,255) # 파란색, 빨간색

def paint(event, x, y, flags, param):
    if event == cv.EVENT_LBUTTONDOWN:
        cv.circle(img, (x,y), BrushSize, LCOLOR, -1)
    elif event == cv.EVENT_RBUTTONDOWN:
        cv.circle(img,(x,y), BrushSize,RCOLOR, -1)
    elif event == cv.EVENT_MOUSEMOVE and flags == cv.EVENT_FLAG_LBUTTON :
        cv.circle(img,(x,y), BrushSize, LCOLOR, -1)
    elif event == cv.EVENT_MOUSEMOVE and flags == cv.EVENT_FLAG_RBUTTON :
        cv.circle(img,(x,y), BrushSize, RCOLOR, -1)

    cv.imshow('painting', img)

cv.namedWindow('painting')
cv.imshow('painting', img)
cv.setMouseCallback('painting', paint)


while True:
    if cv.waitKey(1) == ord('q'):
        cv.destroyAllWindows()
        break
    elif cv.waitKey(1) == ord('+'):
        BrushSize = min(20, BrushSize + 1)
    elif cv.waitKey(1) == ord('-'):
        BrushSize = max(20, BrushSize - 1)
    