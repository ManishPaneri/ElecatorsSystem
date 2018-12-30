# Elevator System Implementation in Java

I have tried to implement it using muti-threading and TreeSet. TreeSet is used to store incoming request. It is a good choice here as it removes the duplicate requests and implements NavigableSet which provide you methods such as floor and ceiling.

# Elevator in this program implements following features -
*	If elevator is going up or down, it checks for nearest floor request to process first in that direction. 
*	If there is no request to process, it waits at last processed floor.
*	If a new request comes while elevator is processing a request. It process the new request first if it is nearest than the processing floor in same direction.

