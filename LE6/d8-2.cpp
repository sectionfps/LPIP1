#include <iostream>
using namespace std;

string classificar_triangulo(double a, double b, double c) {
    if (a == b && b == c) {
        return "Equilátero";
    } else if (a == b || a == c || b == c) {
        return "Isósceles";
    } else {
        return "Escaleno";
    }
}

int main() {
    double a, b, c;

    cout << "Digite o lado 1: ";
    cin >> a;

    cout << "Digite o lado 2: ";
    cin >> b;

    cout << "Digite o lado 3: ";
    cin >> c;

    string resultado = classificar_triangulo(a, b, c);

    cout << "Triângulo " << resultado << endl;

    return 0;
}