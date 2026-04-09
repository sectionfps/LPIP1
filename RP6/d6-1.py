valor = float(input("Digite o valor do produto: "))
desconto = float(input("Digite o desconto (%): "))

valor_final = valor - (valor * desconto / 100)

print("Valor final com desconto:", valor_final)