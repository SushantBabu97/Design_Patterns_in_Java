package com.example.CreationalPattern.BuilderPattern;

public class Library extends Department{
    private  String libraryName;
    private  Integer libraryNumber;
    private Integer libraryEmployee;
    private boolean status;
    public Library newBuilder(){
        return this;
    }

    @Override
    void totalEmployee(Integer totalEmployee) {
        this.libraryEmployee = totalEmployee;
    }

    public Integer getLibraryEmployee() {
        return libraryEmployee;
    }

    public String getlibraryName() {
        return libraryName;
    }

    public Library setlibraryName(String libraryName) {
        this.libraryName = libraryName;
        return this;
    }

    public Integer getlibraryNumber() {
        return libraryNumber;
    }

    public Library setlibraryNumber(Integer libraryNumber) {
        this.libraryNumber = libraryNumber;
        return this;
    }


    public Library setStatus(boolean status) {
        this.status = status;
        return this;
    }

    public boolean isStatus() {
        return status;
    }

    @Override
    public void getInformation() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Library{" +
                "libraryName='" + libraryName + '\'' +
                ", libraryNumber=" + libraryNumber +
                ", libraryEmployee=" + libraryEmployee +
                ", status=" + status +
                '}';
    }
}
