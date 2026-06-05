package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzgkf {
    public static final /* synthetic */ int zza = 0;
    private static final zzgws zzb;
    private static final zzgnv zzc;
    private static final zzgnr zzd;
    private static final zzgml zze;
    private static final zzgmh zzf;

    static {
        zzgws zzgwsVarZzb = zzgox.zzb("type.googleapis.com/google.crypto.tink.AesGcmKey");
        zzb = zzgwsVarZzb;
        zzc = zzgnv.zzb(new zzgnt() { // from class: com.google.android.gms.internal.ads.zzgkb
            @Override // com.google.android.gms.internal.ads.zzgnt
            public final zzgop zza(zzgfa zzgfaVar) {
                return zzgkf.zzd((zzgha) zzgfaVar);
            }
        }, zzgha.class, zzgom.class);
        zzd = zzgnr.zzb(new zzgnp() { // from class: com.google.android.gms.internal.ads.zzgkc
            @Override // com.google.android.gms.internal.ads.zzgnp
            public final zzgfa zza(zzgop zzgopVar) {
                return zzgkf.zzb((zzgom) zzgopVar);
            }
        }, zzgwsVarZzb, zzgom.class);
        zze = zzgml.zzb(new zzgmj() { // from class: com.google.android.gms.internal.ads.zzgkd
            @Override // com.google.android.gms.internal.ads.zzgmj
            public final zzgop zza(zzgen zzgenVar, zzgfb zzgfbVar) {
                return zzgkf.zzc((zzggs) zzgenVar, zzgfbVar);
            }
        }, zzggs.class, zzgol.class);
        zzf = zzgmh.zzb(new zzgmf() { // from class: com.google.android.gms.internal.ads.zzgke
            @Override // com.google.android.gms.internal.ads.zzgmf
            public final zzgen zza(zzgop zzgopVar, zzgfb zzgfbVar) {
                return zzgkf.zza((zzgol) zzgopVar, zzgfbVar);
            }
        }, zzgwsVarZzb, zzgol.class);
    }

    public static /* synthetic */ zzggs zza(zzgol zzgolVar, zzgfb zzgfbVar) throws GeneralSecurityException {
        if (!zzgolVar.zzg().equals("type.googleapis.com/google.crypto.tink.AesGcmKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesGcmProtoSerialization.parseKey");
        }
        try {
            zzgsm zzgsmVarZzd = zzgsm.zzd(zzgolVar.zze(), zzgyf.zza());
            if (zzgsmVarZzd.zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            zzggx zzggxVarZzc = zzgha.zzc();
            zzggxVarZzc.zzb(zzgsmVarZzd.zzf().zzd());
            zzggxVarZzc.zza(12);
            zzggxVarZzc.zzc(16);
            zzggxVarZzc.zzd(zzf(zzgolVar.zzc()));
            zzgha zzghaVarZze = zzggxVarZzc.zze();
            zzggq zzggqVarZzc = zzggs.zzc();
            zzggqVarZzc.zzc(zzghaVarZze);
            zzggqVarZzc.zzb(zzgwt.zzb(zzgsmVarZzd.zzf().zzA(), zzgfbVar));
            zzggqVarZzc.zza(zzgolVar.zzf());
            return zzggqVarZzc.zzd();
        } catch (zzgzk unused) {
            throw new GeneralSecurityException("Parsing AesGcmKey failed");
        }
    }

    public static /* synthetic */ zzgha zzb(zzgom zzgomVar) throws GeneralSecurityException {
        if (!zzgomVar.zzc().zzi().equals("type.googleapis.com/google.crypto.tink.AesGcmKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesGcmProtoSerialization.parseParameters: ".concat(String.valueOf(zzgomVar.zzc().zzi())));
        }
        try {
            zzgsp zzgspVarZzf = zzgsp.zzf(zzgomVar.zzc().zzh(), zzgyf.zza());
            if (zzgspVarZzf.zzb() != 0) {
                throw new GeneralSecurityException("Only version 0 parameters are accepted");
            }
            zzggx zzggxVarZzc = zzgha.zzc();
            zzggxVarZzc.zzb(zzgspVarZzf.zza());
            zzggxVarZzc.zza(12);
            zzggxVarZzc.zzc(16);
            zzggxVarZzc.zzd(zzf(zzgomVar.zzc().zzg()));
            return zzggxVarZzc.zze();
        } catch (zzgzk e10) {
            throw new GeneralSecurityException("Parsing AesGcmParameters failed: ", e10);
        }
    }

    public static /* synthetic */ zzgol zzc(zzggs zzggsVar, zzgfb zzgfbVar) {
        zzgsk zzgskVarZzb = zzgsm.zzb();
        byte[] bArrZzd = zzggsVar.zze().zzd(zzgfbVar);
        zzgskVarZzb.zza(zzgxn.zzv(bArrZzd, 0, bArrZzd.length));
        return zzgol.zza("type.googleapis.com/google.crypto.tink.AesGcmKey", ((zzgsm) zzgskVarZzb.zzbr()).zzaN(), zzgtn.SYMMETRIC, zzg(zzggsVar.zzd().zzd()), zzggsVar.zzf());
    }

    public static /* synthetic */ zzgom zzd(zzgha zzghaVar) {
        zzgtr zzgtrVarZza = zzgtt.zza();
        zzgtrVarZza.zzb("type.googleapis.com/google.crypto.tink.AesGcmKey");
        zzgsn zzgsnVarZzc = zzgsp.zzc();
        zzgsnVarZzc.zza(zzghaVar.zzb());
        zzgtrVarZza.zzc(((zzgsp) zzgsnVarZzc.zzbr()).zzaN());
        zzgtrVarZza.zza(zzg(zzghaVar.zzd()));
        return zzgom.zzb((zzgtt) zzgtrVarZza.zzbr());
    }

    public static void zze(zzgnm zzgnmVar) {
        zzgnmVar.zzi(zzc);
        zzgnmVar.zzh(zzd);
        zzgnmVar.zzg(zze);
        zzgnmVar.zzf(zzf);
    }

    private static zzggy zzf(zzgut zzgutVar) throws GeneralSecurityException {
        int iOrdinal = zzgutVar.ordinal();
        if (iOrdinal == 1) {
            return zzggy.zza;
        }
        if (iOrdinal != 2) {
            if (iOrdinal == 3) {
                return zzggy.zzc;
            }
            if (iOrdinal != 4) {
                throw new GeneralSecurityException(m6.a.d(zzgutVar.zza(), "Unable to parse OutputPrefixType: "));
            }
        }
        return zzggy.zzb;
    }

    private static zzgut zzg(zzggy zzggyVar) throws GeneralSecurityException {
        if (zzggy.zza.equals(zzggyVar)) {
            return zzgut.TINK;
        }
        if (zzggy.zzb.equals(zzggyVar)) {
            return zzgut.CRUNCHY;
        }
        if (zzggy.zzc.equals(zzggyVar)) {
            return zzgut.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(zzggyVar)));
    }
}
