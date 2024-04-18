package com.example.customer_support_app.Model;

public class ProjectItemModel {
    public String  projectName,projectStatus,projectStartDate,projectManagerName;
    public int  projectMangerImg;
    public String projectStatusColor;

    ProjectItemModel(){
        // for firebase
    }

    public ProjectItemModel(String projectName, String projectStatus, String projectStartDate, String projectManagerName, int projectMangerImg, String projectStatusColor) {
        this.projectName = projectName;
        this.projectStatus = projectStatus;
        this.projectStartDate = projectStartDate;
        this.projectManagerName = projectManagerName;
        this.projectMangerImg = projectMangerImg;
        this.projectStatusColor = projectStatusColor;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getProjectStatus() {
        return projectStatus;
    }

    public void setProjectStatus(String projectStatus) {
        this.projectStatus = projectStatus;
    }

    public String getProjectStartDate() {
        return projectStartDate;
    }

    public void setProjectStartDate(String projectStartDate) {
        this.projectStartDate = projectStartDate;
    }

    public String getProjectManagerName() {
        return projectManagerName;
    }

    public void setProjectManagerName(String projectManagerName) {
        this.projectManagerName = projectManagerName;
    }

    public int getProjectMangerImg() {
        return projectMangerImg;
    }

    public void setProjectMangerImg(int projectMangerImg) {
        this.projectMangerImg = projectMangerImg;
    }

    public String getProjectStatusColor() {
        return projectStatusColor;
    }

    public void setProjectStatusColor(String projectStatusColor) {
        this.projectStatusColor = projectStatusColor;
    }
}
