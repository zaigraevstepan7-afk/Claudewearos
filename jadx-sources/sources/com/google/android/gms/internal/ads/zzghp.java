package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzghp {
    public static final /* synthetic */ int zza = 0;
    private static final zzgoe zzb = zzgoe.zzb(new zzgoc() { // from class: com.google.android.gms.internal.ads.zzghn
        @Override // com.google.android.gms.internal.ads.zzgoc
        public final Object zza(zzgen zzgenVar) {
            zzghm zzghmVar = (zzghm) zzgenVar;
            int i10 = zzghp.zza;
            return zzgkn.zze() ? zzgkn.zzb(zzghmVar) : zzgvt.zzb(zzghmVar);
        }
    }, zzghm.class, zzgeh.class);
    private static final zzgnb zzc = new zzgnb() { // from class: com.google.android.gms.internal.ads.zzgho
        @Override // com.google.android.gms.internal.ads.zzgnb
        public final zzgen zza(zzgfa zzgfaVar, Integer num) {
            int i10 = zzghp.zza;
            return zzghm.zzc(((zzghr) zzgfaVar).zzb(), zzgwt.zzc(32), num);
        }
    };
    private static final zzgeo zzd = zzgmn.zzd("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key", zzgeh.class, zzgtn.SYMMETRIC, zzgsy.zzg());

    public static void zza(boolean z2) throws GeneralSecurityException {
        if (!zzglu.zza(1)) {
            throw new GeneralSecurityException("Registering ChaCha20Poly1305 is not supported in FIPS mode");
        }
        int i10 = zzgks.zza;
        zzgks.zze(zzgnm.zzc());
        zzgnj.zza().zzc(zzb);
        zzgnc.zzb().zzc(zzc, zzghr.class);
        zzgni zzgniVarZzb = zzgni.zzb();
        HashMap map = new HashMap();
        map.put("CHACHA20_POLY1305", zzghr.zzc(zzghq.zza));
        map.put("CHACHA20_POLY1305_RAW", zzghr.zzc(zzghq.zzc));
        zzgniVarZzb.zzd(Collections.unmodifiableMap(map));
        zzgmd.zzc().zzd(zzd, true);
    }
}
