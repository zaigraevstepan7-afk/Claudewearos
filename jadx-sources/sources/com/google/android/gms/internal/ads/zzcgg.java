package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import nc.k2;
import nc.n2;
import nc.n3;
import nc.t;
import rc.k;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzcgg extends k2 {
    private final zzcbz zza;
    private final boolean zzc;
    private final boolean zzd;
    private int zze;
    private n2 zzf;
    private boolean zzg;
    private float zzi;
    private float zzj;
    private float zzk;
    private boolean zzl;
    private boolean zzm;
    private zzbhv zzn;
    private final Object zzb = new Object();
    private boolean zzh = true;

    public zzcgg(zzcbz zzcbzVar, float f10, boolean z2, boolean z10) {
        this.zza = zzcbzVar;
        this.zzi = f10;
        this.zzc = z2;
        this.zzd = z10;
    }

    public static /* synthetic */ void zzd(zzcgg zzcggVar, int i10, int i11, boolean z2, boolean z10) {
        int i12;
        boolean z11;
        boolean z12;
        n2 n2Var;
        n2 n2Var2;
        n2 n2Var3;
        synchronized (zzcggVar.zzb) {
            try {
                boolean z13 = zzcggVar.zzg;
                if (z13 || i11 != 1) {
                    i12 = i11;
                    z11 = false;
                } else {
                    i11 = 1;
                    i12 = 1;
                    z11 = true;
                }
                boolean z14 = i10 != i11;
                if (z14 && i12 == 1) {
                    z12 = true;
                    i12 = 1;
                } else {
                    z12 = false;
                }
                boolean z15 = z14 && i12 == 2;
                boolean z16 = z14 && i12 == 3;
                zzcggVar.zzg = z13 || z11;
                if (z11) {
                    try {
                        n2 n2Var4 = zzcggVar.zzf;
                        if (n2Var4 != null) {
                            n2Var4.zzi();
                        }
                    } catch (RemoteException e10) {
                        k.i("#007 Could not call remote method.", e10);
                    }
                }
                if (z12 && (n2Var3 = zzcggVar.zzf) != null) {
                    n2Var3.zzh();
                }
                if (z15 && (n2Var2 = zzcggVar.zzf) != null) {
                    n2Var2.zzg();
                }
                if (z16) {
                    n2 n2Var5 = zzcggVar.zzf;
                    if (n2Var5 != null) {
                        n2Var5.zze();
                    }
                    zzcggVar.zza.zzw();
                }
                if (z2 != z10 && (n2Var = zzcggVar.zzf) != null) {
                    n2Var.o(z10);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private final void zzw(final int i10, final int i11, final boolean z2, final boolean z10) {
        zzcad.zzf.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcgf
            @Override // java.lang.Runnable
            public final void run() {
                zzcgg.zzd(this.zza, i10, i11, z2, z10);
            }
        });
    }

    private final void zzx(String str, Map map) {
        final HashMap map2 = map == null ? new HashMap() : new HashMap(map);
        map2.put("action", str);
        zzcad.zzf.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcge
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zza.zzd("pubVideoCmd", map2);
            }
        });
    }

    @Override // nc.l2
    public final float zze() {
        float f10;
        synchronized (this.zzb) {
            f10 = this.zzk;
        }
        return f10;
    }

    @Override // nc.l2
    public final float zzf() {
        float f10;
        synchronized (this.zzb) {
            f10 = this.zzj;
        }
        return f10;
    }

    @Override // nc.l2
    public final float zzg() {
        float f10;
        synchronized (this.zzb) {
            f10 = this.zzi;
        }
        return f10;
    }

    @Override // nc.l2
    public final int zzh() {
        int i10;
        synchronized (this.zzb) {
            i10 = this.zze;
        }
        return i10;
    }

    @Override // nc.l2
    public final n2 zzi() {
        n2 n2Var;
        synchronized (this.zzb) {
            n2Var = this.zzf;
        }
        return n2Var;
    }

    @Override // nc.l2
    public final void zzj(boolean z2) {
        zzx(true != z2 ? "unmute" : "mute", null);
    }

    @Override // nc.l2
    public final void zzk() {
        zzx("pause", null);
    }

    @Override // nc.l2
    public final void zzl() {
        zzx("play", null);
    }

    @Override // nc.l2
    public final void zzm(n2 n2Var) {
        synchronized (this.zzb) {
            this.zzf = n2Var;
        }
    }

    @Override // nc.l2
    public final void zzn() {
        zzx("stop", null);
    }

    @Override // nc.l2
    public final boolean zzo() {
        boolean z2;
        Object obj = this.zzb;
        boolean zZzp = zzp();
        synchronized (obj) {
            z2 = false;
            if (!zZzp) {
                try {
                    if (this.zzm && this.zzd) {
                        z2 = true;
                    }
                } finally {
                }
            }
        }
        return z2;
    }

    @Override // nc.l2
    public final boolean zzp() {
        boolean z2;
        synchronized (this.zzb) {
            try {
                z2 = false;
                if (this.zzc && this.zzl) {
                    z2 = true;
                }
            } finally {
            }
        }
        return z2;
    }

    @Override // nc.l2
    public final boolean zzq() {
        boolean z2;
        synchronized (this.zzb) {
            z2 = this.zzh;
        }
        return z2;
    }

    public final void zzr(float f10, float f11, int i10, boolean z2, float f12) {
        boolean z10;
        boolean z11;
        int i11;
        synchronized (this.zzb) {
            try {
                z10 = true;
                if (f11 == this.zzi && f12 == this.zzk) {
                    z10 = false;
                }
                this.zzi = f11;
                if (!((Boolean) t.f12227d.f12230c.zzb(zzbdc.zzmX)).booleanValue()) {
                    this.zzj = f10;
                }
                z11 = this.zzh;
                this.zzh = z2;
                i11 = this.zze;
                this.zze = i10;
                float f13 = this.zzk;
                this.zzk = f12;
                if (Math.abs(f12 - f13) > 1.0E-4f) {
                    this.zza.zzF().invalidate();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (z10) {
            try {
                zzbhv zzbhvVar = this.zzn;
                if (zzbhvVar != null) {
                    zzbhvVar.zze();
                }
            } catch (RemoteException e10) {
                k.i("#007 Could not call remote method.", e10);
            }
        }
        zzw(i11, i10, z11, z2);
    }

    public final void zzs(n3 n3Var) {
        Object obj = this.zzb;
        boolean z2 = n3Var.f12152b;
        boolean z10 = n3Var.f12153c;
        synchronized (obj) {
            this.zzl = z2;
            this.zzm = z10;
        }
        boolean z11 = n3Var.f12151a;
        String str = true != z2 ? "0" : "1";
        String str2 = true != z10 ? "0" : "1";
        String str3 = true != z11 ? "0" : "1";
        q.e eVar = new q.e(3);
        eVar.put("muteStart", str3);
        eVar.put("customControlsRequested", str);
        eVar.put("clickToExpandRequested", str2);
        zzx("initialState", Collections.unmodifiableMap(eVar));
    }

    public final void zzt(float f10) {
        synchronized (this.zzb) {
            this.zzj = f10;
        }
    }

    public final void zzu() {
        boolean z2;
        int i10;
        synchronized (this.zzb) {
            z2 = this.zzh;
            i10 = this.zze;
            this.zze = 3;
        }
        zzw(i10, 3, z2, z2);
    }

    public final void zzv(zzbhv zzbhvVar) {
        synchronized (this.zzb) {
            this.zzn = zzbhvVar;
        }
    }
}
