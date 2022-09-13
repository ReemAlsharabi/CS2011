TARGETS	=		list

all:		$(TARGETS)

ArrBasedList:		listTestDriver.o  ArrBasedList.o
	g++ -o		ArrBasedList		listTestDriver.o		ArrBasedList.o

ArrBasedListTestDriver.o:		ArrBasedListTestDriver.cc		ArrBasedList.h
	g++ -c ArrBasedListTestDriver.cc

ArrBasedList.o:		ArrBasedList.cc		ArrBasedList.h
	g++ -c ArrBasedList.cc

clean:$
	rm -f *.o ArrBasedList