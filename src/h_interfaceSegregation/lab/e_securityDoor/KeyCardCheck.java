package h_interfaceSegregation.lab.e_securityDoor;

public class KeyCardCheck extends SecurityCheck {

    private KeyCardUi securityUI;

    KeyCardCheck(KeyCardUi securityUI) {
        this.securityUI = securityUI;
    }

    @Override
    public boolean validateUser() {
        String code = securityUI.requestKeyCard();
        return isValid(code);
    }

    private boolean isValid(String code) {
        return true;
    }
}
