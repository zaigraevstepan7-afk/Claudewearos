package com.google.android.recaptcha.internal;

import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
final class zzku extends zzle {
    public zzku(int i10) {
        super(i10, null);
    }

    @Override // com.google.android.recaptcha.internal.zzle
    public final void zza() {
        if (!zzj()) {
            for (int i10 = 0; i10 < zzb(); i10++) {
                ((zzii) zzg(i10).getKey()).zzg();
            }
            Iterator it = zzc().iterator();
            while (it.hasNext()) {
                ((zzii) ((Map.Entry) it.next()).getKey()).zzg();
            }
        }
        super.zza();
    }
}
