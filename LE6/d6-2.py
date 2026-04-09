def aplicar_desconto(valor, desconto):
    return valor - (valor * desconto / 100)

valor = float(input("Digite o valor do produto: "))
desconto = float(input("Digite o desconto (%): "))

valor_final = aplicar_desconto(valor, desconto)
print("Valor final com desconto:", valor_final)