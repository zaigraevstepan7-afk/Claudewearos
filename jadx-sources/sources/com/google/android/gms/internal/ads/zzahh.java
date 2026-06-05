package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Objects;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzahh extends zzahd {
    public final String zza;
    public final byte[] zzb;

    public zzahh(String str, byte[] bArr) {
        super("PRIV");
        this.zza = str;
        this.zzb = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzahh.class == obj.getClass()) {
            zzahh zzahhVar = (zzahh) obj;
            if (Objects.equals(this.zza, zzahhVar.zza) && Arrays.equals(this.zzb, zzahhVar.zzb)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.zza.hashCode() + 527;
        return Arrays.hashCode(this.zzb) + (iHashCode * 31);
    }

    @Override // com.google.android.gms.internal.ads.zzahd
    public final String toString() {
        return this.zzf + ": owner=" + this.zza;
    }
}
