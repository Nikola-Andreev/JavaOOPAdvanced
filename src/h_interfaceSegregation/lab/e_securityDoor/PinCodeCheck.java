package h_interfaceSegregation.lab.e_securityDoor;

public class PinCodeCheck extends SecurityCheck {

    private PinCodeUI securityUI;

    public PinCodeCheck(PinCodeUI securityUI) {
        this.securityUI = securityUI;
    }

    @Override
    public boolean validateUser() {
        int pin = securityUI.requestPinCode();
        if (isValid(pin)) {
            return true;
        }

        return false;
    }

    private boolean isValid(int pin) {
        return true;
    }
}
