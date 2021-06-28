package com.covidcensusapp.covidcensus.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.covidcensusapp.covidcensus.R;
import com.covidcensusapp.covidcensus.model.VaccineModel;

import java.util.List;

public class VaccinationInfoAdapter extends RecyclerView.Adapter<VaccinationInfoAdapter.ViewHolder> {
    private LayoutInflater layoutInflater;
    private List<VaccineModel> list_vaccine_centre;

    public VaccinationInfoAdapter(Context mcontext, List<VaccineModel> list_vaccine_centre) {
        this.layoutInflater = LayoutInflater.from(mcontext);
        this.list_vaccine_centre = list_vaccine_centre;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = layoutInflater.inflate(R.layout.vaccination_info_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull VaccinationInfoAdapter.ViewHolder holder, int position) {
        holder.vaccinationcentre.setText(list_vaccine_centre.get(position).getVaccineCentre());
        holder.vaccinationcentreAddr.setText(list_vaccine_centre.get(position).getVaccineCentreAddress());
        holder.vaccinationTiming.setText(list_vaccine_centre.get(position).getVaccinationTimings() + " - " +
                list_vaccine_centre.get(position).getVaccineCentreTime());
        holder.vaccineName.setText(list_vaccine_centre.get(position).getVaccineName());
        holder.vaccinationAvailable.setText(list_vaccine_centre.get(position).getVaccineAvailable());
        holder.vaccineCharges.setText(list_vaccine_centre.get(position).getVaccinationCharger());
        holder.vaccinationage.setText(list_vaccine_centre.get(position).getVaccinationAge());

    }

    @Override
    public int getItemCount() {
        return list_vaccine_centre.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView vaccinationcentre;
        TextView vaccinationcentreAddr;
        TextView vaccinationTiming;
        TextView vaccineName;
        TextView vaccineCharges;
        TextView vaccinationage;
        TextView vaccinationAvailable;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            vaccinationage = itemView.findViewById(R.id.vaccinationage);
            vaccinationAvailable = itemView.findViewById(R.id.isAvailable);
            vaccinationcentre = itemView.findViewById(R.id.vaccineCentre);
            vaccineCharges = itemView.findViewById(R.id.vaccineCharges);
            vaccinationcentreAddr = itemView.findViewById(R.id.vaccineLocation);
            vaccineName = itemView.findViewById(R.id.vaccineName);
            vaccinationTiming = itemView.findViewById(R.id.vaccineTimings);
        }
    }
}
