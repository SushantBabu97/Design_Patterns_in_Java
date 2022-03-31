package com.example.CreationalPattern.BuilderPattern;

import java.util.List;

public class BuilderImplementation {
    public void implementer(){
        Library library = new Library().newBuilder()
                .setlibraryName("Library Department")
                .setlibraryNumber(23)
                .setStatus(false);
        library.totalEmployee(100);

        Account account = new Account().newBuilder()
                .setaccountName("Account Department")
                .setaccountNumber(12)
                .setStatus(true);
        account.totalEmployee(190);

        Institution ncit = new NCIT("NCIT","Koteshwor");
        ncit.addDepartments(library);
        ncit.addDepartments(account);
        getInformation(ncit);


    }

    private void getInformation(Institution institution){
        List<Department> departments  = institution.getDepartmentList();
        departments.forEach(department -> {
            department.getInformation();
        });

    }


}
