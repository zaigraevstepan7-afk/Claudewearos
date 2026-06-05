package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzbaj {
    final long zza;
    final String zzb;
    final int zzc;

    public zzbaj(long j, String str, int i10) {
        this.zza = j;
        this.zzb = str;
        this.zzc = i10;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof zzbaj)) {
            zzbaj zzbajVar = (zzbaj) obj;
            if (zzbajVar.zza == this.zza && zzbajVar.zzc == this.zzc) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (int) this.zza;
    }
}
