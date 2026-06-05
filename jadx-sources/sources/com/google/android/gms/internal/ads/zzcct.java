package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.os.SystemClock;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;
import mc.n;
import nc.t;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzcct implements zzgj {
    private final Context zza;
    private final zzgj zzb;
    private final String zzc;
    private final int zzd;
    private final boolean zze;
    private InputStream zzf;
    private boolean zzg;
    private Uri zzh;
    private volatile zzbbm zzi;
    private boolean zzj = false;
    private boolean zzk = false;
    private zzgo zzl;

    public zzcct(Context context, zzgj zzgjVar, String str, int i10, zzhj zzhjVar, zzccs zzccsVar) {
        this.zza = context;
        this.zzb = zzgjVar;
        this.zzc = str;
        this.zzd = i10;
        new AtomicLong(-1L);
        this.zze = ((Boolean) t.f12227d.f12230c.zzb(zzbdc.zzca)).booleanValue();
    }

    private final boolean zzg() {
        if (!this.zze) {
            return false;
        }
        zzbct zzbctVar = zzbdc.zzeB;
        t tVar = t.f12227d;
        if (!((Boolean) tVar.f12230c.zzb(zzbctVar)).booleanValue() || this.zzj) {
            return ((Boolean) tVar.f12230c.zzb(zzbdc.zzeC)).booleanValue() && !this.zzk;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzl
    public final int zza(byte[] bArr, int i10, int i11) throws IOException {
        if (!this.zzg) {
            throw new IOException("Attempt to read closed CacheDataSource.");
        }
        InputStream inputStream = this.zzf;
        return inputStream != null ? inputStream.read(bArr, i10, i11) : this.zzb.zza(bArr, i10, i11);
    }

    @Override // com.google.android.gms.internal.ads.zzgj
    public final long zzb(zzgo zzgoVar) throws IOException {
        Long l10;
        if (this.zzg) {
            throw new IOException("Attempt to open an already open CacheDataSource.");
        }
        this.zzg = true;
        Uri uri = zzgoVar.zza;
        this.zzh = uri;
        this.zzl = zzgoVar;
        this.zzi = zzbbm.zza(uri);
        zzbct zzbctVar = zzbdc.zzey;
        t tVar = t.f12227d;
        zzbbj zzbbjVarZzb = null;
        if (!((Boolean) tVar.f12230c.zzb(zzbctVar)).booleanValue()) {
            if (this.zzi != null) {
                this.zzi.zzh = zzgoVar.zze;
                this.zzi.zzi = zzfvv.zzc(this.zzc);
                this.zzi.zzj = this.zzd;
                zzbbjVarZzb = n.D.j.zzb(this.zzi);
            }
            if (zzbbjVarZzb != null && zzbbjVarZzb.zze()) {
                this.zzj = zzbbjVarZzb.zzg();
                this.zzk = zzbbjVarZzb.zzf();
                if (!zzg()) {
                    this.zzf = zzbbjVarZzb.zzc();
                    return -1L;
                }
            }
        } else if (this.zzi != null) {
            this.zzi.zzh = zzgoVar.zze;
            this.zzi.zzi = zzfvv.zzc(this.zzc);
            this.zzi.zzj = this.zzd;
            if (this.zzi.zzg) {
                l10 = (Long) tVar.f12230c.zzb(zzbdc.zzeA);
            } else {
                l10 = (Long) tVar.f12230c.zzb(zzbdc.zzez);
            }
            long jLongValue = l10.longValue();
            n.D.f11584k.getClass();
            SystemClock.elapsedRealtime();
            Future futureZza = zzbbx.zza(this.zza, this.zzi);
            try {
                try {
                    try {
                        zzbby zzbbyVar = (zzbby) futureZza.get(jLongValue, TimeUnit.MILLISECONDS);
                        zzbbyVar.zzd();
                        this.zzj = zzbbyVar.zzf();
                        this.zzk = zzbbyVar.zze();
                        zzbbyVar.zza();
                        if (!zzg()) {
                            this.zzf = zzbbyVar.zzc();
                        }
                    } catch (ExecutionException | TimeoutException unused) {
                        futureZza.cancel(false);
                    }
                } catch (InterruptedException unused2) {
                    futureZza.cancel(false);
                    Thread.currentThread().interrupt();
                }
            } catch (Throwable unused3) {
            }
            n.D.f11584k.getClass();
            SystemClock.elapsedRealtime();
            throw null;
        }
        if (this.zzi != null) {
            zzgm zzgmVarZza = zzgoVar.zza();
            zzgmVarZza.zzd(Uri.parse(this.zzi.zza));
            this.zzl = zzgmVarZza.zze();
        }
        return this.zzb.zzb(this.zzl);
    }

    @Override // com.google.android.gms.internal.ads.zzgj
    public final Uri zzc() {
        return this.zzh;
    }

    @Override // com.google.android.gms.internal.ads.zzgj
    public final void zzd() throws IOException {
        if (!this.zzg) {
            throw new IOException("Attempt to close an already closed CacheDataSource.");
        }
        this.zzg = false;
        this.zzh = null;
        InputStream inputStream = this.zzf;
        if (inputStream == null) {
            this.zzb.zzd();
        } else {
            ud.c.d(inputStream);
            this.zzf = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgj
    public final /* synthetic */ Map zze() {
        return Collections.EMPTY_MAP;
    }

    @Override // com.google.android.gms.internal.ads.zzgj
    public final void zzf(zzhj zzhjVar) {
    }
}
