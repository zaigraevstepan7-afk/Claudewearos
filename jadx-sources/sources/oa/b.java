package oa;

import android.graphics.Bitmap;
import fj.l;
import t.m1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class b implements d {

    /* renamed from: a, reason: collision with root package name */
    public final int f12429a;

    /* renamed from: b, reason: collision with root package name */
    public final Bitmap f12430b;

    /* renamed from: c, reason: collision with root package name */
    public final String f12431c;

    /* renamed from: d, reason: collision with root package name */
    public final String f12432d;

    /* renamed from: e, reason: collision with root package name */
    public final f f12433e;

    public b(int i10, Bitmap bitmap, String str, String str2, f fVar) {
        a aVar = a.f12427a;
        l.f(str, "name");
        l.f(str2, "packageName");
        this.f12429a = i10;
        this.f12430b = bitmap;
        this.f12431c = str;
        this.f12432d = str2;
        this.f12433e = fVar;
    }

    @Override // oa.d
    public final String a() {
        return this.f12432d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f12429a != bVar.f12429a || !this.f12430b.equals(bVar.f12430b) || !l.b(this.f12431c, bVar.f12431c) || !l.b(this.f12432d, bVar.f12432d)) {
            return false;
        }
        a aVar = a.f12427a;
        return this.f12433e.equals(bVar.f12433e);
    }

    @Override // oa.d
    public final Bitmap getIcon() {
        return this.f12430b;
    }

    @Override // oa.d
    public final int getId() {
        return this.f12429a;
    }

    @Override // oa.d
    public final String getName() {
        return this.f12431c;
    }

    @Override // oa.d
    public final a getType() {
        return a.f12427a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f12433e.f12439a) + ((a.f12427a.hashCode() + m1.c(m1.c((this.f12430b.hashCode() + (Integer.hashCode(this.f12429a) * 31)) * 31, 31, this.f12431c), 961, this.f12432d)) * 31);
    }

    public final String toString() {
        a aVar = a.f12427a;
        StringBuilder sb2 = new StringBuilder("DockDisplayable(id=");
        sb2.append(this.f12429a);
        sb2.append(", icon=");
        sb2.append(this.f12430b);
        sb2.append(", name=");
        m1.s(sb2, this.f12431c, ", packageName=", this.f12432d, ", iconMask=null, type=");
        sb2.append(aVar);
        sb2.append(", location=");
        sb2.append(this.f12433e);
        sb2.append(")");
        return sb2.toString();
    }
}
