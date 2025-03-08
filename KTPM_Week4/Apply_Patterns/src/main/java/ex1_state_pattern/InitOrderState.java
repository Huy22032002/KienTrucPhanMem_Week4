package ex1_state_pattern;

public class InitOrderState implements OrderState {
    @Override
    public void handleReq() {
        System.out.println("Khoi tao thanh cong!");

    }
}
