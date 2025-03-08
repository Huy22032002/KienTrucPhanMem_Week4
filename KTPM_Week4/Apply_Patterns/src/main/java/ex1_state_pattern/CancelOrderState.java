package ex1_state_pattern;

public class CancelOrderState implements OrderState {
    @Override
    public void handleReq() {
        System.out.println("Don hang da huy thanh cong!");
    }
}
