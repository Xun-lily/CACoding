package use_case.clear_users;

// TODO Complete me


public class ClearInteractor implements ClearInputBoundary{
    private ClearOutputBoundary clearOutputBoundary;
    private ClearUserDataAccessInterface clearUserDataAccess;

    public ClearInteractor(ClearOutputBoundary clearOutputBoundary) {
        this.clearOutputBoundary = clearOutputBoundary;
    }
    public void execute(ClearInputData clearInputData) {
        try{
            clearUserDataAccess.clearAllUsers();
            ClearOutputBoundary.clearSuccess();
        } catch (Exception e) {
            ClearOutputBoundary.clearFailure("Failed to clear users: " + e.getMessage());
        }

    }
}
