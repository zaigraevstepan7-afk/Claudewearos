package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import qc.l0;
import rc.k;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzazv {
    private final Object zza = new Object();
    private zzazt zzb = null;
    private boolean zzc = false;

    public final Activity zza() {
        synchronized (this.zza) {
            try {
                zzazt zzaztVar = this.zzb;
                if (zzaztVar == null) {
                    return null;
                }
                return zzaztVar.zza();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final Context zzb() {
        synchronized (this.zza) {
            try {
                zzazt zzaztVar = this.zzb;
                if (zzaztVar == null) {
                    return null;
                }
                return zzaztVar.zzb();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void zzc(zzazu zzazuVar) {
        synchronized (this.zza) {
            try {
                if (this.zzb == null) {
                    this.zzb = new zzazt();
                }
                this.zzb.zzf(zzazuVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void zzd(Context context) {
        synchronized (this.zza) {
            try {
                if (!this.zzc) {
                    Context applicationContext = context.getApplicationContext();
                    if (applicationContext == null) {
                        applicationContext = context;
                    }
                    Application application = applicationContext instanceof Application ? (Application) applicationContext : null;
                    if (application == null) {
                        int i10 = l0.f13401b;
                        k.g("Can not cast Context to Application");
                    } else {
                        if (this.zzb == null) {
                            this.zzb = new zzazt();
                        }
                        this.zzb.zzg(application, context);
                        this.zzc = true;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void zze(zzazu zzazuVar) {
        synchronized (this.zza) {
            try {
                zzazt zzaztVar = this.zzb;
                if (zzaztVar == null) {
                    return;
                }
                zzaztVar.zzh(zzazuVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
