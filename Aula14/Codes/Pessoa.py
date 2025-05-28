class Pessoa:
    def __init__(self, ano_nascimento):
        self.ano_nascimento = ano_nascimento

ano_nascimento = input('Digite o Ano de Nascimento: ')
p = Pessoa(ano_nascimento)

print("A idade é: ", 2024 - p.ano_nascimento)

