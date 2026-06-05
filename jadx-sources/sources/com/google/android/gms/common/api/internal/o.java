package com.google.android.gms.common.api.internal;

import android.os.Looper;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final f8.b f3568a;

    /* renamed from: b, reason: collision with root package name */
    public volatile Object f3569b;

    /* renamed from: c, reason: collision with root package name */
    public volatile m f3570c;

    public o(Looper looper, Object obj, String str) {
        this.f3568a = new f8.b(looper);
        com.google.android.gms.common.internal.e0.j(obj, "Listener must not be null");
        this.f3569b = obj;
        com.google.android.gms.common.internal.e0.e(str);
        this.f3570c = new m(obj, str);
    }

    public final void a(n nVar) {
        this.f3568a.execute(new a1(this, nVar));
    }
}
