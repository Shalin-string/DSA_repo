#include <stdio.h>

void add(int count)
{
    printf("Add\n");
    count++;
    if (count < 5)
    {
        add(count);
    }
    
}

int main()
{
    add(0);
    

    return 0;
}
