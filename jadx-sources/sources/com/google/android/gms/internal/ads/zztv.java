package com.google.android.gms.internal.ads;

import android.text.TextUtils;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zztv {
    public final String zza;
    public final boolean zzb;
    public final boolean zzc;

    public zztv(String str, boolean z2, boolean z10) {
        this.zza = str;
        this.zzb = z2;
        this.zzc = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && obj.getClass() == zztv.class) {
            zztv zztvVar = (zztv) obj;
            if (TextUtils.equals(this.zza, zztvVar.zza) && this.zzb == zztvVar.zzb && this.zzc == zztvVar.zzc) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.zza.hashCode() + 31) * 31) + (true != this.zzb ? 1237 : 1231)) * 31) + (true != this.zzc ? 1237 : 1231);
    }
}
