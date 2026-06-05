package com.google.android.gms.internal.ads;

import java.util.Arrays;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzgwp implements zzgez {
    private static final byte[] zza = {0};
    private final zzgrc zzb;
    private final int zzc;
    private final byte[] zzd;
    private final byte[] zze;

    private zzgwp(zzgpa zzgpaVar) {
        this.zzb = new zzgwm(zzgpaVar.zze().zzd(zzgem.zza()));
        this.zzc = zzgpaVar.zzc().zzb();
        this.zzd = zzgpaVar.zzd().zzd();
        if (zzgpaVar.zzc().zzf().equals(zzgpg.zzc)) {
            this.zze = Arrays.copyOf(zza, 1);
        } else {
            this.zze = new byte[0];
        }
    }

    public static zzgez zza(zzgpa zzgpaVar) {
        return new zzgwp(zzgpaVar);
    }

    public static zzgez zzb(zzgpp zzgppVar) {
        return new zzgwp(zzgppVar);
    }

    public final byte[] zzc(byte[] bArr) {
        byte[] bArr2 = this.zze;
        return bArr2.length > 0 ? zzgvs.zzb(this.zzd, this.zzb.zza(zzgvs.zzb(bArr, bArr2), this.zzc)) : zzgvs.zzb(this.zzd, this.zzb.zza(bArr, this.zzc));
    }

    private zzgwp(zzgpp zzgppVar) {
        String strValueOf = String.valueOf(zzgppVar.zzc().zzf());
        this.zzb = new zzgwo("HMAC".concat(strValueOf), new SecretKeySpec(zzgppVar.zze().zzd(zzgem.zza()), "HMAC"));
        this.zzc = zzgppVar.zzc().zzb();
        this.zzd = zzgppVar.zzd().zzd();
        if (zzgppVar.zzc().zzg().equals(zzgpx.zzc)) {
            this.zze = Arrays.copyOf(zza, 1);
        } else {
            this.zze = new byte[0];
        }
    }

    public zzgwp(zzgrc zzgrcVar, int i10) {
        this.zzb = zzgrcVar;
        this.zzc = i10;
        this.zzd = new byte[0];
        this.zze = new byte[0];
        zzgrcVar.zza(new byte[0], i10);
    }
}
