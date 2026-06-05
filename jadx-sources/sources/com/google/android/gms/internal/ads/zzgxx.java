package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Locale;
import t.m1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzgxx extends IOException {
    public zzgxx() {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public zzgxx(long j, long j4, int i10, Throwable th2) {
        Locale locale = Locale.US;
        StringBuilder sbL = m1.l("Pos: ", ", limit: ", j);
        sbL.append(j4);
        sbL.append(", len: ");
        sbL.append(i10);
        super("CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(sbL.toString()), th2);
    }

    public zzgxx(Throwable th2) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.", th2);
    }
}
