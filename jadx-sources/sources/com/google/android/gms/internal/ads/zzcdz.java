package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicLong;
import mc.n;
import nc.t;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzcdz extends zzgc {
    private final Context zza;
    private final zzgj zzb;
    private final String zzc;
    private final int zzd;
    private final boolean zze;
    private InputStream zzf;
    private boolean zzg;
    private Uri zzh;
    private volatile zzbbm zzi;
    private boolean zzj;
    private boolean zzk;
    private boolean zzl;
    private boolean zzm;
    private long zzn;
    private mf.a zzo;
    private final AtomicLong zzp;
    private final zzcej zzq;

    public zzcdz(Context context, zzgj zzgjVar, String str, int i10, zzhj zzhjVar, zzcej zzcejVar) {
        super(false);
        this.zza = context;
        this.zzb = zzgjVar;
        this.zzq = zzcejVar;
        this.zzc = str;
        this.zzd = i10;
        this.zzj = false;
        this.zzk = false;
        this.zzl = false;
        this.zzm = false;
        this.zzn = 0L;
        this.zzp = new AtomicLong(-1L);
        this.zzo = null;
        this.zze = ((Boolean) t.f12227d.f12230c.zzb(zzbdc.zzca)).booleanValue();
        zzf(zzhjVar);
    }

    public static Long zzm(zzcdz zzcdzVar) {
        return Long.valueOf(n.D.j.zza(zzcdzVar.zzi));
    }

    private final boolean zzr() {
        if (!this.zze) {
            return false;
        }
        zzbct zzbctVar = zzbdc.zzeB;
        t tVar = t.f12227d;
        if (!((Boolean) tVar.f12230c.zzb(zzbctVar)).booleanValue() || this.zzl) {
            return ((Boolean) tVar.f12230c.zzb(zzbdc.zzeC)).booleanValue() && !this.zzm;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzl
    public final int zza(byte[] bArr, int i10, int i11) throws IOException {
        if (!this.zzg) {
            throw new IOException("Attempt to read closed GcacheDataSource.");
        }
        InputStream inputStream = this.zzf;
        int iZza = inputStream != null ? inputStream.read(bArr, i10, i11) : this.zzb.zza(bArr, i10, i11);
        if (this.zze && this.zzf == null) {
            return iZza;
        }
        zzg(iZza);
        return iZza;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01e2  */
    /* JADX WARN: Type inference failed for: r5v18, types: [mc.n] */
    /* JADX WARN: Type inference failed for: r5v21 */
    /* JADX WARN: Type inference failed for: r5v27 */
    /* JADX WARN: Type inference failed for: r5v39 */
    /* JADX WARN: Type inference failed for: r5v40 */
    @Override // com.google.android.gms.internal.ads.zzgj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long zzb(com.google.android.gms.internal.ads.zzgo r18) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 516
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcdz.zzb(com.google.android.gms.internal.ads.zzgo):long");
    }

    @Override // com.google.android.gms.internal.ads.zzgj
    public final Uri zzc() {
        return this.zzh;
    }

    @Override // com.google.android.gms.internal.ads.zzgj
    public final void zzd() throws IOException {
        if (!this.zzg) {
            throw new IOException("Attempt to close an already closed GcacheDataSource.");
        }
        this.zzg = false;
        this.zzh = null;
        boolean z2 = (this.zze && this.zzf == null) ? false : true;
        InputStream inputStream = this.zzf;
        if (inputStream != null) {
            ud.c.d(inputStream);
            this.zzf = null;
        } else {
            this.zzb.zzd();
        }
        if (z2) {
            zzh();
        }
    }

    public final long zzk() {
        return this.zzn;
    }

    public final long zzl() {
        if (this.zzi != null) {
            AtomicLong atomicLong = this.zzp;
            if (atomicLong.get() != -1) {
                return atomicLong.get();
            }
            synchronized (this) {
                try {
                    if (this.zzo == null) {
                        this.zzo = zzcad.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzcdy
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                return zzcdz.zzm(this.zza);
                            }
                        });
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (this.zzo.isDone()) {
                try {
                    this.zzp.compareAndSet(-1L, ((Long) this.zzo.get()).longValue());
                    return this.zzp.get();
                } catch (InterruptedException | ExecutionException unused) {
                }
            }
        }
        return -1L;
    }

    public final boolean zzn() {
        return this.zzj;
    }

    public final boolean zzo() {
        return this.zzm;
    }

    public final boolean zzp() {
        return this.zzl;
    }

    public final boolean zzq() {
        return this.zzk;
    }
}
