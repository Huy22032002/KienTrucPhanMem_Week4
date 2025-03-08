package ex1_state_pattern;

public class Context {
    private OrderState orderState;

    public Context(OrderState orderState){
        this.orderState = orderState;
    }
    public void setState(OrderState orderState){
        this.orderState = orderState;
    }

    public void handle(){
        orderState.handleReq();
    }
}
