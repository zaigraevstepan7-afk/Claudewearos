package com.google.android.gms.common.api;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class x extends UnsupportedOperationException {

    /* renamed from: a, reason: collision with root package name */
    public final nd.d f3612a;

    public x(nd.d dVar) {
        this.f3612a = dVar;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return "Missing ".concat(String.valueOf(this.f3612a));
    }
}
