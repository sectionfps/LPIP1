#include <iostream>
using namespace std;

int contar_vogais(string texto) {
    int contador = 0;

    for (int i = 0; i < texto.length(); i++) {
        char letra = tolower(texto[i]);

        if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
            contador++;
        }
    }

    return contador;
}

int main() {
    string texto;

    cout << "Digite uma palavra ou frase: ";
    getline(cin, texto);

    int resultado = contar_vogais(texto);

    cout << "Quantidade de vogais: " << resultado << endl;

    return 0;
}