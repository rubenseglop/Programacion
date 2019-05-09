#include <stdio.h>
#include <stdlib.h>

int main(void)
{
            int i;
            printf("Introduzca número del 1 al 5:");
    scanf("%d",&i);

    if (i!=4) {
       printf("Es primo.");
    }
    else
    {
       printf("No es primo.");
    }

    system("PAUSE");     
    return 0;
}
