class even extends Thread{
    int num;
    even (int num){
    this.num=num;
    }
    public void run(){
        System.out.println("square:"+num+":"+(num*num));

    }
}
class odd extends Thread{
    int num;
    odd(int num){
    this.num=num;
    }
    public void run(){
        System.out.println("cube:"+num+":"+(num*num*num));
    }
}
class multi extends Thread{
    public void run(){
        try {
            for (int i = 0; i < 100; i++) {
                sleep(1000);
                if(i%2==0){
                    even e=new even(i);
                    e.start();
                }
                else{
                    odd o=new odd(i);
                    o.start();
                }

            }
        }catch(Exception e){
            System.out.println(e);
    }
}
}
class multithreadingex {
    public static void main(String[] args) {
        multi m=new multi();
        m.start();
    }
}