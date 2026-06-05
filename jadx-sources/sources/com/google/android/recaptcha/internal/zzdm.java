package com.google.android.recaptcha.internal;

import java.lang.reflect.Method;
import java.util.Arrays;
import qi.k;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class zzdm implements zzdd {
    public static final zzdm zza = new zzdm();

    private zzdm() {
    }

    @Override // com.google.android.recaptcha.internal.zzdd
    public final void zza(int i10, zzcj zzcjVar, zzpq... zzpqVarArr) throws zzae {
        int length = zzpqVarArr.length;
        if (length == 0) {
            throw new zzae(4, 3, null);
        }
        Object objZza = zzcjVar.zzc().zza(zzpqVarArr[0]);
        if (true != (objZza instanceof Method)) {
            objZza = null;
        }
        Method method = (Method) objZza;
        if (method == null) {
            throw new zzae(4, 5, null);
        }
        Object[] objArrZzh = zzcjVar.zzc().zzh(k.v0(zzpqVarArr).subList(1, length));
        try {
            zzcjVar.zzc().zzf(i10, method.invoke(null, Arrays.copyOf(objArrZzh, objArrZzh.length)));
        } catch (Exception e10) {
            throw new zzae(6, 15, e10);
        }
    }
}
