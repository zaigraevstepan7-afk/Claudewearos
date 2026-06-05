package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzgeq {
    public static final zzgfa zza(zzgfa zzgfaVar) {
        return zzgfaVar != null ? zzgfaVar : zzgfc.zza(zzb(null).zzaV());
    }

    public static final zzgtt zzb(zzgfa zzgfaVar) {
        try {
            return ((zzgom) zzgnm.zzc().zze(null, zzgom.class)).zzc();
        } catch (GeneralSecurityException e10) {
            throw new zzgow("Parsing parameters failed in getProto(). You probably want to call some Tink register function for ".concat("null"), e10);
        }
    }
}
