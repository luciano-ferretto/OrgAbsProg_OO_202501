class Pessoa:
    def __init__(self, ano):
        self.ano = ano

ano = input("Digite o ano de nascimento: ")
p = Pessoa(ano)

print("Sua idade é: ", 2025 - p.ano)

