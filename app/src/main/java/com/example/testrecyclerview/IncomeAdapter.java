package com.example.testrecyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.testrecyclerview.Income;
import com.example.testrecyclerview.R;

import java.util.List;

public class IncomeAdapter extends RecyclerView.Adapter<IncomeAdapter.ViewHolder>{
    private final LayoutInflater inflater;
    private final List<Income> incomes;

    IncomeAdapter(Context context, List<Income> incomes) {
        this.incomes = incomes;
        this.inflater = LayoutInflater.from(context);
    }

    @NonNull
    @Override
    public IncomeAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.income, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(IncomeAdapter.ViewHolder holder, int position) {
        Income income = incomes.get(position);
        holder.flagView.setImageResource(income.flag);
        holder.nameView.setText(income.name);
        holder.moneyView.setText("$" + income.money);
    }

    @Override
    public int getItemCount() {
        return incomes.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        final ImageView flagView;
        final TextView nameView, moneyView;
        ViewHolder(View view){
            super(view);
            flagView = (ImageView)view.findViewById(R.id.flag);
            nameView = (TextView)view.findViewById(R.id.name);
            moneyView = (TextView)view.findViewById(R.id.money);
        }
    }
}