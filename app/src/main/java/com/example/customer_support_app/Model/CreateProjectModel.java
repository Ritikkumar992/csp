package com.example.customer_support_app.Model;

public class CreateProjectModel {
    private String _id;
    private String name;
    private AssociatedManager associated_manager;
    private String status;
    private String start_date;

    // Constructors
    public CreateProjectModel() {
    }

    public CreateProjectModel(String _id, String name, AssociatedManager associated_manager, String status, String start_date) {
        this._id = _id;
        this.name = name;
        this.associated_manager = associated_manager;
        this.status = status;
        this.start_date = start_date;
    }
    public static class AssociatedManager {
        private String _id;
        private String name;
        private String designation;

        // Constructors, getters, and setters

        public AssociatedManager(String _id, String name, String designation) {
            this._id = _id;
            this.name = name;
            this.designation = designation;
        }

        public String get_id() {
            return _id;
        }

        public void set_id(String _id) {
            this._id = _id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getDesignation() {
            return designation;
        }

        public void setDesignation(String designation) {
            this.designation = designation;
        }
    }

    // Getters and setters
    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public AssociatedManager getAssociated_manager() {
        return associated_manager;
    }

    public void setAssociated_manager(AssociatedManager associated_manager) {
        this.associated_manager = associated_manager;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStart_date() {
        return start_date;
    }

    public void setStart_date(String start_date) {
        this.start_date = start_date;
    }
}
