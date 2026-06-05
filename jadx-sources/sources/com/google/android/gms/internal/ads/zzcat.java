package com.google.android.gms.internal.ads;

import android.view.View;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
abstract class zzcat {
    private final WeakReference zza;

    public zzcat(View view) {
        this.zza = new WeakReference(view);
    }

    public abstract void zza(ViewTreeObserver viewTreeObserver);

    public abstract void zzb(ViewTreeObserver viewTreeObserver);

    public final ViewTreeObserver zzc() {
        ViewTreeObserver viewTreeObserver;
        View view = (View) this.zza.get();
        if (view == null || (viewTreeObserver = view.getViewTreeObserver()) == null || !viewTreeObserver.isAlive()) {
            return null;
        }
        return viewTreeObserver;
    }

    public final void zzd() {
        ViewTreeObserver viewTreeObserverZzc = zzc();
        if (viewTreeObserverZzc != null) {
            zza(viewTreeObserverZzc);
        }
    }

    public final void zze() {
        ViewTreeObserver viewTreeObserverZzc = zzc();
        if (viewTreeObserverZzc != null) {
            zzb(viewTreeObserverZzc);
        }
    }
}
