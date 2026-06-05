package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Map;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzcea implements zzgj {
    private final zzgj zza;
    private final long zzb;
    private final zzgj zzc;
    private long zzd;
    private Uri zze;

    public zzcea(zzgj zzgjVar, int i10, zzgj zzgjVar2) {
        this.zza = zzgjVar;
        this.zzb = i10;
        this.zzc = zzgjVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzl
    public final int zza(byte[] bArr, int i10, int i11) {
        int i12;
        long j = this.zzd;
        long j4 = this.zzb;
        if (j < j4) {
            int iZza = this.zza.zza(bArr, i10, (int) Math.min(i11, j4 - j));
            long j10 = this.zzd + iZza;
            this.zzd = j10;
            i12 = iZza;
            j = j10;
        } else {
            i12 = 0;
        }
        if (j < j4) {
            return i12;
        }
        int iZza2 = this.zzc.zza(bArr, i10 + i12, i11 - i12);
        int i13 = i12 + iZza2;
        this.zzd += iZza2;
        return i13;
    }

    @Override // com.google.android.gms.internal.ads.zzgj
    public final long zzb(zzgo zzgoVar) {
        Uri uri;
        zzgo zzgoVar2;
        Uri uri2 = zzgoVar.zza;
        this.zze = uri2;
        long j = zzgoVar.zze;
        long j4 = this.zzb;
        zzgo zzgoVar3 = null;
        if (j >= j4) {
            uri = uri2;
            zzgoVar2 = null;
        } else {
            long j10 = zzgoVar.zzf;
            long jMin = j4 - j;
            if (j10 != -1) {
                jMin = Math.min(j10, jMin);
            }
            uri = uri2;
            zzgoVar2 = new zzgo(uri, j, jMin, null);
        }
        long j11 = zzgoVar.zzf;
        if (j11 == -1 || j + j11 > j4) {
            zzgoVar3 = new zzgo(uri, Math.max(j4, j), j11 != -1 ? Math.min(j11, (j + j11) - j4) : -1L, null);
        }
        long jZzb = zzgoVar2 != null ? this.zza.zzb(zzgoVar2) : 0L;
        long jZzb2 = zzgoVar3 != null ? this.zzc.zzb(zzgoVar3) : 0L;
        this.zzd = j;
        if (jZzb == -1 || jZzb2 == -1) {
            return -1L;
        }
        return jZzb + jZzb2;
    }

    @Override // com.google.android.gms.internal.ads.zzgj
    public final Uri zzc() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzgj
    public final void zzd() {
        this.zza.zzd();
        this.zzc.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzgj
    public final Map zze() {
        return zzfyi.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzgj
    public final void zzf(zzhj zzhjVar) {
    }
}
