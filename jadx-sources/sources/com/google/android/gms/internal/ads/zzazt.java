package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import mc.n;
import nc.t;
import qc.l0;
import qc.m0;
import qc.r0;
import rc.k;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzazt implements Application.ActivityLifecycleCallbacks {
    private Activity zza;
    private Context zzb;
    private Runnable zzh;
    private long zzj;
    private final Object zzc = new Object();
    private boolean zzd = true;
    private boolean zze = false;
    private final List zzf = new ArrayList();
    private final List zzg = new ArrayList();
    private boolean zzi = false;

    private final void zzk(Activity activity) {
        synchronized (this.zzc) {
            try {
                if (!activity.getClass().getName().startsWith("com.google.android.gms.ads")) {
                    this.zza = activity;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        synchronized (this.zzc) {
            try {
                Activity activity2 = this.zza;
                if (activity2 == null) {
                    return;
                }
                if (activity2.equals(activity)) {
                    this.zza = null;
                }
                Iterator it = this.zzg.iterator();
                while (it.hasNext()) {
                    try {
                        if (((zzbai) it.next()).zza()) {
                            it.remove();
                        }
                    } catch (Exception e10) {
                        n.D.f11582h.zzw(e10, "AppActivityTracker.ActivityListener.onActivityDestroyed");
                        int i10 = l0.f13401b;
                        k.e("", e10);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        zzk(activity);
        synchronized (this.zzc) {
            Iterator it = this.zzg.iterator();
            while (it.hasNext()) {
                try {
                    ((zzbai) it.next()).zzb();
                } catch (Exception e10) {
                    n.D.f11582h.zzw(e10, "AppActivityTracker.ActivityListener.onActivityPaused");
                    int i10 = l0.f13401b;
                    k.e("", e10);
                }
            }
        }
        this.zze = true;
        Runnable runnable = this.zzh;
        if (runnable != null) {
            r0.f13445l.removeCallbacks(runnable);
        }
        m0 m0Var = r0.f13445l;
        zzazs zzazsVar = new zzazs(this);
        this.zzh = zzazsVar;
        m0Var.postDelayed(zzazsVar, this.zzj);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        zzk(activity);
        this.zze = false;
        boolean z2 = this.zzd;
        this.zzd = true;
        Runnable runnable = this.zzh;
        if (runnable != null) {
            r0.f13445l.removeCallbacks(runnable);
        }
        synchronized (this.zzc) {
            Iterator it = this.zzg.iterator();
            while (it.hasNext()) {
                try {
                    ((zzbai) it.next()).zzc();
                } catch (Exception e10) {
                    n.D.f11582h.zzw(e10, "AppActivityTracker.ActivityListener.onActivityResumed");
                    int i10 = l0.f13401b;
                    k.e("", e10);
                }
            }
            if (z2) {
                int i11 = l0.f13401b;
                k.b("App is still foreground.");
            } else {
                Iterator it2 = this.zzf.iterator();
                while (it2.hasNext()) {
                    try {
                        ((zzazu) it2.next()).zza(true);
                    } catch (Exception e11) {
                        int i12 = l0.f13401b;
                        k.e("", e11);
                    }
                }
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        zzk(activity);
    }

    public final Activity zza() {
        return this.zza;
    }

    public final Context zzb() {
        return this.zzb;
    }

    public final void zzf(zzazu zzazuVar) {
        synchronized (this.zzc) {
            this.zzf.add(zzazuVar);
        }
    }

    public final void zzg(Application application, Context context) {
        if (this.zzi) {
            return;
        }
        application.registerActivityLifecycleCallbacks(this);
        if (context instanceof Activity) {
            zzk((Activity) context);
        }
        this.zzb = application;
        this.zzj = ((Long) t.f12227d.f12230c.zzb(zzbdc.zzbe)).longValue();
        this.zzi = true;
    }

    public final void zzh(zzazu zzazuVar) {
        synchronized (this.zzc) {
            this.zzf.remove(zzazuVar);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
