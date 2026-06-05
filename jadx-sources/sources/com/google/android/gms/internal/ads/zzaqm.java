package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzaqm {
    public static final boolean zza = zzaqn.zzb;
    private final List zzb = new ArrayList();
    private boolean zzc = false;

    public final void finalize() {
        if (this.zzc) {
            return;
        }
        zzb("Request on the loose");
        zzaqn.zzb("Marker log finalized without finish() - uncaught exit point for request", new Object[0]);
    }

    public final synchronized void zza(String str, long j) {
        if (this.zzc) {
            throw new IllegalStateException("Marker added to finished log");
        }
        this.zzb.add(new zzaql(str, j, SystemClock.elapsedRealtime()));
    }

    public final synchronized void zzb(String str) {
        this.zzc = true;
        List<zzaql> list = this.zzb;
        long j = list.size() == 0 ? 0L : ((zzaql) list.get(list.size() - 1)).zzc - ((zzaql) list.get(0)).zzc;
        if (j > 0) {
            long j4 = ((zzaql) list.get(0)).zzc;
            zzaqn.zza("(%-4d ms) %s", Long.valueOf(j), str);
            for (zzaql zzaqlVar : list) {
                long j10 = zzaqlVar.zzc;
                zzaqn.zza("(+%-4d) [%2d] %s", Long.valueOf(j10 - j4), Long.valueOf(zzaqlVar.zzb), zzaqlVar.zza);
                j4 = j10;
            }
        }
    }
}
