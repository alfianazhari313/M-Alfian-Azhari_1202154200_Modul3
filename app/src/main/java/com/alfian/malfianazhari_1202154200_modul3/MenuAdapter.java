package com.alfian.malfianazhari_1202154200_modul3;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by M. Alfian Azhari on 2/23/2018.
 */


public class MenuAdapter extends RecyclerView.Adapter<MenuAdapter.ViewHolder> {

    public interface OnItemClickListener {
        void onItemClick(Minuman item);
    }

    private final List<Minuman> items;
    private final OnItemClickListener listener;

    public MenuAdapter(List<Minuman> items, OnItemClickListener listener) {
        this.items = items;
        this.listener = listener;
    }

    @Override public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_minuman, parent, false);
        return new ViewHolder(v);
    }

    @Override public void onBindViewHolder(ViewHolder holder, int position) {
        holder.bind(items.get(position)
                , listener
        );
    }

    @Override public int getItemCount() {
        return items.size();
    }

    static class ViewHolder extends RecyclerView.ViewHolder {

        private TextView tv_merk,tv_diskripsi;
        private ImageView iv_foto;

        public ViewHolder(View itemView) {
            super(itemView);
            tv_merk = (TextView) itemView.findViewById(R.id.tv_merk);
            tv_diskripsi= (TextView) itemView.findViewById(R.id.tv_diskripsi);
            iv_foto=(ImageView) itemView.findViewById(R.id.iv_foto);
        }


        public void bind(final Minuman item, final OnItemClickListener listener) {
            tv_merk.setText(item.getMerk());
            tv_diskripsi.setText(item.getDeskripsi());
            iv_foto.setImageResource(item.getFoto());
//            iv_foto.setOnClickListener(listener);
//            Picasso.with(itemView.getContext()).load(item.imageUrl).into(image);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override public void onClick(View v) {
                    listener.onItemClick(item);
                }
            });
        }
    }
}
