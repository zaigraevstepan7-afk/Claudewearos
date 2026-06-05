package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicReference;
import nc.a2;
import nc.h2;
import nc.t3;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzfaw implements ad.a, zzcxf, zzcvu, zzcvr, zzcwh, zzcyd, zzezh, zzddw {
    private final zzfdx zza;
    private final AtomicReference zzb = new AtomicReference();
    private final AtomicReference zzc = new AtomicReference();
    private final AtomicReference zzd = new AtomicReference();
    private final AtomicReference zze = new AtomicReference();
    private final AtomicReference zzf = new AtomicReference();
    private final AtomicReference zzg = new AtomicReference();
    private final AtomicReference zzh = new AtomicReference();
    private zzfaw zzi = null;

    public zzfaw(zzfdx zzfdxVar) {
        this.zza = zzfdxVar;
    }

    @Override // ad.a
    public final void onAdMetadataChanged() {
        zzfaw zzfawVar = this.zzi;
        if (zzfawVar != null) {
            zzfawVar.onAdMetadataChanged();
        } else {
            zzeyy.zza(this.zzb, new zzeyx() { // from class: com.google.android.gms.internal.ads.zzfak
                @Override // com.google.android.gms.internal.ads.zzeyx
                public final void zza(Object obj) {
                    ((ad.a) obj).onAdMetadataChanged();
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcvr
    public final void zza() {
        zzfaw zzfawVar = this.zzi;
        if (zzfawVar != null) {
            zzfawVar.zza();
            return;
        }
        this.zza.zza();
        zzeyy.zza(this.zzd, new zzeyx() { // from class: com.google.android.gms.internal.ads.zzfas
            @Override // com.google.android.gms.internal.ads.zzeyx
            public final void zza(Object obj) {
                ((zzbww) obj).zzg();
            }
        });
        zzeyy.zza(this.zze, new zzeyx() { // from class: com.google.android.gms.internal.ads.zzfat
            @Override // com.google.android.gms.internal.ads.zzeyx
            public final void zza(Object obj) {
                ((zzbwg) obj).zzf();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcvr
    public final void zzb() {
        zzfaw zzfawVar = this.zzi;
        if (zzfawVar != null) {
            zzfawVar.zzb();
        } else {
            zzeyy.zza(this.zze, new zzeyx() { // from class: com.google.android.gms.internal.ads.zzfau
                @Override // com.google.android.gms.internal.ads.zzeyx
                public final void zza(Object obj) {
                    ((zzbwg) obj).zzh();
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcvr
    public final void zzc() {
        zzfaw zzfawVar = this.zzi;
        if (zzfawVar != null) {
            zzfawVar.zzc();
            return;
        }
        AtomicReference atomicReference = this.zzd;
        zzeyy.zza(atomicReference, new zzeyx() { // from class: com.google.android.gms.internal.ads.zzfae
            @Override // com.google.android.gms.internal.ads.zzeyx
            public final void zza(Object obj) {
                ((zzbww) obj).zzj();
            }
        });
        zzeyy.zza(this.zze, new zzeyx() { // from class: com.google.android.gms.internal.ads.zzfaf
            @Override // com.google.android.gms.internal.ads.zzeyx
            public final void zza(Object obj) {
                ((zzbwg) obj).zzj();
            }
        });
        zzeyy.zza(atomicReference, new zzeyx() { // from class: com.google.android.gms.internal.ads.zzfag
            @Override // com.google.android.gms.internal.ads.zzeyx
            public final void zza(Object obj) {
                ((zzbww) obj).zzf();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcvu
    public final void zzdD(final h2 h2Var) {
        zzfaw zzfawVar = this.zzi;
        if (zzfawVar != null) {
            zzfawVar.zzdD(h2Var);
            return;
        }
        final int i10 = h2Var.f12114a;
        AtomicReference atomicReference = this.zzc;
        zzeyy.zza(atomicReference, new zzeyx() { // from class: com.google.android.gms.internal.ads.zzfap
            @Override // com.google.android.gms.internal.ads.zzeyx
            public final void zza(Object obj) {
                ((zzbxa) obj).zzf(h2Var);
            }
        });
        zzeyy.zza(atomicReference, new zzeyx() { // from class: com.google.android.gms.internal.ads.zzfaq
            @Override // com.google.android.gms.internal.ads.zzeyx
            public final void zza(Object obj) {
                ((zzbxa) obj).zze(i10);
            }
        });
        zzeyy.zza(this.zze, new zzeyx() { // from class: com.google.android.gms.internal.ads.zzfar
            @Override // com.google.android.gms.internal.ads.zzeyx
            public final void zza(Object obj) {
                ((zzbwg) obj).zzg(i10);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzddw
    public final void zzdf() {
        zzfaw zzfawVar = this.zzi;
        if (zzfawVar != null) {
            zzfawVar.zzdf();
        } else {
            zzeyy.zza(this.zzd, new zzeyx() { // from class: com.google.android.gms.internal.ads.zzfal
                @Override // com.google.android.gms.internal.ads.zzeyx
                public final void zza(Object obj) {
                    ((zzbww) obj).zze();
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcvr
    public final void zzdu(final zzbwa zzbwaVar, final String str, final String str2) {
        zzfaw zzfawVar = this.zzi;
        if (zzfawVar != null) {
            zzfawVar.zzdu(zzbwaVar, str, str2);
            return;
        }
        zzeyy.zza(this.zzd, new zzeyx() { // from class: com.google.android.gms.internal.ads.zzfav
            @Override // com.google.android.gms.internal.ads.zzeyx
            public final void zza(Object obj) {
                zzbwa zzbwaVar2 = zzbwaVar;
                ((zzbww) obj).zzk(new zzbxk(zzbwaVar2.zzc(), zzbwaVar2.zzb()));
            }
        });
        zzeyy.zza(this.zzf, new zzeyx() { // from class: com.google.android.gms.internal.ads.zzfab
            @Override // com.google.android.gms.internal.ads.zzeyx
            public final void zza(Object obj) {
                zzbwa zzbwaVar2 = zzbwaVar;
                ((zzbxb) obj).zze(new zzbxk(zzbwaVar2.zzc(), zzbwaVar2.zzb()), str, str2);
            }
        });
        zzeyy.zza(this.zze, new zzeyx() { // from class: com.google.android.gms.internal.ads.zzfac
            @Override // com.google.android.gms.internal.ads.zzeyx
            public final void zza(Object obj) {
                ((zzbwg) obj).zze(zzbwaVar);
            }
        });
        zzeyy.zza(this.zzg, new zzeyx() { // from class: com.google.android.gms.internal.ads.zzfad
            @Override // com.google.android.gms.internal.ads.zzeyx
            public final void zza(Object obj) {
                ((zzbwb) obj).zze(zzbwaVar, str, str2);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcvr
    public final void zze() {
        zzfaw zzfawVar = this.zzi;
        if (zzfawVar != null) {
            zzfawVar.zze();
        } else {
            zzeyy.zza(this.zze, new zzeyx() { // from class: com.google.android.gms.internal.ads.zzfao
                @Override // com.google.android.gms.internal.ads.zzeyx
                public final void zza(Object obj) {
                    ((zzbwg) obj).zzk();
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcvr
    public final void zzf() {
        zzfaw zzfawVar = this.zzi;
        if (zzfawVar != null) {
            zzfawVar.zzf();
        } else {
            zzeyy.zza(this.zze, new zzeyx() { // from class: com.google.android.gms.internal.ads.zzfaa
                @Override // com.google.android.gms.internal.ads.zzeyx
                public final void zza(Object obj) {
                    ((zzbwg) obj).zzl();
                }
            });
        }
    }

    public final void zzg(ad.a aVar) {
        this.zzb.set(aVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcyd
    public final void zzh(final t3 t3Var) {
        zzfaw zzfawVar = this.zzi;
        if (zzfawVar != null) {
            zzfawVar.zzh(t3Var);
        } else {
            zzeyy.zza(this.zzh, new zzeyx() { // from class: com.google.android.gms.internal.ads.zzfah
                @Override // com.google.android.gms.internal.ads.zzeyx
                public final void zza(Object obj) {
                    ((a2) obj).i(t3Var);
                }
            });
        }
    }

    public final void zzi(a2 a2Var) {
        this.zzh.set(a2Var);
    }

    public final void zzj(zzbww zzbwwVar) {
        this.zzd.set(zzbwwVar);
    }

    public final void zzk(zzbxa zzbxaVar) {
        this.zzc.set(zzbxaVar);
    }

    @Override // com.google.android.gms.internal.ads.zzezh
    public final void zzl(zzezh zzezhVar) {
        this.zzi = (zzfaw) zzezhVar;
    }

    @Deprecated
    public final void zzm(zzbwg zzbwgVar) {
        this.zze.set(zzbwgVar);
    }

    @Deprecated
    public final void zzn(zzbwb zzbwbVar) {
        this.zzg.set(zzbwbVar);
    }

    public final void zzo(zzbxb zzbxbVar) {
        this.zzf.set(zzbxbVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcwh
    public final void zzr(final h2 h2Var) {
        zzfaw zzfawVar = this.zzi;
        if (zzfawVar != null) {
            zzfawVar.zzr(h2Var);
            return;
        }
        AtomicReference atomicReference = this.zzd;
        zzeyy.zza(atomicReference, new zzeyx() { // from class: com.google.android.gms.internal.ads.zzfam
            @Override // com.google.android.gms.internal.ads.zzeyx
            public final void zza(Object obj) {
                ((zzbww) obj).zzi(h2Var);
            }
        });
        zzeyy.zza(atomicReference, new zzeyx() { // from class: com.google.android.gms.internal.ads.zzfan
            @Override // com.google.android.gms.internal.ads.zzeyx
            public final void zza(Object obj) {
                ((zzbww) obj).zzh(h2Var.f12114a);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcxf
    public final void zzt() {
        zzfaw zzfawVar = this.zzi;
        if (zzfawVar != null) {
            zzfawVar.zzt();
        } else {
            zzeyy.zza(this.zzc, new zzeyx() { // from class: com.google.android.gms.internal.ads.zzfai
                @Override // com.google.android.gms.internal.ads.zzeyx
                public final void zza(Object obj) {
                    ((zzbxa) obj).zzg();
                }
            });
            zzeyy.zza(this.zze, new zzeyx() { // from class: com.google.android.gms.internal.ads.zzfaj
                @Override // com.google.android.gms.internal.ads.zzeyx
                public final void zza(Object obj) {
                    ((zzbwg) obj).zzi();
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzddw
    public final void zzu() {
    }
}
