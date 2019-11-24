class Single3{
    static Single3 ss = new Single3();
    private Single3(){
        System.out.println("In the constructor");
    }
    public static Single3 createInstance(){
        return(ss);
    }
}