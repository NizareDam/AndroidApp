package info6.tse.nizare.ihm_appliandroid;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

public class ListNameAdapter extends RecyclerView.Adapter<ListitemViewHolder> {

    private List<String> nameList;
    private  final NameItemListener nameItemListener;

    public ListNameAdapter(NameItemListener nameItemListener){
        this.nameItemListener = nameItemListener;
        nameList = new ArrayList<>();
    }
    // i : indique la position - indexe de la liste
    @NonNull
    @Override
    public ListitemViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        // permet de inflate(donner vie) à un XML afin d'obtenir un objet java pour pouvoir manipuler les différents widget
        // .inflate il prends 3 paramètre( lelment qu'on souhaite afficher, viewgroupe : renvoie recycleview ou mainactivity , attachToRoot si c'est l'élément root )
        View view =LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_list_name, viewGroup, false);
        return new ListitemViewHolder(view,nameItemListener);
    }

    @Override
    public void onBindViewHolder(@NonNull ListitemViewHolder ListitemViewHolder, int i) {
        ListitemViewHolder.setContent(nameList.get(i));
    }

    @Override
    public int getItemCount() {
        return nameList.size();
    }

    public void updateData(List<String> nameList)
    {
        this.nameList.clear();
        this.nameList.addAll(nameList);

        notifyDataSetChanged();
    }
}
