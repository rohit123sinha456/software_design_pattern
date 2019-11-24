class Single4{
    private static class lazy{
        static Single4 obj = new Single4();
    }
    private Single4(){
        System.out.println("In the constructor");
    }
    public static Single4 createInstance(){
        return(lazy.obj);
    }
}