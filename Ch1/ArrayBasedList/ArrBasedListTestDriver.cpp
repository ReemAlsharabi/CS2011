#include "ArrBasedList.h"
#include <string>
int main()
{
    ArrBasedList l = new ArrBasedList();
    cout << l.size() << endl;
    l.add(0,"Hanin");
    l.add(1,"Sara");
    l.add(1,"Lamar");
    l.add(1,"Walaa");
    cout << l.size() << endl;
    l.remove(1);
    for(int i=0; i<l.size();i++)
    {
        cout << l.get(i) << " ";
    }
    delete l;
    return 0;
}