package interface_adapter.clear_users;

// TODO Complete me

import interface_adapter.ViewModel;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class ClearViewModel extends ViewModel{
    public final String TITLE_LABEL = "Clear Users View";

    public static final String CLEAR_BUTTON_LABEL = "Clear Users";
    public static final String CANCEL_BUTTON_LABEL = "Cancel";

    private static ClearState state = new ClearState();
    public ClearViewModel(String viewName) {
        super(viewName);
    }

    public void setState(ClearState clearState) {
        this.state = clearState;
        firePropertyChanged();
    }

    private final PropertyChangeSupport support = new PropertyChangeSupport(this);

    public void firePropertyChanged() {
        support.firePropertyChange("state", null, this.state);
    }
    public void addPropertyChangeListener(PropertyChangeListener listener) {
        support.addPropertyChangeListener(listener);
    }
    public static ClearState getState() {
        return state;
    }
}
