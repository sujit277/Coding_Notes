/*pattern12*/
#include<stdio.h>
#include<conio.h>
void main()
{
for(int i=1;i<=5;i++)
{
for(int j=i;j<5;j++)
{
printf(" ");
}
for(int j=i;j>=1;j--)
{
printf("%d",j);
}
for(int j=2;j<=i;j++)
{
printf("%d",j);
}
printf("\n");
}
getch();
}