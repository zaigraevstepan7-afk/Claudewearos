package com.google.android.gms.internal.play_billing;

import java.util.concurrent.Delayed;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
final class zzey extends zzeh implements ScheduledFuture, zzeu {
    private final ScheduledFuture zza;

    public zzey(zzeu zzeuVar, ScheduledFuture scheduledFuture) {
        super(zzeuVar);
        this.zza = scheduledFuture;
    }

    @Override // com.google.android.gms.internal.play_billing.zzeg, java.util.concurrent.Future
    public final boolean cancel(boolean z2) {
        boolean zCancel = zzc().cancel(z2);
        if (zCancel) {
            this.zza.cancel(z2);
        }
        return zCancel;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Delayed delayed) {
        return this.zza.compareTo(delayed);
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(TimeUnit timeUnit) {
        return this.zza.getDelay(timeUnit);
    }
}
