package tp10;

public class MyThread extends Thread{
    private Thread other;

    public MyThread(String tName){
        super(tName);
    }

    public void setOther(Thread o){
        this.other = o;
    }

    public void run(){
        for(int i=0; i<10; i++){
            System.out.println(currentThread().getName() + " " + currentThread().getState());
            System.out.println(currentThread().getName() + " " + this.other.getName() + " " + this.other.getState());
        }
    }

    public static void main(String[] args){
        MyThread threadA = new MyThread("threadA");
        MyThread threadB = new MyThread("threadB");

        threadA.setOther(threadB);
        threadB.setOther(threadA);

        System.out.println(threadA.getState());
        System.out.println(threadB.getState());

        threadA.start();
        threadB.start();


    }
}