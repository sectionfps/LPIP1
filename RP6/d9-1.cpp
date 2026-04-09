#include <iostream>
using namespace std;

int main() {
    string texto;
    int contador = 0;

    cout << "Digite uma palavra ou frase: ";
    getline(cin, texto);

    for (int i = 0; i < texto.length(); i++) {
        char letra = tolower(texto[i]);

        if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
            contador++;
        }
    }

    cout << "Quantidade de vogais: " << contador << endl;

    return 0;
}