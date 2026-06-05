package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import qc.l0;
import rc.k;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzeew extends zzbwk implements zzcxb {
    private zzbwl zza;
    private zzcxa zzb;
    private zzdeh zzc;

    @Override // com.google.android.gms.internal.ads.zzcxb
    public final synchronized void zza(zzcxa zzcxaVar) {
        this.zzb = zzcxaVar;
    }

    public final synchronized void zzc(zzbwl zzbwlVar) {
        this.zza = zzbwlVar;
    }

    public final synchronized void zzd(zzdeh zzdehVar) {
        this.zzc = zzdehVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbwl
    public final synchronized void zze(xd.a aVar) {
        zzbwl zzbwlVar = this.zza;
        if (zzbwlVar != null) {
            ((zzeib) zzbwlVar).zzb.onAdClicked();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbwl
    public final synchronized void zzf(xd.a aVar) {
        zzbwl zzbwlVar = this.zza;
        if (zzbwlVar != null) {
            zzbwlVar.zzf(aVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbwl
    public final synchronized void zzg(xd.a aVar, int i10) {
        zzcxa zzcxaVar = this.zzb;
        if (zzcxaVar != null) {
            zzcxaVar.zza(i10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbwl
    public final synchronized void zzh(xd.a aVar) {
        zzbwl zzbwlVar = this.zza;
        if (zzbwlVar != null) {
            ((zzeib) zzbwlVar).zzc.zzb();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbwl
    public final synchronized void zzi(xd.a aVar) {
        zzcxa zzcxaVar = this.zzb;
        if (zzcxaVar != null) {
            zzcxaVar.zzd();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbwl
    public final synchronized void zzj(xd.a aVar) {
        zzbwl zzbwlVar = this.zza;
        if (zzbwlVar != null) {
            ((zzeib) zzbwlVar).zza.zzdt();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbwl
    public final synchronized void zzk(xd.a aVar, int i10) {
        zzdeh zzdehVar = this.zzc;
        if (zzdehVar != null) {
            zzedh zzedhVar = ((zzehz) zzdehVar).zzc;
            int i11 = l0.f13401b;
            k.g("Fail to initialize adapter ".concat(String.valueOf(zzedhVar.zza)));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbwl
    public final synchronized void zzl(xd.a aVar) {
        zzdeh zzdehVar = this.zzc;
        if (zzdehVar != null) {
            Executor executor = ((zzehz) zzdehVar).zzd.zzb;
            final zzedh zzedhVar = ((zzehz) zzdehVar).zzc;
            final zzfbt zzfbtVar = ((zzehz) zzdehVar).zzb;
            final zzfcf zzfcfVar = ((zzehz) zzdehVar).zza;
            final zzehz zzehzVar = (zzehz) zzdehVar;
            executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzehy
                @Override // java.lang.Runnable
                public final void run() {
                    zzeic zzeicVar = zzehzVar.zzd;
                    zzeic.zze(zzfcfVar, zzfbtVar, zzedhVar);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbwl
    public final synchronized void zzm(xd.a aVar, zzbwm zzbwmVar) {
        zzbwl zzbwlVar = this.zza;
        if (zzbwlVar != null) {
            ((zzeib) zzbwlVar).zzd.zza(zzbwmVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbwl
    public final synchronized void zzn(xd.a aVar) {
        zzbwl zzbwlVar = this.zza;
        if (zzbwlVar != null) {
            ((zzeib) zzbwlVar).zzd.zza(null);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbwl
    public final synchronized void zzo(xd.a aVar) {
        zzbwl zzbwlVar = this.zza;
        if (zzbwlVar != null) {
            ((zzeib) zzbwlVar).zzc.zze();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbwl
    public final synchronized void zzp(xd.a aVar) {
        zzbwl zzbwlVar = this.zza;
        if (zzbwlVar != null) {
            ((zzeib) zzbwlVar).zzd.zzc();
        }
    }
}
