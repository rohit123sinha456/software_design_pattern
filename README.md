This Branch deals with the singleton pattern

The singleton pattern is basically when we want to create a single onject of the class. Like when we want to create a connection to the database we want only a single object to be present that create the connect and all other class uses it.

There are many ways to create multiple objects in java
1. Using the new operator
    for now this is good that one process can create the object once only
    what about if two process/Thread wnats to create it 2 objects will be created(PROBLEM())
2. Using the synchronised operator
    see test case 2 shos that multiple objects can be created to deal with this we have to write the createINstance method like
        to see the prblem run Testcase.jave and keep the run method with with Single.createINstance
        public static synchronized Single createInstance(){
3. This creates the problem that multithreading of a program using the object cannot be done
    To deal with this problem we udoes implementation 3. we create an object and basically reaturns the instance the problem with this one is that object is created even when its not being used 
4. his solution is we do lazy loading that is whenever object is needed we then load it. we put that initialization of the object inside a class(nested static class. so when we call the createInstance method then only the object is created(lazy binding))