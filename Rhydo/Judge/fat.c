/*
 * fat.c
 * 
 * Copyright 2017 Carlos Henrique Rorato <carlosrorato@CarlosRorato>
 * 
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
 * MA 02110-1301, USA.
 * 
 * 
 */


#include <stdio.h>

int fatorial(int n);

int main(int argc, char **argv)
{
	int n,i,a;
	scanf("%d",&n);
	for(i=0;i<n;i++){
		scanf("%d",&a);
		if(a<0) printf("erro\n");
		else printf("%d\n",fatorial(a));
	}
	return 0;
}

int fatorial(int n){
	if(n==0 || n==1) return 1;
	else return n*fatorial(n-1);
}

