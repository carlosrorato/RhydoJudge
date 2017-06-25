/*Acquila Santos Rocha UFG - Ciências da Computação

* Exercício da Formiga querendo doce
* Para execução desse programa foi utilizada como técnica principal um bfs que percorre elemento por elemento da matriz

*/

#include <stdio.h>
#include <stdlib.h>

#define MAX 200000

typedef struct no
{
	int i, j;
	struct no* prox;
}No; 

No* criarLista()
{
	No* lista = (No*)malloc(sizeof(No));
	lista->prox = NULL;
	return lista;
}
void libera(No *LISTA)
{
	if(LISTA->prox != NULL){
		No *proxNode,
			  *atual;

		atual = LISTA->prox;
		while(atual != NULL){
			proxNode = atual->prox;
			free(atual);
			atual = proxNode;
		}
	}
}

void exibe(No *LISTA)
{
	if(LISTA->prox == NULL){
		printf("Lista vazia!\n\n");
		return ;
	}

	No *tmp;
	tmp = LISTA->prox;

	while( tmp != NULL){
		printf("%5d", tmp->valor);
		tmp = tmp->prox;
	}
	printf("\n\n");
}

int tamanhoLista(No* lista)
{
	No* aux = lista->prox;
	int i = 1;
	while(aux->prox != NULL)
	{
		aux = aux->prox;
		i++;
	}
	return i;
}

void pushFim(No* lista, int i, int j)
{
	No* novoNo = (No*)malloc(sizeof(No));
	novoNo->i = i;
    novoNo->j = j;
	if(!novoNo)
	{
		printf("Sem Memoria\n");
		exit(1);
	}
	if(lista->prox == NULL)
	{
		lista->prox = novoNo;
	}
	else
	{
		No* aux = lista->prox;
		while(aux->prox != NULL)
		{
			aux = aux->prox;
		}
		aux->prox = novoNo;
	}
}

int popInicio(No* lista, int* j)
{
	if(lista->prox == NULL)
	{
		printf("Nao ha elementos na fila\n");
		return;
	}
	int i = lista->i;
    *j = lista->j;
	No* auxNo = lista->prox;
	lista->prox = auxNo->prox;
	free(auxNo);

	return i;
}

void setMatriz(int** mat, int n)
{
    int i, j;
    for(i = 0; i < n; i++)
    {
        for(j = 0; j < n; j++)
        {
            scanf("%d",&mat[i][j]);
        }
    }
}

void BFS(int** mat, int n)
{
    No* fila = criaLista();
	for (i = 0; i <= vertices; ++i) {
		//Initialising our arrays
		adjacency_list[i] = NULL;
		parent[i] = 0;
		level[i] = -1;
	}
    for(i = 0; i < n, i++)
    {
        for(j = 0 ; j < n; j++)
        {
            if(i == 0 && j == 0)
            {
                
            }
        }
    }
}
