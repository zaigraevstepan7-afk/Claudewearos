package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzfss extends zzftu {
    private final String zza;
    private final String zzb;

    public /* synthetic */ zzfss(String str, String str2, zzfsr zzfsrVar) {
        this.zza = str;
        this.zzb = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzftu) {
            zzftu zzftuVar = (zzftu) obj;
            String str = this.zza;
            if (str != null ? str.equals(zzftuVar.zzb()) : zzftuVar.zzb() == null) {
                String str2 = this.zzb;
                if (str2 != null ? str2.equals(zzftuVar.zza()) : zzftuVar.zza() == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.zza;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.zzb;
        return ((iHashCode ^ 1000003) * 1000003) ^ (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("OverlayDisplayUpdateRequest{sessionToken=");
        sb2.append(this.zza);
        sb2.append(", appId=");
        return m6.a.j(sb2, this.zzb, "}");
    }

    @Override // com.google.android.gms.internal.ads.zzftu
    public final String zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzftu
    public final String zzb() {
        return this.zza;
    }
}
