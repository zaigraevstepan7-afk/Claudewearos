package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzeq;
import com.google.android.gms.internal.p002firebaseauthapi.zzig;
import com.google.android.gms.internal.p002firebaseauthapi.zzuw;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class zzep {
    private static final zzoe<zzem, zzbh> zza = zzoe.zza(new zzog() { // from class: com.google.android.gms.internal.firebase-auth-api.zzeo
        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzog
        public final Object zza(zzbu zzbuVar) {
            return zzep.zza((zzem) zzbuVar);
        }
    }, zzem.class, zzbh.class);
    private static final zznk<zzeq> zzb = new zznk() { // from class: com.google.android.gms.internal.firebase-auth-api.zzer
        @Override // com.google.android.gms.internal.p002firebaseauthapi.zznk
        public final zzbu zza(zzci zzciVar, Integer num) {
            return zzep.zza((zzeq) zzciVar, null);
        }
    };
    private static final zzbt<zzbh> zzc = zzmy.zza("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key", zzbh.class, zzuw.zzb.SYMMETRIC, zzte.zze());

    public static /* synthetic */ zzbh zza(zzem zzemVar) {
        return zzhd.zzb() ? zzhd.zza(zzemVar) : zzwg.zza(zzemVar);
    }

    public static zzem zza(zzeq zzeqVar, Integer num) {
        return zzem.zza(zzeqVar.zzb(), zzxw.zza(32), num);
    }

    public static String zza() {
        return "type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key";
    }

    public static void zza(boolean z2) {
        if (zzig.zza.zza.zza()) {
            zzhf.zza();
            zznp.zza().zza(zza);
            zzni.zza().zza(zzb, zzeq.class);
            zznq zznqVarZza = zznq.zza();
            HashMap map = new HashMap();
            map.put("CHACHA20_POLY1305", zzeq.zza(zzeq.zza.zza));
            map.put("CHACHA20_POLY1305_RAW", zzeq.zza(zzeq.zza.zzc));
            zznqVarZza.zza(Collections.unmodifiableMap(map));
            zzmn.zza().zza((zzbt) zzc, true);
            return;
        }
        throw new GeneralSecurityException("Registering ChaCha20Poly1305 is not supported in FIPS mode");
    }
}
