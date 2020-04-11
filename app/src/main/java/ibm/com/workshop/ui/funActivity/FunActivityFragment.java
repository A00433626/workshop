package ibm.com.workshop.ui.funActivity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import ibm.com.workshop.R;

public class FunActivityFragment extends Fragment {

    private FunActivityViewModel funActivityViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        funActivityViewModel =
                ViewModelProviders.of(this).get(FunActivityViewModel.class);
        View root = inflater.inflate(R.layout.fragment_fun, container, false);
        return root;
    }
}