package com.google.android.gms.internal.ads;

import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzebg extends zzebk {
    private final String zza;
    private final String zzb;
    private final Drawable zzc;

    public zzebg(String str, String str2, Drawable drawable) {
        this.zza = str;
        if (str2 == null) {
            throw new NullPointerException("Null imageUrl");
        }
        this.zzb = str2;
        this.zzc = drawable;
    }

    public final boolean equals(Object obj) {
        Drawable drawable;
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzebk) {
            zzebk zzebkVar = (zzebk) obj;
            String str = this.zza;
            if (str != null ? str.equals(zzebkVar.zzb()) : zzebkVar.zzb() == null) {
                if (this.zzb.equals(zzebkVar.zzc()) && ((drawable = this.zzc) != null ? drawable.equals(zzebkVar.zza()) : zzebkVar.zza() == null)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.zza;
        int iHashCode = (((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ this.zzb.hashCode();
        Drawable drawable = this.zzc;
        return (iHashCode * 1000003) ^ (drawable != null ? drawable.hashCode() : 0);
    }

    public final String toString() {
        return "OfflineAdAssets{advertiserName=" + this.zza + ", imageUrl=" + this.zzb + ", icon=" + String.valueOf(this.zzc) + "}";
    }

    @Override // com.google.android.gms.internal.ads.zzebk
    public final Drawable zza() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzebk
    public final String zzb() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzebk
    public final String zzc() {
        return this.zzb;
    }
}
