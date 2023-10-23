package interface_adapter.clear_users;

// TODO Complete me

import interface_adapter.ViewManagerModel;
import use_case.clear_users.ClearOutputBoundary;

public class ClearPresenter implements ClearOutputBoundary {
    private ClearViewModel  clearViewModel;
    private ViewManagerModel viewManagerModel;
    public ClearPresenter(ViewManagerModel viewManagerModel,
                           ClearViewModel clearViewModel) {
        this.clearViewModel = clearViewModel;
        this.viewManagerModel = viewManagerModel;
    }
    public void prepareSuccessView(){
        ClearState clearState = ClearViewModel.getState(); // Use clearViewModel to get the state
        clearState.setCleared(true); // Indicate that the clearing was successful
        clearViewModel.setState(clearState);

        viewManagerModel.setActiveView(clearViewModel.getViewName());
        clearViewModel.firePropertyChanged(); // Notify listeners of state changes
        viewManagerModel.firePropertyChanged();

    }
    public void prepareFailView(){
        ClearState clearState = ClearViewModel.getState();
        clearState.setCleared(false); // Indicate that the clearing failed
        clearViewModel.setState(clearState);

        viewManagerModel.setActiveView(clearViewModel.getViewName());
        clearViewModel.firePropertyChanged(); // Notify listeners of state changes
        viewManagerModel.firePropertyChanged();
    }

}
