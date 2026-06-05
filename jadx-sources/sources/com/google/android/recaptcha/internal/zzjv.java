package com.google.android.recaptcha.internal;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
final class zzjv implements zzkc {
    private final zzkc[] zza;

    public zzjv(zzkc... zzkcVarArr) {
        this.zza = zzkcVarArr;
    }

    @Override // com.google.android.recaptcha.internal.zzkc
    public final zzkb zzb(Class cls) {
        for (int i10 = 0; i10 < 2; i10++) {
            zzkc zzkcVar = this.zza[i10];
            if (zzkcVar.zzc(cls)) {
                return zzkcVar.zzb(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    @Override // com.google.android.recaptcha.internal.zzkc
    public final boolean zzc(Class cls) {
        for (int i10 = 0; i10 < 2; i10++) {
            if (this.zza[i10].zzc(cls)) {
                return true;
            }
        }
        return false;
    }
}
