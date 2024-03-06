import cv2 as cv
import numpy as np
import time

def my_cvtGray1( bgr_img ) :
    g = np.zeros([bgr_img.shape[0], bgr_img.shape[1]])
    for r in range (bgr_img.shape[0]) :
        for c in range(bgr_img.shape[1]):
         g[r,c]= 0.114 * bgr_img[r, c, 0] + 0.587 * bgr_img[r,c,1] + 0.299
    return np.uint8(g)


def my_cvtGray2( bgr_img ) :
    g = np.zeros([bgr_img.shape[0], bgr_img.shape[1]])
    g = 0.114*bgr_img[:,:,0] + 0.587*bgr_img[:,:,1]
    return np.uint8(g)
    

img = cv.imread( 'girl_laughing.jpg')

start  = time.time()
my_cvtGray1(img) # 반복문 for 처리
print('My time1 :', time.time() - start)

start  = time.time()
my_cvtGray2(img) # 배열 요소로 처리
print('My time2 :', time.time() - start)

   
start  = time.time()
cv.cvtColor(img, cv.COLOR_BGR2GRAY)
print('OpenCV time :', time.time() - start)
