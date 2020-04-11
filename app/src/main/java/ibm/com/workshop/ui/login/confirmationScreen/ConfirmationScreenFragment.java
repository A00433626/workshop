package ibm.com.workshop.ui.login.confirmationScreen;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import ibm.com.workshop.R;

public class ConfirmationScreenFragment extends Fragment {
String firstName;
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.confirmation_screen, container, false);
      firstName =ConfirmationScreenFragmentArgs.fromBundle(getArguments()).getFirstName();
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        poulateConfirmationText(view);
    }

    private void poulateConfirmationText(View view) {
        TextView confirmationTextView=view.findViewById(R.id.confirmation_text_view);
        confirmationTextView.setText("Hi "+firstName+" Welcome to confirmation screen");
    }
}
