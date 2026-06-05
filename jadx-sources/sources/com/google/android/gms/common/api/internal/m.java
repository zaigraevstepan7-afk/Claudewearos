package com.google.android.gms.common.api.internal;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final Object f3561a;

    /* renamed from: b, reason: collision with root package name */
    public final String f3562b;

    public m(Object obj, String str) {
        this.f3561a = obj;
        this.f3562b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return this.f3561a == mVar.f3561a && this.f3562b.equals(mVar.f3562b);
    }

    public final int hashCode() {
        return this.f3562b.hashCode() + (System.identityHashCode(this.f3561a) * 31);
    }
}
