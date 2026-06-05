package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zztn;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class zzkq {
    public static final zzvc zza;
    private static final byte[] zzb;
    private static final zzvc zzc;
    private static final zzvc zzd;

    static {
        byte[] bArr = new byte[0];
        zzb = bArr;
        zztw zztwVar = zztw.NIST_P256;
        zzub zzubVar = zzub.SHA256;
        zzti zztiVar = zzti.UNCOMPRESSED;
        zzvc zzvcVar = zzct.zza;
        zzvs zzvsVar = zzvs.TINK;
        zza = zza(zztwVar, zzubVar, zztiVar, zzvcVar, zzvsVar, bArr);
        zzc = zza(zztwVar, zzubVar, zzti.COMPRESSED, zzvcVar, zzvs.RAW, bArr);
        zzd = zza(zztwVar, zzubVar, zztiVar, zzct.zzb, zzvsVar, bArr);
    }

    @Deprecated
    private static zzvc zza(zztw zztwVar, zzub zzubVar, zzti zztiVar, zzvc zzvcVar, zzvs zzvsVar, byte[] bArr) {
        zztn.zza zzaVarZza = zztn.zza();
        zztv zztvVar = (zztv) ((zzaje) zztv.zza().zza(zztwVar).zza(zzubVar).zza(zzaho.zza(bArr)).zzf());
        return (zzvc) ((zzaje) zzvc.zza().zza(zzjk.zza()).zza(zzvsVar).zza(((zztn) ((zzaje) zzaVarZza.zza((zzto) ((zzaje) zzto.zzc().zza(zztvVar).zza((zztj) ((zzaje) zztj.zza().zza(zzvcVar).zzf())).zza(zztiVar).zzf())).zzf())).zzj()).zzf());
    }
}
