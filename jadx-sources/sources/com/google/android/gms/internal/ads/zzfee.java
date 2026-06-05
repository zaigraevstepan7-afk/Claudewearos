package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzfee {
    private final zzfed zza = new zzfed();
    private int zzb;
    private int zzc;
    private int zzd;
    private int zze;
    private int zzf;

    public final zzfed zza() {
        zzfed zzfedVar = this.zza;
        zzfed zzfedVarClone = zzfedVar.clone();
        zzfedVar.zza = false;
        zzfedVar.zzb = false;
        return zzfedVarClone;
    }

    public final String zzb() {
        StringBuilder sb2 = new StringBuilder("\n\tPool does not exist: ");
        sb2.append(this.zzd);
        sb2.append("\n\tNew pools created: ");
        sb2.append(this.zzb);
        sb2.append("\n\tPools removed: ");
        sb2.append(this.zzc);
        sb2.append("\n\tEntries added: ");
        sb2.append(this.zzf);
        sb2.append("\n\tNo entries retrieved: ");
        return m6.a.h(sb2, this.zze, "\n");
    }

    public final void zzc() {
        this.zzf++;
    }

    public final void zzd() {
        this.zzb++;
        this.zza.zza = true;
    }

    public final void zze() {
        this.zze++;
    }

    public final void zzf() {
        this.zzd++;
    }

    public final void zzg() {
        this.zzc++;
        this.zza.zzb = true;
    }
}
