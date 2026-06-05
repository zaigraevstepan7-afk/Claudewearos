package xa;

import android.graphics.Bitmap;
import c2.w0;
import fj.l;
import t.m1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final Bitmap f19855a;

    /* renamed from: b, reason: collision with root package name */
    public final String f19856b;

    /* renamed from: c, reason: collision with root package name */
    public final w0 f19857c;

    /* renamed from: d, reason: collision with root package name */
    public final e f19858d;

    public d(Bitmap bitmap, String str, w0 w0Var, e eVar) {
        l.f(bitmap, "bitmap");
        l.f(str, "appName");
        l.f(eVar, "iconType");
        this.f19855a = bitmap;
        this.f19856b = str;
        this.f19857c = w0Var;
        this.f19858d = eVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return l.b(this.f19855a, dVar.f19855a) && l.b(this.f19856b, dVar.f19856b) && l.b(this.f19857c, dVar.f19857c) && this.f19858d == dVar.f19858d;
    }

    public final int hashCode() {
        int iC = m1.c(this.f19855a.hashCode() * 31, 31, this.f19856b);
        w0 w0Var = this.f19857c;
        return this.f19858d.hashCode() + ((iC + (w0Var == null ? 0 : w0Var.hashCode())) * 31);
    }

    public final String toString() {
        return "DisplayableIcon(bitmap=" + this.f19855a + ", appName=" + this.f19856b + ", shape=" + this.f19857c + ", iconType=" + this.f19858d + ")";
    }
}
