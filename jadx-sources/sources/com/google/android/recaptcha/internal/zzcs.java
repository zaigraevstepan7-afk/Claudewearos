package com.google.android.recaptcha.internal;

import java.util.Objects;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class zzcs implements zzdd {
    public static final zzcs zza = new zzcs();

    private zzcs() {
    }

    @Override // com.google.android.recaptcha.internal.zzdd
    public final void zza(int i10, zzcj zzcjVar, zzpq... zzpqVarArr) throws zzae {
        boolean z2 = true;
        if (zzpqVarArr.length != 1) {
            throw new zzae(4, 3, null);
        }
        Object objZza = zzcjVar.zzc().zza(zzpqVarArr[0]);
        if (true != Objects.nonNull(objZza)) {
            objZza = null;
        }
        if (objZza == null) {
            throw new zzae(4, 5, null);
        }
        try {
            try {
                if (objZza instanceof String) {
                    objZza = zzcjVar.zzh().zza((String) objZza);
                }
                zzck zzckVarZzc = zzcjVar.zzc();
                try {
                    zzci.zza(objZza);
                } catch (zzae e10) {
                    if (e10.zzb() == 8 || e10.zzb() == 6) {
                        z2 = false;
                    } else if (e10.zzb() != 47) {
                        throw e10;
                    }
                }
                zzckVarZzc.zzf(i10, Boolean.valueOf(z2));
            } catch (Exception e11) {
                throw new zzae(6, 8, e11);
            }
        } catch (zzae e12) {
            throw e12;
        }
    }
}
