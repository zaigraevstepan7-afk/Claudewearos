package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import java.util.List;
import mc.n;
import nc.s;
import org.json.JSONObject;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzcqh extends FrameLayout implements ViewTreeObserver.OnScrollChangedListener, ViewTreeObserver.OnGlobalLayoutListener {
    private final Context zza;
    private View zzb;

    private zzcqh(Context context) {
        super(context);
        this.zza = context;
    }

    public static zzcqh zza(Context context, View view, zzfbt zzfbtVar) {
        Resources resources;
        DisplayMetrics displayMetrics;
        zzcqh zzcqhVar = new zzcqh(context);
        List list = zzfbtVar.zzu;
        if (!list.isEmpty() && (resources = zzcqhVar.zza.getResources()) != null && (displayMetrics = resources.getDisplayMetrics()) != null) {
            float f10 = ((zzfbu) list.get(0)).zza;
            float f11 = displayMetrics.density;
            zzcqhVar.setLayoutParams(new FrameLayout.LayoutParams((int) (f10 * f11), (int) (r4.zzb * f11)));
        }
        zzcqhVar.zzb = view;
        zzcqhVar.addView(view);
        n nVar = n.D;
        zzcaq zzcaqVar = nVar.C;
        zzcaq.zzb(zzcqhVar, zzcqhVar);
        zzcaq zzcaqVar2 = nVar.C;
        zzcaq.zza(zzcqhVar, zzcqhVar);
        JSONObject jSONObject = zzfbtVar.zzah;
        RelativeLayout relativeLayout = new RelativeLayout(zzcqhVar.zza);
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("header");
        if (jSONObjectOptJSONObject != null) {
            zzcqhVar.zzc(jSONObjectOptJSONObject, relativeLayout, 10);
        }
        JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("footer");
        if (jSONObjectOptJSONObject2 != null) {
            zzcqhVar.zzc(jSONObjectOptJSONObject2, relativeLayout, 12);
        }
        zzcqhVar.addView(relativeLayout);
        return zzcqhVar;
    }

    private final int zzb(double d10) {
        rc.e eVar = s.f12202f.f12203a;
        return rc.e.b(this.zza, (int) d10);
    }

    private final void zzc(JSONObject jSONObject, RelativeLayout relativeLayout, int i10) {
        TextView textView = new TextView(this.zza);
        textView.setTextColor(-1);
        textView.setBackgroundColor(-16777216);
        textView.setGravity(17);
        textView.setText(jSONObject.optString("text", ""));
        textView.setTextSize((float) jSONObject.optDouble("text_size", 11.0d));
        int iZzb = zzb(jSONObject.optDouble("padding", 0.0d));
        textView.setPadding(0, iZzb, 0, iZzb);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, zzb(jSONObject.optDouble("height", 15.0d)));
        layoutParams.addRule(i10);
        relativeLayout.addView(textView, layoutParams);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        getLocationInWindow(new int[2]);
        this.zzb.setY(-r0[1]);
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        getLocationInWindow(new int[2]);
        this.zzb.setY(-r0[1]);
    }
}
