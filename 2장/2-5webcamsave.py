import cv2 as cv
import numpy as np
import sys

cap = cv.VideoCapture(0, cv.CAP_DSHOW) #카메라 연결시도


if not cap.isOpened() :
    sys.exit('카메라 연결 실패')


frames = [] #빈리스트 선언

while True :
    ret, frame = cap.read() #비디오를 구성하는 프레임회복
    
    if not ret :
        print('프레임 획득에 실패하여 루프를 빠집니다.')
        break
    
    cv.imshow('video display', frame)
    
    key = cv.waitKey(1)
    if key == ord('s') :
        frames.append( frame )
    elif key == ord('d') :
        break
    

cap.release()
cv.destroyAllWindows()

if len(frames) > 0 :
    imgs = frames[0]
    for i in range( 1, min(3, len(frames))) :
        imgs = np.hstack( (imgs, frames[i]) )
    
    cv.imshow('collected images', imgs)

    cv.waitKey()
    cv.destroyAllWindows()