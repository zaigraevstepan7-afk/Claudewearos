package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicInteger;
import mc.n;
import nc.t;
import qc.l0;
import rc.k;
import t.m1;
import y8.f;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzcdr extends zzcdl implements zzhj {
    private static final AtomicInteger zzd = new AtomicInteger(0);
    private String zze;
    private final zzcby zzf;
    private boolean zzg;
    private final zzcdq zzh;
    private final zzccv zzi;
    private ByteBuffer zzj;
    private boolean zzk;
    private final Object zzl;
    private final String zzm;
    private final int zzn;
    private boolean zzo;

    public zzcdr(zzcbz zzcbzVar, zzcby zzcbyVar) {
        super(zzcbzVar);
        this.zzf = zzcbyVar;
        this.zzh = new zzcdq();
        this.zzi = new zzccv();
        this.zzl = new Object();
        this.zzm = (String) zzfvc.zzd(zzcbzVar != null ? zzcbzVar.zzr() : null).zzb("");
        this.zzn = zzcbzVar != null ? zzcbzVar.zzf() : 0;
        zzd.incrementAndGet();
    }

    public static int zzi() {
        return zzd.get();
    }

    public static final String zzv(String str) {
        return "cache:".concat(String.valueOf(rc.e.d(str, "MD5")));
    }

    private final void zzx() {
        int iZza = (int) this.zzh.zza();
        int iZza2 = (int) this.zzi.zza(this.zzj);
        int iPosition = this.zzj.position();
        int iRound = Math.round((iPosition / iZza) * iZza2);
        int iZzs = zzcbq.zzs();
        int iZzu = zzcbq.zzu();
        String str = this.zze;
        zzn(str, zzv(str), iPosition, iZza, iRound, iZza2, iRound > 0, iZzs, iZzu);
    }

    @Override // com.google.android.gms.internal.ads.zzcdl
    public final void release() {
        zzd.decrementAndGet();
    }

    @Override // com.google.android.gms.internal.ads.zzhj
    public final void zzd(zzgj zzgjVar, zzgo zzgoVar, boolean z2) {
        if (zzgjVar instanceof zzgw) {
            this.zzh.zzb((zzgw) zzgjVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcdl
    public final void zzf() {
        this.zzg = true;
    }

    public final String zzk() {
        return this.zze;
    }

    public final ByteBuffer zzl() {
        synchronized (this.zzl) {
            try {
                ByteBuffer byteBuffer = this.zzj;
                if (byteBuffer != null && !this.zzk) {
                    byteBuffer.flip();
                    this.zzk = true;
                }
                this.zzg = true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return this.zzj;
    }

    public final boolean zzm() {
        return this.zzo;
    }

    @Override // com.google.android.gms.internal.ads.zzcdl
    public final boolean zzt(String str) throws IOException {
        this.zze = str;
        String strZzv = zzv(str);
        try {
            zzgr zzgrVar = new zzgr();
            zzgrVar.zzf(this.zzb);
            zzcby zzcbyVar = this.zzf;
            zzgrVar.zzc(zzcbyVar.zzd);
            zzgrVar.zzd(zzcbyVar.zze);
            boolean z2 = true;
            zzgrVar.zzb(true);
            zzgrVar.zze(this);
            zzgj zzgjVarZza = zzgrVar.zza();
            if (zzcbyVar.zzi) {
                zzgjVarZza = new zzcct(this.zza, zzgjVarZza, this.zzm, this.zzn, null, null);
            }
            zzgjVarZza.zzb(new zzgo(Uri.parse(str), 0L, -1L, null));
            zzcbz zzcbzVar = (zzcbz) this.zzc.get();
            if (zzcbzVar != null) {
                zzcbzVar.zzt(strZzv, this);
            }
            n.D.f11584k.getClass();
            long jCurrentTimeMillis = System.currentTimeMillis();
            zzbct zzbctVar = zzbdc.zzO;
            t tVar = t.f12227d;
            long jLongValue = ((Long) tVar.f12230c.zzb(zzbctVar)).longValue();
            long jLongValue2 = ((Long) tVar.f12230c.zzb(zzbdc.zzN)).longValue();
            this.zzj = ByteBuffer.allocate(zzcbyVar.zzc);
            int i10 = 8192;
            byte[] bArr = new byte[8192];
            long j = jCurrentTimeMillis;
            while (true) {
                int iZza = zzgjVarZza.zza(bArr, 0, Math.min(this.zzj.remaining(), i10));
                if (iZza == -1) {
                    this.zzo = z2;
                    zzj(str, strZzv, (int) this.zzi.zza(this.zzj));
                    return z2;
                }
                boolean z10 = z2;
                synchronized (this.zzl) {
                    try {
                        if (!this.zzg) {
                            this.zzj.put(bArr, 0, iZza);
                        }
                    } finally {
                    }
                }
                if (this.zzj.remaining() <= 0) {
                    zzx();
                    return z10;
                }
                if (this.zzg) {
                    throw new IOException("Precache abort at " + this.zzj.limit() + " bytes");
                }
                long jCurrentTimeMillis2 = System.currentTimeMillis();
                if (jCurrentTimeMillis2 - j >= jLongValue) {
                    zzx();
                    j = jCurrentTimeMillis2;
                }
                if (jCurrentTimeMillis2 - jCurrentTimeMillis > 1000 * jLongValue2) {
                    throw new IOException("Timeout exceeded. Limit: " + jLongValue2 + " sec");
                }
                z2 = z10;
                i10 = 8192;
            }
        } catch (Exception e10) {
            String strW = m1.w(e10.getClass().getCanonicalName(), ":", e10.getMessage());
            String strB = f.b("Failed to preload url ", str, " Exception: ", strW);
            int i11 = l0.f13401b;
            k.g(strB);
            zzg(str, strZzv, "error", strW);
            return false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhj
    public final void zzb(zzgj zzgjVar, zzgo zzgoVar, boolean z2) {
    }

    @Override // com.google.android.gms.internal.ads.zzhj
    public final void zzc(zzgj zzgjVar, zzgo zzgoVar, boolean z2) {
    }

    @Override // com.google.android.gms.internal.ads.zzhj
    public final void zza(zzgj zzgjVar, zzgo zzgoVar, boolean z2, int i10) {
    }
}
