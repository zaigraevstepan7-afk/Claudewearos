package com.google.android.recaptcha.internal;

import fj.l;
import java.util.Arrays;
import java.util.Objects;
import qi.k;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class zzdi implements zzdd {
    public static final zzdi zza = new zzdi();

    private zzdi() {
    }

    @Override // com.google.android.recaptcha.internal.zzdd
    public final void zza(int i10, zzcj zzcjVar, zzpq... zzpqVarArr) throws zzae {
        int length = zzpqVarArr.length;
        if (length < 2) {
            throw new zzae(4, 3, null);
        }
        Class<?> clsZza = zzcjVar.zzc().zza(zzpqVarArr[0]);
        if (true != Objects.nonNull(clsZza)) {
            clsZza = null;
        }
        if (clsZza == null) {
            throw new zzae(4, 5, null);
        }
        Class<?> cls = clsZza instanceof Class ? clsZza : clsZza.getClass();
        Object objZza = zzcjVar.zzc().zza(zzpqVarArr[1]);
        if (true != (objZza instanceof String)) {
            objZza = null;
        }
        String str = (String) objZza;
        if (str == null) {
            throw new zzae(4, 5, null);
        }
        String strZza = zzcjVar.zzh().zza(str);
        if (l.b(strZza, "forName")) {
            throw new zzae(6, 48, null);
        }
        Class[] clsArrZzg = zzcjVar.zzc().zzg(k.v0(zzpqVarArr).subList(2, length));
        try {
            zzcjVar.zzc().zzf(i10, cls.getMethod(strZza, (Class[]) Arrays.copyOf(clsArrZzg, clsArrZzg.length)));
        } catch (Exception e10) {
            throw new zzae(6, 13, e10);
        }
    }
}
