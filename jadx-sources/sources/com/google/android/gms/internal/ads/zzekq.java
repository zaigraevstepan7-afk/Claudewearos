package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import nc.a2;
import nc.b1;
import nc.c0;
import nc.g1;
import nc.h2;
import nc.t;
import nc.t3;
import nc.z;
import qc.l0;
import rc.k;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzekq implements gc.e, zzcyt, zzcxf, zzcvu, zzcwl, nc.a, zzcvr, zzcyd, zzcwh, zzddw {
    final zzdsc zza;
    private final AtomicReference zzc = new AtomicReference();
    private final AtomicReference zzd = new AtomicReference();
    private final AtomicReference zze = new AtomicReference();
    private final AtomicReference zzf = new AtomicReference();
    private final AtomicReference zzg = new AtomicReference();
    private final AtomicBoolean zzh = new AtomicBoolean(true);
    private final AtomicBoolean zzi = new AtomicBoolean(false);
    private final AtomicBoolean zzj = new AtomicBoolean(false);
    final BlockingQueue zzb = new ArrayBlockingQueue(((Integer) t.f12227d.f12230c.zzb(zzbdc.zzjd)).intValue());

    public zzekq(zzdsc zzdscVar) {
        this.zza = zzdscVar;
    }

    private final void zzo() {
        if (this.zzi.get() && this.zzj.get()) {
            BlockingQueue<Pair> blockingQueue = this.zzb;
            for (final Pair pair : blockingQueue) {
                zzeyy.zza(this.zzd, new zzeyx() { // from class: com.google.android.gms.internal.ads.zzekb
                    @Override // com.google.android.gms.internal.ads.zzeyx
                    public final void zza(Object obj) {
                        Pair pair2 = pair;
                        ((b1) obj).zzc((String) pair2.first, (String) pair2.second);
                    }
                });
            }
            blockingQueue.clear();
            this.zzh.set(false);
        }
    }

    @Override // nc.a
    public final void onAdClicked() {
        if (((Boolean) t.f12227d.f12230c.zzb(zzbdc.zzkY)).booleanValue()) {
            return;
        }
        zzeyy.zza(this.zzc, new zzeko());
    }

    @Override // gc.e
    public final synchronized void onAppEvent(final String str, final String str2) {
        if (!this.zzh.get()) {
            zzeyy.zza(this.zzd, new zzeyx() { // from class: com.google.android.gms.internal.ads.zzeki
                @Override // com.google.android.gms.internal.ads.zzeyx
                public final void zza(Object obj) {
                    ((b1) obj).zzc(str, str2);
                }
            });
            return;
        }
        if (!this.zzb.offer(new Pair(str, str2))) {
            int i10 = l0.f13401b;
            k.b("The queue for app events is full, dropping the new event.");
            zzdsc zzdscVar = this.zza;
            if (zzdscVar != null) {
                zzdsb zzdsbVarZza = zzdscVar.zza();
                zzdsbVarZza.zzb("action", "dae_action");
                zzdsbVarZza.zzb("dae_name", str);
                zzdsbVarZza.zzb("dae_data", str2);
                zzdsbVarZza.zzj();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcvr
    public final void zza() {
        zzeyy.zza(this.zzc, new zzeyx() { // from class: com.google.android.gms.internal.ads.zzejy
            @Override // com.google.android.gms.internal.ads.zzeyx
            public final void zza(Object obj) {
                ((z) obj).zzd();
            }
        });
        zzeyy.zza(this.zzg, new zzeyx() { // from class: com.google.android.gms.internal.ads.zzejz
            @Override // com.google.android.gms.internal.ads.zzeyx
            public final void zza(Object obj) {
                ((g1) obj).zzc();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcvr
    public final void zzb() {
        zzeyy.zza(this.zzc, new zzeyx() { // from class: com.google.android.gms.internal.ads.zzekj
            @Override // com.google.android.gms.internal.ads.zzeyx
            public final void zza(Object obj) {
                ((z) obj).zzh();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcvr
    public final void zzc() {
        zzeyy.zza(this.zzc, new zzeyx() { // from class: com.google.android.gms.internal.ads.zzekl
            @Override // com.google.android.gms.internal.ads.zzeyx
            public final void zza(Object obj) {
                ((z) obj).zzj();
            }
        });
        zzeyx zzeyxVar = new zzeyx() { // from class: com.google.android.gms.internal.ads.zzekm
            @Override // com.google.android.gms.internal.ads.zzeyx
            public final void zza(Object obj) {
                ((g1) obj).zzf();
            }
        };
        AtomicReference atomicReference = this.zzg;
        zzeyy.zza(atomicReference, zzeyxVar);
        zzeyy.zza(atomicReference, new zzeyx() { // from class: com.google.android.gms.internal.ads.zzekn
            @Override // com.google.android.gms.internal.ads.zzeyx
            public final void zza(Object obj) {
                ((g1) obj).zze();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcvu
    public final void zzdD(final h2 h2Var) {
        zzeyx zzeyxVar = new zzeyx() { // from class: com.google.android.gms.internal.ads.zzekc
            @Override // com.google.android.gms.internal.ads.zzeyx
            public final void zza(Object obj) {
                ((z) obj).zzf(h2Var);
            }
        };
        AtomicReference atomicReference = this.zzc;
        zzeyy.zza(atomicReference, zzeyxVar);
        zzeyy.zza(atomicReference, new zzeyx() { // from class: com.google.android.gms.internal.ads.zzekd
            @Override // com.google.android.gms.internal.ads.zzeyx
            public final void zza(Object obj) {
                ((z) obj).zze(h2Var.f12114a);
            }
        });
        zzeyy.zza(this.zzf, new zzeyx() { // from class: com.google.android.gms.internal.ads.zzeke
            @Override // com.google.android.gms.internal.ads.zzeyx
            public final void zza(Object obj) {
                ((c0) obj).zzb(h2Var);
            }
        });
        this.zzh.set(false);
        this.zzb.clear();
    }

    @Override // com.google.android.gms.internal.ads.zzddw
    public final void zzdf() {
        if (((Boolean) t.f12227d.f12230c.zzb(zzbdc.zzkY)).booleanValue()) {
            zzeyy.zza(this.zzc, new zzeko());
        }
        zzeyy.zza(this.zzg, new zzeyx() { // from class: com.google.android.gms.internal.ads.zzeka
            @Override // com.google.android.gms.internal.ads.zzeyx
            public final void zza(Object obj) {
                ((g1) obj).zzb();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcyt
    public final void zzdo(zzfcf zzfcfVar) {
        this.zzh.set(true);
        this.zzj.set(false);
    }

    public final synchronized z zzg() {
        return (z) this.zzc.get();
    }

    @Override // com.google.android.gms.internal.ads.zzcyd
    public final void zzh(final t3 t3Var) {
        zzeyy.zza(this.zze, new zzeyx() { // from class: com.google.android.gms.internal.ads.zzekp
            @Override // com.google.android.gms.internal.ads.zzeyx
            public final void zza(Object obj) {
                ((a2) obj).i(t3Var);
            }
        });
    }

    public final synchronized b1 zzi() {
        return (b1) this.zzd.get();
    }

    public final void zzj(z zVar) {
        this.zzc.set(zVar);
    }

    public final void zzk(c0 c0Var) {
        this.zzf.set(c0Var);
    }

    public final void zzl(a2 a2Var) {
        this.zze.set(a2Var);
    }

    public final void zzm(b1 b1Var) {
        this.zzd.set(b1Var);
        this.zzi.set(true);
        zzo();
    }

    public final void zzn(g1 g1Var) {
        this.zzg.set(g1Var);
    }

    @Override // com.google.android.gms.internal.ads.zzcwh
    public final void zzr(final h2 h2Var) {
        zzeyy.zza(this.zzg, new zzeyx() { // from class: com.google.android.gms.internal.ads.zzekh
            @Override // com.google.android.gms.internal.ads.zzeyx
            public final void zza(Object obj) {
                ((g1) obj).zzd(h2Var);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcwl
    public final void zzs() {
        zzeyy.zza(this.zzc, new zzeyx() { // from class: com.google.android.gms.internal.ads.zzejx
            @Override // com.google.android.gms.internal.ads.zzeyx
            public final void zza(Object obj) {
                ((z) obj).zzg();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcxf
    public final synchronized void zzt() {
        zzeyy.zza(this.zzc, new zzeyx() { // from class: com.google.android.gms.internal.ads.zzekf
            @Override // com.google.android.gms.internal.ads.zzeyx
            public final void zza(Object obj) {
                ((z) obj).zzi();
            }
        });
        zzeyy.zza(this.zzf, new zzeyx() { // from class: com.google.android.gms.internal.ads.zzekg
            @Override // com.google.android.gms.internal.ads.zzeyx
            public final void zza(Object obj) {
                ((c0) obj).zzc();
            }
        });
        this.zzj.set(true);
        zzo();
    }

    @Override // com.google.android.gms.internal.ads.zzddw
    public final void zzu() {
        zzeyy.zza(this.zzc, new zzeyx() { // from class: com.google.android.gms.internal.ads.zzekk
            @Override // com.google.android.gms.internal.ads.zzeyx
            public final void zza(Object obj) {
                ((z) obj).zzk();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcvr
    public final void zze() {
    }

    @Override // com.google.android.gms.internal.ads.zzcvr
    public final void zzf() {
    }

    @Override // com.google.android.gms.internal.ads.zzcyt
    public final void zzdn(zzbvo zzbvoVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzcvr
    public final void zzdu(zzbwa zzbwaVar, String str, String str2) {
    }
}
