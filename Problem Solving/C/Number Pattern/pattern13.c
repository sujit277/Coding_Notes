/*pattern13*/
#include<stdio.h>
#include<conio.h>
void main()
{
for(int i=1;i<=5;i++)
{
for(int j=1;j<=i;j++)
{
if(i%2==0)
{
printf("0");
}
else
{
printf("1");
}
}
printf("\n");
}
getch();
}