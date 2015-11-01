package assign2.alkhanishvili.davit.breakingbad;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.Serializable;
import java.util.ArrayList;

import it.sephiroth.android.library.picasso.Picasso;

/**
 * Created by dalkh on 01-Nov-15.
 */

    public class BBAdapter extends BaseAdapter {
        private ArrayList<Hero> heroes;
        private Context context;

        public BBAdapter(Context context, ArrayList<Hero> heroes) {
            this.context = context;
            this.heroes = heroes;
        }

        @Override
        public int getCount() {
            return heroes.size();
        }

        @Override
        public Object getItem(int position) {
            return this.heroes.get(position);
        }

        @Override
        public long getItemId(int position) {
            return position;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {

            View itemView;
            ViewHolder holder = null;
            if (convertView == null) {
                itemView = View.inflate(context, R.layout.list_item_layout, null);
                ImageView profileImageView = (ImageView) itemView.findViewById(R.id.profileImage);
                TextView nameView = (TextView) itemView.findViewById(R.id.name);
                TextView surNameView = (TextView) itemView.findViewById(R.id.surname);

                holder = new ViewHolder();
                holder.profileImageView = profileImageView;
                holder.nameView = nameView;
                holder.surNameView = surNameView;

                itemView.setTag(holder);
            } else {
                itemView = convertView;
                holder = (ViewHolder) itemView.getTag();
            }


            Hero hero = (Hero) getItem(position);

            Picasso.with(context).load(hero.getImage()).into(holder.profileImageView);
            holder.nameView.setText(hero.getName());
            holder.surNameView.setText(hero.getSurname());


            return itemView;
        }

        private class ViewHolder {
            ImageView profileImageView;
            TextView nameView, surNameView;
        }

    }

