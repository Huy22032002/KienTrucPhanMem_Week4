package ex1_state_pattern;

public class ProcessingOrderState implements OrderState {
    @Override
    public void handleReq() {
        System.out.println("Dang xu ly!");
    }
}
