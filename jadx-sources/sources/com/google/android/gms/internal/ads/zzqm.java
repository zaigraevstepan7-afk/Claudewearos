package com.google.android.gms.internal.ads;

import t.m1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzqm extends Exception {
    /* JADX WARN: Illegal instructions before constructor call */
    public zzqm(long j, long j4) {
        StringBuilder sbL = m1.l("Unexpected audio track timestamp discontinuity: expected ", ", got ", j4);
        sbL.append(j);
        super(sbL.toString());
    }
}
