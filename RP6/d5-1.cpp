#include <iostream>
using namespace std;

int main() {
    double celsius;

    cout << "Digite a temperatura em Celsius: ";
    cin >> celsius;

    double fahrenheit = (celsius * 9/5) + 32;

    cout << "Temperatura em Fahrenheit: " << fahrenheit << endl;

    return 0;
}