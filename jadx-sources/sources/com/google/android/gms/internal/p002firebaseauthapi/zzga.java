package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzgd;
import com.google.android.gms.internal.p002firebaseauthapi.zzig;
import com.google.android.gms.internal.p002firebaseauthapi.zzuw;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class zzga {
    private static final zzoe<zzfx, zzbh> zza = zzoe.zza(new zzog() { // from class: com.google.android.gms.internal.firebase-auth-api.zzfz
        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzog
        public final Object zza(zzbu zzbuVar) {
            return zzga.zza((zzfx) zzbuVar);
        }
    }, zzfx.class, zzbh.class);
    private static final zzbt<zzbh> zzb = zzmy.zza("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key", zzbh.class, zzuw.zzb.SYMMETRIC, zzvv.zze());
    private static final zznm<zzgd> zzc = new zznm() { // from class: com.google.android.gms.internal.firebase-auth-api.zzgc
    };
    private static final zznk<zzgd> zzd = new zznk() { // from class: com.google.android.gms.internal.firebase-auth-api.zzgb
        @Override // com.google.android.gms.internal.p002firebaseauthapi.zznk
        public final zzbu zza(zzci zzciVar, Integer num) {
            return zzga.zza((zzgd) zzciVar, null);
        }
    };

    public static /* synthetic */ zzbh zza(zzfx zzfxVar) {
        return zzhw.zza() ? zzhw.zza(zzfxVar) : zzxs.zza(zzfxVar);
    }

    public static zzfx zza(zzgd zzgdVar, Integer num) {
        return zzfx.zza(zzgdVar.zzb(), zzxw.zza(32), num);
    }

    public static String zza() {
        return "type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key";
    }

    public static void zza(boolean z2) {
        if (zzig.zza.zza.zza()) {
            zzhz.zza();
            zznp.zza().zza(zza);
            zznq zznqVarZza = zznq.zza();
            HashMap map = new HashMap();
            map.put("XCHACHA20_POLY1305", zzgd.zza(zzgd.zza.zza));
            map.put("XCHACHA20_POLY1305_RAW", zzgd.zza(zzgd.zza.zzc));
            zznqVarZza.zza(Collections.unmodifiableMap(map));
            zzni.zza().zza(zzd, zzgd.class);
            zznj.zza().zza(zzc, zzgd.class);
            zzmn.zza().zza((zzbt) zzb, true);
            return;
        }
        throw new GeneralSecurityException("Registering XChaCha20Poly1305 is not supported in FIPS mode");
    }
}
