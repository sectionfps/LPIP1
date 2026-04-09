a = float(input("Digite o lado 1: "))
b = float(input("Digite o lado 2: "))
c = float(input("Digite o lado 3: "))

if a == b and b == c:
    print("Triângulo Equilátero")
elif a == b or a == c or b == c:
    print("Triângulo Isósceles")
else:
    print("Triângulo Escaleno")