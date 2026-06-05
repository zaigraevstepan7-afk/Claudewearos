package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzgib extends zzgfo {
    private final String zza;
    private final zzgia zzb;

    private zzgib(String str, zzgia zzgiaVar) {
        this.zza = str;
        this.zzb = zzgiaVar;
    }

    public static zzgib zzc(String str, zzgia zzgiaVar) {
        return new zzgib(str, zzgiaVar);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzgib)) {
            return false;
        }
        zzgib zzgibVar = (zzgib) obj;
        return zzgibVar.zza.equals(this.zza) && zzgibVar.zzb.equals(this.zzb);
    }

    public final int hashCode() {
        return Objects.hash(zzgib.class, this.zza, this.zzb);
    }

    public final String toString() {
        return "LegacyKmsAead Parameters (keyUri: " + this.zza + ", variant: " + this.zzb.toString() + ")";
    }

    @Override // com.google.android.gms.internal.ads.zzgfa
    public final boolean zza() {
        return this.zzb != zzgia.zzb;
    }

    public final zzgia zzb() {
        return this.zzb;
    }

    public final String zzd() {
        return this.zza;
    }
}
