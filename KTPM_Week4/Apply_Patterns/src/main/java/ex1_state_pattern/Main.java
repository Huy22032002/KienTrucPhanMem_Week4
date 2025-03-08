package ex1_state_pattern;

public class Main {
    public static void main(String[] args){
        //Trang thai dau tien
        Context context = new Context(new InitOrderState());
        context.handle();
        //trang thai thu 2
        context.setState(new ProcessingOrderState());
        context.handle();
        //trang thai 3
        context.setState(new DeliveriedOrderState());
        context.handle();
        //trang thai 4
        context.setState(new CancelOrderState());
        context.handle();
    }
}
