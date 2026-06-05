package com.google.android.gms.internal.ads;

import android.os.Build;
import android.os.ext.SdkExtensions;
import mc.n;
import nc.t;
import qc.r0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzent implements zzett {
    private final Integer zza;

    private zzent(Integer num) {
        this.zza = num;
    }

    public static zzent zzc(rc.a aVar) {
        zzbct zzbctVar = zzbdc.zzkn;
        t tVar = t.f12227d;
        zzbda zzbdaVar = tVar.f12230c;
        zzbda zzbdaVar2 = tVar.f12230c;
        if (!((Boolean) zzbdaVar.zzb(zzbctVar)).booleanValue()) {
            return new zzent(null);
        }
        r0 r0Var = n.D.f11577c;
        int extensionVersion = 0;
        try {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 30 && SdkExtensions.getExtensionVersion(30) > 3) {
                extensionVersion = SdkExtensions.getExtensionVersion(1000000);
            } else if (((Boolean) zzbdaVar2.zzb(zzbdc.zzkq)).booleanValue() && aVar.f14323c >= ((Integer) zzbdaVar2.zzb(zzbdc.zzkp)).intValue() && i10 >= 31 && SdkExtensions.getExtensionVersion(31) >= 9) {
                extensionVersion = SdkExtensions.getExtensionVersion(31);
            }
        } catch (Exception e10) {
            n.D.f11582h.zzw(e10, "AdUtil.getAdServicesExtensionVersion");
        }
        return new zzent(Integer.valueOf(extensionVersion));
    }

    @Override // com.google.android.gms.internal.ads.zzett
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        Integer num = this.zza;
        zzcut zzcutVar = (zzcut) obj;
        if (num != null) {
            zzcutVar.zza.putInt("aos", num.intValue());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzett
    public final /* synthetic */ void zza(Object obj) {
    }
}
