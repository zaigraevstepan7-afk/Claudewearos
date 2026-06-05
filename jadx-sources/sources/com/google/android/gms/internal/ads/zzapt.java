package com.google.android.gms.internal.ads;

import android.text.TextUtils;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzapt {
    private final String zza;
    private final String zzb;

    public zzapt(String str, String str2) {
        this.zza = str;
        this.zzb = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzapt.class == obj.getClass()) {
            zzapt zzaptVar = (zzapt) obj;
            if (TextUtils.equals(this.zza, zzaptVar.zza) && TextUtils.equals(this.zzb, zzaptVar.zzb)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.zzb.hashCode() + (this.zza.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Header[name=");
        sb2.append(this.zza);
        sb2.append(",value=");
        return m6.a.j(sb2, this.zzb, "]");
    }

    public final String zza() {
        return this.zza;
    }

    public final String zzb() {
        return this.zzb;
    }
}
