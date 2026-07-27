#include <stdio.h>

void printNum(int start, int end)
{
    printf("%d ",end);
    if (start < end)
    {
        printNum(start, --end);
    }
       
}

int main()
{
    printNum(5,10);

    return 0;
}
