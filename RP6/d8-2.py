def classificar_triangulo(a, b, c):
    if a == b and b == c:
        return "Equilátero"
    elif a == b or a == c or b == c:
        return "Isósceles"
    else:
        return "Escaleno"

a = float(input("Digite o lado 1: "))
b = float(input("Digite o lado 2: "))
c = float(input("Digite o lado 3: "))

resultado = classificar_triangulo(a, b, c)
print("Triângulo", resultado)