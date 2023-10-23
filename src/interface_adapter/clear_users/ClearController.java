package interface_adapter.clear_users;

//  Complete me
import use_case.clear_users.ClearInputData;
import use_case.clear_users.ClearInputBoundary;

public class ClearController {
    final ClearInputBoundary userClearUseCaseInteractor;

    public ClearController(ClearInputBoundary userClearUseCaseInteractor){
        this.userClearUseCaseInteractor = userClearUseCaseInteractor;
    }

    public void execute() {
        ClearInputData clearInputData = new ClearInputData();

        userClearUseCaseInteractor.execute(clearInputData);
    }
}
