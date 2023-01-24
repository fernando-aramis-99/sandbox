# pip install opencv-python
# pip install mediapipe
import cv2 #opencv
import mediapipe as mp

webcam = cv2.VideoCapture(0) # inicializar o opencv e o mediapipe
solucao_fr = mp.solutions.face_detection
reconhecedor_rostos = solucao_fr.FaceDetection()
desenho = mp.solutions.drawing_utils

while True: 
    #ler as informacoes da webcam
    verificador, frame = webcam.read()

    if not verificador:
        break
    #reconhecer os rostos que estiverem presentes
    lista_rostos = reconhecedor_rostos.process(frame)

    if lista_rostos.detections:
        for rosto in lista_rostos.detections: #desenhar os rostos na imagem
            desenho.draw_detection(frame, rosto)
    cv2.imshow("Rostos na webcam", frame)
    #ESC - finaizar loop
    if cv2.waitKey(5) == 27: # codigo de letra 27 - ESC ou ord('a')
        break
webcam.release()
cv2.destroyAllWindows()