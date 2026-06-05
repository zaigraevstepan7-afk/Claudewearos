package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicReference;
import nc.a2;
import nc.h2;
import nc.t3;
import pc.m;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzexr implements zzcvu, zzcxq, zzezh, m, zzcyd, zzcwh, zzddw {
    private final zzfdx zza;
    private final AtomicReference zzb = new AtomicReference();
    private final AtomicReference zzc = new AtomicReference();
    private final AtomicReference zzd = new AtomicReference();
    private final AtomicReference zze = new AtomicReference();
    private final AtomicReference zzf = new AtomicReference();
    private final AtomicReference zzg = new AtomicReference();
    private zzexr zzh = null;

    public zzexr(zzfdx zzfdxVar) {
        this.zza = zzfdxVar;
    }

    public static zzexr zzi(zzexr zzexrVar) {
        zzexr zzexrVar2 = new zzexr(zzexrVar.zza);
        zzexrVar2.zzh = zzexrVar;
        return zzexrVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzcvu
    public final void zzdD(final h2 h2Var) {
        zzexr zzexrVar = this.zzh;
        if (zzexrVar != null) {
            zzexrVar.zzdD(h2Var);
            return;
        }
        AtomicReference atomicReference = this.zzb;
        zzeyy.zza(atomicReference, new zzeyx() { // from class: com.google.android.gms.internal.ads.zzexm
            @Override // com.google.android.gms.internal.ads.zzeyx
            public final void zza(Object obj) {
                ((zzbax) obj).zzc(h2Var);
            }
        });
        zzeyy.zza(atomicReference, new zzeyx() { // from class: com.google.android.gms.internal.ads.zzexn
            @Override // com.google.android.gms.internal.ads.zzeyx
            public final void zza(Object obj) {
                ((zzbax) obj).zzb(h2Var.f12114a);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzddw
    public final void zzdf() {
        zzexr zzexrVar = this.zzh;
        if (zzexrVar != null) {
            zzexrVar.zzdf();
        } else {
            zzeyy.zza(this.zzd, new zzeyx() { // from class: com.google.android.gms.internal.ads.zzexi
                @Override // com.google.android.gms.internal.ads.zzeyx
                public final void zza(Object obj) {
                    ((zzbbb) obj).zzb();
                }
            });
        }
    }

    @Override // pc.m
    public final void zzds() {
        zzexr zzexrVar = this.zzh;
        if (zzexrVar != null) {
            zzexrVar.zzds();
        } else {
            zzeyy.zza(this.zzf, new zzeyx() { // from class: com.google.android.gms.internal.ads.zzexf
                @Override // com.google.android.gms.internal.ads.zzeyx
                public final void zza(Object obj) {
                    ((m) obj).zzds();
                }
            });
        }
    }

    @Override // pc.m
    public final void zzdt() {
        zzexr zzexrVar = this.zzh;
        if (zzexrVar != null) {
            zzexrVar.zzdt();
            return;
        }
        zzeyy.zza(this.zzf, new zzeyx() { // from class: com.google.android.gms.internal.ads.zzexq
            @Override // com.google.android.gms.internal.ads.zzeyx
            public final void zza(Object obj) {
                ((m) obj).zzdt();
            }
        });
        AtomicReference atomicReference = this.zzd;
        zzeyy.zza(atomicReference, new zzeyx() { // from class: com.google.android.gms.internal.ads.zzexd
            @Override // com.google.android.gms.internal.ads.zzeyx
            public final void zza(Object obj) {
                ((zzbbb) obj).zzf();
            }
        });
        zzeyy.zza(atomicReference, new zzeyx() { // from class: com.google.android.gms.internal.ads.zzexe
            @Override // com.google.android.gms.internal.ads.zzeyx
            public final void zza(Object obj) {
                ((zzbbb) obj).zze();
            }
        });
    }

    @Override // pc.m
    public final void zzdv() {
        zzexr zzexrVar = this.zzh;
        if (zzexrVar != null) {
            zzexrVar.zzdv();
        } else {
            zzeyy.zza(this.zzf, new zzeyx() { // from class: com.google.android.gms.internal.ads.zzexp
                @Override // com.google.android.gms.internal.ads.zzeyx
                public final void zza(Object obj) {
                    ((m) obj).zzdv();
                }
            });
        }
    }

    @Override // pc.m
    public final void zzdw(final int i10) {
        zzexr zzexrVar = this.zzh;
        if (zzexrVar != null) {
            zzexrVar.zzdw(i10);
        } else {
            zzeyy.zza(this.zzf, new zzeyx() { // from class: com.google.android.gms.internal.ads.zzexl
                @Override // com.google.android.gms.internal.ads.zzeyx
                public final void zza(Object obj) {
                    ((m) obj).zzdw(i10);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcxq
    public final void zzg() {
        zzexr zzexrVar = this.zzh;
        if (zzexrVar != null) {
            zzexrVar.zzg();
        } else {
            zzeyy.zza(this.zze, new zzeyx() { // from class: com.google.android.gms.internal.ads.zzexo
                @Override // com.google.android.gms.internal.ads.zzeyx
                public final void zza(Object obj) {
                    ((zzcxq) obj).zzg();
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcyd
    public final void zzh(final t3 t3Var) {
        zzexr zzexrVar = this.zzh;
        if (zzexrVar != null) {
            zzexrVar.zzh(t3Var);
        } else {
            zzeyy.zza(this.zzg, new zzeyx() { // from class: com.google.android.gms.internal.ads.zzexc
                @Override // com.google.android.gms.internal.ads.zzeyx
                public final void zza(Object obj) {
                    ((a2) obj).i(t3Var);
                }
            });
        }
    }

    public final void zzj() {
        zzexr zzexrVar = this.zzh;
        if (zzexrVar != null) {
            zzexrVar.zzj();
            return;
        }
        this.zza.zza();
        zzeyy.zza(this.zzc, new zzeyx() { // from class: com.google.android.gms.internal.ads.zzexj
            @Override // com.google.android.gms.internal.ads.zzeyx
            public final void zza(Object obj) {
                ((zzbay) obj).zza();
            }
        });
        zzeyy.zza(this.zzd, new zzeyx() { // from class: com.google.android.gms.internal.ads.zzexk
            @Override // com.google.android.gms.internal.ads.zzeyx
            public final void zza(Object obj) {
                ((zzbbb) obj).zzc();
            }
        });
    }

    public final void zzk(final zzbau zzbauVar) {
        zzexr zzexrVar = this.zzh;
        if (zzexrVar != null) {
            zzexrVar.zzk(zzbauVar);
        } else {
            zzeyy.zza(this.zzb, new zzeyx() { // from class: com.google.android.gms.internal.ads.zzexh
                @Override // com.google.android.gms.internal.ads.zzeyx
                public final void zza(Object obj) {
                    ((zzbax) obj).zzd(zzbauVar);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzezh
    public final void zzl(zzezh zzezhVar) {
        this.zzh = (zzexr) zzezhVar;
    }

    public final void zzm(m mVar) {
        this.zzf.set(mVar);
    }

    public final void zzn(a2 a2Var) {
        this.zzg.set(a2Var);
    }

    public final void zzo(zzbax zzbaxVar) {
        this.zzb.set(zzbaxVar);
    }

    public final void zzp(zzbbb zzbbbVar) {
        this.zzd.set(zzbbbVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcwh
    public final void zzr(final h2 h2Var) {
        zzexr zzexrVar = this.zzh;
        if (zzexrVar != null) {
            zzexrVar.zzr(h2Var);
        } else {
            zzeyy.zza(this.zzd, new zzeyx() { // from class: com.google.android.gms.internal.ads.zzexg
                @Override // com.google.android.gms.internal.ads.zzeyx
                public final void zza(Object obj) {
                    ((zzbbb) obj).zzd(h2Var);
                }
            });
        }
    }

    @Override // pc.m
    public final void zzdH() {
    }

    @Override // pc.m
    public final void zzdk() {
    }

    @Override // com.google.android.gms.internal.ads.zzddw
    public final void zzu() {
    }
}
