/*pattern5*/
#include<stdio.h>
#include<conio.h>
void main()
{
for(int i=1;i<=5;i++)
{
for(int j=5;j>i;j--)
{
printf(" ");
}
for(int j=1;j<=i;j++)
{
printf("*");
}
printf("\n");
}
getch();
}