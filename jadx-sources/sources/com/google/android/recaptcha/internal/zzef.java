package com.google.android.recaptcha.internal;

import java.util.Iterator;
import java.util.List;
import qi.k;
import qi.l;
import qi.s;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class zzef {
    private List zza = s.f13520a;

    public final long zza(long[] jArr) {
        Iterator it = l.I0(this.zza, k.u0(jArr)).iterator();
        if (!it.hasNext()) {
            throw new UnsupportedOperationException("Empty collection can't be reduced.");
        }
        Object next = it.next();
        while (it.hasNext()) {
            next = Long.valueOf(((Number) next).longValue() ^ ((Number) it.next()).longValue());
        }
        return ((Number) next).longValue();
    }

    public final void zzb(long[] jArr) {
        this.zza = k.u0(jArr);
    }
}
