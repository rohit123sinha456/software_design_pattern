class Access extends Thread{
    public void test1() {
        /**
         * In this test case e just call the test instance from twice to see
         * that the object is created once only
         */
        Single.createInstance();
        Single.createInstance();
        
    }
    /** the function for multi threading */
    public void run(){
        Single2.createInstance();
    }
    /** */
    public void test2() {
        /**I this test case we show that if we call the method
         * from two thread we get create the instance twice
         */
        for (int i=0; i<8; i++) 
        { 
            /** One object can call the start and make an object once only
             * thus we are creating multiple objects 
             */
            Access object = new Access(); 
            object.start(); 
        } 
    }
    public void test3(){
        Single3.createInstance();
    }
    public void test4() {
        Single4.createInstance();
        
    }
    public static void main(String args[]) {
        Access obj = new Access();
        /**System.out.println("Tring to create object from one thread more than once");
        obj.test1();
        System.out.println("Tring to create object from multiple thread thread only than once and actually we can. this is a problem");
        obj.test2();
        System.out.println("implementaion of 3");
        obj.test3();*/
        obj.test4();
    }
}