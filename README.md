# JAVA8-StreamAPI-Lazy-Pipeline
Lazy loading :
Stream operations are lazy loaded.
Intermediate operations are called only after calling the terminal operator.

Pipelining :
The example demonstrates this behaviour, where we have two intermediate operations namely map and filter. 
The output shows, neither the map nor the filter is executed independently over the entire size of the available stream. 
First, the id – 1,2 didn’t pass the filter test.
The the id – 3,4,5 are passed the filter and immediately moved to the map. 
So, once passed through the filter it is immediately available to the map operation, 
no matter how many elements are still lined in the stream before the filter operation.

