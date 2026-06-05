package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzghy {
    public static final /* synthetic */ int zza = 0;
    private static final zzgeo zzb = zzgmn.zzd("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey", zzgeh.class, zzgtn.SYMMETRIC, zzgup.zzg());
    private static final zzgnb zzc = new zzgnb() { // from class: com.google.android.gms.internal.ads.zzghw
        @Override // com.google.android.gms.internal.ads.zzgnb
        public final zzgen zza(zzgfa zzgfaVar, Integer num) {
            int i10 = zzghy.zza;
            return zzgih.zzc((zzgim) zzgfaVar, num);
        }
    };
    private static final zzgoe zzd = zzgoe.zzb(new zzgoc() { // from class: com.google.android.gms.internal.ads.zzghx
        @Override // com.google.android.gms.internal.ads.zzgoc
        public final Object zza(zzgen zzgenVar) throws GeneralSecurityException {
            zzgih zzgihVar = (zzgih) zzgenVar;
            int i10 = zzghy.zza;
            String strZzd = zzgihVar.zzd().zzd();
            zzgfo zzgfoVarZzb = zzgihVar.zzd().zzb();
            zzgeh zzgehVarZzb = zzgey.zza(strZzd).zzb();
            int i11 = zzghv.zza;
            try {
                return zzgla.zzc(new zzghv(zzgtt.zzf(zzgfc.zzb(zzgfoVarZzb), zzgyf.zza()), zzgehVarZzb), zzgihVar.zzb());
            } catch (zzgzk e10) {
                throw new GeneralSecurityException(e10);
            }
        }
    }, zzgih.class, zzgeh.class);

    public static void zza(boolean z2) throws GeneralSecurityException {
        if (!zzglu.zza(1)) {
            throw new GeneralSecurityException("Registering KMS Envelope AEAD is not supported in FIPS mode");
        }
        int i10 = zzgir.zza;
        zzgir.zze(zzgnm.zzc());
        zzgnc.zzb().zzc(zzc, zzgim.class);
        zzgnj.zza().zzc(zzd);
        zzgmd.zzc().zzd(zzb, true);
    }
}
