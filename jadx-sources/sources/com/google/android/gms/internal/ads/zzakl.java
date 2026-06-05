package com.google.android.gms.internal.ads;

import java.util.List;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzakl {
    public static void zza(zzakm zzakmVar, zzakq zzakqVar, zzdn zzdnVar) {
        for (int i10 = 0; i10 < zzakmVar.zza(); i10++) {
            long jZzb = zzakmVar.zzb(i10);
            List listZzc = zzakmVar.zzc(jZzb);
            if (!listZzc.isEmpty()) {
                if (i10 == zzakmVar.zza() - 1) {
                    throw new IllegalStateException();
                }
                long jZzb2 = zzakmVar.zzb(i10 + 1) - zzakmVar.zzb(i10);
                if (jZzb2 > 0) {
                    zzdnVar.zza(new zzakj(listZzc, jZzb, jZzb2));
                }
            }
        }
    }
}
