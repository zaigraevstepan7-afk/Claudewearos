package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.HashMap;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzgjf {
    private static final zzgnb zza = new zzgnb() { // from class: com.google.android.gms.internal.ads.zzgjd
        @Override // com.google.android.gms.internal.ads.zzgnb
        public final zzgen zza(zzgfa zzgfaVar, Integer num) {
            return zzgjc.zzc((zzgjh) zzgfaVar, zzgwt.zzc(32), num);
        }
    };
    private static final zzgoe zzb = zzgoe.zzb(new zzgoc() { // from class: com.google.android.gms.internal.ads.zzgje
        @Override // com.google.android.gms.internal.ads.zzgoc
        public final Object zza(zzgen zzgenVar) {
            return zzglc.zzb((zzgjc) zzgenVar);
        }
    }, zzgjc.class, zzgeh.class);

    public static void zza(boolean z2) {
        int i10 = zzglh.zza;
        zzglh.zze(zzgnm.zzc());
        zzgni zzgniVarZzb = zzgni.zzb();
        HashMap map = new HashMap();
        map.put("XAES_256_GCM_192_BIT_NONCE", zzgjb.zzg);
        map.put("XAES_256_GCM_192_BIT_NONCE_NO_PREFIX", zzgjb.zzh);
        map.put("XAES_256_GCM_160_BIT_NONCE_NO_PREFIX", zzgjb.zzi);
        map.put("X_AES_GCM_8_BYTE_SALT_NO_PREFIX", zzgjb.zzj);
        zzgniVarZzb.zzd(Collections.unmodifiableMap(map));
        zzgnj.zza().zzc(zzb);
        zzgnc.zzb().zzc(zza, zzgjh.class);
    }
}
