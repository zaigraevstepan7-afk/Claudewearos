package ii;

import android.graphics.Shader;
import c2.e0;
import c2.w;
import fi.i;
import fi.j;
import fj.l;
import t.m1;
import v2.h0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class g implements h {

    /* renamed from: b, reason: collision with root package name */
    public final long f8594b = w.c(w.f3054d, 0.38f);

    /* renamed from: c, reason: collision with root package name */
    public final int f8595c = 12;

    @Override // ii.h
    public final long a() {
        return this.f8594b;
    }

    @Override // ii.h
    public final Shader b(h0 h0Var, j jVar, i iVar) {
        l.f(iVar, "runtimeShaderCache");
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return w.d(this.f8594b, gVar.f8594b) && this.f8595c == gVar.f8595c;
    }

    @Override // ii.h
    public final int f() {
        return this.f8595c;
    }

    public final int hashCode() {
        int i10 = w.f3059i;
        return Integer.hashCode(this.f8595c) + (Long.hashCode(this.f8594b) * 31);
    }

    public final String toString() {
        return m1.k("Plain(color=", w.j(this.f8594b), ", blendMode=", e0.I(this.f8595c), ")");
    }
}
