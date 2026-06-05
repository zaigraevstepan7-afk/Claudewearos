package com.google.android.gms.internal.ads;

import java.io.IOException;
import t.m1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzzy extends IOException {
    public zzzy(Throwable th2) {
        super(m1.j("Unexpected ", th2.getClass().getSimpleName(), th2.getMessage() != null ? ": ".concat(String.valueOf(th2.getMessage())) : ""), th2);
    }
}
