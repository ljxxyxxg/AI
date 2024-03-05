# 3
# 샘플링
# 10,000개의 공 중에서 1000개만 뽑는다 했을때 뽑아내는 행위 자체가 샘플링

# 양자화
# 샘플링한 아날로그 형태로 되어 있는 신호나 정보를 디지털화 시킨것
import cv2 as cv
import sys



img = cv.imread('soccer.jpg')
if img is None:
    sys.exit('file not found')
    
cv.imshow('original_RGB', img)
cv.imshow('Upper left half', img[0:img.shape[0]//2, 0:img.shape[1]//2, :]) # (행, 열, 채널)
cv.imshow('Center half', img[img.shape[0]//4:3*img.shape[0]//4, img.shape[1]//4:3*img.shape[1]//4,:])

cv.imshow('R channel', img[:,:,2])
cv.imshow('G channel', img[:,:,1])
cv.imshow('B channel', img[:,:,0])


cv.waitKey()
cv.destroyA1lWindows()