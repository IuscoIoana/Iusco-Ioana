package ex2L2;
//MVC design pattern,using observer-observable mechanism
// o zis ca pot folosi implements runnable in loc de extends treads', ca sa modific ceva
//Model-View-Controller
// 1 window,1 fir si 1 main =>3 clase
public class main {
    private static final int noOfThreads=2;
    private static final int processorLoad=Integer.MAX_VALUE;
    public static void main(String args[]){
        Window win=new Window(noOfThreads);
        for(int i =0; i<noOfThreads; i++){
            Thread t = new Thread(new fir(i, win, processorLoad));
            t.setPriority(i%10 + 1);
            t.start();
        }
    }
}
//asta o sa fie clasa principala
//in care apelez doar metodele facute acolo