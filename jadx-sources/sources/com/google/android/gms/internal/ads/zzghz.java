package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzghz extends zzgfn {
    private final zzgib zza;
    private final zzgws zzb;
    private final Integer zzc;

    private zzghz(zzgib zzgibVar, zzgws zzgwsVar, Integer num) {
        this.zza = zzgibVar;
        this.zzb = zzgwsVar;
        this.zzc = num;
    }

    public static zzghz zzc(zzgib zzgibVar, Integer num) throws GeneralSecurityException {
        zzgws zzgwsVarZzb;
        if (zzgibVar.zzb() == zzgia.zza) {
            if (num == null) {
                throw new GeneralSecurityException("For given Variant TINK the value of idRequirement must be non-null");
            }
            zzgwsVarZzb = zzgws.zzb(ByteBuffer.allocate(5).put((byte) 1).putInt(num.intValue()).array());
        } else {
            if (zzgibVar.zzb() != zzgia.zzb) {
                throw new GeneralSecurityException("Unknown Variant: ".concat(zzgibVar.zzb().toString()));
            }
            if (num != null) {
                throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
            }
            zzgwsVarZzb = zzgws.zzb(new byte[0]);
        }
        return new zzghz(zzgibVar, zzgwsVarZzb, num);
    }

    @Override // com.google.android.gms.internal.ads.zzgfn, com.google.android.gms.internal.ads.zzgen
    public final /* synthetic */ zzgfa zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzgfn
    public final zzgws zzb() {
        return this.zzb;
    }

    public final zzgib zzd() {
        return this.zza;
    }

    public final Integer zze() {
        return this.zzc;
    }
}
