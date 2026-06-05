package oa;

import android.graphics.Bitmap;
import fj.l;
import t.m1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class c implements d {

    /* renamed from: a, reason: collision with root package name */
    public final int f12434a;

    /* renamed from: b, reason: collision with root package name */
    public final Bitmap f12435b;

    /* renamed from: c, reason: collision with root package name */
    public final String f12436c;

    /* renamed from: d, reason: collision with root package name */
    public final String f12437d;

    /* renamed from: e, reason: collision with root package name */
    public final g f12438e;

    public c(int i10, Bitmap bitmap, String str, String str2, g gVar) {
        a aVar = a.f12427a;
        l.f(str, "name");
        l.f(str2, "packageName");
        this.f12434a = i10;
        this.f12435b = bitmap;
        this.f12436c = str;
        this.f12437d = str2;
        this.f12438e = gVar;
    }

    @Override // oa.d
    public final String a() {
        return this.f12437d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f12434a != cVar.f12434a || !this.f12435b.equals(cVar.f12435b) || !l.b(this.f12436c, cVar.f12436c) || !l.b(this.f12437d, cVar.f12437d)) {
            return false;
        }
        a aVar = a.f12427a;
        return this.f12438e.equals(cVar.f12438e);
    }

    @Override // oa.d
    public final Bitmap getIcon() {
        return this.f12435b;
    }

    @Override // oa.d
    public final int getId() {
        return this.f12434a;
    }

    @Override // oa.d
    public final String getName() {
        return this.f12436c;
    }

    @Override // oa.d
    public final a getType() {
        return a.f12427a;
    }

    public final int hashCode() {
        return this.f12438e.hashCode() + ((a.f12427a.hashCode() + m1.c(m1.c((this.f12435b.hashCode() + (Integer.hashCode(this.f12434a) * 31)) * 31, 31, this.f12436c), 961, this.f12437d)) * 31);
    }

    public final String toString() {
        a aVar = a.f12427a;
        StringBuilder sb2 = new StringBuilder("GridDisplayable(id=");
        sb2.append(this.f12434a);
        sb2.append(", icon=");
        sb2.append(this.f12435b);
        sb2.append(", name=");
        m1.s(sb2, this.f12436c, ", packageName=", this.f12437d, ", iconMask=null, type=");
        sb2.append(aVar);
        sb2.append(", location=");
        sb2.append(this.f12438e);
        sb2.append(")");
        return sb2.toString();
    }
}
