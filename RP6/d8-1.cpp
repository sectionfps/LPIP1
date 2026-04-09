#include <iostream>
using namespace std;

int main() {
    double a, b, c;

    cout << "Digite o lado 1: ";
    cin >> a;

    cout << "Digite o lado 2: ";
    cin >> b;

    cout << "Digite o lado 3: ";
    cin >> c;

    if (a == b && b == c) {
        cout << "Triângulo Equilátero" << endl;
    } else if (a == b || a == c || b == c) {
        cout << "Triângulo Isósceles" << endl;
    } else {
        cout << "Triângulo Escaleno" << endl;
    }

    return 0;
}