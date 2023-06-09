// Generated by view binder compiler. Do not edit!
package com.example.bookapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.bookapp.R;
import com.google.android.material.textfield.TextInputLayout;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityPdfEditBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final ImageButton backBtn;

  @NonNull
  public final TextView categoryTv;

  @NonNull
  public final EditText descriptionEt;

  @NonNull
  public final TextInputLayout descriptionTil;

  @NonNull
  public final ImageView iconTv;

  @NonNull
  public final Button submitBtn;

  @NonNull
  public final EditText titleEt;

  @NonNull
  public final TextInputLayout titleTil;

  private ActivityPdfEditBinding(@NonNull RelativeLayout rootView, @NonNull ImageButton backBtn,
      @NonNull TextView categoryTv, @NonNull EditText descriptionEt,
      @NonNull TextInputLayout descriptionTil, @NonNull ImageView iconTv, @NonNull Button submitBtn,
      @NonNull EditText titleEt, @NonNull TextInputLayout titleTil) {
    this.rootView = rootView;
    this.backBtn = backBtn;
    this.categoryTv = categoryTv;
    this.descriptionEt = descriptionEt;
    this.descriptionTil = descriptionTil;
    this.iconTv = iconTv;
    this.submitBtn = submitBtn;
    this.titleEt = titleEt;
    this.titleTil = titleTil;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityPdfEditBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityPdfEditBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_pdf_edit, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityPdfEditBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.backBtn;
      ImageButton backBtn = ViewBindings.findChildViewById(rootView, id);
      if (backBtn == null) {
        break missingId;
      }

      id = R.id.categoryTv;
      TextView categoryTv = ViewBindings.findChildViewById(rootView, id);
      if (categoryTv == null) {
        break missingId;
      }

      id = R.id.descriptionEt;
      EditText descriptionEt = ViewBindings.findChildViewById(rootView, id);
      if (descriptionEt == null) {
        break missingId;
      }

      id = R.id.descriptionTil;
      TextInputLayout descriptionTil = ViewBindings.findChildViewById(rootView, id);
      if (descriptionTil == null) {
        break missingId;
      }

      id = R.id.iconTv;
      ImageView iconTv = ViewBindings.findChildViewById(rootView, id);
      if (iconTv == null) {
        break missingId;
      }

      id = R.id.submitBtn;
      Button submitBtn = ViewBindings.findChildViewById(rootView, id);
      if (submitBtn == null) {
        break missingId;
      }

      id = R.id.titleEt;
      EditText titleEt = ViewBindings.findChildViewById(rootView, id);
      if (titleEt == null) {
        break missingId;
      }

      id = R.id.titleTil;
      TextInputLayout titleTil = ViewBindings.findChildViewById(rootView, id);
      if (titleTil == null) {
        break missingId;
      }

      return new ActivityPdfEditBinding((RelativeLayout) rootView, backBtn, categoryTv,
          descriptionEt, descriptionTil, iconTv, submitBtn, titleEt, titleTil);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
