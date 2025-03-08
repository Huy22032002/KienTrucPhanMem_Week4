package ex1_state_pattern;

public class DeliveriedOrderState implements OrderState {
    @Override
    public void handleReq(){
        System.out.println("Da giao thanh cong!");
    }
}
