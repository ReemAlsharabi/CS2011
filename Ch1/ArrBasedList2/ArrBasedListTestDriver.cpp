#include "ArrBasedList.h"
#include <string>
#include <iostream>
int main()
{
    ArrBasedList l;
    string x;
    cin >> x;
    
    for(int i=0;i<x.length(); i++)
    {
        l.add(i, x.at(i));
    }

    for(int i=0; i<x.length();i++)
    {
        cout << l.pop();
    }
    return 0;
}
