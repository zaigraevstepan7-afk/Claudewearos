package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import com.google.android.gms.common.api.internal.j0;
import com.google.android.gms.common.api.m;
import com.google.android.gms.common.api.p;
import com.google.android.gms.common.api.r;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class zzg {
    public final r removeActivityUpdates(p pVar, PendingIntent pendingIntent) {
        return ((j0) pVar).f3557b.doWrite((m) new zze(this, pVar, pendingIntent));
    }

    public final r requestActivityUpdates(p pVar, long j, PendingIntent pendingIntent) {
        return ((j0) pVar).f3557b.doWrite((m) new zzd(this, pVar, j, pendingIntent));
    }
}
