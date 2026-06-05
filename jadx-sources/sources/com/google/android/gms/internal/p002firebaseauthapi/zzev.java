package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzig;
import com.google.android.gms.internal.p002firebaseauthapi.zzuw;
import java.security.GeneralSecurityException;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class zzev {
    private static final zzbt<zzbh> zza = zzmy.zza("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey", zzbh.class, zzuw.zzb.SYMMETRIC, zzvo.zze());
    private static final zznk<zzfi> zzb = new zznk() { // from class: com.google.android.gms.internal.firebase-auth-api.zzey
        @Override // com.google.android.gms.internal.p002firebaseauthapi.zznk
        public final zzbu zza(zzci zzciVar, Integer num) {
            return zzfg.zza((zzfi) zzciVar, null);
        }
    };
    private static final zzoe<zzfg, zzbh> zzc = zzoe.zza(new zzog() { // from class: com.google.android.gms.internal.firebase-auth-api.zzex
        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzog
        public final Object zza(zzbu zzbuVar) {
            return zzev.zza((zzfg) zzbuVar);
        }
    }, zzfg.class, zzbh.class);

    public static /* synthetic */ zzbh zza(zzfg zzfgVar) {
        String strZzd = zzfgVar.zzb().zzd();
        return zzhv.zza(zzew.zza(zzfgVar.zzb().zzb(), zzcg.zza(strZzd).zza(strZzd)), zzfgVar.zzc());
    }

    public static void zza(boolean z2) {
        if (zzig.zza.zza.zza()) {
            zzfm.zza();
            zzni.zza().zza(zzb, zzfi.class);
            zznp.zza().zza(zzc);
            zzmn.zza().zza((zzbt) zza, true);
            return;
        }
        throw new GeneralSecurityException("Registering KMS Envelope AEAD is not supported in FIPS mode");
    }
}
