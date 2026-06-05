package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzaey {
    public final int zza;
    public final byte[] zzb;
    public final int zzc;
    public final int zzd;

    public zzaey(int i10, byte[] bArr, int i11, int i12) {
        this.zza = i10;
        this.zzb = bArr;
        this.zzc = i11;
        this.zzd = i12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzaey.class == obj.getClass()) {
            zzaey zzaeyVar = (zzaey) obj;
            if (this.zza == zzaeyVar.zza && this.zzc == zzaeyVar.zzc && this.zzd == zzaeyVar.zzd && Arrays.equals(this.zzb, zzaeyVar.zzb)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10 = this.zza;
        return ((((Arrays.hashCode(this.zzb) + (i10 * 31)) * 31) + this.zzc) * 31) + this.zzd;
    }
}
