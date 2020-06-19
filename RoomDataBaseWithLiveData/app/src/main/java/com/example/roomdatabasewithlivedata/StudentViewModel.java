package com.example.roomdatabasewithlivedata;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import java.util.List;

public class StudentViewModel extends AndroidViewModel {

    StudentRepository repository;
    LiveData<List<Student>> readData;

    public StudentViewModel(@NonNull Application application) {
        super(application);
        repository = new StudentRepository(application);
        readData = repository.readStudentData();
    }

    public void insert(Student student) {
        repository.insertdata(student);
    }

    public void delete(Student student){
        repository.deleteData(student);
    }

    public LiveData<List<Student>> readData(){
        return readData;
    }
}
