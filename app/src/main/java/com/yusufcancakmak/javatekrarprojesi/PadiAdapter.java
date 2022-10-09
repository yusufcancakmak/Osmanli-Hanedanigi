package com.yusufcancakmak.javatekrarprojesi;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class PadiAdapter extends RecyclerView.Adapter<PadiAdapter.cardnesneTutucu> {
private Context mcontext;
private List<Padisahlar> padisahlarList;

    public PadiAdapter(Context mcontext, List<Padisahlar> padisahlarList) {
        this.mcontext = mcontext;
        this.padisahlarList = padisahlarList;
    }

    @NonNull
    @Override
    public cardnesneTutucu onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview_tasarim,parent,false);
        return new cardnesneTutucu(view);
    }

    @Override
    public void onBindViewHolder(@NonNull cardnesneTutucu holder, int position) {
        Padisahlar p =padisahlarList.get(position);
        holder.textViewPadiAd.setText(p.getPadi_ad());
        holder.textViewPadiYil.setText(String.valueOf("Tahtta " +p.getPadi_yas()+ " yıl geçirdi."));
        holder.textViewPadiAciklama.setText(p.getPadi_acıklama());
        holder.imageView.setImageResource(mcontext.getResources().getIdentifier(p.getPadi_resim(),"drawable",mcontext.getPackageName()));

    }

    @Override
    public int getItemCount() {
        return padisahlarList.size();
    }

    public class cardnesneTutucu extends RecyclerView.ViewHolder{
        private ImageView imageView;
        private TextView textViewPadiAd;
        private TextView textViewPadiYil;
        private TextView textViewPadiAciklama;
        public cardnesneTutucu(@NonNull View itemView) {
            super(itemView);

            imageView=itemView.findViewById(R.id.imageView);
            textViewPadiAd=itemView.findViewById(R.id.textViewPadiAd);
            textViewPadiAciklama=itemView.findViewById(R.id.textViewPadiAcıklama);
            textViewPadiYil=itemView.findViewById(R.id.textViewPadiYil);


        }
    }
}
