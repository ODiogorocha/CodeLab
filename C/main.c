#include <stdio.h>
#include <stdlib.h>

void range_pares (int inicio, int final) {
    int range = final - inicio;
    
    for(int i = 0 ; i <= range; i++) {
        if ((inicio + i)%2 == 0 ) {
            printf("%d\n", inicio + i);
        }
    }
}

int main(){
range_pares(0, 100);
}