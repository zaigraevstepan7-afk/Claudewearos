package com.google.android.gms.common.api.internal;

import java.util.Arrays;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class h0 {

    /* renamed from: a, reason: collision with root package name */
    public final a f3549a;

    /* renamed from: b, reason: collision with root package name */
    public final nd.d f3550b;

    public /* synthetic */ h0(a aVar, nd.d dVar) {
        this.f3549a = aVar;
        this.f3550b = dVar;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof h0)) {
            h0 h0Var = (h0) obj;
            if (com.google.android.gms.common.internal.e0.l(this.f3549a, h0Var.f3549a) && com.google.android.gms.common.internal.e0.l(this.f3550b, h0Var.f3550b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f3549a, this.f3550b});
    }

    public final String toString() {
        t0.j jVar = new t0.j(this);
        jVar.g(this.f3549a, "key");
        jVar.g(this.f3550b, "feature");
        return jVar.toString();
    }
}
