#include <iostream> 
#include <vector>
#include <string>

using namespace std;

void exibirCabecalho() {
    cout << "=================================" << endl;
    cout << "     SORVETERIA DO DENER" << endl;
    cout << "   Sistema de Controle de Estoque" << endl;
    cout << "=================================" << endl;
}

string verificarEstoqueCritico(int quantidade) {
    if (quantidade < 5) {
        return "[REPOSIÇÃO NECESSÁRIA]";
    }
    return "";
}

int main() {
    vector<string> nomes;
    vector<int> quantidades;

    exibirCabecalho();

    for (int i = 0; i < 3; i++) {
        string nome;
        int qtd;

        cout << "Digite o nome do insumo: ";
        getline(cin, nome);

        cout << "Digite a quantidade: ";
        cin >> qtd;
        cin.ignore(); // limpa o ENTER do buffer

        nomes.push_back(nome);
        quantidades.push_back(qtd);
    }

    cout << "\nRelatório de Estoque:" << endl;

    for (int i = 0; i < nomes.size(); i++) {
        string aviso = verificarEstoqueCritico(quantidades[i]);
        cout << "Produto: " << nomes[i]
             << " | Estoque: " << quantidades[i]
             << " unidades " << aviso << endl;
    }

    return 0;
}