package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Objects;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class zzrt {
    private final zzbw zza;
    private final int zzb;
    private final String zzc;
    private final String zzd;

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzrt)) {
            return false;
        }
        zzrt zzrtVar = (zzrt) obj;
        return this.zza == zzrtVar.zza && this.zzb == zzrtVar.zzb && this.zzc.equals(zzrtVar.zzc) && this.zzd.equals(zzrtVar.zzd);
    }

    public final int hashCode() {
        return Objects.hash(this.zza, Integer.valueOf(this.zzb), this.zzc, this.zzd);
    }

    public final String toString() {
        return "(status=" + this.zza + ", keyId=" + this.zzb + ", keyType='" + this.zzc + "', keyPrefix='" + this.zzd + "')";
    }

    public final int zza() {
        return this.zzb;
    }

    private zzrt(zzbw zzbwVar, int i10, String str, String str2) {
        this.zza = zzbwVar;
        this.zzb = i10;
        this.zzc = str;
        this.zzd = str2;
    }
}
