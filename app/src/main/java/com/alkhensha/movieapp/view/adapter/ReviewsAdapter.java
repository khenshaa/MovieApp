package com.alkhensha.movieapp.view.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

import com.alkhensha.movieapp.R;
import com.alkhensha.movieapp.model.Review;


/**
 * Created by khenshaa on 12/15/17.
 */

public class ReviewsAdapter extends RecyclerView.Adapter<ReviewsAdapter.ReviewsViewHolder> {
    private List<Review> mReviews;

    public ReviewsAdapter() {
        mReviews = new ArrayList<>();
    }

    public void setData(List<Review> movies) {
        this.mReviews.clear();
        this.mReviews.addAll(movies);
        notifyDataSetChanged();
    }

    public List<Review> getData() {
        return this.mReviews;
    }

    @Override
    public ReviewsViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.adapter_reviews, parent, false);
        return new ReviewsViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ReviewsViewHolder holder, int position) {
        holder.mReviewAuthor.setText(mReviews.get(holder.getAdapterPosition()).getAuthor());
        holder.mReviewContent.setText(mReviews.get(holder.getAdapterPosition()).getContent());
    }

    @Override
    public int getItemCount() {
        return mReviews.size();
    }

    class ReviewsViewHolder extends RecyclerView.ViewHolder {
        @BindView(R.id.adapter_reviews_author)
        TextView mReviewAuthor;

        @BindView(R.id.adapter_reviews_content)
        TextView mReviewContent;

        ReviewsViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }

}
