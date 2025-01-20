public class Task_1 implements Runnable{
        @Override
        public void run(){
            for(int i = 0; i < 10; i++){
                System.out.println("Thread name: "+ Thread.currentThread().getName()+" number: " + i);
                if(i == 5 && Thread.currentThread().getName().equals("T1")){
                    System.out.println("Thread is yielded");
                    Thread.yield();
                }
            }
        }
}