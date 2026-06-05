package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public abstract class zzzd {
    private zzzc zza;
    private zzzl zzb;

    public zzmc zze() {
        throw null;
    }

    public void zzj() {
        this.zza = null;
        this.zzb = null;
    }

    public void zzk(zze zzeVar) {
        throw null;
    }

    public boolean zzn() {
        throw null;
    }

    public abstract zzze zzo(zzmd[] zzmdVarArr, zzxk zzxkVar, zzvh zzvhVar, zzbl zzblVar);

    public abstract void zzp(Object obj);

    public final zzzl zzq() {
        zzzl zzzlVar = this.zzb;
        zzdd.zzb(zzzlVar);
        return zzzlVar;
    }

    public final void zzr(zzzc zzzcVar, zzzl zzzlVar) {
        zzdd.zzf(this.zza == null);
        this.zza = zzzcVar;
        this.zzb = zzzlVar;
    }

    public final void zzs() {
        zzzc zzzcVar = this.zza;
        if (zzzcVar != null) {
            zzzcVar.zzl();
        }
    }
}
