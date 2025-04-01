import random

numero_sorteado = random.randint(1,100)
#palpite = 0
contador = 1
print("Bem vindo ao Jogo de Adivinhação")
#while palpite != numero_sorteado:
while True:
    
    palpite = int(input("Digite seu palpite: "))
    if palpite < numero_sorteado:
        print("Tente um número maior")
    elif palpite > numero_sorteado:
        print("Tente um número menor")
    else:
        print("Parabéns! Você acertou na sua tentantiva de número ", contador)
        break
    contador += 1