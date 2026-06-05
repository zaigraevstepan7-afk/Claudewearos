package com.google.android.gms.internal.auth;

import com.google.android.gms.common.api.internal.j0;
import com.google.android.gms.common.api.m;
import com.google.android.gms.common.api.p;
import com.google.android.gms.common.api.r;
import com.google.android.gms.common.internal.e0;
import jd.a;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzbt {
    public final r getSpatulaHeader(p pVar) {
        e0.i(pVar);
        return ((j0) pVar).f3557b.doWrite((m) new zzbs(this, pVar));
    }

    public final r performProxyRequest(p pVar, a aVar) {
        e0.i(pVar);
        e0.i(aVar);
        return ((j0) pVar).f3557b.doWrite((m) new zzbq(this, pVar, aVar));
    }
}
