package com.google.android.gms.internal.ads;

import java.io.File;
import java.security.GeneralSecurityException;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzavi implements zzfps {
    final /* synthetic */ zzfnu zza;

    public zzavi(zzavk zzavkVar, zzfnu zzfnuVar) {
        this.zza = zzfnuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfps
    public final boolean zza(File file) {
        try {
            return this.zza.zza(file);
        } catch (GeneralSecurityException unused) {
            return false;
        }
    }
}
