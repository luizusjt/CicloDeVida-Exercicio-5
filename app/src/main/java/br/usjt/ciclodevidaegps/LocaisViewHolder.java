/**
 * Uriel Henrique Marques Farias Mishima RA: 81717300
 */
package br.usjt.ciclodevidaegps;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class LocaisViewHolder extends RecyclerView.ViewHolder {
    public ImageView iconLocalizacaoImageView;
    public TextView latitudeTextView;
    public TextView longitudeTextView;

    public LocaisViewHolder(View itemView) {
        super(itemView);
        iconLocalizacaoImageView = itemView.findViewById(R.id.iconLocalizacaoImageView);
        latitudeTextView = itemView.findViewById(R.id.latitudeTextView);
        longitudeTextView = itemView.findViewById(R.id.longitudeTextView);
    }
}
