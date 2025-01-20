
public class Yield_Thread{
    /*
     *Yield causes the current running thread to leave the CPU and sit in runnable queue so that threads of the same priority can 
     *take it's turn and get executed by the CPU no gaurentee that it will be honored by the JVM.
     *
     * NOTE:
     *  1. In this example t1 thread will ever get past 5 before switching over to t2
     */
    public static void main(String[]args) throws Exception{
        Runnable r1 = new Task_1();
        Runnable r2 = new Task_1();
        Thread t1 = new Thread(r1, "T1");
        Thread t2 = new Thread(r2, "T2");
        t1.start();
        t2.start();
        t1.join();
        t2.join();
    }
}