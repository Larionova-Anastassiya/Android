// Generated by view binder compiler. Do not edit!
package com.example.bookapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.bookapp.R;
import com.github.barteksc.pdfviewer.PDFView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityPdfDetailBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final ImageButton addCommentBtn;

  @NonNull
  public final ImageButton backBtn;

  @NonNull
  public final LinearLayout bookOptionsLl;

  @NonNull
  public final TextView categoryLabelTv;

  @NonNull
  public final TextView categoryTv;

  @NonNull
  public final TextView commentsLabelTv;

  @NonNull
  public final RecyclerView commentsRv;

  @NonNull
  public final TextView dateLabelTv;

  @NonNull
  public final TextView dateTv;

  @NonNull
  public final TextView descriptionTv;

  @NonNull
  public final Button downloadBookBtn;

  @NonNull
  public final TextView downloadsLabelTv;

  @NonNull
  public final TextView downloadsTv;

  @NonNull
  public final Button favoriteBtn;

  @NonNull
  public final TextView pagesLabelTv;

  @NonNull
  public final TextView pagesTv;

  @NonNull
  public final RelativeLayout pdfRl;

  @NonNull
  public final PDFView pdfView;

  @NonNull
  public final ProgressBar progressBar;

  @NonNull
  public final Button readBookBtn;

  @NonNull
  public final TextView sizeLabelTv;

  @NonNull
  public final TextView sizeTv;

  @NonNull
  public final TextView titleTv;

  @NonNull
  public final RelativeLayout toolbarRl;

  @NonNull
  public final TextView viewsLabelTv;

  @NonNull
  public final TextView viewsTv;

  private ActivityPdfDetailBinding(@NonNull RelativeLayout rootView,
      @NonNull ImageButton addCommentBtn, @NonNull ImageButton backBtn,
      @NonNull LinearLayout bookOptionsLl, @NonNull TextView categoryLabelTv,
      @NonNull TextView categoryTv, @NonNull TextView commentsLabelTv,
      @NonNull RecyclerView commentsRv, @NonNull TextView dateLabelTv, @NonNull TextView dateTv,
      @NonNull TextView descriptionTv, @NonNull Button downloadBookBtn,
      @NonNull TextView downloadsLabelTv, @NonNull TextView downloadsTv,
      @NonNull Button favoriteBtn, @NonNull TextView pagesLabelTv, @NonNull TextView pagesTv,
      @NonNull RelativeLayout pdfRl, @NonNull PDFView pdfView, @NonNull ProgressBar progressBar,
      @NonNull Button readBookBtn, @NonNull TextView sizeLabelTv, @NonNull TextView sizeTv,
      @NonNull TextView titleTv, @NonNull RelativeLayout toolbarRl, @NonNull TextView viewsLabelTv,
      @NonNull TextView viewsTv) {
    this.rootView = rootView;
    this.addCommentBtn = addCommentBtn;
    this.backBtn = backBtn;
    this.bookOptionsLl = bookOptionsLl;
    this.categoryLabelTv = categoryLabelTv;
    this.categoryTv = categoryTv;
    this.commentsLabelTv = commentsLabelTv;
    this.commentsRv = commentsRv;
    this.dateLabelTv = dateLabelTv;
    this.dateTv = dateTv;
    this.descriptionTv = descriptionTv;
    this.downloadBookBtn = downloadBookBtn;
    this.downloadsLabelTv = downloadsLabelTv;
    this.downloadsTv = downloadsTv;
    this.favoriteBtn = favoriteBtn;
    this.pagesLabelTv = pagesLabelTv;
    this.pagesTv = pagesTv;
    this.pdfRl = pdfRl;
    this.pdfView = pdfView;
    this.progressBar = progressBar;
    this.readBookBtn = readBookBtn;
    this.sizeLabelTv = sizeLabelTv;
    this.sizeTv = sizeTv;
    this.titleTv = titleTv;
    this.toolbarRl = toolbarRl;
    this.viewsLabelTv = viewsLabelTv;
    this.viewsTv = viewsTv;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityPdfDetailBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityPdfDetailBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_pdf_detail, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityPdfDetailBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.addCommentBtn;
      ImageButton addCommentBtn = ViewBindings.findChildViewById(rootView, id);
      if (addCommentBtn == null) {
        break missingId;
      }

      id = R.id.backBtn;
      ImageButton backBtn = ViewBindings.findChildViewById(rootView, id);
      if (backBtn == null) {
        break missingId;
      }

      id = R.id.bookOptionsLl;
      LinearLayout bookOptionsLl = ViewBindings.findChildViewById(rootView, id);
      if (bookOptionsLl == null) {
        break missingId;
      }

      id = R.id.categoryLabelTv;
      TextView categoryLabelTv = ViewBindings.findChildViewById(rootView, id);
      if (categoryLabelTv == null) {
        break missingId;
      }

      id = R.id.categoryTv;
      TextView categoryTv = ViewBindings.findChildViewById(rootView, id);
      if (categoryTv == null) {
        break missingId;
      }

      id = R.id.commentsLabelTv;
      TextView commentsLabelTv = ViewBindings.findChildViewById(rootView, id);
      if (commentsLabelTv == null) {
        break missingId;
      }

      id = R.id.commentsRv;
      RecyclerView commentsRv = ViewBindings.findChildViewById(rootView, id);
      if (commentsRv == null) {
        break missingId;
      }

      id = R.id.dateLabelTv;
      TextView dateLabelTv = ViewBindings.findChildViewById(rootView, id);
      if (dateLabelTv == null) {
        break missingId;
      }

      id = R.id.dateTv;
      TextView dateTv = ViewBindings.findChildViewById(rootView, id);
      if (dateTv == null) {
        break missingId;
      }

      id = R.id.descriptionTv;
      TextView descriptionTv = ViewBindings.findChildViewById(rootView, id);
      if (descriptionTv == null) {
        break missingId;
      }

      id = R.id.downloadBookBtn;
      Button downloadBookBtn = ViewBindings.findChildViewById(rootView, id);
      if (downloadBookBtn == null) {
        break missingId;
      }

      id = R.id.downloadsLabelTv;
      TextView downloadsLabelTv = ViewBindings.findChildViewById(rootView, id);
      if (downloadsLabelTv == null) {
        break missingId;
      }

      id = R.id.downloadsTv;
      TextView downloadsTv = ViewBindings.findChildViewById(rootView, id);
      if (downloadsTv == null) {
        break missingId;
      }

      id = R.id.favoriteBtn;
      Button favoriteBtn = ViewBindings.findChildViewById(rootView, id);
      if (favoriteBtn == null) {
        break missingId;
      }

      id = R.id.pagesLabelTv;
      TextView pagesLabelTv = ViewBindings.findChildViewById(rootView, id);
      if (pagesLabelTv == null) {
        break missingId;
      }

      id = R.id.pagesTv;
      TextView pagesTv = ViewBindings.findChildViewById(rootView, id);
      if (pagesTv == null) {
        break missingId;
      }

      id = R.id.pdfRl;
      RelativeLayout pdfRl = ViewBindings.findChildViewById(rootView, id);
      if (pdfRl == null) {
        break missingId;
      }

      id = R.id.pdfView;
      PDFView pdfView = ViewBindings.findChildViewById(rootView, id);
      if (pdfView == null) {
        break missingId;
      }

      id = R.id.progressBar;
      ProgressBar progressBar = ViewBindings.findChildViewById(rootView, id);
      if (progressBar == null) {
        break missingId;
      }

      id = R.id.readBookBtn;
      Button readBookBtn = ViewBindings.findChildViewById(rootView, id);
      if (readBookBtn == null) {
        break missingId;
      }

      id = R.id.sizeLabelTv;
      TextView sizeLabelTv = ViewBindings.findChildViewById(rootView, id);
      if (sizeLabelTv == null) {
        break missingId;
      }

      id = R.id.sizeTv;
      TextView sizeTv = ViewBindings.findChildViewById(rootView, id);
      if (sizeTv == null) {
        break missingId;
      }

      id = R.id.titleTv;
      TextView titleTv = ViewBindings.findChildViewById(rootView, id);
      if (titleTv == null) {
        break missingId;
      }

      id = R.id.toolbarRl;
      RelativeLayout toolbarRl = ViewBindings.findChildViewById(rootView, id);
      if (toolbarRl == null) {
        break missingId;
      }

      id = R.id.viewsLabelTv;
      TextView viewsLabelTv = ViewBindings.findChildViewById(rootView, id);
      if (viewsLabelTv == null) {
        break missingId;
      }

      id = R.id.viewsTv;
      TextView viewsTv = ViewBindings.findChildViewById(rootView, id);
      if (viewsTv == null) {
        break missingId;
      }

      return new ActivityPdfDetailBinding((RelativeLayout) rootView, addCommentBtn, backBtn,
          bookOptionsLl, categoryLabelTv, categoryTv, commentsLabelTv, commentsRv, dateLabelTv,
          dateTv, descriptionTv, downloadBookBtn, downloadsLabelTv, downloadsTv, favoriteBtn,
          pagesLabelTv, pagesTv, pdfRl, pdfView, progressBar, readBookBtn, sizeLabelTv, sizeTv,
          titleTv, toolbarRl, viewsLabelTv, viewsTv);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}