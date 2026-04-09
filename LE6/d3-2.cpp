#include <iostream>
using namespace std;

bool validar_senha(string senha) {
    return senha.length() >= 8;
}

int main() {
    string senha;

    cout << "Digite uma senha: ";
    cin >> senha;

    while (!validar_senha(senha)) {
        cout << "Senha inválida! Deve ter pelo menos 8 caracteres." << endl;
        cout << "Digite novamente: ";
        cin >> senha;
    }

    cout << "Senha válida!" << endl;

    return 0;
}