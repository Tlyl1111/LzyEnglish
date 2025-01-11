package com.example.lzyenglish;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ProgressBar;

public class TimerFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_timer, container, false);

        // Lấy ProgressBar từ layout
        ProgressBar progressBar = view.findViewById(R.id.progress_bar);
        progressBar.setProgress(25); // Ví dụ: 25%

        // Lấy nút "Kiểm tra" từ layout
        Button checkButton = view.findViewById(R.id.btn_check);
        checkButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Tạo instance của ArrangeWordFragment
                ArrangeWordFragment arrangeWordFragment = new ArrangeWordFragment();

                // Sử dụng FragmentTransaction để thay thế Fragment
                FragmentTransaction transaction = requireActivity().getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.fragment_container, arrangeWordFragment); // R.id.fragment_container là ID của View chứa Fragment
                transaction.addToBackStack(null); // Để có thể quay lại TimerFragment nếu cần
                transaction.commit();
            }
        });

        return view;
    }


}
