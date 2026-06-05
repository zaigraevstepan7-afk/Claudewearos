package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzffd {
    private final zzfew zza;
    private final mf.a zzb;
    private boolean zzc = false;
    private boolean zzd = false;

    public zzffd(final zzfeb zzfebVar, final zzfev zzfevVar, final zzfew zzfewVar) {
        this.zza = zzfewVar;
        this.zzb = zzgdb.zzf(zzgdb.zzn(zzfevVar.zza(zzfewVar), new zzgci() { // from class: com.google.android.gms.internal.ads.zzffb
            @Override // com.google.android.gms.internal.ads.zzgci
            public final mf.a zza(Object obj) {
                return zzffd.zzb(this.zza, zzfevVar, zzfebVar, zzfewVar, (zzfek) obj);
            }
        }, zzfewVar.zzb()), Exception.class, new zzgci() { // from class: com.google.android.gms.internal.ads.zzffc
            @Override // com.google.android.gms.internal.ads.zzgci
            public final mf.a zza(Object obj) {
                return zzffd.zza(this.zza, zzfevVar, (Exception) obj);
            }
        }, zzfewVar.zzb());
    }

    public static /* synthetic */ mf.a zza(zzffd zzffdVar, zzfev zzfevVar, Exception exc) {
        synchronized (zzffdVar) {
            zzffdVar.zzd = true;
            throw exc;
        }
    }

    public static /* synthetic */ mf.a zzb(zzffd zzffdVar, zzfev zzfevVar, zzfeb zzfebVar, zzfew zzfewVar, zzfek zzfekVar) {
        synchronized (zzffdVar) {
            try {
                zzffdVar.zzd = true;
                zzfevVar.zzb(zzfekVar);
                if (zzffdVar.zzc) {
                    return zzgdb.zzh(new zzfeu(zzfekVar, zzfewVar));
                }
                zzfebVar.zzd(zzfewVar.zza(), zzfekVar);
                return zzgdb.zzh(null);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final synchronized mf.a zzc(zzfew zzfewVar) {
        if (!this.zzd && !this.zzc) {
            zzfew zzfewVar2 = this.zza;
            if (zzfewVar2.zza() != null && zzfewVar.zza() != null && zzfewVar2.zza().equals(zzfewVar.zza())) {
                this.zzc = true;
                return this.zzb;
            }
        }
        return null;
    }

    public final synchronized void zzd(zzgcx zzgcxVar) {
        zzgci zzgciVar = new zzgci() { // from class: com.google.android.gms.internal.ads.zzffa
            @Override // com.google.android.gms.internal.ads.zzgci
            public final mf.a zza(Object obj) {
                return zzgdb.zzi();
            }
        };
        zzfew zzfewVar = this.zza;
        zzgdb.zzr(zzgdb.zzn(this.zzb, zzgciVar, zzfewVar.zzb()), zzgcxVar, zzfewVar.zzb());
    }
}
