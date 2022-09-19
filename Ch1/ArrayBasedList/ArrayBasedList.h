#ifndef ArrBasedList_H
#define ArrBasedList_H
#include <string>
using namespace std;
class ArrBasedList
{
    private:
        char *a;
	    int s;
    public:
        ArrBasedList();
        ~ArrBasedList();
        int size();
        char get(int);
        void set(int, char);
        void add(int, char);
        char remove(int);
        char pop();
        void push(char);
};
#endif
