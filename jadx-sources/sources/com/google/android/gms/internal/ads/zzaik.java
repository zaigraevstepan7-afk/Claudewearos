package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzaik {
    public final int zza;
    public int zzb;
    public int zzc;
    public long zzd;
    private final boolean zze;
    private final zzen zzf;
    private final zzen zzg;
    private int zzh;
    private int zzi;

    public zzaik(zzen zzenVar, zzen zzenVar2, boolean z2) throws zzaz {
        this.zzg = zzenVar;
        this.zzf = zzenVar2;
        this.zze = z2;
        zzenVar2.zzL(12);
        this.zza = zzenVar2.zzp();
        zzenVar.zzL(12);
        this.zzi = zzenVar.zzp();
        zzadx.zzb(zzenVar.zzg() == 1, "first_chunk must be 1");
        this.zzb = -1;
    }

    public final boolean zza() {
        int i10 = this.zzb + 1;
        this.zzb = i10;
        if (i10 == this.zza) {
            return false;
        }
        this.zzd = this.zze ? this.zzf.zzw() : this.zzf.zzu();
        if (this.zzb == this.zzh) {
            zzen zzenVar = this.zzg;
            this.zzc = zzenVar.zzp();
            zzenVar.zzM(4);
            int i11 = this.zzi - 1;
            this.zzi = i11;
            this.zzh = i11 > 0 ? (-1) + zzenVar.zzp() : -1;
        }
        return true;
    }
}
