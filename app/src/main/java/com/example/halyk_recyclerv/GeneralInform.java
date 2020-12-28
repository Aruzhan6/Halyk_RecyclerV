package com.example.halyk_recyclerv;

public class GeneralInform {
    private String contract,description;
    private int imageId;

    public GeneralInform(String contract, String description, int imageId) {
        this.contract = contract;
        this.description = description;
        this.imageId = imageId;
    }

    public String getContract() {
        return contract;
    }

    public void setContract(String contract) {
        this.contract = contract;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }
}
