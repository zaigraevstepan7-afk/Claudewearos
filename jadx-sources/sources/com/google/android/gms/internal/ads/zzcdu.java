package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.IOException;
import mc.n;
import nc.t;
import qc.l0;
import qc.r0;
import rc.k;
import y8.f;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzcdu extends zzcdl implements zzcbp {
    public static final /* synthetic */ int zzd = 0;
    private zzcbq zze;
    private String zzf;
    private boolean zzg;
    private boolean zzh;
    private zzcdd zzi;
    private long zzj;
    private long zzk;

    public zzcdu(zzcbz zzcbzVar, zzcby zzcbyVar) {
        super(zzcbzVar);
        zzcem zzcemVar = new zzcem(zzcbzVar.getContext(), zzcbyVar, (zzcbz) this.zzc.get(), null);
        int i10 = l0.f13401b;
        k.f("ExoPlayerAdapter initialized.");
        this.zze = zzcemVar;
        zzcemVar.zzL(this);
    }

    public static void zzb(zzcdu zzcduVar) {
        t tVar;
        long jLongValue;
        long jIntValue;
        boolean zBooleanValue;
        t tVar2;
        long j;
        long j4;
        long j10;
        String strZzc = zzc(zzcduVar.zzf);
        try {
            zzbct zzbctVar = zzbdc.zzN;
            tVar = t.f12227d;
            jLongValue = ((Long) tVar.f12230c.zzb(zzbctVar)).longValue() * 1000;
            jIntValue = ((Integer) tVar.f12230c.zzb(zzbdc.zzt)).intValue();
            zBooleanValue = ((Boolean) tVar.f12230c.zzb(zzbdc.zzca)).booleanValue();
        } catch (Exception e10) {
            String strB = f.b("Failed to preload url ", zzcduVar.zzf, " Exception: ", e10.getMessage());
            int i10 = l0.f13401b;
            k.g(strB);
            n.D.f11582h.zzv(e10, "VideoStreamExoPlayerCache.preload");
            zzcduVar.release();
            zzcduVar.zzg(zzcduVar.zzf, strZzc, "error", zzd("error", e10));
        }
        synchronized (zzcduVar) {
            n.D.f11584k.getClass();
            if (System.currentTimeMillis() - zzcduVar.zzj > jLongValue) {
                throw new IOException("Timeout reached. Limit: " + jLongValue + " ms");
            }
            if (zzcduVar.zzg) {
                throw new IOException("Abort requested before buffering finished. ");
            }
            if (!zzcduVar.zzh) {
                if (!zzcduVar.zze.zzV()) {
                    throw new IOException("ExoPlayer was released during preloading.");
                }
                long jZzz = zzcduVar.zze.zzz();
                if (jZzz > 0) {
                    long jZzv = zzcduVar.zze.zzv();
                    if (jZzv != zzcduVar.zzk) {
                        boolean z2 = jZzv > 0;
                        String str = zzcduVar.zzf;
                        long jZzA = zBooleanValue ? zzcduVar.zze.zzA() : -1L;
                        j10 = jZzv;
                        j = jIntValue;
                        boolean z10 = z2;
                        tVar2 = tVar;
                        j4 = jZzz;
                        zzcduVar.zzo(str, strZzc, j10, j4, z10, jZzA, zBooleanValue ? zzcduVar.zze.zzx() : -1L, zBooleanValue ? zzcduVar.zze.zzB() : -1L, zzcbq.zzs(), zzcbq.zzu());
                        zzcduVar.zzk = j10;
                    } else {
                        tVar2 = tVar;
                        j = jIntValue;
                        j4 = jZzz;
                        j10 = jZzv;
                    }
                    if (j10 >= j4) {
                        zzcduVar.zzj(zzcduVar.zzf, strZzc, j4);
                    } else if (zzcduVar.zze.zzw() >= j && j10 > 0) {
                    }
                } else {
                    tVar2 = tVar;
                }
                zzcduVar.zzx(((Long) tVar2.f12230c.zzb(zzbdc.zzO)).longValue());
                return;
            }
            n.D.B.zzc(zzcduVar.zzi);
        }
    }

    public static final String zzc(String str) {
        return "cache:".concat(String.valueOf(rc.e.d(str, "MD5")));
    }

    private static String zzd(String str, Exception exc) {
        return str + "/" + exc.getClass().getCanonicalName() + ":" + exc.getMessage();
    }

    private final void zzx(long j) {
        r0.f13445l.postDelayed(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcdt
            @Override // java.lang.Runnable
            public final void run() {
                zzcdu.zzb(this.zza);
            }
        }, j);
    }

    @Override // com.google.android.gms.internal.ads.zzcdl
    public final void release() {
        zzcbq zzcbqVar = this.zze;
        if (zzcbqVar != null) {
            zzcbqVar.zzL(null);
            this.zze.zzH();
        }
    }

    public final zzcbq zza() {
        synchronized (this) {
            this.zzh = true;
            notify();
        }
        this.zze.zzL(null);
        zzcbq zzcbqVar = this.zze;
        this.zze = null;
        return zzcbqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcdl
    public final void zzf() {
        synchronized (this) {
            this.zzg = true;
            notify();
            release();
        }
        String str = this.zzf;
        if (str != null) {
            zzg(this.zzf, zzc(str), "externalAbort", "Programmatic precache abort.");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbp
    public final void zzi(final boolean z2, final long j) {
        final zzcbz zzcbzVar = (zzcbz) this.zzc.get();
        if (zzcbzVar != null) {
            zzcad.zzf.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcds
                @Override // java.lang.Runnable
                public final void run() {
                    zzcbzVar.zzv(z2, j);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbp
    public final void zzk(String str, Exception exc) {
        int i10 = l0.f13401b;
        k.h("Precache error", exc);
        n.D.f11582h.zzv(exc, "VideoStreamExoPlayerCache.onError");
    }

    @Override // com.google.android.gms.internal.ads.zzcbp
    public final void zzl(String str, Exception exc) {
        int i10 = l0.f13401b;
        k.h("Precache exception", exc);
        n.D.f11582h.zzv(exc, "VideoStreamExoPlayerCache.onException");
    }

    @Override // com.google.android.gms.internal.ads.zzcdl
    public final void zzp(int i10) {
        this.zze.zzJ(i10);
    }

    @Override // com.google.android.gms.internal.ads.zzcdl
    public final void zzq(int i10) {
        this.zze.zzK(i10);
    }

    @Override // com.google.android.gms.internal.ads.zzcdl
    public final void zzr(int i10) {
        this.zze.zzM(i10);
    }

    @Override // com.google.android.gms.internal.ads.zzcdl
    public final void zzs(int i10) {
        this.zze.zzN(i10);
    }

    @Override // com.google.android.gms.internal.ads.zzcdl
    public final boolean zzt(String str) {
        return zzu(str, new String[]{str});
    }

    @Override // com.google.android.gms.internal.ads.zzcdl
    public final boolean zzu(String str, String[] strArr) {
        long j;
        long j4;
        long j10;
        long j11;
        long j12;
        long j13;
        long j14;
        boolean z2;
        this.zzf = str;
        String strZzc = zzc(str);
        try {
            Uri[] uriArr = new Uri[strArr.length];
            for (int i10 = 0; i10 < strArr.length; i10++) {
                uriArr[i10] = Uri.parse(strArr[i10]);
            }
            this.zze.zzF(uriArr, this.zzb);
            zzcbz zzcbzVar = (zzcbz) this.zzc.get();
            if (zzcbzVar != null) {
                zzcbzVar.zzt(strZzc, this);
            }
            n.D.f11584k.getClass();
            long jCurrentTimeMillis = System.currentTimeMillis();
            zzbct zzbctVar = zzbdc.zzO;
            t tVar = t.f12227d;
            long jLongValue = ((Long) tVar.f12230c.zzb(zzbctVar)).longValue();
            long jLongValue2 = ((Long) tVar.f12230c.zzb(zzbdc.zzN)).longValue() * 1000;
            long jIntValue = ((Integer) tVar.f12230c.zzb(zzbdc.zzt)).intValue();
            boolean zBooleanValue = ((Boolean) tVar.f12230c.zzb(zzbdc.zzca)).booleanValue();
            long j15 = -1;
            while (true) {
                synchronized (this) {
                    if (System.currentTimeMillis() - jCurrentTimeMillis > jLongValue2) {
                        throw new IOException("Timeout reached. Limit: " + jLongValue2 + " ms");
                    }
                    if (this.zzg) {
                        throw new IOException("Abort requested before buffering finished. ");
                    }
                    if (this.zzh) {
                        return true;
                    }
                    if (!this.zze.zzV()) {
                        throw new IOException("ExoPlayer was released during preloading.");
                    }
                    long jZzz = this.zze.zzz();
                    if (jZzz > 0) {
                        long jZzv = this.zze.zzv();
                        if (jZzv != j15) {
                            if (jZzv > 0) {
                                j14 = jLongValue2;
                                z2 = true;
                            } else {
                                j14 = jLongValue2;
                                z2 = false;
                            }
                            j13 = jZzv;
                            long jZzA = zBooleanValue ? this.zze.zzA() : -1L;
                            j4 = jIntValue;
                            j11 = jLongValue;
                            j = j14;
                            j12 = jZzz;
                            zzo(str, strZzc, j13, j12, z2, jZzA, zBooleanValue ? this.zze.zzx() : -1L, zBooleanValue ? this.zze.zzB() : -1L, zzcbq.zzs(), zzcbq.zzu());
                            j15 = j13;
                        } else {
                            j11 = jLongValue;
                            j = jLongValue2;
                            j4 = jIntValue;
                            j12 = jZzz;
                            j13 = jZzv;
                        }
                        if (j13 >= j12) {
                            zzj(str, strZzc, j12);
                            return true;
                        }
                        if (this.zze.zzw() >= j4 && j13 > 0) {
                            return true;
                        }
                        j10 = j11;
                    } else {
                        j = jLongValue2;
                        j4 = jIntValue;
                        j10 = jLongValue;
                    }
                    try {
                        wait(j10);
                    } catch (InterruptedException unused) {
                        throw new IOException("Wait interrupted.");
                    }
                }
                jLongValue = j10;
                jIntValue = j4;
                jLongValue2 = j;
            }
        } catch (Exception e10) {
            String strB = f.b("Failed to preload url ", str, " Exception: ", e10.getMessage());
            int i11 = l0.f13401b;
            k.g(strB);
            n.D.f11582h.zzv(e10, "VideoStreamExoPlayerCache.preload");
            release();
            zzg(str, strZzc, "error", zzd("error", e10));
            return false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbp
    public final void zzv() {
        int i10 = l0.f13401b;
        k.g("Precache onRenderedFirstFrame");
    }

    @Override // com.google.android.gms.internal.ads.zzcdl
    public final boolean zzw(String str, String[] strArr, zzcdd zzcddVar) {
        this.zzf = str;
        this.zzi = zzcddVar;
        String strZzc = zzc(str);
        try {
            Uri[] uriArr = new Uri[strArr.length];
            for (int i10 = 0; i10 < strArr.length; i10++) {
                uriArr[i10] = Uri.parse(strArr[i10]);
            }
            this.zze.zzF(uriArr, this.zzb);
            zzcbz zzcbzVar = (zzcbz) this.zzc.get();
            if (zzcbzVar != null) {
                zzcbzVar.zzt(strZzc, this);
            }
            n.D.f11584k.getClass();
            this.zzj = System.currentTimeMillis();
            this.zzk = -1L;
            zzx(0L);
            return true;
        } catch (Exception e10) {
            String strB = f.b("Failed to preload url ", str, " Exception: ", e10.getMessage());
            int i11 = l0.f13401b;
            k.g(strB);
            n.D.f11582h.zzv(e10, "VideoStreamExoPlayerCache.preload");
            release();
            zzg(str, strZzc, "error", zzd("error", e10));
            return false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbp
    public final void zzm(int i10) {
    }

    @Override // com.google.android.gms.internal.ads.zzcbp
    public final void zzD(int i10, int i11) {
    }
}
