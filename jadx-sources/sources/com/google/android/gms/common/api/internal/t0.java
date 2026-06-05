package com.google.android.gms.common.api.internal;

import android.os.Looper;
import com.google.android.gms.common.api.Status;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class t0 extends com.google.android.gms.common.api.w implements com.google.android.gms.common.api.u {

    /* renamed from: a, reason: collision with root package name */
    public t0 f3587a = null;

    /* renamed from: b, reason: collision with root package name */
    public final Object f3588b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public final WeakReference f3589c;

    public t0(WeakReference weakReference) {
        com.google.android.gms.common.internal.e0.j(weakReference, "GoogleApiClient reference must not be null");
        this.f3589c = weakReference;
        com.google.android.gms.common.api.p pVar = (com.google.android.gms.common.api.p) weakReference.get();
        new s0(this, pVar != null ? ((j0) pVar).f3557b.getLooper() : Looper.getMainLooper());
    }

    public final void a(Status status) {
        synchronized (this.f3588b) {
            synchronized (this.f3588b) {
            }
        }
    }
}
