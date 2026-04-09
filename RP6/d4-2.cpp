#include <iostream>
using namespace std;

string gerar_mensagem_boas_vindas(string nome, int idade) {
    return "Bem-vindo, " + nome + "! Você tem " + to_string(idade) + " anos.";
}

int main() {
    string nome;
    int idade;

    cout << "Digite seu nome: ";
    cin >> nome;

    cout << "Digite sua idade: ";
    cin >> idade;

    cout << gerar_mensagem_boas_vindas(nome, idade) << endl;

    return 0;
}