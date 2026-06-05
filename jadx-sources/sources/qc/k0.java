package qc;

import android.app.Activity;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import com.google.android.gms.internal.ads.zzcaq;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class k0 {

    /* renamed from: a, reason: collision with root package name */
    public final View f13394a;

    /* renamed from: b, reason: collision with root package name */
    public Activity f13395b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f13396c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f13397d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f13398e;

    /* renamed from: f, reason: collision with root package name */
    public final ViewTreeObserver.OnGlobalLayoutListener f13399f;

    public k0(Activity activity, View view, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        this.f13395b = activity;
        this.f13394a = view;
        this.f13399f = onGlobalLayoutListener;
    }

    public final void a() {
        View decorView;
        if (this.f13396c) {
            return;
        }
        Activity activity = this.f13395b;
        ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = this.f13399f;
        if (activity != null) {
            Window window = activity.getWindow();
            ViewTreeObserver viewTreeObserver = (window == null || (decorView = window.getDecorView()) == null) ? null : decorView.getViewTreeObserver();
            if (viewTreeObserver != null) {
                viewTreeObserver.addOnGlobalLayoutListener(onGlobalLayoutListener);
            }
        }
        zzcaq zzcaqVar = mc.n.D.C;
        zzcaq.zza(this.f13394a, onGlobalLayoutListener);
        this.f13396c = true;
    }
}
