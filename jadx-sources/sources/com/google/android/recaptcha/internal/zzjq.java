package com.google.android.recaptcha.internal;

import java.util.List;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
final class zzjq extends zzjs {
    public /* synthetic */ zzjq(zzjp zzjpVar) {
        super(null);
    }

    @Override // com.google.android.recaptcha.internal.zzjs
    public final List zza(Object obj, long j) {
        zzjb zzjbVar = (zzjb) zzlv.zzf(obj, j);
        if (zzjbVar.zzc()) {
            return zzjbVar;
        }
        int size = zzjbVar.size();
        zzjb zzjbVarZzd = zzjbVar.zzd(size == 0 ? 10 : size + size);
        zzlv.zzs(obj, j, zzjbVarZzd);
        return zzjbVarZzd;
    }

    @Override // com.google.android.recaptcha.internal.zzjs
    public final void zzb(Object obj, long j) {
        ((zzjb) zzlv.zzf(obj, j)).zzb();
    }

    @Override // com.google.android.recaptcha.internal.zzjs
    public final void zzc(Object obj, Object obj2, long j) {
        zzjb zzjbVarZzd = (zzjb) zzlv.zzf(obj, j);
        zzjb zzjbVar = (zzjb) zzlv.zzf(obj2, j);
        int size = zzjbVarZzd.size();
        int size2 = zzjbVar.size();
        if (size > 0 && size2 > 0) {
            if (!zzjbVarZzd.zzc()) {
                zzjbVarZzd = zzjbVarZzd.zzd(size2 + size);
            }
            zzjbVarZzd.addAll(zzjbVar);
        }
        if (size > 0) {
            zzjbVar = zzjbVarZzd;
        }
        zzlv.zzs(obj, j, zzjbVar);
    }

    private zzjq() {
        super(null);
    }
}
