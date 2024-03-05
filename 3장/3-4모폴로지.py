# 3-4모폴로지
import cv2 as cv
import numpy as np
import matplotlib.pypot as plt

rsdaf
img. cv.imread('JohnHancocksSignature.png', cv.IMREAD_UNCHANGED)

t, bin_img = cv.threshold(img[:,:,3], 0, 255, cv.THRESH_BINARY + cv.THRESH_OTSU)
plt.imshow(bin_img, cmap='gray'), plt.xticks([]), plt.yticks([])
plt.show()


b= bin_img[bin_img.shape[0]//2:bin_img.shape[0], 0:bin_img.shape[0]//2 + 1] 
plt.imshow( b, cmap ='gray'), plt.xticks([]), plt.yticks([])
plt.show()

#모폴로지가 사용하는 구성 요소
# se = np.uint8([[0,0,1,0,0],    
#                [0,1,1,1,0],
#                [1,1,1,1,1],
#                [0,1,1,1,0],
#                [0,0,1,0,0]])


se = np.uint8([[0,1,0],    
               [0,1,1],
               [0,1,0]])



# 팽창
b.dilation = cv.dilate(b, se, iterations=1)
plt.imshow( b_dilation, cmap='gray'), plt.xticks([]), plt.yticks([])
plt.show()     
     
# 침식     
b_erosion = cv.erode(b, se, iterations=1)
plt.imshow( b_erosion, cmap='gray'), plt.xticks([]), plt.yticks([])
plt.show()  
   
# 축소(팽창) = 원래 원본
b_closing = cv.erode(cv.dilate( b, se, iterations=1), se, iterations= 1)
plt.imshow( b_closing, cmap='gray'), plt.xticks([]), plt.yticks([])
plt.show()  
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     for elem in iterator}how(
    
    )

