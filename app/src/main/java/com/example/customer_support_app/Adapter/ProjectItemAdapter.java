package com.example.customer_support_app.Adapter;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.example.customer_support_app.Model.ProjectItemModel;
import com.example.customer_support_app.R;
import java.util.List;

public class ProjectItemAdapter extends RecyclerView.Adapter<ProjectItemAdapter.ViewHolder> {

    Context context;
    List<ProjectItemModel> projectItemModelsArr;

    public ProjectItemAdapter(Context context, List<ProjectItemModel> projectItemModelsArr) {
        this.context = context;
        this.projectItemModelsArr = projectItemModelsArr;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.project_data_row,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.ProjectName.setText(projectItemModelsArr.get(position).projectName);
        holder.ProjectStatus.setText(projectItemModelsArr.get(position).projectStatus);
        holder.ProjectStatus.setBackgroundColor(Color.GRAY);

        holder.ProjectStartDate.setText(projectItemModelsArr.get(position).projectStartDate);
        holder.ProjectManagerImg.setImageResource(R.drawable.profile_logo3);
        holder.ProjectManagerName.setText(projectItemModelsArr.get(position).projectManagerName);
    }

    @Override
    public int getItemCount() {
        return projectItemModelsArr.size();
    }

    public class ViewHolder extends  RecyclerView.ViewHolder{

        TextView ProjectName, ProjectStatus,ProjectStartDate,ProjectManagerName;
        ImageView ProjectManagerImg;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            ProjectName = itemView.findViewById(R.id.projectName);
            ProjectStatus = itemView.findViewById(R.id.projectStatus);
            ProjectStartDate = itemView.findViewById(R.id.projectStartDate);
            ProjectManagerName = itemView.findViewById(R.id.projectManager);
            ProjectManagerImg = itemView.findViewById(R.id.userIcon);


            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (mListener != null) {
                        int position = getAdapterPosition();
                        if (position != RecyclerView.NO_POSITION) {
                            mListener.onItemClick(position);
                        }
                    }
                }
            });
        }
    }
    private OnItemClickListener mListener;

    public void setOnItemClickListener(OnItemClickListener listener) {
        mListener = listener;
    }

    public interface OnItemClickListener {
        void onItemClick(int position);
    }
}
