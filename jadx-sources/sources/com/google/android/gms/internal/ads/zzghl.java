package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzghl extends zzgfo {
    private final int zza;
    private final zzghj zzb;

    public /* synthetic */ zzghl(int i10, zzghj zzghjVar, zzghk zzghkVar) {
        this.zza = i10;
        this.zzb = zzghjVar;
    }

    public static zzghi zzc() {
        return new zzghi(null);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzghl)) {
            return false;
        }
        zzghl zzghlVar = (zzghl) obj;
        return zzghlVar.zza == this.zza && zzghlVar.zzb == this.zzb;
    }

    public final int hashCode() {
        return Objects.hash(zzghl.class, Integer.valueOf(this.zza), this.zzb);
    }

    public final String toString() {
        return m6.a.h(m6.a.k("AesGcmSiv Parameters (variant: ", String.valueOf(this.zzb), ", "), this.zza, "-byte key)");
    }

    @Override // com.google.android.gms.internal.ads.zzgfa
    public final boolean zza() {
        return this.zzb != zzghj.zzc;
    }

    public final int zzb() {
        return this.zza;
    }

    public final zzghj zzd() {
        return this.zzb;
    }
}
