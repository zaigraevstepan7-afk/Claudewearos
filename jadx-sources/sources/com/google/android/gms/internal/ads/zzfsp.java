package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzfsp extends zzftr {
    private final int zza;
    private final String zzb;

    public /* synthetic */ zzfsp(int i10, String str, zzfso zzfsoVar) {
        this.zza = i10;
        this.zzb = str;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzftr) {
            zzftr zzftrVar = (zzftr) obj;
            if (this.zza == zzftrVar.zza() && ((str = this.zzb) != null ? str.equals(zzftrVar.zzb()) : zzftrVar.zzb() == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.zzb;
        return (str == null ? 0 : str.hashCode()) ^ ((this.zza ^ 1000003) * 1000003);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("OverlayDisplayState{statusCode=");
        sb2.append(this.zza);
        sb2.append(", sessionToken=");
        return m6.a.j(sb2, this.zzb, "}");
    }

    @Override // com.google.android.gms.internal.ads.zzftr
    public final int zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzftr
    public final String zzb() {
        return this.zzb;
    }
}
