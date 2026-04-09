#include <iostream>
using namespace std;

int main() {
    double nota;

    cout << "Digite a nota (0 a 100): ";
    cin >> nota;

    if (nota >= 90) {
        cout << "Classificação: A" << endl;
    } else if (nota >= 80) {
        cout << "Classificação: B" << endl;
    } else if (nota >= 70) {
        cout << "Classificação: C" << endl;
    } else if (nota >= 60) {
        cout << "Classificação: D" << endl;
    } else {
        cout << "Classificação: E" << endl;
    }

    return 0;
}