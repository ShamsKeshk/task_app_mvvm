package com.example.android.todolist.view.model;

import android.arch.lifecycle.ViewModel;
import android.arch.lifecycle.ViewModelProvider;

import com.example.android.todolist.database.AppDatabase;
import com.example.android.todolist.view.model.AddTaskViewModel;

// Completed (1) Make this class extend ViewModel ViewModelProvider.NewInstanceFactory
public class AddTaskViewModelFactory extends ViewModelProvider.NewInstanceFactory {

    // Completed (2) Add two member variables. One for the database and one for the taskId
    private AppDatabase mAppDatabase;
    private int taskId ;

    // Completed (3) Initialize the member variables in the constructor with the parameters received

    public AddTaskViewModelFactory(AppDatabase mAppDatabase, int taskId) {
        this.mAppDatabase = mAppDatabase;
        this.taskId = taskId;
    }


// Completed (4) Uncomment the following method
    // Note: This can be reused with minor modifications

    @Override
    public <T extends ViewModel> T create(Class<T> modelClass) {
        //noinspection unchecked
        return (T) new AddTaskViewModel(mAppDatabase, taskId);
    }


}
