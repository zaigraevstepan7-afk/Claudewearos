package com.google.android.gms.internal.play_billing;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class zzfb {
    public static zzev zza(ExecutorService executorService) {
        return executorService instanceof zzev ? (zzev) executorService : executorService instanceof ScheduledExecutorService ? new zzfa((ScheduledExecutorService) executorService) : new zzex(executorService);
    }

    public static zzew zzb(ScheduledExecutorService scheduledExecutorService) {
        return scheduledExecutorService instanceof zzew ? (zzew) scheduledExecutorService : new zzfa(scheduledExecutorService);
    }
}
