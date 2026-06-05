package com.google.android.gms.internal.play_billing;

import java.util.Arrays;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class zzba {
    private final String zza;
    private final zzaz zzb;
    private zzaz zzc;

    public /* synthetic */ zzba(String str, zzbb zzbbVar) {
        zzaz zzazVar = new zzaz();
        this.zzb = zzazVar;
        this.zzc = zzazVar;
        str.getClass();
        this.zza = str;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(32);
        sb2.append(this.zza);
        sb2.append('{');
        zzaz zzazVar = this.zzb.zzb;
        String str = "";
        while (zzazVar != null) {
            Object obj = zzazVar.zza;
            sb2.append(str);
            if (obj == null || !obj.getClass().isArray()) {
                sb2.append(obj);
            } else {
                sb2.append((CharSequence) Arrays.deepToString(new Object[]{obj}), 1, r2.length() - 1);
            }
            zzazVar = zzazVar.zzb;
            str = ", ";
        }
        sb2.append('}');
        return sb2.toString();
    }

    public final zzba zza(Object obj) {
        zzaz zzazVar = new zzaz();
        this.zzc.zzb = zzazVar;
        this.zzc = zzazVar;
        zzazVar.zza = obj;
        return this;
    }
}
