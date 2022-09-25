#ifndef ArrBasedQueue_H
#define ArrBasedQueue_H
#include <string>
using namespace std;
class ArrBasedQueue
{
    private:
        string *a;
	    int n; // number of elemnts
        int j; // first element's index
    public:
        ArrBasedQueue();
        ~ArrBasedQueue();
        void add(string);
        string remove();
        void resize();
        void rotate(int);
};
#endif
