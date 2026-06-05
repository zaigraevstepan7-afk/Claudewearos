package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Objects;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzgjh extends zzgfo {
    private final zzgjg zza;
    private final int zzb;

    private zzgjh(zzgjg zzgjgVar, int i10) {
        this.zza = zzgjgVar;
        this.zzb = i10;
    }

    public static zzgjh zzd(zzgjg zzgjgVar, int i10) throws GeneralSecurityException {
        if (i10 < 8 || i10 > 12) {
            throw new GeneralSecurityException("Salt size must be between 8 and 12 bytes");
        }
        return new zzgjh(zzgjgVar, i10);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzgjh)) {
            return false;
        }
        zzgjh zzgjhVar = (zzgjh) obj;
        return zzgjhVar.zza == this.zza && zzgjhVar.zzb == this.zzb;
    }

    public final int hashCode() {
        return Objects.hash(zzgjh.class, this.zza, Integer.valueOf(this.zzb));
    }

    public final String toString() {
        return m6.a.h(m6.a.k("X-AES-GCM Parameters (variant: ", this.zza.toString(), "salt_size_bytes: "), this.zzb, ")");
    }

    @Override // com.google.android.gms.internal.ads.zzgfa
    public final boolean zza() {
        return this.zza != zzgjg.zzb;
    }

    public final int zzb() {
        return this.zzb;
    }

    public final zzgjg zzc() {
        return this.zza;
    }
}
