#include <iostream>
using namespace std;

int main() {
    int A[15], B[15];

    for (int i = 0; i < 15; i++) {
        cout << "Digite o número " << (i + 1) << ": ";
        cin >> A[i];
    }

    for (int i = 0; i < 15; i++) {
        B[i] = A[i] * A[i];
    }

    cout << "\nMatriz A:" << endl;
    for (int i = 0; i < 15; i++) {
        cout << A[i] << " ";
    }

    cout << "\n\nMatriz B (quadrados):" << endl;
    for (int i = 0; i < 15; i++) {
        cout << B[i] << " ";
    }

    return 0;
}