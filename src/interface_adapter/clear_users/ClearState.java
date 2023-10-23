package interface_adapter.clear_users;

// TODO Complete me

public class ClearState {
    private boolean cleared;
    private String errorMessage;

    public ClearState() {
        this.cleared = false;
        this.errorMessage = "";
    }
    public boolean isCleared() {
        return cleared;
    }
    public void setCleared(boolean cleared) {
        this.cleared = cleared;
    }
    public String getErrorMessage() {
        return errorMessage;
    }
    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }
}
