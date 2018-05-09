package com.example.lancemoreland.taskmanagerproject;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Date;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;


public class NewTask extends Fragment {

    private ActivityCallback activityCallback;

    @BindView(R.id.input_date_textView)
    protected Date dateDue;
    @BindView(R.id.input_details_editText)
    protected EditText taskDetails;
    @BindView(R.id.input_task_name_editText)
    protected EditText taskName;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_new_task, container, false);
        ButterKnife.bind(this, view);

        return view;
    }

    public static NewTask newInstance(){
        Bundle args = new Bundle();

        NewTask fragment = new NewTask();
        fragment.setArguments(args);
        return fragment;
    }

    @OnClick(R.id.create_task_button)
    protected void addButtonClicked(){
        if(taskName.getText().toString().isEmpty() || taskDetails.getText().toString().isEmpty() || dateDue.toString().isEmpty()){
            Toast.makeText(getActivity(), "All Fields are required!", Toast.LENGTH_LONG).show();
        }else{
            String dueDate = dateDue.toString();
            String detailsOfTask = taskDetails.getText().toString();
            String nameOfTask = taskName.getText().toString();

            addTaskToDatabase(taskName, taskDetails, dateDue);
            Toast.makeText(getActivity(), "Task created!", Toast.LENGTH_LONG).show();
        }

    }

    private void addGameToDatabase(final String dueDate, final String taskDetails, final String taskName) {
        NewTask newTask = new NewTask(taskDetails, taskName, new Date());
    }

    public void attachParent(ActivityCallback activityCallback){
        this.activityCallback = activityCallback;

    }

    public interface ActivityCallback{

    }

}
