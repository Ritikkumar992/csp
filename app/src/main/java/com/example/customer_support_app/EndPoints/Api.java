package com.example.customer_support_app.EndPoints;

import com.example.customer_support_app.Model.CreateProjectModel;
import com.example.customer_support_app.Model.ManagerListModel;
import com.example.customer_support_app.Model.ProjectItemModel;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface Api {
    @GET("getManagers?role_id=rol_qLO42FIvSNsdZEO4")
    Call<List<ManagerListModel>> getManagers();

    @POST("addProject")
    Call<List<CreateProjectModel>>createProject (@Body CreateProjectModel body);

    @GET("projects")
    Call<List<ProjectItemModel>> getProjects(@Query("role") String role, @Query("id") String id);

}
/**
 * http://localhost:8000/getManagers?role_id=rol_qLO42FIvSNsdZEO4
 */