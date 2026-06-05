package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzfb implements zzau {
    public final int zza;

    public zzfb(int i10) {
        this.zza = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zzfb) && this.zza == ((zzfb) obj).zza;
    }

    public final int hashCode() {
        return this.zza;
    }

    public final String toString() {
        return "Mp4AlternateGroup: " + this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzau
    public final /* synthetic */ void zza(zzar zzarVar) {
    }
}
