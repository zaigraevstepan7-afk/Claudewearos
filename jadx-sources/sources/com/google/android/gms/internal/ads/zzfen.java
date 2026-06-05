package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzfen implements zzfel {
    private final String zza;

    public zzfen(String str) {
        this.zza = str;
    }

    @Override // com.google.android.gms.internal.ads.zzfel
    public final boolean equals(Object obj) {
        if (obj instanceof zzfen) {
            return this.zza.equals(((zzfen) obj).zza);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzfel
    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final String toString() {
        return this.zza;
    }
}
