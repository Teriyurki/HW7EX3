package com.example.hw7ex3;

public class Task {

    private int id;
    private String task;

    public Task (int newId, String newTask){
        setID(newId);
        setTask(newTask);
    }


    private void setTask(String newTask) {
        task = newTask;
    }

    private void setID(int newId) {

        id = newId;
    }
    public int getId() {
        return id;
    }

    public String getTask() {

        return task;
    }


    public String toString() {

        return id + ":" + task;
    }
}
