package com.google.android.gms.internal.ads;

import android.content.pm.ApkChecksum;
import android.content.pm.PackageManager$OnChecksumsReadyListener;
import c2.s0;
import java.util.List;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzaum implements PackageManager$OnChecksumsReadyListener {
    final zzgdv zza = zzgdv.zze();

    public final void onChecksumsReady(List list) {
        if (list == null) {
            this.zza.zzc("");
            return;
        }
        try {
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                ApkChecksum apkChecksumB = s0.b(list.get(i10));
                if (apkChecksumB.getType() == 8) {
                    zzgdv zzgdvVar = this.zza;
                    zzgas zzgasVarZzf = zzgas.zzi().zzf();
                    byte[] value = apkChecksumB.getValue();
                    zzgdvVar.zzc(zzgasVarZzf.zzj(value, 0, value.length));
                    return;
                }
            }
        } catch (Throwable unused) {
        }
        this.zza.zzc("");
    }
}
