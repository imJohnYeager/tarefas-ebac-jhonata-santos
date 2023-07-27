package br.com.jyeager.padroesdeprojeto.deCriacao.factory;

public class Customer {

    private String gradeRequest;
    private Boolean hasCompanyContract;

    public Customer(String gradeRequest, Boolean hasCompanyContract) {
        this.gradeRequest = gradeRequest;
        this.hasCompanyContract = hasCompanyContract;
    }

    public Boolean getHasCompanyContract() {
        return hasCompanyContract;
    }

    public String getGradeRequest() {
        return gradeRequest;
    }
}
