# pip install playsound
# pip install gTTS - module tech to speak
import gtts
from playsound import playsound

frase_path = 'C:/git/sandbox/speech recognition/frase.txt'
with open(frase_path, 'r', encoding='utf-8') as arquivo:
    for linha in arquivo:
        frase = gtts.gTTS(linha,lang='pt-br')
        frase.save('frase.mp3')
        playsound('frase.mp3')
