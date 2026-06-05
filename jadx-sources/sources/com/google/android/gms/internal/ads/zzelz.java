package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.Objects;
import java.util.concurrent.Callable;
import nc.t;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzelz implements zzetu {
    private final zzgdm zza;
    private final zzfco zzb;
    private final int zzc;

    public zzelz(zzgdm zzgdmVar, zzfco zzfcoVar, zzfdd zzfddVar, int i10) {
        this.zza = zzgdmVar;
        this.zzb = zzfcoVar;
        this.zzc = i10;
    }

    public static zzema zzc(zzelz zzelzVar) throws GeneralSecurityException {
        boolean zEquals;
        zzbct zzbctVar = zzbdc.zzhg;
        t tVar = t.f12227d;
        String strZza = null;
        if (((Boolean) tVar.f12230c.zzb(zzbctVar)).booleanValue()) {
            zzfco zzfcoVar = zzelzVar.zzb;
            if (zzelzVar.zzc != 2) {
                String strW = u3.c.w(zzfcoVar.zzd);
                if (((Boolean) tVar.f12230c.zzb(zzbdc.zzhh)).booleanValue()) {
                    zEquals = Arrays.asList(((String) tVar.f12230c.zzb(zzbdc.zzhi)).split(",")).contains(u3.c.v(strW));
                } else {
                    zEquals = Objects.equals(strW, "requester_type_2");
                }
                if (zEquals) {
                    strZza = zzfdd.zza();
                }
            }
        }
        return new zzema(strZza);
    }

    @Override // com.google.android.gms.internal.ads.zzetu
    public final int zza() {
        return 5;
    }

    @Override // com.google.android.gms.internal.ads.zzetu
    public final mf.a zzb() {
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzely
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzelz.zzc(this.zza);
            }
        });
    }
}
