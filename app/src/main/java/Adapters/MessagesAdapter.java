package Adapters;

import android.content.Context;
import android.preference.PreferenceManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.changeyourself.fitnesapp.R;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

import DataBase.Message;

public class MessagesAdapter extends RecyclerView.Adapter<MessagesAdapter.MessagesViewHolder> {
    private List<Message>messages;
    private static final int TYPE_MY_MESAGE=0;
    private static final int Type_OTHER_MESSAGE=1;
    private Context context;

    public MessagesAdapter(Context context) {
        messages = new ArrayList<>();
        this.context=context;
    }

    public List<Message> getMessages() {
        return messages;
    }

    public void setMessages(List<Message> messages) {
        this.messages = messages;
        notifyDataSetChanged();
    }

    @Override
    public MessagesViewHolder onCreateViewHolder( ViewGroup parent, int viewType) {
        View view;
        if(viewType==TYPE_MY_MESAGE){
            view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_note_others,parent,false);

        }else{
            view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_chat_messages,parent,false);
        }
        return new MessagesViewHolder(view);
    }

    @Override
    public int getItemViewType(int position) {
        Message message=messages.get(position);
        String author=message.getAuthor();
        if(author != null && author.equals(PreferenceManager.getDefaultSharedPreferences(context).getString("author","anonim"))){
            return TYPE_MY_MESAGE;
        }else{
            return Type_OTHER_MESSAGE;
        }
    }

    @Override
    public void onBindViewHolder( MessagesAdapter.MessagesViewHolder holder, int position) {
     Message message=messages.get(position);
     String author=message.getAuthor();
     String textOfMessage=message.getMessage();
     String urltoImage=message.getImageURL();
     holder.textViewauthor.setText(author);
     if(textOfMessage!=null&&!textOfMessage.isEmpty()){
         holder.textViewmessages.setVisibility(View.VISIBLE);
         holder.textViewmessages.setText(textOfMessage);
     }else{
         holder.textViewmessages.setVisibility(View.GONE);
     }
        if(urltoImage==null){
            holder.imageViewchatik.setVisibility(View.GONE);
        }else{
            holder.imageViewchatik.setVisibility(View.VISIBLE);
        }
        if(urltoImage!=null&&!urltoImage.isEmpty()){
            Picasso.get().load(urltoImage).into(holder.imageViewchatik);
        }


    }

    @Override
    public int getItemCount() {
        return messages.size();
    }

    class MessagesViewHolder extends RecyclerView.ViewHolder{
        private TextView textViewauthor;
        private TextView textViewmessages;
        private ImageView imageViewchatik;
        public MessagesViewHolder( View itemView) {
            super(itemView);
            textViewauthor=itemView.findViewById(R.id.textViewAuthor);
            textViewmessages=itemView.findViewById(R.id.textViewTextOfMessage);
            imageViewchatik=itemView.findViewById(R.id.imageViewImage);
        }
    }
}
