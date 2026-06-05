package com.google.android.gms.internal.ads;

import qc.l0;
import qc.s;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzbof extends zzcap {
    private final s zzb;
    private final Object zza = new Object();
    private boolean zzc = false;
    private int zzd = 0;

    public zzbof(s sVar) {
        this.zzb = sVar;
    }

    public final zzboa zza() {
        zzboa zzboaVar = new zzboa(this);
        l0.k("createNewReference: Trying to acquire lock");
        synchronized (this.zza) {
            l0.k("createNewReference: Lock acquired");
            zzj(new zzbob(this, zzboaVar), new zzboc(this, zzboaVar));
            int i10 = this.zzd;
            if (i10 < 0) {
                throw new IllegalStateException();
            }
            this.zzd = i10 + 1;
        }
        l0.k("createNewReference: Lock released");
        return zzboaVar;
    }

    public final void zzb() {
        l0.k("markAsDestroyable: Trying to acquire lock");
        synchronized (this.zza) {
            l0.k("markAsDestroyable: Lock acquired");
            if (this.zzd < 0) {
                throw new IllegalStateException();
            }
            l0.k("Releasing root reference. JS Engine will be destroyed once other references are released.");
            this.zzc = true;
            zzc();
        }
        l0.k("markAsDestroyable: Lock released");
    }

    public final void zzc() {
        l0.k("maybeDestroy: Trying to acquire lock");
        synchronized (this.zza) {
            try {
                l0.k("maybeDestroy: Lock acquired");
                int i10 = this.zzd;
                if (i10 < 0) {
                    throw new IllegalStateException();
                }
                if (this.zzc && i10 == 0) {
                    l0.k("No reference is left (including root). Cleaning up engine.");
                    zzj(new zzboe(this), new zzcal());
                } else {
                    l0.k("There are still references to the engine. Not destroying.");
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        l0.k("maybeDestroy: Lock released");
    }

    public final void zzd() {
        l0.k("releaseOneReference: Trying to acquire lock");
        synchronized (this.zza) {
            l0.k("releaseOneReference: Lock acquired");
            if (this.zzd <= 0) {
                throw new IllegalStateException();
            }
            l0.k("Releasing 1 reference for JS Engine");
            this.zzd--;
            zzc();
        }
        l0.k("releaseOneReference: Lock released");
    }
}
