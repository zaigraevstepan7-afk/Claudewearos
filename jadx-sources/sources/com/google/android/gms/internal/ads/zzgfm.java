package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzgfm {
    public static final /* synthetic */ int zza = 0;
    private static final zzgmc zzb = zzb();

    public static zzgel zza() throws GeneralSecurityException {
        if (zzglv.zzb()) {
            throw new GeneralSecurityException("Cannot use non-FIPS-compliant AeadConfigurationV1 in FIPS mode");
        }
        return zzb;
    }

    private static zzgmc zzb() {
        try {
            zzgog zzgogVarZza = zzgoj.zza();
            zzgft.zzd(zzgogVarZza);
            zzgogVarZza.zza(zzgoe.zzb(new zzgoc() { // from class: com.google.android.gms.internal.ads.zzgff
                @Override // com.google.android.gms.internal.ads.zzgoc
                public final Object zza(zzgen zzgenVar) {
                    return zzgvu.zzb((zzgfw) zzgenVar);
                }
            }, zzgfw.class, zzgeh.class));
            zzgogVarZza.zza(zzgoe.zzb(new zzgoc() { // from class: com.google.android.gms.internal.ads.zzgfg
                @Override // com.google.android.gms.internal.ads.zzgoc
                public final Object zza(zzgen zzgenVar) {
                    return zzgvr.zzb((zzggs) zzgenVar);
                }
            }, zzggs.class, zzgeh.class));
            zzgogVarZza.zza(zzgoe.zzb(new zzgoc() { // from class: com.google.android.gms.internal.ads.zzgfh
                @Override // com.google.android.gms.internal.ads.zzgoc
                public final Object zza(zzgen zzgenVar) {
                    return zzglq.zzb((zzghd) zzgenVar);
                }
            }, zzghd.class, zzgeh.class));
            zzgogVarZza.zza(zzgoe.zzb(new zzgoc() { // from class: com.google.android.gms.internal.ads.zzgfi
                @Override // com.google.android.gms.internal.ads.zzgoc
                public final Object zza(zzgen zzgenVar) {
                    return zzgvq.zzb((zzggi) zzgenVar);
                }
            }, zzggi.class, zzgeh.class));
            zzgogVarZza.zza(zzgoe.zzb(new zzgoc() { // from class: com.google.android.gms.internal.ads.zzgfj
                @Override // com.google.android.gms.internal.ads.zzgoc
                public final Object zza(zzgen zzgenVar) {
                    zzghm zzghmVar = (zzghm) zzgenVar;
                    int i10 = zzgfm.zza;
                    return zzgkn.zze() ? zzgkn.zzb(zzghmVar) : zzgvt.zzb(zzghmVar);
                }
            }, zzghm.class, zzgeh.class));
            zzgogVarZza.zza(zzgoe.zzb(new zzgoc() { // from class: com.google.android.gms.internal.ads.zzgfk
                @Override // com.google.android.gms.internal.ads.zzgoc
                public final Object zza(zzgen zzgenVar) {
                    zzgji zzgjiVar = (zzgji) zzgenVar;
                    int i10 = zzgfm.zza;
                    return zzgli.zzc() ? zzgli.zzb(zzgjiVar) : zzgwr.zzb(zzgjiVar);
                }
            }, zzgji.class, zzgeh.class));
            zzgogVarZza.zza(zzgoe.zzb(new zzgoc() { // from class: com.google.android.gms.internal.ads.zzgfl
                @Override // com.google.android.gms.internal.ads.zzgoc
                public final Object zza(zzgen zzgenVar) {
                    return zzglc.zzb((zzgjc) zzgenVar);
                }
            }, zzgjc.class, zzgeh.class));
            return zzgmc.zzb(zzgogVarZza.zzc());
        } catch (GeneralSecurityException e10) {
            throw new IllegalStateException(e10);
        }
    }
}
