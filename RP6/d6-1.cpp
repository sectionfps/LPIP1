#include <iostream>
using namespace std;

int main() {
    double valor, desconto;

    cout << "Digite o valor do produto: ";
    cin >> valor;

    cout << "Digite o desconto (%): ";
    cin >> desconto;

    double valor_final = valor - (valor * desconto / 100);

    cout << "Valor final com desconto: " << valor_final << endl;

    return 0;
}