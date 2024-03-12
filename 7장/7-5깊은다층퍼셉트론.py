import numpy as np
import tensorflow as tf
import tensorflow.keras.datasets as ds
import matplotlib.pyplot as plt

from tensorflow.keras.models import Sequential #학습순서 순서대로
from tensorflow.keras.layers import Dense #층
from tensorflow.keras.optimizers import Adam #학습법


# 1단계 데이터 준비(1차원으로 준비)
(x_train, y_train),(x_test, y_test) = ds.mnist.load_data()
x_train = x_train.reshape(60000, 784)
x_test = x_test.reshape(10000, 784)
x_train = x_train.astype(np.float32) / 255.0
x_test = x_test.astype(np.float32) / 255.0
y_train = tf.keras.utils.to_categorical( y_train, 10)
y_test = tf.keras.utils.to_categorical( y_test, 10)


# 2단계 모델을 선택, 신경망 구조 설계
dmlp_Adam = Sequential()
dmlp_Adam.add( Dense(units = 1024, activation = 'relu', input_shape = (784,)))
dmlp_Adam.add( Dense(units = 512, activation = 'relu'))
dmlp_Adam.add( Dense(units = 512, activation = 'relu'))
dmlp_Adam.add( Dense(units = 10, activation = 'softmax'))

# 3단계 학습한다
dmlp_Adam.compile(loss = 'categorical_crossentropy', optimizer=Adam(learning_rate = 0.001),
            metrics = ['accuracy'])

# 원핫 코딩 정답부분만 1로 표기 나머지 다 0으로 나온다
hist_Adam = dmlp_Adam.fit(x_train, y_train, batch_size = 128, epochs =50,
                  validation_data=(x_test, y_test), verbose=2)


print('Adam정확률', dmlp_Adam.evaluate( x_test, y_test, verbose=0)[1]*100)


dmlp_Adam.save('dmlp_trained.h5')
plt.plot(hist_Adam.history['loss'])
plt.plot(hist_Adam.history['val_loss'])
plt.title('dmlp_Adam optimizer')


plt.xlabel('epochs')
plt.ylabel('accuracy')
plt.legend(['train','test'])
plt.grid()
plt.show()
         
