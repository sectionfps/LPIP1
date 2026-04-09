#include <iostream>
using namespace std;

double celsius_para_fahrenheit(double celsius) {
    return (celsius * 9/5) + 32;
}

int main() {
    double celsius;

    cout << "Digite a temperatura em Celsius: ";
    cin >> celsius;

    double fahrenheit = celsius_para_fahrenheit(celsius);

    cout << "Temperatura em Fahrenheit: " << fahrenheit << endl;

    return 0;
}