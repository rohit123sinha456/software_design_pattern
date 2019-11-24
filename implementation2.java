class Single2{
    public static Single2 ss = null;
    static int counter = 0;
    // we make the constructor private so that no one else can create object  outside the class
    private Single2(){
        System.out.println("In side the constructor");
        counter++;
        System.out.println("Counter value is"+counter);

    }

    // we create a public method that will create the object
    /** The method will check if the object is already made ot not if no then only it 
     * will create the 
     * object
     */

    public static synchronized Single2 createInstance(){
        if(ss == null){
        ss = new Single2();
        return(ss);}
        else{
        System.out.println("Already exist");
        return(ss);}
    }
}