package com.google.android.gms.internal.fido;

import java.lang.reflect.InvocationTargetException;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzee {
    private static final zzeg zza = zzb(zzeg.zzd);

    private static zzeg zzb(String[] strArr) {
        zzeg zzegVarZza;
        try {
            zzegVarZza = zzeh.zza();
        } catch (NoClassDefFoundError unused) {
            zzegVarZza = null;
        }
        if (zzegVarZza != null) {
            return zzegVarZza;
        }
        StringBuilder sb2 = new StringBuilder();
        for (String str : strArr) {
            try {
                return (zzeg) Class.forName(str).getConstructor(null).newInstance(null);
            } catch (Throwable th2) {
                th = th2;
                if (th instanceof InvocationTargetException) {
                    th = th.getCause();
                }
                sb2.append('\n');
                sb2.append(str);
                sb2.append(": ");
                sb2.append(th);
            }
        }
        throw new IllegalStateException(sb2.insert(0, "No logging platforms found:").toString());
    }
}
