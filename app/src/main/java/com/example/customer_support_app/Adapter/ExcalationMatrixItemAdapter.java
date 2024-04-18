package com.example.customer_support_app.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.example.customer_support_app.Model.ExcalationMatrixItemModel;
import com.example.customer_support_app.R;

import java.util.ArrayList;

public class ExcalationMatrixItemAdapter extends RecyclerView.Adapter<ExcalationMatrixItemAdapter.ViewHolder> {

    Context context;
    ArrayList<ExcalationMatrixItemModel> arrayExcalationItem;
    public ExcalationMatrixItemAdapter(Context context, ArrayList<ExcalationMatrixItemModel> arrayContact){
        this.context = context;
        this.arrayExcalationItem = arrayContact;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.excalation_matrix_row,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        holder.managerLogo.setImageResource(arrayExcalationItem.get(position).userIcon);
        holder.managerName.setText(arrayExcalationItem.get(position).name);
        holder.managerRole.setText(arrayExcalationItem.get(position).role);
        holder.managerLevel.setText(arrayExcalationItem.get(position).level);
        holder.levelbackground.setBackgroundResource(arrayExcalationItem.get(position).levelbackground);

    }

    @Override
    public int getItemCount() {
        return arrayExcalationItem.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

       ImageView managerLogo, levelbackground;
       TextView managerName, managerRole, managerLevel;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            managerLogo = itemView.findViewById(R.id.manager_icon);
            managerName = itemView.findViewById(R.id.manager_name);
            managerRole = itemView.findViewById(R.id.manager_role);
            managerLevel = itemView.findViewById(R.id.manager_level);
            levelbackground = itemView.findViewById(R.id.circle_background);

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
