package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzgnm {
    private static final zzgnm zza = (zzgnm) zzgow.zza(new zzgov() { // from class: com.google.android.gms.internal.ads.zzgnk
        @Override // com.google.android.gms.internal.ads.zzgov
        public final Object zza() {
            zzgnm zzgnmVar = new zzgnm();
            zzgnmVar.zzg(new zzgmi(zzgmr.class, zzgol.class, new zzgmj() { // from class: com.google.android.gms.internal.ads.zzgnl
                @Override // com.google.android.gms.internal.ads.zzgmj
                public final zzgop zza(zzgen zzgenVar, zzgfb zzgfbVar) {
                    return ((zzgmr) zzgenVar).zzb(zzgfbVar);
                }
            }));
            return zzgnmVar;
        }
    });
    private final AtomicReference zzb = new AtomicReference(new zzgou(new zzgoq(), null));

    public static zzgnm zzc() {
        return zza;
    }

    public final zzgen zza(zzgop zzgopVar, zzgfb zzgfbVar) {
        return ((zzgou) this.zzb.get()).zza(zzgopVar, zzgfbVar);
    }

    public final zzgfa zzb(zzgop zzgopVar) {
        return ((zzgou) this.zzb.get()).zzb(zzgopVar);
    }

    public final zzgop zzd(zzgen zzgenVar, Class cls, zzgfb zzgfbVar) {
        return ((zzgou) this.zzb.get()).zzc(zzgenVar, cls, zzgfbVar);
    }

    public final zzgop zze(zzgfa zzgfaVar, Class cls) {
        return ((zzgou) this.zzb.get()).zzd(zzgfaVar, cls);
    }

    public final synchronized void zzf(zzgmh zzgmhVar) {
        AtomicReference atomicReference = this.zzb;
        zzgoq zzgoqVar = new zzgoq((zzgou) atomicReference.get());
        zzgoqVar.zza(zzgmhVar);
        atomicReference.set(new zzgou(zzgoqVar, null));
    }

    public final synchronized void zzg(zzgml zzgmlVar) {
        AtomicReference atomicReference = this.zzb;
        zzgoq zzgoqVar = new zzgoq((zzgou) atomicReference.get());
        zzgoqVar.zzb(zzgmlVar);
        atomicReference.set(new zzgou(zzgoqVar, null));
    }

    public final synchronized void zzh(zzgnr zzgnrVar) {
        AtomicReference atomicReference = this.zzb;
        zzgoq zzgoqVar = new zzgoq((zzgou) atomicReference.get());
        zzgoqVar.zzc(zzgnrVar);
        atomicReference.set(new zzgou(zzgoqVar, null));
    }

    public final synchronized void zzi(zzgnv zzgnvVar) {
        AtomicReference atomicReference = this.zzb;
        zzgoq zzgoqVar = new zzgoq((zzgou) atomicReference.get());
        zzgoqVar.zzd(zzgnvVar);
        atomicReference.set(new zzgou(zzgoqVar, null));
    }

    public final boolean zzj(zzgop zzgopVar) {
        return ((zzgou) this.zzb.get()).zzi(zzgopVar);
    }

    public final boolean zzk(zzgop zzgopVar) {
        return ((zzgou) this.zzb.get()).zzj(zzgopVar);
    }
}
