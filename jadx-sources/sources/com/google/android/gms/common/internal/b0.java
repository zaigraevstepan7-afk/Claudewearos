package com.google.android.gms.common.internal;

import android.os.Bundle;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public abstract class b0 {

    /* renamed from: a, reason: collision with root package name */
    public Boolean f3620a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f3621b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f f3622c;

    /* renamed from: d, reason: collision with root package name */
    public final int f3623d;

    /* renamed from: e, reason: collision with root package name */
    public final Bundle f3624e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ f f3625f;

    public b0(f fVar, int i10, Bundle bundle) {
        this.f3625f = fVar;
        Boolean bool = Boolean.TRUE;
        this.f3622c = fVar;
        this.f3620a = bool;
        this.f3621b = false;
        this.f3623d = i10;
        this.f3624e = bundle;
    }

    public abstract void a(nd.b bVar);

    public abstract boolean b();

    public final void c() {
        synchronized (this) {
            this.f3620a = null;
        }
        synchronized (this.f3622c.zzt) {
            this.f3622c.zzt.remove(this);
        }
    }
}
