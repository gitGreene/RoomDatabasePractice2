package co.codemaestro.roomdatabasepractice2;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class WordListAdapter extends RecyclerView.Adapter<WordListAdapter.WordViewHolder> {
    private final LayoutInflater mInflater;
    private List<Word> mWords;

    WordListAdapter(Context context) {
        mInflater = LayoutInflater.from(context);
    }

    void setWords(List<Word> words) {
        mWords = words;
        notifyDataSetChanged();
    }



    class WordViewHolder extends RecyclerView.ViewHolder {

        // Initialize the views
        private final TextView timeBankTitleView;
        private final TextView timeBankValueView;

        private WordViewHolder(View itemView) {
            super(itemView);
            timeBankTitleView = itemView.findViewById(R.id.timeBankTitle);
            timeBankValueView = itemView.findViewById(R.id.timeBankValue);
        }
    }

    @Override
    public WordViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = mInflater.inflate(R.layout.recyclerview_item, parent, false);
        return new WordViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(WordViewHolder holder, int position) {
        if (mWords != null) {
            Word current = mWords.get(position);
            holder.timeBankTitleView.setText(current.getTimeBankTitle());
            holder.timeBankValueView.setText(current.getTimeBankValue());
        } else {
            holder.timeBankTitleView.setText(R.string.no_words);
        }
    }

    @Override
    public int getItemCount() {
        if (mWords != null) {
            return mWords.size();
        } else return 0;
    }




}

