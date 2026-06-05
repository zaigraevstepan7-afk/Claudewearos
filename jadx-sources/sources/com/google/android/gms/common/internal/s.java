package com.google.android.gms.common.internal;

import android.os.Bundle;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class s implements d, b, c {

    /* renamed from: b, reason: collision with root package name */
    public static s f3701b;

    /* renamed from: c, reason: collision with root package name */
    public static final t f3702c = new t(0, 0, 0, false, false);

    /* renamed from: a, reason: collision with root package name */
    public Object f3703a;

    public /* synthetic */ s(Object obj) {
        this.f3703a = obj;
    }

    public static synchronized s b() {
        try {
            if (f3701b == null) {
                f3701b = new s();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f3701b;
    }

    @Override // com.google.android.gms.common.internal.d
    public void a(nd.b bVar) {
        f fVar = (f) this.f3703a;
        if (bVar.f12268b == 0) {
            fVar.getRemoteService(null, fVar.getScopes());
        } else if (fVar.zzx != null) {
            fVar.zzx.onConnectionFailed(bVar);
        }
    }

    @Override // com.google.android.gms.common.internal.b
    public void onConnected(Bundle bundle) {
        ((com.google.android.gms.common.api.internal.g) this.f3703a).n();
    }

    @Override // com.google.android.gms.common.internal.c
    public void onConnectionFailed(nd.b bVar) {
        ((com.google.android.gms.common.api.internal.q) this.f3703a).onConnectionFailed(bVar);
    }

    @Override // com.google.android.gms.common.internal.b
    public void onConnectionSuspended(int i10) {
        ((com.google.android.gms.common.api.internal.g) this.f3703a).onConnectionSuspended(i10);
    }
}
