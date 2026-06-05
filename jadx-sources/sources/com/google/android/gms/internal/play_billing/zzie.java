package com.google.android.gms.internal.play_billing;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
final class zzie implements zziy {
    private static final zzik zza = new zzic();
    private final zzik zzb;

    public zzie() {
        zzhf zzhfVarZza = zzhf.zza();
        int i10 = zziu.zza;
        zzid zzidVar = new zzid(zzhfVarZza, zza);
        byte[] bArr = zzhp.zzb;
        this.zzb = zzidVar;
    }

    @Override // com.google.android.gms.internal.play_billing.zziy
    public final zzix zza(Class cls) {
        int i10 = zziz.zza;
        if (!zzhk.class.isAssignableFrom(cls)) {
            int i11 = zziu.zza;
        }
        zzij zzijVarZzb = this.zzb.zzb(cls);
        if (zzijVarZzb.zzb()) {
            int i12 = zziu.zza;
            return zziq.zzc(zziz.zzm(), zzgz.zza(), zzijVarZzb.zza());
        }
        int i13 = zziu.zza;
        return zzip.zzl(cls, zzijVarZzb, zzis.zza(), zzia.zza(), zziz.zzm(), zzijVarZzb.zzc() + (-1) != 1 ? zzgz.zza() : null, zzii.zza());
    }
}
