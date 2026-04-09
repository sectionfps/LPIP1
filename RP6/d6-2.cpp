#include <iostream>
using namespace std;

double aplicar_desconto(double valor, double desconto) {
    return valor - (valor * desconto / 100);
}

int main() {
    double valor, desconto;

    cout << "Digite o valor do produto: ";
    cin >> valor;

    cout << "Digite o desconto (%): ";
    cin >> desconto;

    double valor_final = aplicar_desconto(valor, desconto);

    cout << "Valor final com desconto: " << valor_final << endl;

    return 0;
}