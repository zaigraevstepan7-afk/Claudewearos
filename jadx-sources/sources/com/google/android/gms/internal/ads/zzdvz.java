package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TableRow;
import android.widget.TextView;
import com.anonlab.voidlauncher.R;
import com.google.android.gms.ads.nativead.NativeAd;
import fc.i;
import mc.n;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzdvz {
    public static final void zza(Context context, ViewGroup viewGroup, i iVar) {
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setTag("layout");
        zzf(linearLayout, -1, -1);
        linearLayout.setGravity(17);
        linearLayout.addView(iVar);
        iVar.setTag("ad_view");
        viewGroup.addView(linearLayout);
    }

    public static final void zzb(Context context, ViewGroup viewGroup, NativeAd nativeAd) {
        wc.i iVar = new wc.i(context);
        iVar.setTag("ad_view_tag");
        zzf(iVar, -1, -1);
        viewGroup.addView(iVar);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setTag("layout_tag");
        linearLayout.setOrientation(1);
        zzf(linearLayout, -1, -1);
        linearLayout.setBackgroundColor(-1);
        iVar.addView(linearLayout);
        Resources resourcesZze = n.D.f11582h.zze();
        linearLayout.addView(zzc(context, resourcesZze == null ? "Headline" : resourcesZze.getString(R.string.native_headline), "headline_header_tag"));
        View viewZzd = zzd(context, zzfvv.zzc(nativeAd.getHeadline()), "headline_tag");
        iVar.setHeadlineView(viewZzd);
        linearLayout.addView(viewZzd);
        linearLayout.addView(zzc(context, resourcesZze == null ? "Body" : resourcesZze.getString(R.string.native_body), "body_header_tag"));
        View viewZzd2 = zzd(context, zzfvv.zzc(nativeAd.getBody()), "body_tag");
        iVar.setBodyView(viewZzd2);
        linearLayout.addView(viewZzd2);
        linearLayout.addView(zzc(context, resourcesZze == null ? "Media View" : resourcesZze.getString(R.string.native_media_view), "media_view_header_tag"));
        wc.b bVar = new wc.b(context);
        bVar.setTag("media_view_tag");
        iVar.setMediaView(bVar);
        linearLayout.addView(bVar);
        iVar.setNativeAd(nativeAd);
    }

    private static TextView zzc(Context context, String str, String str2) {
        return zze(context, str, android.R.style.TextAppearance.Small, -9210245, 0.0f, str2);
    }

    private static TextView zzd(Context context, String str, String str2) {
        return zze(context, str, android.R.style.TextAppearance.Medium, -16777216, 12.0f, str2);
    }

    private static TextView zze(Context context, String str, int i10, int i11, float f10, String str2) {
        TextView textView = new TextView(context);
        textView.setTag(str2);
        zzf(textView, -2, -2);
        ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new TableRow.LayoutParams();
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(layoutParams);
        marginLayoutParams.bottomMargin = (int) TypedValue.applyDimension(1, f10, textView.getResources().getDisplayMetrics());
        textView.setLayoutParams(marginLayoutParams);
        textView.setTextAppearance(context, i10);
        textView.setTextColor(i11);
        textView.setText(str);
        return textView;
    }

    private static void zzf(View view, int i10, int i11) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new TableRow.LayoutParams();
        }
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(layoutParams);
        layoutParams2.height = i10;
        layoutParams2.width = i11;
        view.setLayoutParams(layoutParams2);
    }
}
