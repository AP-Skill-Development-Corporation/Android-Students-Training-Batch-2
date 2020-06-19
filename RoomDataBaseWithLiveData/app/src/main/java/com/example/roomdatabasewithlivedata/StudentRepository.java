package com.example.roomdatabasewithlivedata;

import android.app.Application;
import android.os.AsyncTask;

import androidx.lifecycle.LiveData;

import java.util.List;

public class StudentRepository {

    StudentDatabase database;
    LiveData<List<Student>> readStudentsData;

    public StudentRepository(Application application) {
        database = StudentDatabase.getDataBase(application);
        readStudentsData = database.myDao().readData();
    }

    public void insertdata(Student student){
        new InsertTask().execute(student);
    }

    public void deleteData(Student student){
        new DeleteTask().execute(student);
    }

    public LiveData<List<Student>> readStudentData(){
        return readStudentsData;
    }


    class InsertTask extends AsyncTask<Student,Void,Void>{

        @Override
        protected Void doInBackground(Student... students) {
                database.myDao().insert(students[0]);
            return null;
        }
    }


    class  DeleteTask extends AsyncTask<Student,Void,Void>{

        @Override
        protected Void doInBackground(Student... students) {
            database.myDao().delete(students[0]);
            return null;
        }
    }

}
