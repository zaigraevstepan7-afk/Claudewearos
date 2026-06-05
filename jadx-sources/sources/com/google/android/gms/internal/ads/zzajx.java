package com.google.android.gms.internal.ads;

import java.util.List;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzajx implements zzadt {
    private zzadw zza;
    private zzakf zzb;
    private boolean zzc;

    private final boolean zza(zzadu zzaduVar) {
        zzajz zzajzVar = new zzajz();
        if (zzajzVar.zzb(zzaduVar, true) && (zzajzVar.zza & 2) == 2) {
            int iMin = Math.min(zzajzVar.zze, 8);
            zzen zzenVar = new zzen(iMin);
            zzaduVar.zzh(zzenVar.zzN(), 0, iMin);
            zzenVar.zzL(0);
            if (zzenVar.zza() >= 5 && zzenVar.zzm() == 127 && zzenVar.zzu() == 1179402563) {
                this.zzb = new zzajw();
            } else {
                zzenVar.zzL(0);
                if (zzaff.zzd(1, zzenVar, true)) {
                    this.zzb = new zzakh();
                } else {
                    zzenVar.zzL(0);
                    if (zzakb.zzd(zzenVar)) {
                        this.zzb = new zzakb();
                    }
                }
            }
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzadt
    public final int zzb(zzadu zzaduVar, zzaep zzaepVar) throws zzaz {
        zzdd.zzb(this.zza);
        if (this.zzb == null) {
            if (!zza(zzaduVar)) {
                throw zzaz.zza("Failed to determine bitstream type", null);
            }
            zzaduVar.zzj();
        }
        if (!this.zzc) {
            zzaez zzaezVarZzw = this.zza.zzw(0, 1);
            this.zza.zzG();
            this.zzb.zzh(this.zza, zzaezVarZzw);
            this.zzc = true;
        }
        return this.zzb.zze(zzaduVar, zzaepVar);
    }

    @Override // com.google.android.gms.internal.ads.zzadt
    public final /* synthetic */ List zzd() {
        return zzfyf.zzn();
    }

    @Override // com.google.android.gms.internal.ads.zzadt
    public final void zze(zzadw zzadwVar) {
        this.zza = zzadwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzadt
    public final void zzf(long j, long j4) {
        zzakf zzakfVar = this.zzb;
        if (zzakfVar != null) {
            zzakfVar.zzj(j, j4);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzadt
    public final boolean zzi(zzadu zzaduVar) {
        try {
            return zza(zzaduVar);
        } catch (zzaz unused) {
            return false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzadt
    public final /* synthetic */ zzadt zzc() {
        return this;
    }
}
