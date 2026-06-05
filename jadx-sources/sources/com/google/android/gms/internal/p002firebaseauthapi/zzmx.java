package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzuw;
import java.security.GeneralSecurityException;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
final class zzmx<P> extends zzmy<P> implements zzcj<P> {
    public zzmx(String str, Class<P> cls, zzaky<? extends zzakp> zzakyVar) {
        super(str, cls, zzuw.zzb.ASYMMETRIC_PRIVATE, zzakyVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzcj
    public final zzuw zzc(zzaho zzahoVar) throws GeneralSecurityException {
        Object objZza = zzns.zza().zza((zzns) zzou.zza(this.zza, zzahoVar, this.zzb, zzvs.RAW, null), zzbr.zza());
        if (!(objZza instanceof zzck)) {
            throw new GeneralSecurityException("Key not private key");
        }
        zzou zzouVar = (zzou) zzns.zza().zza(((zzck) objZza).zzb(), zzou.class, zzbr.zza());
        return (zzuw) ((zzaje) zzuw.zza().zza(zzouVar.zzf()).zza(zzouVar.zzd()).zza(zzouVar.zza()).zzf());
    }
}
