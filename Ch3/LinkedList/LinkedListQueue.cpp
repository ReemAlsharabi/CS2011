#include "LinkedListQueue.h"
LinkedListQueue::LinkedListQueue()
{
    head = NULL;
    tail = NULL;
    n = 0;
}
void LinkedListQueue::push(string x)
{
    Node *a = new Node;
    a->data = x;
    a->next = tail;
    tail = a;
    if (n==0)
    {
        head = a;
        tail = a;
    }
    else
    {
        tail->next = a;
		tail = a;
    }
    n++;
}

string LinkedListQueue::pop()
{
    if (n==0)
		return NULL;
	Node *a = head;
	head = head->next;
	n--;
	if (n==0)
		tail = NULL;
	return a->data;
}
