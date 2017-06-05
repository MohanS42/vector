#include<stdio.h>
int main()
{
int g;
printf("enter the number:");
scanf("%d",&g);
if(g>0)
{
    printf("positive");
    }
else if(g<0)
{
    printf("negative");
    }
else
{
    printf("zero");
    }
return 0;}
