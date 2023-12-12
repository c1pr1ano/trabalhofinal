package controller;

import model.Admin;
import view.AdminView;

public class AdminController {
    private AdminView model;
    private AdminView view;

    public AdminController(Admin model, AdminView view) {
        this.model = model;
        this.view = view;
    }

    public void setAdminName(String name) {
        model.setName(name);
    }

    public String getAdminName() {
        return model.getName();
    }

    public void updateAdminView() {
        view.printAdminDetails(model.getName(), model.getRole());
    }
}