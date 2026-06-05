package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzdq;
import com.google.android.gms.internal.p002firebaseauthapi.zzuw;
import java.security.GeneralSecurityException;
import m6.a;
import t.m1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class zzgl {
    private static final zzxv zza;
    private static final zzoa<zzdq, zzot> zzb;
    private static final zznw<zzot> zzc;
    private static final zzmu<zzdj, zzou> zzd;
    private static final zzmq<zzou> zze;

    static {
        zzxv zzxvVarZzb = zzph.zzb("type.googleapis.com/google.crypto.tink.AesEaxKey");
        zza = zzxvVarZzb;
        zzb = zzoa.zza(new zzoc() { // from class: com.google.android.gms.internal.firebase-auth-api.zzgk
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zzoc
            public final zzox zza(zzci zzciVar) {
                zzdq zzdqVar = (zzdq) zzciVar;
                return zzot.zzb((zzvc) ((zzaje) zzvc.zza().zza("type.googleapis.com/google.crypto.tink.AesEaxKey").zza(((zzso) ((zzaje) zzso.zzb().zza(zzgl.zzb(zzdqVar)).zza(zzdqVar.zzc()).zzf())).zzj()).zza(zzgl.zza(zzdqVar.zzf())).zzf()));
            }
        }, zzdq.class, zzot.class);
        zzc = zznw.zza(new zzny() { // from class: com.google.android.gms.internal.firebase-auth-api.zzgn
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zzny
            public final zzci zza(zzox zzoxVar) {
                return zzgl.zzb((zzot) zzoxVar);
            }
        }, zzxvVarZzb, zzot.class);
        zzd = zzmu.zza(new zzmw() { // from class: com.google.android.gms.internal.firebase-auth-api.zzgm
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zzmw
            public final zzox zza(zzbu zzbuVar, zzcn zzcnVar) {
                zzdj zzdjVar = (zzdj) zzbuVar;
                return zzou.zza("type.googleapis.com/google.crypto.tink.AesEaxKey", ((zzsn) ((zzaje) zzsn.zzb().zza(zzgl.zzb(zzdjVar.zzc())).zza(zzaho.zza(zzdjVar.zze().zza(zzcn.zza(zzcnVar)))).zzf())).zzj(), zzuw.zzb.SYMMETRIC, zzgl.zza(zzdjVar.zzc().zzf()), zzdjVar.zza());
            }
        }, zzdj.class, zzou.class);
        zze = zzmq.zza(new zzms() { // from class: com.google.android.gms.internal.firebase-auth-api.zzgp
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zzms
            public final zzbu zza(zzox zzoxVar, zzcn zzcnVar) {
                return zzgl.zzb((zzou) zzoxVar, zzcnVar);
            }
        }, zzxvVarZzb, zzou.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zzdj zzb(zzou zzouVar, zzcn zzcnVar) throws GeneralSecurityException {
        if (!zzouVar.zzf().equals("type.googleapis.com/google.crypto.tink.AesEaxKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesEaxProtoSerialization.parseKey");
        }
        try {
            zzsn zzsnVarZza = zzsn.zza(zzouVar.zzd(), zzaiq.zza());
            if (zzsnVarZza.zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            return zzdj.zzb().zza(zzdq.zze().zzb(zzsnVarZza.zze().zzb()).zza(zzsnVarZza.zzd().zza()).zzc(16).zza(zza(zzouVar.zzc())).zza()).zza(zzxw.zza(zzsnVarZza.zze().zzf(), zzcn.zza(zzcnVar))).zza(zzouVar.zze()).zza();
        } catch (zzajk unused) {
            throw new GeneralSecurityException("Parsing AesEaxcKey failed");
        }
    }

    private static zzdq.zzb zza(zzvs zzvsVar) throws GeneralSecurityException {
        int i10 = zzgo.zza[zzvsVar.ordinal()];
        if (i10 == 1) {
            return zzdq.zzb.zza;
        }
        if (i10 == 2 || i10 == 3) {
            return zzdq.zzb.zzb;
        }
        if (i10 == 4) {
            return zzdq.zzb.zzc;
        }
        throw new GeneralSecurityException(a.d(zzvsVar.zza(), "Unable to parse OutputPrefixType: "));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zzdq zzb(zzot zzotVar) throws GeneralSecurityException {
        if (zzotVar.zza().zzf().equals("type.googleapis.com/google.crypto.tink.AesEaxKey")) {
            try {
                zzso zzsoVarZza = zzso.zza(zzotVar.zza().zze(), zzaiq.zza());
                return zzdq.zze().zzb(zzsoVarZza.zza()).zza(zzsoVarZza.zzd().zza()).zzc(16).zza(zza(zzotVar.zza().zzd())).zza();
            } catch (zzajk e10) {
                throw new GeneralSecurityException("Parsing AesEaxParameters failed: ", e10);
            }
        }
        throw new IllegalArgumentException(m1.i("Wrong type URL in call to AesEaxProtoSerialization.parseParameters: ", zzotVar.zza().zzf()));
    }

    private static zzvs zza(zzdq.zzb zzbVar) throws GeneralSecurityException {
        if (zzdq.zzb.zza.equals(zzbVar)) {
            return zzvs.TINK;
        }
        if (zzdq.zzb.zzb.equals(zzbVar)) {
            return zzvs.CRUNCHY;
        }
        if (zzdq.zzb.zzc.equals(zzbVar)) {
            return zzvs.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(zzbVar)));
    }

    private static zzsr zzb(zzdq zzdqVar) throws GeneralSecurityException {
        if (zzdqVar.zzd() == 16) {
            return (zzsr) ((zzaje) zzsr.zzb().zza(zzdqVar.zzb()).zzf());
        }
        throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d. Currently Tink only supports aes eax keys with tag size equal to 16 bytes.", Integer.valueOf(zzdqVar.zzd())));
    }

    public static void zza() {
        zzns zznsVarZza = zzns.zza();
        zznsVarZza.zza(zzb);
        zznsVarZza.zza(zzc);
        zznsVarZza.zza(zzd);
        zznsVarZza.zza(zze);
    }
}
