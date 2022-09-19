#include "ArrBasedList.h"
#include <string>
#include <iostream>
using namespace std;

ArrBasedList::ArrBasedList()
{
	a = new char[10];
	s = 0; // the number of elements in the list
}
ArrBasedList::~ArrBasedList()
{
	delete [] a;
}
int ArrBasedList::size()
{
	return s;
} // O(1)
char ArrBasedList::get(int i)
{
	return a[i];
}
void ArrBasedList::set(int i, char x)
{
	a[i] = x;
} // O(1)
void ArrBasedList::add(int i, char x)
{
	if (s == 10)
		cout << "You cannot add new elements." << endl;
	else
	{
		for (int j = s; j > i; j--) // start from the right
			a[j] = a[j - 1];
	}
	a[i] = x;
	s++;
}
char ArrBasedList::remove(int i)
{
	char x = a[i];				// store the element
	for (int j = i; j < s - 1; j++) // start from the right
		a[j] = a[j + 1];
	s--;
	return x;
}
char ArrBasedList::pop()
{
	return remove(s-1);
}
void ArrBasedList::push(char x)
{
	add(s, x);
}
