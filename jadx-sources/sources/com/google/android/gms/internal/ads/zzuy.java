package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzuy {
    private static final AtomicLong zza = new AtomicLong();

    public zzuy(long j, zzgo zzgoVar, Uri uri, Map map, long j4, long j10, long j11) {
    }

    public static long zza() {
        return zza.getAndIncrement();
    }

    public zzuy(long j, zzgo zzgoVar, long j4) {
        Uri uri = zzgoVar.zza;
    }
}
