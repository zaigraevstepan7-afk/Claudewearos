package com.google.android.gms.internal.ads;

import android.provider.Settings;
import java.lang.reflect.InvocationTargetException;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzaxh extends zzayi {
    public zzaxh(zzawv zzawvVar, String str, String str2, zzasr zzasrVar, int i10, int i11) {
        super(zzawvVar, "WQkp0526ddrUi1BRkagos9QKSJQ1uugrJcxnlXdGVtysNEwcyhf7H4AuLi1Daa/J", "bIxRlixcWzGpKi+RzORPGFA/CCK1ebxNEgd5yxb9Upc=", zzasrVar, i10, 49);
    }

    @Override // com.google.android.gms.internal.ads.zzayi
    public final void zza() throws InvocationTargetException {
        zzasr zzasrVar = this.zzd;
        zzasrVar.zzY(3);
        try {
            int i10 = 1;
            if (true == ((Boolean) this.zze.invoke(null, this.zza.zzb())).booleanValue()) {
                i10 = 2;
            }
            zzasrVar.zzY(i10);
        } catch (InvocationTargetException e10) {
            if (!(e10.getTargetException() instanceof Settings.SettingNotFoundException)) {
                throw e10;
            }
        }
    }
}
