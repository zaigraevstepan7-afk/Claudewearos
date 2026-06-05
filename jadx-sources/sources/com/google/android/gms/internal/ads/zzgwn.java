package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import javax.crypto.Mac;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzgwn extends ThreadLocal {
    final /* synthetic */ zzgwo zza;

    public zzgwn(zzgwo zzgwoVar) {
        this.zza = zzgwoVar;
    }

    @Override // java.lang.ThreadLocal
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final Mac initialValue() throws InvalidKeyException {
        try {
            zzgwa zzgwaVar = zzgwa.zzb;
            zzgwo zzgwoVar = this.zza;
            Mac mac = (Mac) zzgwaVar.zza(zzgwoVar.zzb);
            mac.init(zzgwoVar.zzc);
            return mac;
        } catch (GeneralSecurityException e10) {
            throw new IllegalStateException(e10);
        }
    }
}
