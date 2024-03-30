package br.com.vvatte;

public class Customer {
    private String gradeRequest;
    private Boolean hasCompanyContract;

    public Customer(String gradeRequest, Boolean hasCompanyContract){
        this.gradeRequest = gradeRequest;
        this.hasCompanyContract = hasCompanyContract;
    }

    public Boolean hasCompanyContract(){
        return hasCompanyContract;
    }
    public  String getGradeRequest(){
        return gradeRequest;
    }
}
