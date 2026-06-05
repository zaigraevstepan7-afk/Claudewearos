package ek;

import ak.b0;
import ak.p;
import kk.h;
import kk.x;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class f extends b0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f6094a;

    /* renamed from: b, reason: collision with root package name */
    public final long f6095b;

    /* renamed from: c, reason: collision with root package name */
    public final x f6096c;

    public f(String str, long j, x xVar) {
        this.f6094a = str;
        this.f6095b = j;
        this.f6096c = xVar;
    }

    @Override // ak.b0
    public final long e() {
        return this.f6095b;
    }

    @Override // ak.b0
    public final p g() {
        String str = this.f6094a;
        if (str == null) {
            return null;
        }
        try {
            return p.a(str);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    @Override // ak.b0
    public final h l() {
        return this.f6096c;
    }
}
