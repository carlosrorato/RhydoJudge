#include <stdio.h>

int fat(int n)
{
	if(n == 0 || n == 1) 
		return 1;
	return n * fat(n - 1);
}
int main()
{
	int qtd;
	scanf("%d",&qtd);
	int v[qtd];
	int i = 0;
	int valor;
	while (i <qtd)
	{
		scanf("%d",&valor);
		
		if(valor < 0) v[i] = 0;
		else v[i] = fat(valor);

		i++;
	}
	for(i = 0; i < qtd; i++)
	{
		if(v[i] == 0) printf("erro");
		printf("%d\n",v[i]);
	}
	return 0;
}