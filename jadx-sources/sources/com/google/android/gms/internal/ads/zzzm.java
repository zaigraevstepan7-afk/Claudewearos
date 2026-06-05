package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzzm {
    private int zza;
    private int zzb;
    private int zzc = 0;
    private zzzf[] zzd = new zzzf[100];

    public zzzm(boolean z2, int i10) {
    }

    public final synchronized int zza() {
        return this.zzb * 65536;
    }

    public final synchronized zzzf zzb() {
        zzzf zzzfVar;
        try {
            this.zzb++;
            int i10 = this.zzc;
            if (i10 > 0) {
                zzzf[] zzzfVarArr = this.zzd;
                int i11 = i10 - 1;
                this.zzc = i11;
                zzzfVar = zzzfVarArr[i11];
                if (zzzfVar == null) {
                    throw null;
                }
                zzzfVarArr[i11] = null;
            } else {
                zzzfVar = new zzzf(new byte[65536], 0);
                int i12 = this.zzb;
                zzzf[] zzzfVarArr2 = this.zzd;
                int length = zzzfVarArr2.length;
                if (i12 > length) {
                    this.zzd = (zzzf[]) Arrays.copyOf(zzzfVarArr2, length + length);
                    return zzzfVar;
                }
            }
            return zzzfVar;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void zzc(zzzf zzzfVar) {
        zzzf[] zzzfVarArr = this.zzd;
        int i10 = this.zzc;
        this.zzc = i10 + 1;
        zzzfVarArr[i10] = zzzfVar;
        this.zzb--;
        notifyAll();
    }

    public final synchronized void zzd(zzzg zzzgVar) {
        while (zzzgVar != null) {
            try {
                zzzf[] zzzfVarArr = this.zzd;
                int i10 = this.zzc;
                this.zzc = i10 + 1;
                zzzfVarArr[i10] = zzzgVar.zzc();
                this.zzb--;
                zzzgVar = zzzgVar.zzd();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        notifyAll();
    }

    public final synchronized void zze() {
        zzf(0);
    }

    public final synchronized void zzf(int i10) {
        int i11 = this.zza;
        this.zza = i10;
        if (i10 < i11) {
            zzg();
        }
    }

    public final synchronized void zzg() {
        int i10 = this.zza;
        String str = zzex.zza;
        int iMax = Math.max(0, ((i10 + 65535) / 65536) - this.zzb);
        int i11 = this.zzc;
        if (iMax >= i11) {
            return;
        }
        Arrays.fill(this.zzd, iMax, i11, (Object) null);
        this.zzc = iMax;
    }
}
