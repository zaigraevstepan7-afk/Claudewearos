package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzig;
import com.google.android.gms.internal.p002firebaseauthapi.zzuw;
import java.security.GeneralSecurityException;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class zzes {
    private static final zzoe<zzfa, zzbh> zza = zzoe.zza(new zzog() { // from class: com.google.android.gms.internal.firebase-auth-api.zzeu
        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzog
        public final Object zza(zzbu zzbuVar) {
            zzfa zzfaVar = (zzfa) zzbuVar;
            return zzhv.zza(zzcg.zza(zzfaVar.zzb().zzc()).zza(zzfaVar.zzb().zzc()), zzfaVar.zzc());
        }
    }, zzfa.class, zzbh.class);
    private static final zzbt<zzbh> zzb = zzmy.zza("type.googleapis.com/google.crypto.tink.KmsAeadKey", zzbh.class, zzuw.zzb.REMOTE, zzvk.zze());
    private static final zznk<zzez> zzc = new zznk() { // from class: com.google.android.gms.internal.firebase-auth-api.zzet
        @Override // com.google.android.gms.internal.p002firebaseauthapi.zznk
        public final zzbu zza(zzci zzciVar, Integer num) {
            return zzfa.zza((zzez) zzciVar, null);
        }
    };

    public static void zza(boolean z2) {
        if (zzig.zza.zza.zza()) {
            zzfb.zza();
            zznp.zza().zza(zza);
            zzni.zza().zza(zzc, zzez.class);
            zzmn.zza().zza((zzbt) zzb, true);
            return;
        }
        throw new GeneralSecurityException("Registering KMS AEAD is not supported in FIPS mode");
    }
}
