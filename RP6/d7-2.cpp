#include <iostream>
using namespace std;

string classificar_nota(double nota) {
    if (nota >= 90) {
        return "A";
    } else if (nota >= 80) {
        return "B";
    } else if (nota >= 70) {
        return "C";
    } else if (nota >= 60) {
        return "D";
    } else {
        return "E";
    }
}

int main() {
    double nota;

    cout << "Digite a nota (0 a 100): ";
    cin >> nota;

    string resultado = classificar_nota(nota);

    cout << "Classificação: " << resultado << endl;

    return 0;
}