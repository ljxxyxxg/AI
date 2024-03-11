from PyQt5.QtWidgets import *
import sys
import cv2 as cv

class Video(QMainWindow) :
    def __init__(self) :
        super().__init__()
        self.setWindowTitle('비디오에서 프레임 수집')
        self.setGeometry(200, 200, 500, 100)
                        #x좌표, y좌표, 너비 , 높이

        videoButton = QPushButton('비디오켜기', self)
        captureButton = QPushButton('프레임잡기', self)
        saveButton = QPushButton('프레임저장', self)     
        quitButton = QPushButton('나가기', self)
        
        
        #self는 클래스의 멤버
        
        videoButton.setGeometry(10,10,100,30)
        captureButton.setGeometry(110,10,100,30)
        saveButton.setGeometry(210,10,100,30)
        quitButton.setGeometry(310,10,100,30)
        
        videoButton.clicked.connect(self.videoFunction)
        captureButton.clicked.connect(self.captureFunction)
        saveButton.clicked.connect(self.saveFunction)
        quitButton.clicked.connect(self.quitFunction)
        
    def videoFunction(self):
        self.cap = cv.VideoCapture(0, cv.CAP_DSHOW)
        if not self.cap.isOpened() : self.close()
        
        while True:
            ret, self.frame = self.cap.read()
            if not ret: break
            cv.imshow('video display', self.frame)
            cv.waitKey(1)

    def captureFunction(self):
        self.capturedFrame = self.frame
        cv.imshow('Captured Frame', self.capturedFrame)
        

    def saveFunction(self):
        fname = QFileDialog().getSaveFileName(self,'파일저장','./')
        cv.imwrite(fname[0], self.capturedFrame)
        
    def quitFunction(self):
        self.cap.release()
        cv.destroyAllWindows()
        self.close()
        
        
app = QApplication(sys.argv)
win = Video()
win.show()
app.exec_()