package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.Surface;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzabh implements zzacn {
    final /* synthetic */ zzabn zza;
    private zzfyf zzb;
    private zzz zzc;
    private long zzd;
    private long zze;

    public zzabh(zzabn zzabnVar, Context context, int i10) {
        this.zza = zzabnVar;
        zzex.zzL(context);
        this.zzb = zzfyf.zzn();
        this.zze = -9223372036854775807L;
    }

    private static final void zza(zzz zzzVar) {
        zzx zzxVarZzb = zzzVar.zzb();
        zzxVarZzb.zzF(zzabn.zzA(zzzVar.zzE));
        zzxVarZzb.zzan();
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzacn
    public final boolean zzA(zzz zzzVar) {
        return zzabn.zzy(this.zza, zzzVar, 0);
    }

    @Override // com.google.android.gms.internal.ads.zzacn
    public final boolean zzB() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzacn
    public final boolean zzC() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzacn
    public final boolean zzD(boolean z2) {
        return this.zza.zze.zzD(false);
    }

    @Override // com.google.android.gms.internal.ads.zzacn
    public final Surface zzb() {
        zzdd.zzf(false);
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzacn
    public final void zzh() {
        zzabn zzabnVar = this.zza;
        if (zzabnVar.zzh.zza() == 0) {
            zzabnVar.zze.zzh();
            return;
        }
        zzet zzetVar = new zzet(10);
        boolean z2 = true;
        while (zzabnVar.zzh.zza() > 0) {
            zzabl zzablVar = (zzabl) zzabnVar.zzh.zzb();
            zzablVar.getClass();
            if (z2) {
                int i10 = zzablVar.zzb;
                if (i10 == 0 || i10 == 1) {
                    zzablVar = new zzabl(zzablVar.zza, 0, zzablVar.zzc);
                } else {
                    zzabnVar.zze.zzh();
                }
            }
            zzetVar.zzd(zzablVar.zzc, zzablVar);
            z2 = false;
        }
        zzabnVar.zzh = zzetVar;
    }

    @Override // com.google.android.gms.internal.ads.zzacn
    public final void zzi() {
        this.zza.zzq();
    }

    @Override // com.google.android.gms.internal.ads.zzacn
    public final void zzj(boolean z2) {
        this.zze = -9223372036854775807L;
        zzabn.zzj(this.zza, z2);
    }

    @Override // com.google.android.gms.internal.ads.zzacn
    public final void zzk(boolean z2) {
        zzabn zzabnVar = this.zza;
        if (zzabnVar.zzd) {
            zzabnVar.zze.zzk(z2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzacn
    public final void zzl(int i10, zzz zzzVar, long j, int i11, List list) {
        zzdd.zzf(false);
        this.zzb = zzfyf.zzl(list);
        this.zzc = zzzVar;
        zzabn zzabnVar = this.zza;
        zzabnVar.zzq = -9223372036854775807L;
        zza(zzzVar);
        long j4 = this.zze;
        long j10 = -4611686018427387904L;
        if (zzabnVar.zzd) {
            if (j4 != -9223372036854775807L) {
                j10 = j4 + 1;
            }
        } else if (j4 != -9223372036854775807L) {
            return;
        }
        long j11 = j10;
        zzabnVar.zzh.zzd(j11, new zzabl(j + this.zzd, i11, j11));
    }

    @Override // com.google.android.gms.internal.ads.zzacn
    public final void zzn() {
        this.zza.zzr();
    }

    @Override // com.google.android.gms.internal.ads.zzacn
    public final void zzo(long j, long j4) {
        this.zza.zze.zzo(j + this.zzd, j4);
    }

    @Override // com.google.android.gms.internal.ads.zzacn
    public final void zzp(long j) {
        this.zzd = j;
    }

    @Override // com.google.android.gms.internal.ads.zzacn
    public final void zzq(int i10) {
        this.zza.zze.zzq(i10);
    }

    @Override // com.google.android.gms.internal.ads.zzacn
    public final void zzs(Surface surface, zzeo zzeoVar) {
        this.zza.zzs(surface, zzeoVar);
    }

    @Override // com.google.android.gms.internal.ads.zzacn
    public final void zzt(float f10) {
        this.zza.zze.zzt(f10);
    }

    @Override // com.google.android.gms.internal.ads.zzacn
    public final void zzu(List list) {
        if (this.zzb.equals(list)) {
            return;
        }
        this.zzb = zzfyf.zzl(list);
        zzz zzzVar = this.zzc;
        if (zzzVar != null) {
            zza(zzzVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzacn
    public final void zzv(zzabo zzaboVar) {
        this.zza.zze.zzv(zzaboVar);
    }

    @Override // com.google.android.gms.internal.ads.zzacn
    public final void zzw() {
        zzabn zzabnVar = this.zza;
        zzabnVar.zzq = this.zze;
        if (zzabnVar.zzp >= zzabnVar.zzq) {
            zzabnVar.zze.zzw();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzacn
    public final void zzx() {
        zzabn zzabnVar = this.zza;
        if (zzabnVar.zzd) {
            zzabnVar.zzu();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzacn
    public final void zzy() {
        zzabn zzabnVar = this.zza;
        if (zzabnVar.zzd) {
            zzabnVar.zzv();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzacn
    public final boolean zzz(long j, zzacl zzaclVar) {
        zzdd.zzf(false);
        if (zzabn.zzz(this.zza)) {
            throw null;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzacn
    public final void zzm() {
    }

    @Override // com.google.android.gms.internal.ads.zzacn
    public final void zzr(zzack zzackVar, Executor executor) {
    }
}
