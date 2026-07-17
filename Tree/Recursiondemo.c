#include <stdio.h>

void add(int count)
{
    
    printf("%d\n",count);
    count--;
    if (count > 0)
    {
        add(count);
    }
    
}

int main()
{
    add(5);
    

    return 0;
}
