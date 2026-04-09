#include <iostream>
using namespace std;

int main() {
    string nome;
    int idade;

    cout << "Digite seu nome: ";
    cin >> nome;

    cout << "Digite sua idade: ";
    cin >> idade;

    cout << "Bem-vindo, " << nome << "! Você tem " << idade << " anos." << endl;

    return 0;
}