# Instalação:  SpeechRecognition & PyAudio
# pip install SpeechRecognition
# python -m pip install pyaudio
import speech_recognition as sr
rec = sr.Recognizer() # Recognizer - for thw message
#print(sr.Microphone().list_microphone_names()) #List of microfones - apply on sr.Microphone(index_list_microphone)
with sr.Microphone() as mic: # Microphone - for the listening
    rec.adjust_for_ambient_noise(mic)
    print("Aquilo que for dito, será registrado...")
    audio = rec.listen(mic)
    texto = rec.recognize_google(audio, language="pt-BR")
    print(texto)