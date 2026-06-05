package com.google.android.gms.internal.play_billing;

import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class zzel extends zzen {
    public static zzeu zza(Object obj) {
        return new zzeo(obj);
    }

    public static zzeu zzb(zzeu zzeuVar, long j, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        return zzeuVar.isDone() ? zzeuVar : zzff.zzs(zzeuVar, 28500L, timeUnit, scheduledExecutorService);
    }

    public static void zzc(zzeu zzeuVar, zzej zzejVar, Executor executor) {
        zzeuVar.zzb(new zzek(zzeuVar, zzejVar), executor);
    }
}
