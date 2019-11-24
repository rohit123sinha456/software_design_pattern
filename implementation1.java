class Single{
    public static Single ss = null;
    // we make the constructor private so that no one else can create object  outside the class
    private Single(){
        System.out.println("In side the constructor");
    }

    // we create a public method that will create the object
    /** The method will check if the object is already made ot not if no then only it 
     * will create the 
     * object
     */

    public static Single createInstance(){
        if(ss == null){
        ss = new Single();
        return(ss);}
        else{
        System.out.println("Already exist");
        return(ss);}
    }
}